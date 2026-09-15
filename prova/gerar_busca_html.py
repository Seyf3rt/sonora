# -*- coding: utf-8 -*-
"""Lê os arquivos .md desta pasta e gera prova/busca.html — a página de busca offline.

    python3 prova/gerar_busca_html.py

Regenere sempre que editar QUESTOES_RESPONDIDAS.md, BANCO_DE_QUESTOES.md ou
ERROS_PROVA_PRATICA.md.
"""
import json
import os
import re
import unicodedata

PASTA = os.path.dirname(os.path.abspath(__file__))


def ler(nome):
    return open(os.path.join(PASTA, nome), encoding='utf-8').read()


def sem_acento(texto):
    base = unicodedata.normalize('NFD', texto.lower())
    return ''.join(c for c in base if unicodedata.category(c) != 'Mn')


# ------------------------------------------------------------------ questões
def parse_questoes(arquivo, fonte):
    """Extrai as questões de um dos dois arquivos de questões."""
    texto = ler(arquivo)
    entradas = []
    parte_atual = ''

    for pedaco in re.split(r'\n(?=#{2,3} )', texto):
        linhas = pedaco.split('\n')
        cabecalho = linhas[0]

        if cabecalho.startswith('## '):
            parte_atual = cabecalho[3:].strip()
            continue
        if not cabecalho.startswith('### '):
            continue

        titulo = cabecalho[4:].strip()
        corpo = '\n'.join(linhas[1:])

        m = re.match(r'(?:Questão (\d+)|([A-Z]\d+))\s*—\s*(.+)', titulo)
        # cabeçalho de questão, mas sem gabarito, é uma nota de rodapé do arquivo
        if not m or '> **Resposta:' not in corpo:
            if len(corpo.strip()) > 80:
                entradas.append({
                    'id': 'NOTA', 'fonte': fonte, 'tipo': 'nota', 'parte': parte_atual,
                    'enunciado': titulo, 'alternativas': [], 'resposta': '',
                    'porque': corpo.strip(), 'chaves': '',
                    'onde': '`' + arquivo + '` — ' + parte_atual,
                })
            continue
        ident = 'Q' + m.group(1) if m.group(1) else m.group(2)
        tipo = m.group(3).strip()
        alternativas = re.findall(r'^- (.+)$', corpo, re.M)
        resposta = re.search(r'^> \*\*Resposta: (.+?)\*\*$', corpo, re.M)
        porque = re.search(r'^> \*\*Resposta:.*?\n>\n> (.+?)$', corpo, re.M | re.S)
        chaves = re.search(r'^\*\*Palavras-chave:\*\* (.+)$', corpo, re.M)
        onde = re.search(r'^\*\*Onde estudar:\*\* (.+)$', corpo, re.M)

        corte = corpo.find('\n- ')
        enunciado = (corpo[:corte] if corte > 0 else corpo).strip()
        enunciado = re.sub(r'\n\*\*Palavras-chave.*', '', enunciado, flags=re.S).strip()

        entradas.append({
            'id': ident,
            'fonte': fonte,
            'tipo': tipo,
            'parte': parte_atual,
            'enunciado': enunciado,
            'alternativas': alternativas,
            'resposta': resposta.group(1).strip() if resposta else '',
            'porque': porque.group(1).split('\n\n')[0].strip() if porque else '',
            'chaves': chaves.group(1).strip() if chaves else '',
            'onde': onde.group(1).strip() if onde else '',
        })
    return entradas


