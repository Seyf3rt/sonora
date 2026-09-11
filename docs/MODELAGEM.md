# Sonora – Fase 05: modelagem dos relacionamentos

Diagrama: [`diagrama-classes.png`](diagrama-classes.png)
(fonte editável: [`diagrama-classes.svg`](diagrama-classes.svg), gerado por
[`gerar_diagrama.py`](gerar_diagrama.py)).

Cada associação abaixo traz os quatro adornos pedidos: **papel**, **nome com direção de
leitura**, **multiplicidade nas duas pontas** e **navegabilidade**. A justificativa é sempre
o código da Fase 05 — o diagrama descreve o que as classes de fato guardam.

> **Regra que vale para todas:** só existe navegação onde existe atributo. Se `A` guarda uma
> referência para `B` e `B` não guarda nada de `A`, a associação é unidirecional de `A` para
> `B`, com a seta aberta na ponta de `B`.

---

## 1. Plataforma → Musica (o acervo)

| Adorno | Valor |
|---|---|
| Nome | `Plataforma` **cadastra ▶** `Musica` |
| Papéis | lado `Musica`: `- acervo` |
| Multiplicidade | `Plataforma` **1** — `Musica` **0..\*** |
| Navegabilidade | unidirecional, `Plataforma` → `Musica` |

**Multiplicidade.** Do lado da plataforma é `1`: uma música cadastrada pertence ao acervo de
uma única plataforma (o `App` cria uma só). Do lado da música é `0..*`: a plataforma nasce com
o acervo vazio (`new ArrayList<>()`) e não há teto para quantas músicas cabem — foi justamente
a troca do `Musica[500]` por `ArrayList<Musica>` que tirou o limite de 500.

**Navegabilidade.** `Plataforma` tem o atributo `musicas`, então caminha até as músicas
(`buscarMusica`, `getTodasMusicas`). `Musica` não tem nenhum atributo de plataforma e nem
precisa: uma música não sabe onde está cadastrada. Por isso a seta aparece só na ponta da
`Musica`.

## 2. Plataforma → Usuario (os registrados)

| Adorno | Valor |
|---|---|
| Nome | `Plataforma` **registra ▶** `Usuario` |
| Papéis | lado `Usuario`: `- usuarios` |
| Multiplicidade | `Plataforma` **1** — `Usuario` **0..\*** |
| Navegabilidade | unidirecional, `Plataforma` → `Usuario` |

**Multiplicidade.** Mesma leitura do acervo: uma plataforma (`1`) para nenhum ou muitos
usuários (`0..*`), já que a lista começa vazia e cresce sem limite.

**Navegabilidade.** `Plataforma.usuarios` permite ir da plataforma até o usuário
(`buscarUsuario`, `getInfoUsuarios`, `excluirUsuario`). `Usuario` não guarda a plataforma.

## 3. Plataforma → Playlist (as playlists hospedadas)

| Adorno | Valor |
|---|---|
| Nome | `Plataforma` **hospeda ▶** `Playlist` |
| Papéis | lado `Playlist`: `- playlists` |
| Multiplicidade | `Plataforma` **1** — `Playlist` **0..\*** |
| Navegabilidade | unidirecional, `Plataforma` → `Playlist` |

Esta não estava na lista do enunciado, mas existe no código (`ArrayList<Playlist> playlists`) e
por isso está desenhada: um diagrama que a omitisse não descreveria a `Plataforma` de verdade.

## 4. Usuario ← Playlist (o dono)

| Adorno | Valor |
|---|---|
| Nome | `Usuario` **cria ▶** `Playlist` (lido da esquerda para a direita no diagrama: **◀ cria**) |
| Papéis | lado `Usuario`: `- dono` · lado `Playlist`: `- playlists` |
| Multiplicidade | `Usuario` **1** — `Playlist` **0..\*** |
| Navegabilidade | unidirecional, `Playlist` → `Usuario` |

**Multiplicidade.** Do lado do usuário é exatamente `1`, e isso está garantido no código: o
construtor `Playlist(String, Usuario)` lança `IllegalArgumentException` se o dono for nulo, ou
seja, não existe playlist órfã (`0..1` seria errado). Do lado da playlist é `0..*`: um usuário
recém-criado não tem nenhuma e pode criar quantas quiser.

