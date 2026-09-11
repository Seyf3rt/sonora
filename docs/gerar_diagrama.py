# -*- coding: utf-8 -*-
"""Gera docs/diagrama-classes.svg: classes do Sonora + as associações com os
quatro adornos (papel, nome com direção, multiplicidade e navegabilidade)."""

LINHA = 30
CAB = 60
PAD = 18
FS = 19

def esc(t):
    return t.replace('&', '&amp;').replace('<', '&lt;').replace('>', '&gt;')

class Caixa:
    def __init__(self, nome, x, y, w, atributos, metodos):
        self.nome, self.x, self.y, self.w = nome, x, y, w
        self.atributos, self.metodos = atributos, metodos
        self.h = CAB + PAD * 2 + LINHA * len(atributos) + PAD * 2 + LINHA * len(metodos)

    @property
    def dir(self): return self.x + self.w
    @property
    def baixo(self): return self.y + self.h
    @property
    def cx(self): return self.x + self.w / 2
    @property
    def cy(self): return self.y + self.h / 2

    def svg(self):
        y1 = self.y + CAB
        y2 = y1 + PAD * 2 + LINHA * len(self.atributos)
        p = [f'<rect x="{self.x}" y="{self.y}" width="{self.w}" height="{self.h}" '
             f'fill="#ffffff" stroke="#111111" stroke-width="3"/>',
             f'<line x1="{self.x}" y1="{y1}" x2="{self.dir}" y2="{y1}" stroke="#111111" stroke-width="3"/>',
             f'<line x1="{self.x}" y1="{y2}" x2="{self.dir}" y2="{y2}" stroke="#111111" stroke-width="3"/>',
             f'<text x="{self.cx}" y="{self.y + 40}" text-anchor="middle" font-size="27" '
             f'font-weight="bold" font-family="DejaVu Sans, Arial, sans-serif">{esc(self.nome)}</text>']

        def bloco(itens, topo):
            saida = []
            for i, item in enumerate(itens):
                texto, estatico = (item, False) if isinstance(item, str) else item
                dec = ' text-decoration="underline"' if estatico else ''
                saida.append(
                    f'<text x="{self.x + 22}" y="{topo + PAD + LINHA * i + 21}" font-size="{FS}" '
                    f'font-family="DejaVu Sans, Arial, sans-serif"{dec}>{esc(texto)}</text>')
            return saida

        p += bloco(self.atributos, y1)
        p += bloco(self.metodos, y2)
        return '\n'.join(p)


musica = Caixa('Musica', 1040, 200, 500, [
    ('- contagem: int', True),
    '- id: int',
    '- titulo: String',
    '- artista: String',
    '- duracaoSegundos: int',
    '- reproducoes: int',
], [
    '+ Musica(titulo: String, artista: String,',
    '             duracaoSegundos: int)',
    '+ getId(): int',
    '+ getTitulo(): String',
    '+ getArtista(): String',
    '+ getDuracaoSegundos(): int',
    '+ getReproducoes(): int',
    '+ reproduzir(): void',
    '+ getDuracaoFormatada(): String',
    '+ informacoes(): String',
    ('+ getContagem(): int', True),
])

playlist = Caixa('Playlist', 1040, 990, 560, [
    ('- contagem: int', True),
    '- id: int',
    '- titulo: String',
    '- dono: Usuario',
    '- musicas: ArrayList<Musica>',
], [
    '+ Playlist(titulo: String, dono: Usuario)',
    '+ getId(): int',
    '+ getTitulo(): String',
    '+ getDono(): Usuario',
    '+ getQuantidade(): int',
    '+ adicionar(musica: Musica): boolean',
    '+ getNaPosicao(indice: int): Musica',
    '+ removerNaPosicao(indice: int): boolean',
    '+ posicaoDe(idMusica: int): int',
    '+ getDuracaoSegundos(): int',
    '+ getDuracaoFormatada(): String',
    '+ getTodasMusicas(): String',
    '+ reproduzirTudo(): void',
    '+ informacoes(): String',
    ('+ getContagem(): int', True),
])