# ------------------------------------------------------------------ prática
def parse_pratica():
    """Cada linha de tabela e cada receita do guia da prática vira uma entrada."""
    texto = ler('ERROS_PROVA_PRATICA.md')
    entradas = []
    secao = ''
    subsecao = ''

    for bloco in re.split(r'\n(?=#{2,3} )', texto):
        linhas = bloco.split('\n')
        cab = linhas[0]
        if cab.startswith('## '):
            secao = re.sub(r'^\d+\.\s*', '', cab[3:].strip())
            subsecao = ''
        elif cab.startswith('### '):
            subsecao = re.sub(r'^\d+\.\d+\s*', '', cab[4:].strip())
        else:
            continue

        corpo = '\n'.join(linhas[1:]).strip()
        contexto = secao + ' · ' + subsecao if subsecao else secao

        linhas_tabela = [l for l in corpo.split('\n')
                         if l.startswith('|') and not re.match(r'^\|[\s:|-]+\|$', l)]
        if len(linhas_tabela) >= 2:
            titulos = [c.strip() for c in linhas_tabela[0].strip('|').split('|')]
            for linha in linhas_tabela[1:]:
                celulas = [c.strip() for c in linha.strip('|').split('|')]
                if len(celulas) != len(titulos):
                    continue
                meio = ' · '.join('**' + titulos[i] + ':** ' + celulas[i]
                                  for i in range(1, len(celulas) - 1))
                entradas.append({
                    'id': 'PRÁTICA',
                    'fonte': 'pratica',
                    'tipo': 'erro',
                    'parte': contexto,
                    'enunciado': celulas[0],
                    'alternativas': [],
                    'resposta': celulas[-1],
                    'porque': meio,
                    'chaves': '',
                    'onde': '`ERROS_PROVA_PRATICA.md` — ' + contexto,
                })
            continue

        if subsecao and corpo:
            ehreceita = secao.startswith('Receitas')
            entradas.append({
                'id': 'RECEITA' if ehreceita else 'PRÁTICA',
                'fonte': 'pratica',
                'tipo': 'receita' if ehreceita else 'nota',
                'parte': contexto,
                'enunciado': subsecao,
                'alternativas': [],
                'resposta': '',
                'porque': corpo,
                'chaves': '',
                'onde': '`ERROS_PROVA_PRATICA.md` — ' + contexto,
            })
    return entradas


entradas = (parse_questoes('QUESTOES_RESPONDIDAS.md', 'revisao')
            + parse_questoes('BANCO_DE_QUESTOES.md', 'banco')
            + parse_pratica())

def limpo(texto):
    return sem_acento(re.sub(r'[`*>]', '', texto))


for e in entradas:
    bruto = ' '.join([e['id'], e['tipo'], e['parte'], e['enunciado'],
                      ' '.join(e['alternativas']), e['resposta'], e['porque'], e['chaves']])
    e['busca'] = limpo(bruto)
    # campos usados só para ordenar por relevância
    e['alvoId'] = limpo(e['id'] + ' ' + e['parte'])
    e['alvoChaves'] = limpo(e['chaves'])
    e['alvoEnunciado'] = limpo(e['enunciado'])
    e['alvoResposta'] = limpo(e['resposta'] + ' ' + e['porque'])

DADOS = json.dumps(entradas, ensure_ascii=False, separators=(',', ':'))

contagem = {}
for e in entradas:
    contagem[e['fonte']] = contagem.get(e['fonte'], 0) + 1
print('entradas:', len(entradas), contagem)

# ------------------------------------------------------------------ página
FONTES = ('<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>\n'
          '<link rel="stylesheet" href="https://fonts.googleapis.com/css2?'
          'family=IBM+Plex+Mono:wght@400;600&'
          'family=IBM+Plex+Sans:wght@400;500;600;700&'
          'family=IBM+Plex+Serif:wght@400;600&display=swap">')

