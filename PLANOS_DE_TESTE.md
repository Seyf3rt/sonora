# Sonora – Fase 03: Planos de teste

Cada linha vira um método de teste em `test/` (o `@DisplayName` do método é o texto da coluna
**Descrição**). Os planos PL01 e PL02 vieram prontos no enunciado; PL03 a PL08 são os pedidos;
PL09 a PL11 cobrem o resto do contrato da Fase 02 (construtores de `Usuario` e `Playlist` e o
cadastro na `Plataforma`), pra cada classe de produção ter a sua classe espelho completa.

> **Sobre o `buscarMusicaPorId(id)` do enunciado:** neste projeto a busca por id é a sobrecarga
> `Plataforma.buscarMusica(int id)`. O PL06 foi ajustado pra esse nome.
>
> **Sobre os ids:** os contadores de id (`Musica.contagem`, `Usuario.contagem`, `Playlist.contagem`)
> são `static` e não são zerados entre os testes, que rodam todos na mesma JVM. Por isso o PL08
> compara ids **relativos** (o 2º id é o 1º + 1) em vez de valores absolutos (1, 2, 3).

---

## PL01 – Validar `Musica.getDuracaoFormatada()`

Classe de teste: `MusicaTest`

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Duração com minutos e segundos | Música de 125 segundos | Deve resultar em `"02:05"` |
| 2 | Duração redonda em minutos | Música de 90 segundos | Deve resultar em `"01:30"` |
| 3 | Menos de um minuto, com zero à esquerda | Música de 5 segundos | Deve resultar em `"00:05"` |
| 4 | Dois dígitos nos minutos | Música de 600 segundos | Deve resultar em `"10:00"` |
| 5 | Valor logo abaixo de dez minutos | Música de 599 segundos | Deve resultar em `"09:59"` |

## PL02 – Validar construtor de `Musica` com dados inválidos

Classe de teste: `MusicaTest`

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Título vazio deve ser rejeitado | título `""`, artista `"Queen"`, duração 355 | Deve lançar `IllegalArgumentException` |
| 2 | Título nulo deve ser rejeitado | título `null`, artista `"Queen"`, duração 355 | Deve lançar `IllegalArgumentException` |
| 3 | Artista vazio deve ser rejeitado | título `"Bohemian Rhapsody"`, artista `""`, duração 355 | Deve lançar `IllegalArgumentException` |
| 4 | Duração zero deve ser rejeitada | título válido, artista válido, duração 0 | Deve lançar `IllegalArgumentException` |
| 5 | Duração negativa deve ser rejeitada | título válido, artista válido, duração -10 | Deve lançar `IllegalArgumentException` |
| 6 | Dados válidos criam a música | título `"Bohemian Rhapsody"`, artista `"Queen"`, duração 355 | Objeto criado, com id maior que zero e getters devolvendo os valores informados |
| 7 *(adicional)* | Título só com espaços deve ser rejeitado | título `"   "`, artista `"Queen"`, duração 355 | Deve lançar `IllegalArgumentException` |
| 8 *(adicional)* | A mensagem da exceção descreve o erro | título válido, artista válido, duração -30 | `IllegalArgumentException` com mensagem não vazia que cita o valor `-30` |

## PL03 – Validar `Playlist.adicionar(musica)`

Classe de teste: `PlaylistTest` · Cenário base (`@BeforeEach`): playlist vazia `"Clássicos do Rock"` com dono válido e três músicas criadas (Bohemian Rhapsody 355 s, Hotel California 391 s, Stairway to Heaven 482 s).

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Adicionar em playlist vazia retorna true e a quantidade vira um | `adicionar(bohemian)` na playlist vazia | Retorna `true`; `getQuantidade()` == 1 |
| 2 | Adicionar três músicas sobe a quantidade para três e mantém a ordem | `adicionar` de bohemian, hotel e stairway, nessa ordem | `getQuantidade()` == 3; posições 0, 1 e 2 devolvem bohemian, hotel e stairway |
| 3 | Adicionar até encher: todas as 100 adições retornam true | 100 chamadas de `adicionar` | Todas retornam `true`; `getQuantidade()` == 100 |
| 4 | A adição que ultrapassa a capacidade retorna false e a quantidade não muda | Playlist com 100 músicas, `adicionar(hotel)` | Retorna `false`; `getQuantidade()` continua 100 |
| 5 | Adicionar música nula lança IllegalArgumentException e nada é adicionado | `adicionar(null)` | Deve lançar `IllegalArgumentException`; `getQuantidade()` continua 0 |