usuario = Caixa('Usuario', 1820, 570, 600, [
    ('- contagem: int', True),
    '- id: int',
    '- nome: String',
    '- email: String',
    '- seguindo: ArrayList<Usuario>',
], [
    '+ Usuario(nome: String, email: String)',
    '+ getId(): int',
    '+ getNome(): String',
    '+ getEmail(): String',
    '+ seguir(outro: Usuario): void',
    '+ deixarDeSeguir(outro: Usuario): void',
    '+ getQuantidadeSeguindo(): int',
    '+ segue(outro: Usuario): boolean',
    '+ getSeguindo(): ArrayList<Usuario>',
    '+ informacoes(): String',
    ('+ getContagem(): int', True),
])

plataforma = Caixa('Plataforma', 60, 200, 740, [
    '- musicas: ArrayList<Musica>',
    '- usuarios: ArrayList<Usuario>',
    '- playlists: ArrayList<Playlist>',
], [
    '+ cadastrarMusica(musica: Musica): boolean',
    '+ getTotalMusicas(): int',
    '+ getTodasMusicas(): String',
    '+ buscarMusica(id: int): Musica',
    '+ buscarMusica(titulo: String): Musica',
    '+ excluirMusica(idMusica: int): boolean',
    '+ cadastrarUsuario(usuario: Usuario): boolean',
    '+ getTotalUsuarios(): int',
    '+ buscarUsuario(id: int): Usuario',
    '+ getInfoUsuarios(): String',
    '+ getInfoUsuario(id: int): String',
    '+ excluirUsuario(id: int): boolean',
    '+ seguirUsuario(idSeguidor: int, idSeguido: int): void',
    '+ deixarDeSeguirUsuario(idSeguidor: int, idSeguido: int): void',
    '+ getSeguindo(id: int): String',
    '+ getSeguidores(id: int): String',
    '+ cadastrarPlaylist(nome: String, idDono: int): boolean',
    '+ getTotalPlaylists(): int',
    '+ buscarPlaylist(id: int): Playlist',
    '+ getInfoPlaylist(id: int): String',
    '+ getTodasPlaylists(): String',
    '+ getTodasMusicasPlaylist(idPlaylist: int): String',
    '+ addMusicaPlaylist(idPlaylist: int, idMusica: int): boolean',
    '+ excluirMusicaPlaylist(idPlaylist: int, idMusica: int): boolean',
    '+ excluirPlaylist(idPlaylist: int): boolean',
    '+ getMusicaPlaylist(idPlaylist: int, posicao: int): Musica',
    '+ tocarPlaylist(id: int): void',
    '- exigirUsuario(id: int): Usuario',
    '- exigirPlaylist(id: int): Playlist',
])

caixas = [plataforma, musica, playlist, usuario]

partes = []

def linha(pontos, cor='#111111'):
    d = ' '.join(f'{x},{y}' for x, y in pontos)
    partes.append(f'<polyline points="{d}" fill="none" stroke="{cor}" stroke-width="3"/>')

def seta(ponta, direcao, cor='#111111'):
    """Seta ABERTA da UML: navegabilidade naquela direção."""
    x, y = ponta
    t = 20
    if direcao == 'direita':
        pts = [(x - t, y - t * 0.62), (x, y), (x - t, y + t * 0.62)]
    elif direcao == 'esquerda':
        pts = [(x + t, y - t * 0.62), (x, y), (x + t, y + t * 0.62)]
    elif direcao == 'cima':
        pts = [(x - t * 0.62, y + t), (x, y), (x + t * 0.62, y + t)]
    else:
        pts = [(x - t * 0.62, y - t), (x, y), (x + t * 0.62, y - t)]
    d = ' '.join(f'{px},{py}' for px, py in pts)
    partes.append(f'<polyline points="{d}" fill="none" stroke="{cor}" stroke-width="3" '
                  f'stroke-linecap="round" stroke-linejoin="round"/>')

