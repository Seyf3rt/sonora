# Prova prática: o que costuma dar errado (e como sair do buraco)

Este arquivo existe para o momento em que o nervosismo apaga o óbvio. Todas as mensagens de erro
abaixo foram reproduzidas de verdade no compilador — são exatamente o texto que vai aparecer na
sua tela.

**Ordem de uso:** trave → seção 1 (protocolo) → ache a mensagem de erro nas seções 3 a 6 →
copie o esqueleto da seção 7.

---

## 1. Protocolo: os primeiros cinco minutos

1. **Leia o enunciado inteiro antes de escrever qualquer coisa.** Sublinhe os substantivos
   (viram classes) e os verbos (viram métodos).
2. **Crie os arquivos vazios primeiro**, um por classe, com o nome exatamente igual ao da classe.
3. **Compile com o esqueleto vazio.** Ver "compilou" uma vez, logo no começo, desarma metade do
   nervosismo e garante que o ambiente está funcionando.
4. **Escreva atributos → construtor → getters → métodos de negócio.** Nessa ordem, sempre.
5. **Compile a cada método pronto**, não no fim. Erro achado cedo custa 30 segundos; achado no
   fim, custa a prova.

### Comandos, para não travar no básico

```bash
javac -encoding UTF-8 -d out *.java     # compila tudo
java -cp out App                        # roda a classe App
```

Se as classes estiverem em pacote (como no projeto do professor, `package exercicios.lista04;`):

```bash
javac -encoding UTF-8 -d out src/exercicios/lista04/*.java
java -cp out exercicios.lista04.App
```

O `-encoding UTF-8` evita o erro de acento em `ç`, `ã` e afins.

---

## 2. Quando travar: protocolo de desbloqueio

Trave por mais de dois minutos e siga esta lista, em ordem:

1. **Não invente.** Abra `material-do-professor/ProjetoPratico/src/` e procure um exemplo do mesmo
   assunto. Você quase sempre já viu aquilo resolvido.
2. **Faça a versão burra primeiro.** Um `for` comum resolve o que um `for-each` elegante resolve.
   Código feio que roda vale nota; código bonito que não compila, não.
3. **Comente o que não compila** e siga para a próxima parte. Nota parcial existe. Um arquivo que
   não compila pode zerar tudo o que está dentro dele.
4. **Leia a PRIMEIRA mensagem de erro, não a última.** O javac cospe erros em cascata: corrija a
   primeira e as outras 12 costumam sumir juntas.
5. **Confira o trivial antes de suspeitar da lógica:** ponto e vírgula, chave fechada, nome do
   arquivo igual ao nome da classe, `import java.util.ArrayList;`.

### As cinco perguntas que resolvem 80% dos travamentos

| Pergunta | Se a resposta for "não" |
|---|---|
| O nome do arquivo é igual ao da classe pública? | Renomeie o arquivo. |
| Todo `{` tem seu `}`? | Conte as chaves de cima para baixo. |
| Os atributos são `private`? | O professor cobra encapsulamento em toda prova. |
| Existe construtor recebendo o que o enunciado pediu? | Escreva-o antes de continuar. |
| O método que devolve algo tem `return` em **todos** os caminhos? | Adicione o `return` que falta. |

---

## 3. Erros que o compilador pega (não compila)