## PL04 – Validar `Playlist.getNaPosicao(indice)`

Classe de teste: `PlaylistTest` · Playlist com `[bohemian, hotel, stairway]`, salvo onde indicado.

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Posição zero devolve a primeira música adicionada | `getNaPosicao(0)` | Devolve bohemian |
| 2 | Última posição válida devolve a última música adicionada | `getNaPosicao(getQuantidade() - 1)` | Devolve stairway |
| 3 | Índice negativo lança IndexOutOfBoundsException | `getNaPosicao(-1)` | Deve lançar `IndexOutOfBoundsException` |
| 4 | Índice igual à quantidade lança IndexOutOfBoundsException | `getNaPosicao(3)` numa playlist de 3 músicas | Deve lançar `IndexOutOfBoundsException` |
| 5 | Playlist vazia: posição zero lança IndexOutOfBoundsException | `getNaPosicao(0)` numa playlist vazia | Deve lançar `IndexOutOfBoundsException` |

## PL05 – Validar `Playlist.removerNaPosicao(indice)`

Classe de teste: `PlaylistTest` · Playlist com `[bohemian, hotel, stairway]`.

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Remover do meio: a música seguinte assume a posição e a quantidade cai em um | `removerNaPosicao(1)` | `getQuantidade()` == 2; posição 0 é bohemian e posição 1 é stairway (sem buraco) |
| 2 | Remover a primeira: a segunda música passa a ocupar a posição zero | `removerNaPosicao(0)` | `getQuantidade()` == 2; posição 0 é hotel e posição 1 é stairway |
| 3 | Remover a última: a quantidade cai e a antiga posição passa a ser inválida | `removerNaPosicao(2)` | `getQuantidade()` == 2; posição 1 é hotel; `getNaPosicao(2)` lança `IndexOutOfBoundsException` |
| 4 | Remoção de posição válida retorna true | `removerNaPosicao(1)` | Retorna `true` |
| 5 | Índice negativo lança IndexOutOfBoundsException e nada é removido | `removerNaPosicao(-1)` | Deve lançar `IndexOutOfBoundsException`; `getQuantidade()` continua 3 |
| 6 | Índice além da quantidade lança IndexOutOfBoundsException e nada é removido | `removerNaPosicao(3)` | Deve lançar `IndexOutOfBoundsException`; `getQuantidade()` continua 3 |
| 7 | A duração total acompanha a remoção | Duração total 1228 s; `removerNaPosicao(1)` (tira os 391 s de Hotel California) | `getDuracaoSegundos()` == 837 e `getDuracaoFormatada()` == `"13:57"` |

## PL06 – Validar `Plataforma.buscarMusica(titulo)` e `buscarMusica(id)`

Classe de teste: `PlataformaTest` · Cenário base (`@BeforeEach`): `Plataforma` nova com Bohemian Rhapsody e Hotel California cadastradas e o usuário Lucas cadastrado.

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Buscar por id de música cadastrada devolve a música | `buscarMusica(bohemian.getId())` e `buscarMusica(hotel.getId())` | Devolve bohemian e hotel, respectivamente |
| 2 | Buscar por título de música cadastrada devolve a música | `buscarMusica("Hotel California")` | Devolve hotel |
| 3 | Buscar por título ignora maiúsculas e minúsculas | `buscarMusica("bohemian rhapsody")` e `buscarMusica("BOHEMIAN RHAPSODY")` | Devolve bohemian nas duas |
| 4 | Buscar por id inexistente devolve null | `buscarMusica(Musica.getContagem() + 1)` (id que nunca foi gerado) | Devolve `null` |
| 5 | Buscar por título inexistente devolve null | `buscarMusica("Música que não existe")` | Devolve `null` |

## PL07 – Validar `Musica.reproduzir()`

Classe de teste: `MusicaTest` · Cenário base: `bohemian` = Bohemian Rhapsody (355 s), recém-criada.

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Música recém-criada começa com zero reproduções | `bohemian.getReproducoes()` sem nenhuma chamada | Deve resultar em 0 |
| 2 | Uma chamada de reproduzir() aumenta o contador em um | Uma chamada de `reproduzir()` | `getReproducoes()` == valor anterior + 1 |
| 3 | Três chamadas de reproduzir() resultam em três reproduções | Três chamadas de `reproduzir()` | `getReproducoes()` == 3 |
| 4 | Reproduzir uma música não altera o contador de outra | Duas chamadas de `reproduzir()` em bohemian; outra música sem chamadas | bohemian com 2 reproduções; a outra com 0 |