def texto(x, y, t, anchor='middle', tam=19, peso='normal', estilo='normal', cor='#111111'):
    partes.append(f'<text x="{x}" y="{y}" text-anchor="{anchor}" font-size="{tam}" '
                  f'font-weight="{peso}" font-style="{estilo}" fill="{cor}" '
                  f'font-family="DejaVu Sans, Arial, sans-serif">{esc(t)}</text>')

def nome_assoc(x, y, t, anchor='middle'):
    texto(x, y, t, anchor=anchor, tam=21, estilo='italic')

# ------------------------------------------------------------------
# 1. Plataforma cadastra ▶ Musica   (1 para 0..*, unidirecional)
# ------------------------------------------------------------------
linha([(plataforma.dir, 440), (musica.x, 440)])
seta((musica.x, 440), 'direita')
nome_assoc((plataforma.dir + musica.x) / 2, 420, 'cadastra ▶')
texto(plataforma.dir + 14, 480, '1', anchor='start')
texto(musica.x - 14, 480, '0..*', anchor='end')
texto(musica.x - 14, 506, '- acervo', anchor='end')

# ------------------------------------------------------------------
# 2. Plataforma registra ▶ Usuario  (1 para 0..*, unidirecional)
#    contorna por baixo, pra não cruzar as outras caixas
# ------------------------------------------------------------------
linha([(700, plataforma.y), (700, 110), (2680, 110), (2680, 1040), (usuario.dir, 1040)])
seta((usuario.dir, 1040), 'esquerda')
nome_assoc(1690, 92, 'registra ▶')
texto(676, plataforma.y - 16, '1', anchor='end')
texto(usuario.dir + 18, 1020, '0..*', anchor='start')
texto(usuario.dir + 18, 994, '- usuarios', anchor='start')

# ------------------------------------------------------------------
# 3. Plataforma hospeda ▶ Playlist  (1 para 0..*, unidirecional)
# ------------------------------------------------------------------
linha([(plataforma.dir, 1150), (playlist.x, 1150)])
seta((playlist.x, 1150), 'direita')
nome_assoc((plataforma.dir + playlist.x) / 2, 1130, 'hospeda ▶')
texto(plataforma.dir + 14, 1190, '1', anchor='start')
texto(playlist.x - 14, 1190, '0..*', anchor='end')
texto(playlist.x - 14, 1216, '- playlists', anchor='end')

# ------------------------------------------------------------------
# 4. Playlist contém ▶ Musica  (0..* para 0..*, unidirecional)
# ------------------------------------------------------------------
linha([(1260, playlist.y), (1260, musica.baixo)])
seta((1260, musica.baixo), 'cima')
nome_assoc(1282, (playlist.y + musica.baixo) / 2 + 8, 'contém ▲', anchor='start')
texto(1240, playlist.y - 16, '0..*', anchor='end')
texto(1240, musica.baixo + 34, '0..*', anchor='end')
texto(1240, musica.baixo + 60, '- faixas', anchor='end')

# ------------------------------------------------------------------
# 5. Usuario cria ▶ Playlist  (1 dono para 0..* playlists, unidirecional
#    Playlist -> Usuario: só a Playlist guarda o dono)
# ------------------------------------------------------------------
linha([(playlist.dir, 1100), (usuario.x, 1100)])
seta((usuario.x, 1100), 'direita')
nome_assoc((playlist.dir + usuario.x) / 2, 1080, '◀ cria')
texto(playlist.dir + 14, 1140, '0..*', anchor='start')
texto(playlist.dir + 14, 1166, '- playlists', anchor='start')
texto(usuario.x - 14, 1140, '1', anchor='end')
texto(usuario.x - 14, 1166, '- dono', anchor='end')