| Mensagem real do javac | O que aconteceu | Correção |
|---|---|---|
| `class Pessoa is public, should be declared in a file named Pessoa.java` | Nome do arquivo diferente do nome da classe pública. | Renomeie o arquivo para `Pessoa.java`. |
| `';' expected` | Faltou ponto e vírgula **na linha anterior** à apontada. | Olhe a linha de cima, não a que o erro aponta. |
| `missing return statement` | Método com tipo de retorno que não retorna em algum caminho (ex.: `return` só dentro do `if`). | Garanta um `return` no fim, ou no `else`. |
| `non-static method getNome() cannot be referenced from a static context` | Chamou método de instância dentro do `main`, sem objeto. | Crie o objeto: `Pessoa p = new Pessoa(); p.getNome();` |
| `cannot find symbol` + `symbol: class ArrayList` | Faltou o import. | `import java.util.ArrayList;` no topo do arquivo. |
| `cannot find symbol` + `symbol: variable x` | Nome escrito errado, ou variável declarada dentro de um bloco e usada fora. | Confira a grafia e o escopo (veja a Questão 14). |
| `constructor X in class X cannot be applied to given types; required: no arguments` | Você escreveu `public void X(...)` — com `void`, aquilo **não é construtor**, é um método comum. | Tire o `void`. Construtor não tem tipo de retorno. |
| `exception NumberFormatException has already been caught` | `catch (Exception e)` veio antes do `catch` da subclasse. | Ordene do mais específico para o mais genérico. |
| `incompatible types: String cannot be converted to int` | Atribuiu texto a número. | `Integer.parseInt(texto)` para converter. |
| `unreported exception ...; must be caught or declared to be thrown` | Exceção **verificada** (checked) sem tratamento. | Envolva em `try..catch` ou declare `throws` no método. |

> **Regra de ouro:** corrija sempre o primeiro erro da lista e compile de novo antes de olhar os outros.

---

## 4. Erros que COMPILAM e te enganam (os mais perigosos)

Estes não dão mensagem nenhuma. O programa roda e entrega o resultado errado.

### 4.1 Setter sem `this` — o campeão

```java
public void setNome(String nome) {
    nome = nome;        // ERRADO: atribui o parâmetro nele mesmo
}
```

O atributo continua `null` para sempre. Saída real do teste: `getNome() = null`.

```java
public void setNome(String nome) {
    this.nome = nome;   // CERTO
}
```

### 4.2 Comparar texto com `==`

```java
String a = "Lucas";
String b = new String("Lucas");
a == b        // false
a.equals(b)   // true
```

Para **texto, objeto e qualquer coisa que não seja primitivo**, use `equals`. O `==` compara
endereços de memória, não conteúdo. Para ignorar maiúsculas: `equalsIgnoreCase`.

### 4.3 Divisão inteira

```java
int total = 7, qtd = 2;
total / qtd              // 3   (a parte decimal some)
(double) total / qtd     // 3.5
```

Se a média deu um número redondo suspeito, é isso.

### 4.4 Esqueceu de adicionar o objeto na lista

Criar o objeto não o cadastra em lugar nenhum:

```java
Musica m = new Musica("Bohemian Rhapsody", "Queen", 355);
// falta: plataforma.cadastrarMusica(m);
```

Sintoma: a listagem sai vazia e você jura que cadastrou.

### 4.5 Ponto e vírgula depois do `if` ou do `for`

```java
if (valor < 0);           // <- este ; encerra o if
    throw new IllegalArgumentException("...");   // roda SEMPRE
```

### 4.6 `=` no lugar de `==`

Com `boolean` isso compila e é sempre verdadeiro: `if (ativo = true)`.

---

## 5. Erros em tempo de execução (compila, mas quebra rodando)

| Exceção | Causa mais comum na prova | Correção |
|---|---|---|
| `NullPointerException` | `ArrayList` declarado e **não inicializado**, ou objeto que veio de uma busca que devolveu `null`. | `private ArrayList<X> lista = new ArrayList<>();` e teste `if (obj != null)` depois de buscar. |
| `IndexOutOfBoundsException: Index 99 out of bounds for length 2` | Índice fora da lista, ou `<=` no lugar de `<` no `for`. | `for (int i = 0; i < lista.size(); i++)` — **`<`**, nunca `<=`. |
| `ConcurrentModificationException` | Removeu de dentro de um `for-each`. | Use `for` com índice de trás para frente, ou `lista.removeIf(...)`. |
| `NumberFormatException` | `Integer.parseInt` em texto que não é número. | `try..catch (NumberFormatException e)` ao redor da leitura. |
| `InputMismatchException` | `sc.nextInt()` e o usuário digitou letra. | Leia com `nextLine()` e converta dentro de um `try`. |

