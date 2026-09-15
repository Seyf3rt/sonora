# Material de prova — POO / FURB

Tudo o que dá para consultar durante a prova, reunido em um lugar só. São duas provas: uma
**teórica** (a lista L07 é o melhor retrato dela) e uma **prática** (escrever código Java).

## Comece por aqui

**Abra `busca.html`** (duplo clique, funciona sem internet). É uma página só, com um campo de
busca no topo: você digita a dúvida e as questões aparecem na hora, com a resposta em destaque.
Cobre as três fontes ao mesmo tempo — as 30 questões da revisão, as 58 do banco extra e os erros
da prova prática, 133 entradas no total.

Atalhos: `/` foca o campo, `Esc` limpa. Os botões no topo filtram por fonte.

Se preferir ler em vez de buscar, os arquivos abaixo são a mesma informação em markdown.

| Se você… | Abra |
|---|---|
| quer achar qualquer coisa rápido | **`busca.html`** |
| está na prova teórica e quer achar uma questão | **`BUSCA_POR_PALAVRA_CHAVE.md`** |
| quer a questão inteira, com todas as alternativas e o porquê | **`QUESTOES_RESPONDIDAS.md`** |
| não achou a questão na lista de revisão | **`BANCO_DE_QUESTOES.md`** (58 questões extras) |
| está na prova prática e travou, ou o código não compila | **`ERROS_PROVA_PRATICA.md`** |
| quer a teoria completa do professor | `material-do-professor/Conteudo/` |
| quer código pronto para se basear | `material-do-professor/ProjetoPratico/src/` |
| quer o documento original da revisão | `L07_Revisao_Prova_respondida.docx` |

## Fluxo de consulta, na hora da prova

Com o `busca.html` aberto, é um passo só: digite uma palavra do enunciado e leia a resposta. O
resultado mais relevante vem primeiro, porque a busca pesa palavra-chave e enunciado acima do
resto. Serve também para a prática: cole a mensagem do compilador, por exemplo
`missing return statement`, e a correção aparece.

Sem o `busca.html`, pelos arquivos markdown:

1. Pegue **uma palavra literal** do enunciado da prova.
2. Ctrl+F em `BUSCA_POR_PALAVRA_CHAVE.md` → a tabela dá a resposta direta e o número da questão.
3. Precisa conferir as alternativas? Ctrl+F o mesmo termo em `QUESTOES_RESPONDIDAS.md` (as 30 da
   revisão) ou em `BANCO_DE_QUESTOES.md` (as 58 extras). O índice diz qual dos dois abrir: **Q**
   é da revisão, **B** é do banco extra.
4. Ainda em dúvida? A linha "Onde estudar" de cada questão aponta a seção exata do material do
   professor.

## O que tem em cada arquivo

### `busca.html`
A página de busca. Um arquivo só, sem instalação e sem internet: abra no navegador e use. É
gerada a partir dos três arquivos de questões e erros por `gerar_busca_html.py` — se editar
qualquer um deles, rode `python3 prova/gerar_busca_html.py` para atualizar a página.

### `BUSCA_POR_PALAVRA_CHAVE.md`
O ponto de entrada. Resposta relâmpago das 30 questões da revisão e das 58 do banco extra, índice
alfabético com 372 palavras-chave apontando para as duas fontes, consulta rápida de sintaxe
(ArrayList, associações, multiplicidade) e as pegadinhas que se repetem nas alternativas.

### `BANCO_DE_QUESTOES.md`
58 questões **novas**, escritas a partir da teoria do professor, nos mesmos três formatos da
prova: assinalar, somatória e relacionar colunas. Existe para o caso de cair uma questão que não
está na lista de revisão. Cobre as mesmas partes da L07 e mais associações, multiplicidade e
`ArrayList`, que a revisão não cobre. Cada questão diz de qual seção do material ela saiu.

### `QUESTOES_RESPONDIDAS.md`
As 30 questões na íntegra, com a alternativa correta marcada, uma frase explicando o porquê, as
palavras-chave e o ponto do material onde estudar. No fim, duas ressalvas: a questão 16, cujo
código não compila em Java de verdade, e a afirmativa 01 da questão 27.

### `ERROS_PROVA_PRATICA.md`
O guia anti-pane. Protocolo dos primeiros cinco minutos, o que fazer quando travar, e três
listas de erros: os que o compilador pega, os que compilam e enganam (setter sem `this`,
`==` em texto, divisão inteira), e os que estouram rodando. Todas as mensagens de erro foram
reproduzidas no compilador — é o texto exato que aparece na tela. Tem ainda sete esqueletos de
código prontos para copiar e um checklist para antes de entregar.

### `material-do-professor/`
Cópia do repositório público da disciplina,
[afburger/FURB-2026_02_POO_16804](https://github.com/afburger/FURB-2026_02_POO_16804),
no commit `41a060b3c2faee3b9e981e7368494a6a36286012`. Está aqui para funcionar **offline**, sem depender de internet na hora da
prova. Conteúdo:

- `Conteudo/Unidade01.md` — fundamentos, escopo, encapsulamento, membros de classe, exceções
- `Conteudo/Unidade02.md` — qualidade de software e testes com JUnit
- `Conteudo/Unidade03.md` — associações, ArrayList e multiplicidade
- `ProjetoPratico/src/exemplos/` — o código mostrado em aula, por unidade
- `ProjetoPratico/src/exercicios/` — as resoluções das listas, inclusive o Sonora (listas 3 e 4)
- `ProjetoPratico/test/` — os testes JUnit do professor
- `Cronograma_Ter_Qui.md` — o cronograma da disciplina

## Escopo das provas

**Teórica.** A L07 cobre, nesta ordem: paradigmas de programação, conceitos de classe e objeto,
UML e diagrama de classes, implementação e memória (Heap/Stack), escopo de variáveis,
encapsulamento, membros de classe, sobrecarga, construtores, lançamento e tratamento de exceções,
e testes de unidade.

**Prática.** O mais provável é escrever classes no mesmo formato do Sonora: atributos privados,
construtor que valida e lança `IllegalArgumentException`, getters, associações com `ArrayList`.
Os esqueletos da seção 7 de `ERROS_PROVA_PRATICA.md` cobrem esse formato.

> **Observação sobre datas:** o cronograma do professor marca a P1 (unidades 1 a 3) para
> 08/09/2026. Se a sua prova é outra data, o conteúdo da L07 continua sendo o melhor guia do que
> vai cair.

## O resto do repositório também serve

- `../docs/MODELAGEM.md` — as seis associações do Sonora com papel, nome, multiplicidade e
  navegabilidade, cada uma justificada. É o melhor resumo de associações que você tem.
- `../docs/diagrama-classes.png` — o diagrama pronto.
- `../test/` — 83 testes JUnit funcionando, bons como modelo.
- `../PLANOS_DE_TESTE.md` — os planos de teste em formato de tabela.
