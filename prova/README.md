# Material de prova — POO / FURB

## O arquivo principal

**`Questoes POO - prova.pdf`** — 28 páginas com as **88 questões respondidas**, prontas para
imprimir ou ler no celular.

- **Parte I** — as 30 questões da lista de revisão do professor (L07), na íntegra, com a
  alternativa correta marcada e a explicação.
- **Parte II** — 58 questões extras, escritas a partir do material da disciplina, nos mesmos três
  formatos da prova: assinalar, somatória e relacionar colunas. Cobrem os mesmos assuntos da
  revisão e mais associações, multiplicidade e `ArrayList`, que a lista não cobre.

Tem índice no começo, gabarito em tabela ao fim de cada parte, e as duas ressalvas importantes
(a questão 16, cujo código não compila em Java de verdade, e a afirmativa 01 da questão 27).

## O resto da pasta

| Arquivo | O que é |
|---|---|
| `ERROS_PROVA_PRATICA.md` | os erros mais comuns da prova prática, com as mensagens reais do compilador, esqueletos de código e checklist |
| `QUESTOES_RESPONDIDAS.md` | as 30 questões da Parte I em markdown (é a fonte do PDF) |
| `BANCO_DE_QUESTOES.md` | as 58 questões da Parte II em markdown (é a fonte do PDF) |
| `L07_Revisao_Prova_respondida.docx` | o documento original da revisão, preenchido |
| `material-do-professor/` | cópia offline do repositório da disciplina |

## Material do professor

Cópia de [afburger/FURB-2026_02_POO_16804](https://github.com/afburger/FURB-2026_02_POO_16804),
commit `41a060b3c2faee3b9e981e7368494a6a36286012`, para funcionar sem internet:

- `Conteudo/Unidade01.md` — fundamentos, escopo, encapsulamento, membros de classe, exceções
- `Conteudo/Unidade02.md` — qualidade de software e testes com JUnit
- `Conteudo/Unidade03.md` — associações, ArrayList e multiplicidade
- `ProjetoPratico/src/` — o código de aula e as resoluções das listas, inclusive o Sonora
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
  navegabilidade, cada uma justificada.
- `../docs/diagrama-classes.png` — o diagrama pronto.
- `../test/` — 83 testes JUnit funcionando, bons como modelo.