### 5.1 A pegadinha do `for-each` que NÃO lança exceção

Testado de verdade, com uma lista `[a, b, c]`:

- remover o **primeiro** dentro do `for-each` → `ConcurrentModificationException`
- remover o **penúltimo** dentro do `for-each` → **não lança nada**, o laço só termina mais cedo
  e a lista fica `[a, c]`

Ou seja: às vezes explode, às vezes silencia e dá resultado errado. Nunca remova dentro do
`for-each`.

### 5.2 A pegadinha do Scanner

```java
int idade = sc.nextInt();
String nome = sc.nextLine();   // vem VAZIO
```

Saída real: `idade lida = 20 | nome lido = []`. O `nextInt()` consome o número mas deixa o
Enter na fila, e o `nextLine()` seguinte engole esse Enter.

**Solução que nunca falha:** leia tudo com `nextLine()` e converta.

```java
int idade = Integer.parseInt(sc.nextLine().trim());
```

### 5.3 `remove(int)` x `remove(Object)`

Numa `ArrayList<Integer>`, `nums.remove(1)` remove a **posição 1**, não o número 1.
Testado: `[10, 20, 30].remove(1)` resulta em `[10, 30]`.

---

## 6. Erros de JUnit

| Sintoma | Causa | Correção |
|---|---|---|
| O teste **não aparece** no relatório | Faltou a anotação `@Test`. | Anote o método. |
| `must not be private. It will not be executed.` | Método de teste `private`. | Deixe `public` ou sem modificador. |
| `must not return a value. It will not be executed.` | Método de teste com tipo de retorno. | Use `void`. |
| `expected: <2> but was: <3>` com os valores trocados | Inverteu a ordem do `assertEquals`. | `assertEquals(esperado, obtido)` — **esperado primeiro**. |
| O teste da exceção passa sem testar nada | Esqueceu a lambda no `assertThrows`. | `assertThrows(Tipo.class, () -> metodo());` |

Repare no detalhe cruel: um teste `private` ou com retorno **não falha** — ele simplesmente não
roda, e aparece só como WARNING no meio da saída. Sempre confira a contagem: se você escreveu
10 testes, o relatório tem que dizer `10 tests found`.

---

## 7. Receitas para copiar

### 7.1 Classe completa, do jeito que o professor cobra

```java
public class Musica {

    private static int contagem;          // membro de classe: vai sublinhado na UML

    private int id;                       // atributos sempre private
    private String titulo;
    private int duracaoSegundos;

    public Musica(String titulo, int duracaoSegundos) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido: não pode ser nulo nem vazio.");
        }
        if (duracaoSegundos <= 0) {
            throw new IllegalArgumentException("Duração inválida: " + duracaoSegundos);
        }
        this.titulo = titulo;
        this.duracaoSegundos = duracaoSegundos;
        contagem++;
        this.id = contagem;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracaoFormatada() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }

    public static int getContagem() {
        return contagem;
    }
}
```

**O que o professor procura aqui:** atributos `private`, validação que lança
`IllegalArgumentException` antes de atribuir, `this.` no construtor, getter sem parâmetro.

### 7.2 Associação um-para-muitos (o lado "muitos" vira coleção)

```java
import java.util.ArrayList;

public class Playlist {

    private String titulo;
    private Usuario dono;                                    // multiplicidade 1
    private ArrayList<Musica> musicas = new ArrayList<>();   // multiplicidade 0..*

    public Playlist(String titulo, Usuario dono) {
        if (dono == null) {
            throw new IllegalArgumentException("A playlist precisa de um dono.");
        }
        this.titulo = titulo;
        this.dono = dono;
    }

    public void adicionar(Musica musica) {
        if (musica == null) {
            throw new IllegalArgumentException("Música nula.");
        }
        musicas.add(musica);
    }

    public Musica getNaPosicao(int indice) {
        if (indice < 0 || indice >= musicas.size()) {
            throw new IndexOutOfBoundsException("Posição " + indice + " inválida.");
        }
        return musicas.get(indice);
    }

    public int getQuantidade() {
        return musicas.size();       // nunca um contador manual
    }
}
```