CSS = r'''
:root{
  --ground:#f2f5f7; --surface:#ffffff; --surface-2:#e9eef2;
  --ink:#15202b; --ink-2:#4a5b6b; --ink-3:#77889a;
  --line:#d3dce4; --line-forte:#b6c4d0;
  --accent:#0f6fb8; --accent-ink:#0b527f; --accent-fraca:#e2eef8; --chip-ativa:#ffffff;
  --certo:#1a7f37; --certo-fraca:#e4f3e8;
  --aviso:#8a6100; --aviso-fraca:#fbf1dc;
  --sombra:0 1px 2px rgba(21,32,43,.06);
  --sans:"IBM Plex Sans",-apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,sans-serif;
  --serif:"IBM Plex Serif",Georgia,"Times New Roman",serif;
  --mono:"IBM Plex Mono",ui-monospace,SFMono-Regular,Menlo,Consolas,monospace;
}
@media (prefers-color-scheme:dark){
  :root:not([data-theme="light"]){
    --ground:#0e141a; --surface:#161e26; --surface-2:#1e2831;
    --ink:#e4ecf3; --ink-2:#a6b6c4; --ink-3:#7b8b9a;
    --line:#2a3742; --line-forte:#3b4c5a;
    --accent:#59aee8; --accent-ink:#8ccbf5; --accent-fraca:#13293a; --chip-ativa:#08131c;
    --certo:#5fd07f; --certo-fraca:#12291a;
    --aviso:#e3b45f; --aviso-fraca:#2b2213;
    --sombra:0 1px 2px rgba(0,0,0,.3);
  }
}
:root[data-theme="dark"]{
  --ground:#0e141a; --surface:#161e26; --surface-2:#1e2831;
  --ink:#e4ecf3; --ink-2:#a6b6c4; --ink-3:#7b8b9a;
  --line:#2a3742; --line-forte:#3b4c5a;
  --accent:#59aee8; --accent-ink:#8ccbf5; --accent-fraca:#13293a; --chip-ativa:#08131c;
  --certo:#5fd07f; --certo-fraca:#12291a;
  --aviso:#e3b45f; --aviso-fraca:#2b2213;
  --sombra:0 1px 2px rgba(0,0,0,.3);
}

*{box-sizing:border-box}
html,body{margin:0}
body{
  background:var(--ground); color:var(--ink);
  font-family:var(--sans); font-size:15px; line-height:1.55;
  -webkit-text-size-adjust:100%;
}
.envolucro{max-width:820px; margin:0 auto; padding-inline:16px}

.topo{
  position:sticky; top:env(safe-area-inset-top,0px); z-index:20;
  background:var(--ground); border-bottom:1px solid var(--line);
}
.topo-interno{max-width:820px; margin:0 auto; padding:14px 16px 10px}
.marca{display:flex; align-items:baseline; gap:10px; flex-wrap:wrap; margin-bottom:10px}
.marca h1{
  font-family:var(--mono); font-size:15px; font-weight:600; letter-spacing:.02em;
  margin:0; color:var(--ink);
}
.marca .sub{font-size:12.5px; color:var(--ink-3)}

.campo{position:relative; display:flex; align-items:center}
.campo svg{position:absolute; left:13px; width:17px; height:17px; color:var(--ink-3); pointer-events:none}
#busca{
  width:100%; padding:13px 62px 13px 39px;
  font-family:var(--sans); font-size:16px; color:var(--ink);
  background:var(--surface); border:1.5px solid var(--line-forte); border-radius:9px;
  box-shadow:var(--sombra);
}
#busca::placeholder{color:var(--ink-3)}
#busca::-webkit-search-cancel-button{-webkit-appearance:none; appearance:none}
#busca:focus{outline:none; border-color:var(--accent); box-shadow:0 0 0 3px var(--accent-fraca)}
.atalho{
  position:absolute; right:11px; font-family:var(--mono); font-size:11px;
  color:var(--ink-3); background:var(--surface-2); border:1px solid var(--line);
  border-radius:5px; padding:2px 6px;
}
#limpar{
  position:absolute; right:10px; display:none; border:0; cursor:pointer;
  background:var(--surface-2); color:var(--ink-2); border-radius:5px;
  font-family:var(--mono); font-size:12px; padding:4px 8px;
}

.filtros{display:flex; gap:6px; flex-wrap:wrap; margin-top:10px}
.chip{
  font-family:var(--sans); font-size:12.5px; font-weight:500; cursor:pointer;
  padding:5px 11px; border-radius:99px; color:var(--ink-2);
  background:transparent; border:1px solid var(--line-forte);
}
.chip:hover{border-color:var(--accent); color:var(--accent-ink)}
.chip[aria-pressed="true"]{background:var(--accent); border-color:var(--accent); color:var(--chip-ativa)}
.chip:focus-visible,#busca:focus-visible,summary:focus-visible{outline:2px solid var(--accent); outline-offset:2px}
.placar{font-size:12.5px; color:var(--ink-3); padding:8px 0 2px; font-variant-numeric:tabular-nums}

.lista{padding-bottom:64px}
.item{
  background:var(--surface); border:1px solid var(--line); border-radius:10px;
  padding:14px 16px; margin-bottom:10px; border-left:3px solid var(--line-forte);
}
.item[data-fonte="revisao"]{border-left-color:var(--accent)}
.item[data-fonte="banco"]{border-left-color:var(--ink-3)}
.item[data-fonte="pratica"]{border-left-color:var(--aviso)}

.item-topo{display:flex; align-items:center; gap:8px; flex-wrap:wrap; margin-bottom:7px}
.selo{
  font-family:var(--mono); font-size:11px; font-weight:600; letter-spacing:.03em;
  padding:2px 7px; border-radius:5px; background:var(--accent-fraca); color:var(--accent-ink);
}
.item[data-fonte="banco"] .selo{background:var(--surface-2); color:var(--ink-2)}
.item[data-fonte="pratica"] .selo{background:var(--aviso-fraca); color:var(--aviso)}
.trilha{font-size:11.5px; color:var(--ink-3)}

.enunciado{font-family:var(--serif); font-size:16px; line-height:1.5; margin:0 0 10px}
.enunciado p{margin:0 0 8px}
.enunciado p:last-child{margin-bottom:0}

.resposta{
  display:flex; gap:9px; align-items:baseline; flex-wrap:wrap;
  background:var(--certo-fraca); border-radius:7px; padding:9px 12px; margin-bottom:9px;
}
.resposta .rot{
  font-family:var(--mono); font-size:10.5px; font-weight:600; letter-spacing:.06em;
  text-transform:uppercase; color:var(--certo); flex:none;
}
.resposta .val{font-weight:600; color:var(--ink)}
.porque{font-size:14px; color:var(--ink-2); margin:0 0 9px}
.porque p{margin:0 0 7px}
.porque p:last-child{margin-bottom:0}

details{margin-bottom:9px}
summary{
  cursor:pointer; font-size:12.5px; color:var(--accent-ink); font-weight:500;
  list-style:none; display:inline-flex; align-items:center; gap:5px;
}
summary::-webkit-details-marker{display:none}
summary::before{content:"\25B8"; font-size:10px}
details[open] summary::before{content:"\25BE"}
.alts{list-style:none; margin:9px 0 0; padding:0; display:flex; flex-direction:column; gap:5px}
.alts li{
  font-size:14px; padding:6px 10px; border-radius:6px;
  background:var(--surface-2); color:var(--ink-2);
}
.alts li.certa{background:var(--certo-fraca); color:var(--ink); font-weight:500}

.rodape-item{
  display:flex; flex-wrap:wrap; gap:6px 14px; font-size:11.5px; color:var(--ink-3);
  border-top:1px solid var(--line); padding-top:8px;
}
.rodape-item b{color:var(--ink-2); font-weight:500}
.rodape-item>span,.resposta .val,.marca .sub{min-width:0}

code{
  font-family:var(--mono); font-size:.9em; background:var(--surface-2);
  padding:1px 4px; border-radius:4px; overflow-wrap:anywhere;
}
.enunciado,.porque,.alts li,.rodape-item,.resposta .val{overflow-wrap:anywhere}
pre{
  font-family:var(--mono); font-size:12.5px; line-height:1.5;
  background:var(--surface-2); border:1px solid var(--line); border-radius:7px;
  padding:11px 13px; overflow-x:auto; margin:9px 0;
}
pre code{background:none; padding:0; font-size:inherit}
mark{background:var(--aviso-fraca); color:var(--ink); border-radius:3px; padding:0 1px}

.vazio{text-align:center; padding:48px 16px; color:var(--ink-3)}
.vazio p{margin:0 0 14px}
.sugestoes{display:flex; gap:6px; flex-wrap:wrap; justify-content:center}
.sugestoes button{
  font-family:var(--mono); font-size:12px; cursor:pointer; padding:5px 10px;
  border-radius:6px; border:1px solid var(--line-forte); background:var(--surface); color:var(--ink-2);
}
.sugestoes button:hover{border-color:var(--accent); color:var(--accent-ink)}

@media (max-width:480px){
  .topo-interno{padding:11px 14px 9px}
  .envolucro{padding-inline:14px}
  .atalho{display:none}
  .enunciado{font-size:15px}
}
@media (prefers-reduced-motion:reduce){*{transition:none!important; animation:none!important}}
'''