**Navegabilidade.** Aqui a seta vai no sentido contrário ao da leitura do nome, e isso é
proposital: quem guarda a referência é a `Playlist`, no atributo `dono`. O `Usuario` **não** tem
uma lista de playlists — quem responde "quais são as playlists do Lucas" é a `Plataforma`,
percorrendo o acervo dela. Então navega-se de `Playlist` para `Usuario`, nunca ao contrário.

**Consequência no código.** Como o usuário não conhece as próprias playlists,
`Plataforma.excluirUsuario` precisa varrer a lista de playlists para apagar as do usuário
excluído (`playlists.removeIf(p -> p.getDono() == usuario)`).

## 5. Playlist → Musica (as faixas) — o exemplo do enunciado

| Adorno | Valor |
|---|---|
| Nome | `Playlist` **contém ▶** `Musica` |
| Papéis | lado `Musica`: `- faixas` |
| Multiplicidade | `Playlist` **0..\*** — `Musica` **0..\*** |
| Navegabilidade | unidirecional, `Playlist` → `Musica` |

**Multiplicidade.** `0..*` nas duas pontas. Uma playlist pode estar vazia ou ter quantas faixas
quiser (a lista cresce). E a mesma música pode aparecer em várias playlists ao mesmo tempo —
inclusive repetida dentro da mesma, porque `adicionar` não verifica duplicata.

**Navegabilidade.** `Playlist.musicas` leva da playlist às faixas. A `Musica` não sabe em que
playlists está: não existe nada como `musica.getPlaylists()`.

## 6. Usuario → Usuario (associação reflexiva: seguir)

| Adorno | Valor |
|---|---|
| Nome | `Usuario` **segue ▶** `Usuario` |
| Papéis | ponta de saída: `- seguidores` · ponta de chegada: `- seguindo` |
| Multiplicidade | `0..\*` — `0..\*` |
| Navegabilidade | unidirecional, no sentido `seguidores` → `seguindo` |

A mesma classe aparece nas duas pontas, então os papéis são o que diferencia os lados: lendo
a partir de um usuário, `- seguindo` é o conjunto de quem ele segue e `- seguidores` é o
conjunto de quem o segue.

**Multiplicidade.** `0..*` dos dois lados. Quem acabou de se cadastrar não segue ninguém e não
é seguido por ninguém, e não há teto em nenhuma das direções. Não pode ser `1..*`: um usuário
sozinho na plataforma tem as duas coleções vazias.

**Navegabilidade.** Só o papel `- seguindo` virou atributo (`ArrayList<Usuario> seguindo` em
`Usuario`). O papel `- seguidores` é **derivado**: `Plataforma.getSeguidores(id)` descobre quem
segue alguém percorrendo os usuários cadastrados e perguntando `outro.segue(usuario)`. Se a
associação fosse bidirecional, `Usuario` teria também uma lista `seguidores`, e as duas listas
precisariam ser mantidas em sincronia a cada `seguir`/`deixarDeSeguir` — uma fonte clássica de
inconsistência. Guardar um lado só e derivar o outro evita isso.

**Regras implementadas** (`Usuario.seguir`): seguir a si mesmo lança
`IllegalArgumentException`; seguir alguém que já se segue lança `IllegalStateException`; seguir
`null` lança `IllegalArgumentException`. `deixarDeSeguir` lança `IllegalStateException` quando
não havia o que desfazer.

---

## Resumo em uma tabela

| # | Associação | Papéis | Nome | Multiplicidade | Navegabilidade |
|---|---|---|---|---|---|
| 1 | Plataforma–Musica | `- acervo` | cadastra ▶ | 1 — 0..* | Plataforma → Musica |
| 2 | Plataforma–Usuario | `- usuarios` | registra ▶ | 1 — 0..* | Plataforma → Usuario |
| 3 | Plataforma–Playlist | `- playlists` | hospeda ▶ | 1 — 0..* | Plataforma → Playlist |
| 4 | Usuario–Playlist | `- dono` / `- playlists` | cria ▶ | 1 — 0..* | Playlist → Usuario |
| 5 | Playlist–Musica | `- faixas` | contém ▶ | 0..* — 0..* | Playlist → Musica |
| 6 | Usuario–Usuario | `- seguidores` / `- seguindo` | segue ▶ | 0..* — 0..* | seguidores → seguindo |

## Como regerar a imagem

```bash
python3 docs/gerar_diagrama.py      # escreve docs/diagrama-classes.svg
```

O PNG é o mesmo SVG rasterizado (2780×1840). Qualquer navegador abre o `.svg` direto.