### 7.3 Associação reflexiva (classe ligada a ela mesma)

```java
private ArrayList<Usuario> seguindo = new ArrayList<>();

public void seguir(Usuario outro) {
    if (outro == null) {
        throw new IllegalArgumentException("Usuário nulo.");
    }
    if (outro == this) {
        throw new IllegalArgumentException("Não pode seguir a si mesmo.");
    }
    if (seguindo.contains(outro)) {
        throw new IllegalStateException("Já segue esse usuário.");
    }
    seguindo.add(outro);
}
```

### 7.4 Buscar dentro de uma lista

```java
public Musica buscarMusica(int id) {
    for (Musica musica : musicas) {
        if (musica.getId() == id) {
            return musica;
        }
    }
    return null;              // não achou
}

public Musica buscarMusica(String titulo) {         // sobrecarga: mesma ideia, assinatura diferente
    for (Musica musica : musicas) {
        if (musica.getTitulo().equalsIgnoreCase(titulo)) {
            return musica;
        }
    }
    return null;
}
```

### 7.5 Remover com segurança

```java
// pelo índice, de trás para frente (não quebra o laço)
for (int i = lista.size() - 1; i >= 0; i--) {
    if (lista.get(i).getId() == id) {
        lista.remove(i);
    }
}

// ou, mais simples:
lista.removeIf(m -> m.getId() == id);
```

### 7.6 Teste JUnit

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MusicaTest {

    private Musica bohemian;

    @BeforeEach
    public void montarCenario() {                 // roda antes de CADA teste
        bohemian = new Musica("Bohemian Rhapsody", 355);
    }

    @Test
    @DisplayName("Duração com minutos e segundos")
    public void duracaoFormatada() {
        assertEquals("05:55", bohemian.getDuracaoFormatada());   // esperado, obtido
    }

    @Test
    @DisplayName("Título vazio deve ser rejeitado")
    public void tituloVazioLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> new Musica("", 355));
    }
}
```

### 7.7 Menu com leitura à prova de erro

```java
static int lerInt(Scanner sc, String prompt) {
    while (true) {
        try {
            System.out.print(prompt);
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Digite um número.");
        }
    }
}
```

---

## 8. Checklist antes de entregar

- [ ] Compila sem nenhum erro (`javac -encoding UTF-8 -d out *.java`).
- [ ] Roda sem estourar exceção no caminho normal.
- [ ] Todos os atributos são `private`.
- [ ] Todo construtor valida o que o enunciado mandou validar e lança `IllegalArgumentException`.
- [ ] Todo `this.` que precisa estar, está (confira cada setter e cada construtor).
- [ ] Nenhuma comparação de texto com `==`.
- [ ] Nenhum `for` com `<=` em cima de `size()`.
- [ ] Toda `ArrayList` foi inicializada na declaração.
- [ ] Se pediram testes: todos têm `@Test`, são `public void`, e a contagem no relatório bate com
      o número de testes que você escreveu.
- [ ] Nome de cada arquivo igual ao nome da classe pública.

---

## 9. Se o tempo estiver acabando

Nesta ordem de prioridade:

1. **Faça compilar.** Comente o que estiver quebrado. Um arquivo que não compila arrasta o resto.
2. **Entregue os atributos e o construtor com validação.** É o que mais pontua e é o mais rápido.
3. **Getters simples.** São de graça.
4. **Depois os métodos de negócio.**
5. **Deixe o menu por último** — é a parte que menos vale e a que mais consome tempo.

Não apague código que não funciona: comente. Professor dá nota parcial para raciocínio visível,
mas não dá nota para arquivo vazio.
