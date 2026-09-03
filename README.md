# Sonora – Fase 03: Testes de unidade com JUnit 6

Plataforma de músicas, playlists e usuários feita em Java puro (sem coleções, sem herança,
sem build tool). Nesta fase entram os testes automatizados por cima das classes da Fase 02.

## Estrutura

```
sonora/
├── App.java                 menu de texto (main)
├── Musica.java              classes de produção (pacote padrão)
├── Usuario.java
├── Playlist.java
├── Plataforma.java
├── lib/
│   └── junit-platform-console-standalone-6.0.0.jar   JUnit 6 (API + engine + launcher)
├── test/                    uma classe espelho por classe de produção
│   ├── MusicaTest.java      PL01, PL02, PL07, PL08
│   ├── UsuarioTest.java     PL09, PL08
│   ├── PlaylistTest.java    PL03, PL04, PL05, PL10
│   └── PlataformaTest.java  PL06, PL11
├── PLANOS_DE_TESTE.md       tabelas Caso / Descrição / Entrada / Saída esperada
└── L0x - Unidade_y.pdf      enunciados das fases
```

`App.java` não tem classe de teste: é só o menu (entrada/saída no console).

## Rodar o App

```bash
javac -encoding UTF-8 -d out *.java
java -cp out App
```

## Rodar os testes pela linha de comando

Precisa de JDK 17 ou mais novo (o JUnit 6 exige). Na raiz do projeto:

```bash
javac -encoding UTF-8 -d out -cp lib/junit-platform-console-standalone-6.0.0.jar *.java test/*.java
java -jar lib/junit-platform-console-standalone-6.0.0.jar execute --class-path out --scan-classpath
```

O relatório sai em árvore, com o `@DisplayName` de cada caso. Pra rodar uma classe só:

```bash
java -jar lib/junit-platform-console-standalone-6.0.0.jar execute --class-path out --select-class PlaylistTest
```

No Windows os mesmos comandos funcionam no `cmd`/PowerShell (o `javac` expande o `*.java`).

## Rodar os testes na IDE

**IntelliJ IDEA** (roteiro dos slides):

1. `File > Project Structure` (ou botão direito no projeto > *Open Module Settings*).
2. Em *Libraries*, adicionar `lib/junit-platform-console-standalone-6.0.0.jar`.
3. Em *Modules > Sources*, marcar a pasta `test` como **Tests** (verde) e a raiz como *Sources*.
4. Botão direito em `test` > *Run 'All Tests'*.

**VS Code** (extensão *Extension Pack for Java*): o jar em `lib/` já é reconhecido como
*Referenced Library*; a pasta `test` aparece no painel *Testing* depois de abrir o projeto.

## Pontos de atenção encontrados ao escrever os testes

Os testes exigidos passam todos, mas eles expuseram detalhes de projeto que valem revisão:

- **`Plataforma` usa os contadores `static` das outras classes como se fossem seus.**
  `cadastrarMusica` guarda a música em `musicas[Musica.getContagem() - 1]`, e a checagem de
  "cheia" olha `Musica.getContagem() >= 500`. Ou seja, a posição e o limite dependem de quantas
  músicas **já foram criadas no programa inteiro**, não de quantas a plataforma guarda. Criar duas
  músicas e só depois cadastrar as duas faz a segunda sobrescrever a primeira. O mesmo vale pra
  `cadastrarUsuario` / `cadastrarPlaylist`. A correção é a `Plataforma` ter os próprios contadores
  (`quantidadeMusicas`, `quantidadeUsuarios`, `quantidadePlaylists`).
- **`Playlist.getTodasMusicas()` percorre `Musica.getContagem()`** em vez de `quantidade`; dá
  `NullPointerException` sempre que a playlist tem menos músicas do que o total criado.
- **`Plataforma.excluirMusica` faz `Musica.decContagem()`**, então a próxima música criada
  recebe um id repetido (o id da última que existia). Além disso o laço de deslocamento vai até
  `j <= contagem` lendo `musicas[j + 1]`, uma posição além do que está em uso, e dá
  `NullPointerException` se houver algum slot vazio no caminho.
- **Contadores de id não zeram entre os testes** (todas as classes rodam na mesma JVM). Os
  testes de id comparam valores relativos (`id2 == id1 + 1`) por causa disso.