CORPO = '''
<header class="topo">
  <div class="topo-interno">
    <div class="marca">
      <h1>POO &middot; busca da prova</h1>
      <span class="sub">questões, respostas e erros de compilação</span>
    </div>
    <div class="campo">
      <svg viewBox="0 0 20 20" fill="none" stroke="currentColor" stroke-width="2" aria-hidden="true">
        <circle cx="9" cy="9" r="6"></circle><path d="M13.5 13.5 18 18"></path>
      </svg>
      <input id="busca" type="search" autocomplete="off" spellcheck="false"
             placeholder="digite a dúvida: static, finally, sobrecarga, missing return..."
             aria-label="Buscar nas questões e nos erros">
      <span class="atalho" id="dica-atalho">/</span>
      <button id="limpar" type="button" aria-label="Limpar busca">esc</button>
    </div>
    <div class="filtros" role="group" aria-label="Filtrar por fonte">
      <button class="chip" data-filtro="tudo" aria-pressed="true">Tudo</button>
      <button class="chip" data-filtro="revisao" aria-pressed="false">Revisão L07</button>
      <button class="chip" data-filtro="banco" aria-pressed="false">Banco extra</button>
      <button class="chip" data-filtro="pratica" aria-pressed="false">Prova prática</button>
    </div>
    <div class="placar" id="placar"></div>
  </div>
</header>

<main class="envolucro">
  <div class="lista" id="lista"></div>
</main>
'''