# ------------------------------------------------------------------
# 6. Usuario segue ▶ Usuario  (reflexiva, 0..* dos dois lados)
# ------------------------------------------------------------------
linha([(1930, usuario.y), (1930, 420), (2330, 420), (2330, usuario.y)])
seta((2330, usuario.y), 'baixo')
nome_assoc(2130, 402, 'segue ▶')
texto(1914, usuario.y - 18, '0..*', anchor='end')
texto(1914, usuario.y - 44, '- seguidores', anchor='end')
texto(2346, usuario.y - 18, '0..*', anchor='start')
texto(2346, usuario.y - 44, '- seguindo', anchor='start')

# ------------------------------------------------------------------
# Legenda
# ------------------------------------------------------------------
LX, LY, LW, LH = 1700, 1380, 900, 400
partes.append(f'<rect x="{LX}" y="{LY}" width="{LW}" height="{LH}" fill="#f6f6f6" '
              f'stroke="#111111" stroke-width="3"/>')
texto(LX + 24, LY + 44, 'Como ler os adornos', anchor='start', tam=24, peso='bold')
legenda = [
    '- papel       nome do lado da associação (ex.: - faixas)',
    'nome ▶        verbo e direção de leitura (ex.: Plataforma cadastra ▶ Musica)',
    '0..* / 1       multiplicidade em cada ponta',
    '——▶           navegabilidade: a seta aberta marca o único lado navegável;',
    '                      sem seta nenhuma, a associação seria bidirecional',
    '',
    'Todas as associações do Sonora são unidirecionais: só o lado de onde a seta',
    'sai guarda a referência para o outro. Musica, por exemplo, não sabe em que',
    'playlists está, e Usuario não conhece a Plataforma que o registrou.',
]
for i, l in enumerate(legenda):
    texto(LX + 24, LY + 86 + i * 30, l, anchor='start', tam=18)

texto(60, 96, 'Sonora · Fase 05 — diagrama de classes', anchor='start', tam=30, peso='bold')
texto(60, 130, 'papel · nome com direção · multiplicidade · navegabilidade',
      anchor='start', tam=18, estilo='italic')

JX, JY, JW, JH = 60, 1380, 880, 400
partes.append(f'<rect x="{JX}" y="{JY}" width="{JW}" height="{JH}" fill="#f6f6f6" '
              f'stroke="#111111" stroke-width="3"/>')
texto(JX + 24, JY + 44, 'Por que estas multiplicidades', anchor='start', tam=24, peso='bold')
justificativas = [
    'cadastra: a plataforma é uma só (1) e o acervo pode estar vazio',
    'ou ter quantas músicas forem cadastradas (0..*).',
    'registra / hospeda: mesma leitura, para usuários e playlists.',
    'contém: uma playlist pode estar vazia e a mesma música pode',
    'aparecer em várias playlists, então 0..* nas duas pontas.',
    'cria: toda playlist tem exatamente 1 dono (o construtor recusa',
    'dono nulo) e um usuário pode ter 0..* playlists.',
    'segue: quem entra na plataforma não segue ninguém, e não há',
    'teto para quantos segue ou por quantos é seguido (0..* / 0..*).',
]
for i, l in enumerate(justificativas):
    texto(JX + 24, JY + 86 + i * 30, l, anchor='start', tam=18)

W, H = 2780, 1840
svg = [f'<svg xmlns="http://www.w3.org/2000/svg" width="{W}" height="{H}" viewBox="0 0 {W} {H}">',
       f'<rect width="{W}" height="{H}" fill="#ffffff"/>',
       '<text x="60" y="1830" font-size="1" fill="#ffffff">.</text>']
svg += partes
svg += [c.svg() for c in caixas]
svg.append('</svg>')

open('docs/diagrama-classes.svg', 'w', encoding='utf-8').write('\n'.join(svg))
print('svg gerado')
for c in caixas:
    print(f'{c.nome}: x={c.x} y={c.y} w={c.w} h={c.h} baixo={c.baixo} dir={c.dir}')