## PL08 (bônus) – Contadores de id

Classes de teste: `MusicaTest` (casos 1 a 4) e `UsuarioTest` (casos 5 e 6).

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | A segunda música criada recebe o id da primeira mais um | Duas músicas criadas em sequência | `segunda.getId()` == `primeira.getId() + 1` |
| 2 | Três músicas criadas em sequência têm ids consecutivos | Três músicas criadas em sequência | Ids são `id1`, `id1 + 1` e `id1 + 2` |
| 3 | Criar um usuário entre duas músicas não interfere nos ids de Música | Música, depois um `Usuario`, depois outra música | A 2ª música tem id da 1ª + 1 (o usuário não consumiu id de música) |
| 4 | O id da música é igual ao total de músicas criadas até ela | Uma música nova | `getId()` == `Musica.getContagem()` (a 1ª recebe 1, a 2ª recebe 2, ...) |
| 5 | Dois usuários criados em sequência têm ids consecutivos | Dois usuários criados em sequência | `segundo.getId()` == `primeiro.getId() + 1` |
| 6 | Criar uma música entre dois usuários não interfere nos ids de Usuário | Usuário, depois uma `Musica`, depois outro usuário | O 2º usuário tem id do 1º + 1 |

## PL09 – Validar construtor de `Usuario` com dados inválidos

Classe de teste: `UsuarioTest`

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Nome vazio deve ser rejeitado | nome `""`, e-mail `"lucas@sonora.com"` | Deve lançar `IllegalArgumentException` |
| 2 | Nome nulo deve ser rejeitado | nome `null`, e-mail `"lucas@sonora.com"` | Deve lançar `IllegalArgumentException` |
| 3 | E-mail vazio deve ser rejeitado | nome `"Lucas"`, e-mail `""` | Deve lançar `IllegalArgumentException` |
| 4 | E-mail nulo deve ser rejeitado | nome `"Lucas"`, e-mail `null` | Deve lançar `IllegalArgumentException` |
| 5 | E-mail sem @ deve ser rejeitado | nome `"Lucas"`, e-mail `"lucas.sonora.com"` | Deve lançar `IllegalArgumentException` com mensagem não vazia |
| 6 | Dados válidos criam o usuário | nome `"Lucas"`, e-mail `"lucas@sonora.com"` | Objeto criado, id maior que zero, `getNome()` e `getEmail()` devolvem os valores informados |

## PL10 – Validar construtor de `Playlist`

Classe de teste: `PlaylistTest`

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Título vazio deve ser rejeitado | título `""`, dono válido | Deve lançar `IllegalArgumentException` |
| 2 | Título nulo deve ser rejeitado | título `null`, dono válido | Deve lançar `IllegalArgumentException` |
| 3 | Dono nulo deve ser rejeitado | título `"Clássicos do Rock"`, dono `null` | Deve lançar `IllegalArgumentException` |
| 4 | Dados válidos criam a playlist vazia | título `"Clássicos do Rock"`, dono válido | Id maior que zero, `getTitulo()` e `getDono()` corretos, `getQuantidade()` == 0 e `getDuracaoSegundos()` == 0 |

## PL11 – Validar `Plataforma.cadastrarMusica` e `cadastrarUsuario`

Classe de teste: `PlataformaTest` · Mesmo cenário base do PL06.

| Caso | Descrição | Entrada | Saída esperada |
|---|---|---|---|
| 1 | Música nula não é cadastrada (retorna false) | `cadastrarMusica(null)` | Retorna `false` |
| 2 | Música válida é cadastrada (retorna true) e passa a ser encontrada | `cadastrarMusica(stairway)` | Retorna `true`; `buscarMusica(id)` e `buscarMusica("Stairway to Heaven")` devolvem stairway |
| 3 | Usuário nulo não é cadastrado (retorna false) | `cadastrarUsuario(null)` | Retorna `false` |
| 4 | Usuário válido é cadastrado (retorna true) | `cadastrarUsuario(ana)` | Retorna `true` |

> O caso "estrutura cheia retorna false" do contrato **não** foi automatizado pra `Plataforma`:
> ela usa o contador global `Musica.getContagem()` como limite (500), e não a quantidade de músicas
> que ela mesma guarda. Encher esse contador num teste estragaria todos os outros testes que
> cadastram música depois. Ver a seção "Pontos de atenção" no README.