JS = r'''
const DADOS = __DADOS__;
const lista = document.getElementById('lista');
const campo = document.getElementById('busca');
const placar = document.getElementById('placar');
const limpar = document.getElementById('limpar');
const dicaAtalho = document.getElementById('dica-atalho');
const SENTINELA = '⁣';
let filtro = 'tudo';

const semAcento = (t) => t.normalize('NFD').replace(/[̀-ͯ]/g, '').toLowerCase();
const escapar = (t) => t.replace(/[&<>"]/g, (c) => ({'&':'&amp;','<':'&lt;','>':'&gt;','"':'&quot;'}[c]));

function md(texto, comBloco) {
  if (!texto) return '';
  const blocos = [];
  let t = texto.replace(/```(\w*)\n([\s\S]*?)```/g, (_, lang, codigo) => {
    blocos.push('<pre><code>' + escapar(codigo.replace(/\n$/, '')) + '</code></pre>');
    return SENTINELA + (blocos.length - 1) + SENTINELA;
  });
  t = escapar(t)
    .replace(/`([^`]+)`/g, '<code>$1</code>')
    .replace(/\*\*([^*]+)\*\*/g, '<b>$1</b>');
  if (comBloco) {
    t = t.split(/\n\s*\n/).map((p) => p.trim() ? '<p>' + p.trim().replace(/\n/g, ' ') + '</p>' : '').join('');
  } else {
    t = t.replace(/\n/g, ' ');
  }
  return t.replace(new RegExp(SENTINELA + '(\\d+)' + SENTINELA, 'g'), (_, i) => blocos[i]);
}

function realcar(html, termos) {
  if (!termos.length) return html;
  return html.split(/(<[^>]*>)/).map((parte) => {
    if (parte.startsWith('<')) return parte;
    let saida = parte;
    for (const termo of termos) {
      if (termo.length < 2) continue;
      const posicao = semAcento(saida).indexOf(termo);
      if (posicao === -1) continue;
      saida = saida.slice(0, posicao) + '<mark>' + saida.slice(posicao, posicao + termo.length)
            + '</mark>' + saida.slice(posicao + termo.length);
    }
    return saida;
  }).join('');
}

function cartao(e, termos) {
  const alternativas = e.alternativas.map((a) => {
    const certa = a.indexOf('✅') !== -1;
    const texto = a.replace(/^\*\*|\*\*$/g, '').replace('✅ ', '').replace(/^· /, '');
    return '<li class="' + (certa ? 'certa' : '') + '">' + realcar(md(texto), termos) + '</li>';
  }).join('');

  return '<article class="item" data-fonte="' + e.fonte + '">'
    + '<div class="item-topo"><span class="selo">' + escapar(e.id) + '</span>'
    + '<span class="trilha">' + escapar(e.parte || e.tipo) + '</span></div>'
    + '<div class="enunciado">' + realcar(md(e.enunciado, true), termos) + '</div>'
    + (e.resposta ? '<div class="resposta"><span class="rot">resposta</span>'
        + '<span class="val">' + realcar(md(e.resposta), termos) + '</span></div>' : '')
    + (e.porque ? '<div class="porque">' + realcar(md(e.porque, true), termos) + '</div>' : '')
    + (alternativas ? '<details><summary>ver alternativas</summary>'
        + '<ul class="alts">' + alternativas + '</ul></details>' : '')
    + '<div class="rodape-item">'
    + (e.chaves ? '<span><b>chaves:</b> ' + escapar(e.chaves) + '</span>' : '')
    + (e.onde ? '<span><b>onde:</b> ' + md(e.onde) + '</span>' : '')
    + '</div></article>';
}

function render() {
  const bruto = campo.value.trim();
  const termos = semAcento(bruto).split(/\s+/).filter(Boolean);
  limpar.style.display = bruto ? 'block' : 'none';
  if (dicaAtalho) dicaAtalho.style.display = bruto ? 'none' : '';

  // relevância: o que casa nas palavras-chave ou no enunciado vem antes
  const achados = DADOS.filter((e) => {
    if (filtro !== 'tudo' && e.fonte !== filtro) return false;
    return termos.every((t) => e.busca.indexOf(t) !== -1);
  }).map((e, ordem) => {
    let peso = 0;
    for (const t of termos) {
      if (e.alvoId.indexOf(t) !== -1) peso += 8;
      if (e.alvoChaves.indexOf(t) !== -1) peso += 4;
      if (e.alvoEnunciado.indexOf(t) !== -1) peso += 2;
      if (e.alvoResposta.indexOf(t) !== -1) peso += 1;
    }
    return { e, peso, ordem };
  }).sort((a, b) => b.peso - a.peso || a.ordem - b.ordem).map((x) => x.e);

  const palavra = achados.length === 1 ? ' resultado' : ' resultados';
  placar.textContent = achados.length + palavra + (bruto ? ' para "' + bruto + '"' : ' disponíveis');

  if (!achados.length) {
    lista.innerHTML = '<div class="vazio"><p>Nada encontrado com esse termo. Tente uma palavra sozinha:</p>'
      + '<div class="sugestoes">'
      + ['static', 'finally', 'sobrecarga', 'construtor', 'ArrayList', 'this', 'escopo', 'assertThrows']
          .map((s) => '<button type="button" data-sugestao="' + s + '">' + s + '</button>').join('')
      + '</div></div>';
    return;
  }
  lista.innerHTML = achados.map((e) => cartao(e, termos)).join('');
}

campo.addEventListener('input', render);
limpar.addEventListener('click', () => { campo.value = ''; campo.focus(); render(); });
document.addEventListener('click', (ev) => {
  const chip = ev.target.closest('.chip');
  if (chip) {
    filtro = chip.dataset.filtro;
    document.querySelectorAll('.chip').forEach((c) => c.setAttribute('aria-pressed', String(c === chip)));
    render();
    return;
  }
  const sugestao = ev.target.closest('[data-sugestao]');
  if (sugestao) { campo.value = sugestao.dataset.sugestao; campo.focus(); render(); }
});
document.addEventListener('keydown', (ev) => {
  if (ev.key === '/' && document.activeElement !== campo) { ev.preventDefault(); campo.focus(); }
  if (ev.key === 'Escape') { campo.value = ''; campo.blur(); render(); }
});

render();
if (window.matchMedia('(min-width:600px)').matches) campo.focus();
'''

TITULO = 'POO &middot; busca da prova'
nucleo = ('<style>' + CSS + '</style>\n' + CORPO + '\n<script>'
          + JS.replace('__DADOS__', DADOS) + '</script>')

standalone = ('<!doctype html>\n<html lang="pt-BR">\n<head>\n<meta charset="utf-8">\n'
              '<meta name="viewport" content="width=device-width,initial-scale=1">\n'
              '<title>' + TITULO + '</title>\n' + FONTES + '\n</head>\n<body>\n'
              + nucleo + '\n</body>\n</html>\n')
open(os.path.join(PASTA, 'busca.html'), 'w', encoding='utf-8').write(standalone)
print('escrito prova/busca.html')

destino = os.environ.get('SAIDA_ARTEFATO')
if destino:
    open(destino, 'w', encoding='utf-8').write(
        '<title>' + TITULO + '</title>\n' + FONTES + '\n' + nucleo + '\n')
    print('escrito', destino)
