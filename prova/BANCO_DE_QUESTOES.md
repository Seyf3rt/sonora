# Banco de questões extras

58 questões **novas**, além das 30 da lista L07, escritas a partir do material do professor (`material-do-professor/Conteudo/`). Mesmos três formatos da revisão: assinalar, somatória e relacionar colunas.

**Para que serve:** se cair uma questão que não está na L07, a chance de o assunto estar aqui é alta. Procure por uma palavra do enunciado com Ctrl+F, ou use o índice em `BUSCA_POR_PALAVRA_CHAVE.md`.

Cada questão traz a resposta, o porquê e a seção exata do material de onde ela saiu — então dá para conferir a fonte se a prova disser algo diferente.

Legenda: **✅** alternativa correta · **·** alternativa incorreta.

---

## Índice por parte

- **Parte 1 — Paradigmas e conceitos básicos de POO** — B01 a B06
- **Parte 2 — UML: diagrama de classes e diagrama de objetos** — B07 a B11
- **Parte 3 — Implementação, memória e o operador new** — B12 a B15
- **Parte 4 — Escopo de variáveis e inicialização** — B16 a B20
- **Parte 5 — Encapsulamento** — B21 a B25
- **Parte 6 — Membros de classe, sobrecarga e construtores** — B26 a B30
- **Parte 7 — Lançamento de exceções** — B31 a B34
- **Parte 8 — Tratamento de exceções** — B35 a B41
- **Parte 9 — Qualidade de software e testes de unidade** — B42 a B48
- **Parte 10 — Associações, multiplicidade e ArrayList** — B49 a B58

---

## Parte 1 — Paradigmas e conceitos básicos de POO

### B01 — assinalar

O mesmo cálculo de Fibonacci foi escrito em Pascal, Haskell, Prolog e Java no material da disciplina. Sobre o que essa comparação demonstra, assinale a alternativa correta:

- · a) Que apenas o paradigma orientado a objetos é capaz de resolver o problema.
- **✅ b) Que o paradigma determina a visão que o programador tem sobre a estruturação e a execução do programa, e um mesmo problema pode ser resolvido em vários paradigmas.**
- · c) Que linguagens multiparadigma não existem na prática.
- · d) Que o paradigma lógico é sempre mais eficiente que o imperativo.
- · e) Que o paradigma escolhido não influencia a forma como o código é escrito.

> **Resposta: b**
>
> Um paradigma fornece e determina a visão sobre a estruturação e a execução do programa. Algumas linguagens são multiparadigma, como Python, que aparece citada tanto no imperativo quanto no orientado a objetos.

**Palavras-chave:** paradigma, Fibonacci, multiparadigma, Pascal, Haskell, Prolog, Java

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 1

---

### B02 — somatória

Sobre as contrapartidas do paradigma orientado a objetos apontadas no material, some os números das afirmativas CORRETAS:

- **✅ 01. Maior curva de aprendizagem.**
- **✅ 02. Programas maiores.**
- **✅ 04. Não é recomendável para qualquer tipo de problema.**
- **✅ 08. Recursos como herança e polimorfismo podem ser desafiadores de compreender no início.**
- · 16. Menor produtividade e maior custo de desenvolvimento.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> ATENÇÃO, esta é a pegadinha mais provável da prova: o material lista "programas maiores" como CONTRAPARTIDA do POO. Maior produtividade e MENOR custo estão entre os objetivos, não entre as contrapartidas — por isso a 16 é falsa.

**Palavras-chave:** contrapartidas, curva de aprendizagem, programas maiores, produtividade, custo, herança, polimorfismo

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 2

---

### B03 — somatória

Sobre os objetivos do paradigma orientado a objetos, some os números das afirmativas CORRETAS:

- **✅ 01. Melhorar a compreensão do sistema.**
- **✅ 02. Alto grau de reutilização por meio de componentes acopláveis.**
- **✅ 04. Facilidade de manutenção e de evolução.**
- **✅ 08. Maior produtividade e menor custo.**
- · 16. Eliminar por completo a necessidade de testes de software.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> Os cinco objetivos do material são compreensão, reutilização, manutenção, evolução, qualidade e produtividade com menor custo. Nada disso dispensa testar.

**Palavras-chave:** objetivos, compreensão, reutilização, manutenção, evolução, qualidade, produtividade

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 2

---

### B04 — assinalar

Para calcular o IMC de Marta, o material lista sete características dela (nome, idade, altura, peso, cor preferida, signo e naturalidade), mas modela apenas altura e peso. Esse princípio se chama:

- · a) Encapsulamento.
- · b) Sobrecarga.
- **✅ c) Abstração: modelar somente o que é relevante para o problema.**
- · d) Herança.
- · e) Polimorfismo.

> **Resposta: c**
>
> Abstração é escolher, entre as muitas formas de caracterizar algo do mundo real, apenas as características úteis ao problema que se quer resolver.

**Palavras-chave:** abstração, IMC, Marta, relevante, modelar, características

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 3 (Problema a ser resolvido)

---

### B05 — assinalar

A classe `Cachorro` tem os atributos Nome, Raça, Cor e Peso, e dela foram criados o objeto 1 (pingo, labrador, branco, 12 kg) e o objeto 2 (brutus, pastor alemão, marrom, 21 kg). Sobre esses dois objetos, assinale a alternativa correta:

- **✅ a) Compartilham a mesma estrutura, definida pela classe, mas possuem estados diferentes.**
- · b) São a mesma instância, pois pertencem à mesma classe.
- · c) Possuem estruturas diferentes, pois têm valores diferentes.
- · d) Não podem existir ao mesmo tempo na memória.
- · e) Compartilham os valores dos atributos, pois a classe é única.

> **Resposta: a**
>
> A classe define a estrutura, ou seja, quais atributos e operações existem. Cada objeto tem seu próprio estado, que é o valor desses atributos.

**Palavras-chave:** Cachorro, pingo, brutus, estrutura, estado, instância

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 3 (Exemplo: classe Cachorro)

---

### B06 — relacionar colunas

Relacione cada termo à definição de Barker (2005) apresentada no material:

Coluna da esquerda: A. Objeto · B. Classe · C. Estado · D. Operação

- **( C )** Corresponde ao valor dos atributos e pode mudar ao longo do tempo.
- **( A )** Construção de software que empacota estado e comportamento e representa uma abstração do mundo real.
- **( D )** Ação que o objeto é capaz de executar, podendo usar os dados do próprio objeto.
- **( B )** Abstração que descreve as características comuns de um grupo de objetos; funciona como molde.

> **Resposta: C – A – D – B**
>
> Objeto empacota estado e comportamento; classe é o molde; estado é o valor dos atributos; operação é o que o objeto sabe fazer.

**Palavras-chave:** Barker, objeto, classe, estado, operação, molde, abstração

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 4 (Resumindo)

---

## Parte 2 — UML: diagrama de classes e diagrama de objetos

### B07 — assinalar

Sobre o diagrama de objetos, assinale a alternativa INCORRETA:

- · a) Mostra uma fotografia do estado detalhado do sistema num instante do tempo.
- · b) Contém somente objetos, não contém classes.
- · c) O nome do objeto aparece sublinhado, no formato `nomeObjeto : Classe`.
- **✅ d) Representa tanto a estrutura de dados quanto o comportamento dos objetos.**
- · e) Permite representar um objeto anônimo, omitindo o nome antes dos dois-pontos.

> **Resposta: d**
>
> O material diz explicitamente que o diagrama de objetos tem uso limitado justamente porque apresenta somente estruturas de dados, o estado, SEM representar o comportamento.

**Palavras-chave:** diagrama de objetos, fotografia, sublinhado, anônimo, comportamento, uso limitado

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 1

---

### B08 — relacionar colunas

Relacione o que aparece em cada diagrama, tomando a classe `Pessoa` como exemplo:

Coluna da esquerda: A. Diagrama de classes · B. Diagrama de objetos

- **( B )** `marta : Pessoa` com `peso = 78` e `altura = 1.71`
- **( A )** `Pessoa` com `peso : double` e `calcularImc() : double`
- **( B )** Vários retângulos da mesma classe, cada um com seu próprio estado.
- **( A )** Um único retângulo, com três compartimentos: nome, atributos e operações.

> **Resposta: B – A – B – A**
>
> O diagrama de classes descreve os tipos (`peso : double`); o de objetos mostra instâncias com valores (`peso = 78`). Os dois são complementares.

**Palavras-chave:** diagrama de classes, diagrama de objetos, complementares, tipo, valor, compartimentos

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 1.3

---

### B09 — somatória

Sobre a notação do diagrama de objetos, some os números das afirmativas CORRETAS:

- **✅ 01. Cada objeto é representado por um retângulo com dois compartimentos.**
- **✅ 02. No topo fica a identificação no formato `nomeObjeto : Classe`.**
- **✅ 04. O nome do objeto é sublinhado, e é isso que o distingue de uma classe no diagrama.**
- **✅ 08. Abaixo da identificação ficam os valores dos atributos.**
- · 16. É obrigatório nomear todos os objetos; objetos anônimos não são permitidos.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> Objeto anônimo é permitido: basta omitir o nome e escrever `: Classe`.

**Palavras-chave:** notação, retângulo, dois compartimentos, sublinhado, objeto anônimo

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 1.2

---

### B10 — relacionar colunas

Relacione cada símbolo de visibilidade da UML ao seu significado:

Coluna da esquerda: A. `-` · B. `+` · C. `#` · D. `~`

- **( C )** Protegido; será estudado mais tarde, junto com herança.
- **( A )** Privado: somente visível pela própria classe.
- **( D )** De pacote; corresponde à ausência de palavra reservada em Java.
- **( B )** Público: visível para qualquer classe.

> **Resposta: C – A – D – B**
>
> A tabela do material tem quatro símbolos. O `~` (de pacote) é o menos lembrado e corresponde a não escrever modificador nenhum em Java.

**Palavras-chave:** visibilidade, menos, mais, sustenido, til, private, public, protected, pacote

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.3

---

### B11 — assinalar

Numa associação entre `Pessoa` e `Livro`, a `Pessoa` recebe o papel `- autor` e o `Livro` o papel `- obra`. Perguntando "dado um autor, quantas obras ele pode escrever?" e "dada uma obra, quantos autores pode ter?", as multiplicidades corretas são:

- · a) `1` do lado do autor e `1` do lado da obra.
- **✅ b) `0..*` do lado da obra e `1..*` do lado do autor.**
- · c) `1..*` do lado da obra e `0..1` do lado do autor.
- · d) `0..1` nas duas pontas.
- · e) `3..5` do lado da obra e `1` do lado do autor.

> **Resposta: b**
>
> Um autor pode não ter escrito nenhuma obra e não há teto, logo `0..*` no lado das obras. Uma obra precisa de pelo menos um autor, logo `1..*` no lado dos autores. A multiplicidade é sempre escrita na ponta OPOSTA àquela que você fixou na pergunta.

**Palavras-chave:** multiplicidade, papel, autor, obra, Pessoa, Livro, mínimo e máximo

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 1

---

## Parte 3 — Implementação, memória e o operador new

### B12 — somatória

O operador `new` realiza quatro operações. Some os números das afirmativas CORRETAS:

- **✅ 01. Cria o objeto na memória, alocando espaço para as variáveis de instância.**
- **✅ 02. Inicializa as variáveis de instância com os valores padrão.**
- **✅ 04. Executa o construtor que foi utilizado no próprio `new`.**
- **✅ 08. Retorna o endereço de memória do objeto criado.**
- · 16. Libera automaticamente a memória do objeto anterior de mesmo tipo.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> São exatamente as quatro operações listadas no material. Liberar memória é trabalho do coletor de lixo, não do `new`.

**Palavras-chave:** new, operador, alocar, inicializar, construtor, endereço de memória, quatro operações

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.3 (O operador new)

---

### B13 — assinalar

Considere o trecho `ContaBancaria conta1 = new ContaBancaria();`. Sobre o que a variável `conta1` armazena, assinale a alternativa correta:

- **✅ a) Armazena o endereço de memória do objeto, não o objeto em si.**
- · b) Armazena uma cópia de todos os atributos do objeto.
- · c) Armazena o objeto inteiro, dentro da área Stack.
- · d) Não armazena nada até o primeiro setter ser chamado.
- · e) Armazena o nome da classe como texto.

> **Resposta: a**
>
> Variável de referência guarda endereço. O objeto em si fica no Heap; a variável fica no Stack.

**Palavras-chave:** variável de referência, endereço, objeto, Heap, Stack

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.3

---

### B14 — assinalar

Uma classe declara `public ContaBancaria(String titular)` e nenhum outro construtor. O que acontece ao escrever `new ContaBancaria()`?

- · a) Compila normalmente, pois o construtor padrão sempre existe.
- **✅ b) Não compila: ao declarar qualquer construtor, o compilador deixa de fornecer o construtor padrão sem argumentos.**
- · c) Compila, mas lança exceção em tempo de execução.
- · d) Compila e inicializa `titular` com string vazia.
- · e) Não compila, porque construtor não pode receber parâmetro.

> **Resposta: b**
>
> O construtor padrão só é fornecido quando NENHUM construtor foi implementado. Declarou um, perdeu o de graça — se quiser os dois, precisa declarar os dois.

**Palavras-chave:** construtor padrão, sem argumentos, deixa de fornecer, sobrecarga de construtor

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.3 (Construtores)

---

### B15 — relacionar colunas

Relacione cada elemento do código ao seu equivalente no diagrama de classes:

Coluna da esquerda: A. Variável de instância · B. Método · C. Membro sublinhado · D. Tipo de retorno `void`

- **( B )** Operação da classe, escrita com parênteses após o nome.
- **( C )** Membro de classe (`static`), que pertence à classe e não à instância.
- **( A )** Atributo da classe, escrito como `nome : tipo`.
- **( D )** Operação que altera o estado e não devolve valor (procedimento).

> **Resposta: B – C – A – D**
>
> Atributo vira variável de instância, operação vira método, membro estático aparece sublinhado e quem não devolve nada é `void`.

**Palavras-chave:** tradução, diagrama para código, atributo, operação, sublinhado, void, procedimento

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seções 1.3 e 3.1

---

## Parte 4 — Escopo de variáveis e inicialização

### B16 — assinalar

Considere a classe de referência do material, com `var1` declarada no corpo da classe, `var2` dentro de `metodoB` e `var3` dentro de um bloco `do { }`. Assinale a alternativa correta:

- · a) `var3` continua existindo depois do `}` que fecha o bloco do `do/while`.
- · b) `var2` pode ser lida por `metodoA`.
- **✅ c) `var1` pode ser lida e alterada tanto por `metodoA` quanto por `metodoB`.**
- · d) `var1` só existe dentro do método em que for usada pela primeira vez.
- · e) As três variáveis têm o mesmo escopo, pois estão na mesma classe.

> **Resposta: c**
>
> O escopo da variável de instância são TODOS os métodos da classe. A local vale só no seu método e a de bloco morre no `}` do bloco.

**Palavras-chave:** escopo, var1, var2, var3, instância, local, bloco, do/while

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 2, seções 1 a 4

---

### B17 — relacionar colunas

Relacione cada tipo de variável de instância ao seu valor padrão em Java:

Coluna da esquerda: A. `int` · B. `double` · C. `boolean` · D. Referência (objeto, `String`, array)

- **( C )** `false`
- **( D )** `null`
- **( A )** `0`
- **( B )** `0.0`

> **Resposta: C – D – A – B**
>
> Numérica inteira começa em `0`, ponto flutuante em `0.0`, lógica em `false` e referência em `null`. O `char` começa em `\u0000`, o caractere nulo.

**Palavras-chave:** valor padrão, inicialização automática, zero, false, null, char, \u0000

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 2, seção 5

---

### B18 — assinalar

Sobre variáveis locais e de bloco em Java, assinale a alternativa correta:

- · a) Recebem valor padrão igual ao das variáveis de instância.
- **✅ b) Não possuem valor inicial; ler antes de atribuir gera erro de compilação.**
- · c) Não possuem valor inicial; ler antes de atribuir gera lixo de memória em tempo de execução.
- · d) São sempre inicializadas com `null`, independentemente do tipo.
- · e) Só podem ser declaradas no início do método.

> **Resposta: b**
>
> O material é explícito: tentar ler antes de atribuir gera ERRO DE COMPILAÇÃO, não lixo. Guarde isso, porque é o ponto que a questão 16 da L07 confunde.

**Palavras-chave:** variável local, sem valor inicial, erro de compilação, lixo, atribuição explícita

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 2, seção 5

---

### B19 — assinalar

No exemplo de sombreamento do material, `var1` de instância vale 20, a local é declarada como `int var1 = 5;` e o método executa `this.var1 = 10;`. O que imprimem, nessa ordem, `System.out.println(var1);` e `System.out.println(this.var1);`?

- **✅ a) 5 e 10**
- · b) 10 e 5
- · c) 20 e 10
- · d) 5 e 20
- · e) 10 e 10

> **Resposta: a**
>
> `var1` sem qualificador é a LOCAL, que vale 5. `this.var1` é a de instância, que acabou de ser alterada para 10. A linguagem sempre dá preferência à variável de menor escopo.

**Palavras-chave:** sombreamento, shadowing, this, menor escopo, preferência, var1

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 2, seção 7

---

### B20 — somatória

Sobre boas práticas de escopo apontadas no material, some os números das afirmativas CORRETAS:

- **✅ 01. Declarar cada variável no menor escopo possível e perto de onde é usada.**
- **✅ 02. Preferir variáveis locais quando o dado não precisa persistir no objeto.**
- **✅ 04. Não confiar no valor padrão de variáveis de instância como se fosse valor de negócio.**
- **✅ 08. Evitar sombreamento desnecessário, exceto no padrão `this.campo = campo` de construtores e setters.**
- · 16. Declarar todas as variáveis como de instância, para facilitar o reuso entre métodos.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é o oposto da primeira boa prática: o material manda usar o MENOR escopo possível.

**Palavras-chave:** boas práticas, menor escopo, variável local, valor padrão, sombreamento aceito

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 2, seção 8

---

## Parte 5 — Encapsulamento

### B21 — assinalar

No exemplo da motivação do encapsulamento, a classe cliente executa `conta1.saldo = 10000;`. Qual é exatamente o problema?

- · a) O comando não compila, pois `saldo` é `double`.
- **✅ b) Define um saldo sem que exista um depósito correspondente, violando a integridade dos dados.**
- · c) O saldo fica correto, mas o desempenho piora.
- · d) O problema só existe se a classe não tiver construtor.
- · e) Nenhum: acessar atributo diretamente é a forma recomendada.

> **Resposta: b**
>
> O estado do objeto passou a ser alterado por fora, sem passar pela regra de negócio. Por isso o atributo precisa ser `private` e o acesso, controlado por métodos.

**Palavras-chave:** motivação, encapsulamento, saldo, integridade dos dados, acesso direto, ContaBancaria

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.1

---

### B22 — somatória

Sobre getters e setters conforme o material, some os números das afirmativas CORRETAS:

- **✅ 01. O getter nunca tem parâmetro, é do tipo função e retorna dado do mesmo tipo do atributo.**
- **✅ 02. O setter sempre tem um parâmetro, do mesmo tipo do atributo, e é do tipo procedimento.**
- **✅ 04. Para atributo lógico, o getter usa o prefixo `is` em vez de `get`.**
- **✅ 08. O setter é o lugar natural para validar o valor antes de alterar o estado do objeto.**
- · 16. Um setter que só faz a atribuição direta já agrega proteção sobre o dado.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> O material diz o contrário da 16: um setter que só atribui NÃO agrega proteção nenhuma. A proteção vem da validação.

**Palavras-chave:** getter, setter, prefixo is, função, procedimento, validação, proteção

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.4

---

### B23 — assinalar

Sobre as boas práticas de encapsulamento, assinale a alternativa correta:

- **✅ a) Somente é admissível utilizar `public` para constantes.**
- · b) Todo atributo deve ser `public` para permitir reuso.
- · c) Getters e setters devem ser criados para todos os atributos, sem exceção.
- · d) Atributos `private` dispensam métodos de acesso.
- · e) O encapsulamento se aplica apenas a métodos, nunca a atributos.

> **Resposta: a**
>
> A regra do material é clara: encapsular todos os atributos, e `public` só se justifica para constantes. Getter e setter entram apenas quando há necessidade de expor ou de permitir alteração.

**Palavras-chave:** boas práticas, public, constantes, encapsular todos, necessidade

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.6

---

### B24 — assinalar

O material compara o encapsulamento de métodos com um motorista que liga o carro sem conhecer o mecanismo interno de combustão. O que essa analogia ilustra?

- · a) Que métodos devem sempre ser privados.
- **✅ b) Que é possível ocultar a complexidade interna do objeto, criando uma forma simplificada de usá-lo, o que favorece a reutilização.**
- · c) Que o objeto não deve ter comportamento, apenas dados.
- · d) Que toda classe precisa de um construtor sem argumentos.
- · e) Que atributos devem ser acessados diretamente para ganhar desempenho.

> **Resposta: b**
>
> Encapsular método é esconder o "como" e expor só o "o quê". Quem usa a classe não precisa saber o que acontece por dentro.

**Palavras-chave:** encapsulamento de métodos, ocultar complexidade, analogia do carro, reutilização

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.7

---

### B25 — relacionar colunas

Relacione cada elemento ao seu papel no código `public void setTitular(String titular) { this.titular = titular; }`:

Coluna da esquerda: A. `this.titular` · B. `titular` (sem qualificador) · C. `void` · D. `public`

- **( B )** O parâmetro recebido pelo método, que tem menor escopo e por isso tem preferência.
- **( D )** Modificador de acesso que torna o método visível para qualquer classe.
- **( A )** A variável de instância, acessada explicitamente pelo objeto corrente.
- **( C )** Indica que o método é um procedimento e não devolve valor.

> **Resposta: B – D – A – C**
>
> `this` refere-se ao objeto corrente. Sem ele, o Java usaria o identificador de menor escopo, que é o parâmetro, e a atribuição não faria nada.

**Palavras-chave:** this, objeto corrente, parâmetro, setTitular, void, public, menor escopo

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.5

---

## Parte 6 — Membros de classe, sobrecarga e construtores

### B26 — somatória

Sobre as restrições dos métodos de classe (`static`), some os números das afirmativas CORRETAS:

- **✅ 01. Podem manipular variáveis de classe.**
- **✅ 02. Não podem manipular variáveis de instância sem uma instância explícita.**
- **✅ 04. Não podem reusar métodos de instância.**
- **✅ 08. Não podem utilizar a palavra `this`.**
- · 16. Só podem ser chamados depois que pelo menos um objeto da classe for criado.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 nega a própria razão de existir do `static`: membro de classe pode ser usado SEM que haja instância alguma.

**Palavras-chave:** static, método de classe, this, variável de instância, reusar, sem instância

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.1 (Métodos de classe)

---

### B27 — assinalar

Assinale a alternativa que contém apenas membros estáticos da biblioteca Java citados no material:

- **✅ a) `Integer.MAX_VALUE`, `Math.sqrt()`, `Math.abs()`, `Math.max()`, `JOptionPane.showInputDialog()`**
- · b) `conta.getSaldo()`, `conta.sacar()`, `new Scanner()`
- · c) `this.saldo`, `this.titular`, `super.metodo()`
- · d) `try`, `catch`, `finally`, `throw`
- · e) `private`, `public`, `protected`, `static`

> **Resposta: a**
>
> Todos os da alternativa (a) são acessados por `Classe.membro`, sem criar objeto. As outras listam métodos de instância, referências ou palavras reservadas.

**Palavras-chave:** Integer.MAX_VALUE, Math.sqrt, Math.abs, Math.max, JOptionPane, membro estático, Classe.membro

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.1

---

### B28 — assinalar

Considere os métodos `int somar(int a, int b)`, `double somar(double a, double b)` e `int somar(int a, int b, int c)` na mesma classe. Sobre esse código, assinale a alternativa correta:

- · a) Não compila, pois não é permitido repetir o nome do método.
- **✅ b) É sobrecarga válida: mesmo nome, listas de parâmetros diferentes.**
- · c) É sobrecarga válida apenas porque os tipos de retorno são diferentes.
- · d) Só os dois primeiros formam sobrecarga; o terceiro é inválido.
- · e) É sobrescrita de métodos, não sobrecarga.

> **Resposta: b**
>
> O que diferencia é a assinatura, isto é, a lista de parâmetros. O tipo de retorno não entra nessa conta — tanto que dois métodos com a MESMA assinatura e retornos diferentes não podem coexistir.

**Palavras-chave:** sobrecarga, somar, assinatura, lista de parâmetros, tipo de retorno

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.2

---

### B29 — relacionar colunas

Relacione cada característica ao conceito correto:

Coluna da esquerda: A. Construtor · B. Método comum · C. Variável de classe · D. Método de classe

- **( A )** Não possui tipo de dado de retorno e tem o mesmo identificador da classe.
- **( C )** É comum e compartilhada entre todas as instâncias; aparece sublinhada na UML.
- **( D )** Pode ser chamado por `Classe.metodo()` e não pode usar `this`.
- **( B )** Declara um tipo de retorno e é invocado sobre um objeto já existente.

> **Resposta: A – C – D – B**
>
> O construtor é o único que não declara tipo de retorno. `static` é o que dá o comportamento de classe, sublinhado no diagrama.

**Palavras-chave:** construtor, método, variável de classe, método de classe, sublinhado, identificador da classe

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3

---

### B30 — somatória

Sobre construtores, some os números das afirmativas CORRETAS:

- **✅ 01. São invocados exclusivamente durante a criação de objetos.**
- **✅ 02. Servem para inicializar o objeto.**
- **✅ 04. Sua declaração é semelhante à de um método, porém sem tipo de dado de retorno.**
- **✅ 08. Ao declarar qualquer construtor, o compilador deixa de fornecer o construtor padrão.**
- · 16. É obrigatório declarar pelo menos um construtor em toda classe.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> Não é obrigatório criar construtor: sem nenhum, o compilador fornece o padrão sem argumentos. Mas assim que você declara um, perde esse padrão.

**Palavras-chave:** construtor, inicializar, sem tipo de retorno, construtor padrão, obrigatório

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.3

---

## Parte 7 — Lançamento de exceções

### B31 — assinalar

Sobre o efeito de uma exceção lançada e não tratada, assinale a alternativa correta:

- · a) O programa continua normalmente, ignorando a linha problemática.
- **✅ b) O método cria um objeto de exceção que contém informação sobre o erro, notifica o sistema e a execução do programa é abortada.**
- · c) O compilador se recusa a gerar o arquivo `.class`.
- · d) O valor inválido é gravado assim mesmo, mas com um aviso no console.
- · e) A exceção é convertida automaticamente em valor de retorno `null`.

> **Resposta: b**
>
> Lançar exceção é criar o objeto que caracteriza o erro e notificar o sistema. Sem tratamento, o efeito é abortar a execução.

**Palavras-chave:** lançamento, objeto de exceção, notificar, abortar execução, throw

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 6, seções 1 e 2

---

### B32 — assinalar

Considere o método abaixo:

```java
public void metodo() {
    throw new IllegalArgumentException("sempre lança");
    salario = 10;
}
```

Assinale a alternativa correta:

- · a) Compila e nunca executa a atribuição.
- **✅ b) Não compila: a linha após um `throw` incondicional é código inalcançável.**
- · c) Compila, e a atribuição executa antes do lançamento.
- · d) Não compila, porque `IllegalArgumentException` precisa de `throws` na assinatura.
- · e) Compila apenas se o método declarar `throws IllegalArgumentException`.

> **Resposta: b**
>
> Quando o `throw` é SEMPRE executado, nada pode vir depois dele no mesmo bloco. Diferente é o `throw` dentro de um `if`: aí a linha seguinte é alcançável no caso normal.

**Palavras-chave:** código inalcançável, throw incondicional, unreachable, erro de compilação

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 6, seção 4

---

### B33 — assinalar

Por que `IllegalArgumentException` é a exceção usada nos setters e construtores do material?

- · a) Porque é a única exceção que existe em Java.
- **✅ b) Porque é uma exceção pronta da biblioteca, usada para indicar que um argumento recebido é inválido.**
- · c) Porque é uma exceção verificada e obriga o chamador a tratá-la.
- · d) Porque impede que o programa seja abortado.
- · e) Porque só pode ser usada dentro de blocos `try`.

> **Resposta: b**
>
> Ela é subclasse de `RuntimeException`, portanto NÃO é verificada — o compilador não obriga a tratar. O nome comunica exatamente a intenção: o argumento recebido não serve.

**Palavras-chave:** IllegalArgumentException, argumento inválido, RuntimeException, não verificada, setter, construtor

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 6, seções 2 e 3

---

### B34 — relacionar colunas

Relacione cada palavra ao seu papel no mecanismo de exceções:

Coluna da esquerda: A. `throw` · B. `throws` · C. `try` · D. `catch`

- **( D )** Recebe o objeto da exceção e contém os comandos executados quando o erro ocorre.
- **( A )** Cria e lança o objeto de exceção, interrompendo o método na hora.
- **( C )** Delimita o bloco cuja execução passa a ser monitorada.
- **( B )** Aparece na assinatura do método e delega o tratamento ao chamador.

> **Resposta: D – A – C – B**
>
> O par que mais confunde é `throw` (lança, dentro do corpo) e `throws` (declara, na assinatura). Repare no `s`.

**Palavras-chave:** throw, throws, try, catch, lançar, delegar, monitorar

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aulas 6 e 7

---

## Parte 8 — Tratamento de exceções

### B35 — relacionar colunas

Relacione cada classe da hierarquia de erros ao seu lugar:

Coluna da esquerda: A. `Throwable` · B. `Error` · C. `Exception` · D. `RuntimeException`

- **( B )** Erros graves como falta de memória e estouro de pilha; não se espera que sejam tratados.
- **( A )** Raiz da hierarquia; qualquer classe de erro precisa estender dela.
- **( D )** Subclasse de `Exception` que NÃO é verificada pelo compilador.
- **( C )** Condições que o programa poderia contornar e que podem e devem ser tratadas.

> **Resposta: B – A – D – C**
>
> `Throwable` é a raiz, com dois ramos: `Error` (não trate) e `Exception` (trate). Dentro de `Exception`, o ramo `RuntimeException` é o não verificado.

**Palavras-chave:** Throwable, Error, Exception, RuntimeException, hierarquia, verificada

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seção 2

---

### B36 — assinalar

Considere o laço `for (int i = 0; i <= nota.length; i++)` percorrendo um vetor `double[] nota = new double[3]`. Segundo a classificação do material, esse é um exemplo de:

- · a) Erro de execução, impossível de evitar.
- **✅ b) Erro de lógica: erro na concepção do algoritmo, que deve ser evitado.**
- · c) Erro do compilador Java.
- · d) Exceção verificada, que exige `throws`.
- · e) Erro de sintaxe, detectado antes de rodar.

> **Resposta: b**
>
> O programa compila e roda, mas o raciocínio está errado: índices válidos vão de 0 a length-1. Erros de lógica nascem do programador e devem ser evitados, ao contrário dos de execução, que muitas vezes dependem do usuário ou do ambiente.

**Palavras-chave:** erro de lógica, erro de execução, i <= length, vetor, concepção do algoritmo

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seção 1

---

### B37 — somatória

Sobre como o mecanismo escolhe qual cláusula `catch` executar, some os números das afirmativas CORRETAS:

- **✅ 01. Ao ocorrer o erro, é criado um objeto da classe que o caracteriza e o programa é notificado.**
- **✅ 02. O comando que causou o erro é interrompido.**
- **✅ 04. As cláusulas `catch` são verificadas na ordem em que foram escritas.**
- **✅ 08. Encontrada uma cláusula compatível, o fluxo segue nela e, ao terminar, prossegue após o comando `try`.**
- · 16. Todas as cláusulas `catch` compatíveis são executadas, uma após a outra.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> Só UMA cláusula `catch` executa: a primeira compatível encontrada na ordem de escrita. Por isso `Exception` fica por último, como "pega tudo".

**Palavras-chave:** múltiplos catch, ordem, primeira compatível, pega tudo, Exception por último

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seção 4

---

### B38 — assinalar

Sobre a regra de quais exceções são verificadas (checked) pelo compilador, assinale a alternativa correta:

- · a) Todas as subclasses de `Throwable` são verificadas.
- **✅ b) `Error` e `RuntimeException`, e todas as suas subclasses, NÃO são verificadas; as demais são.**
- · c) Apenas `Error` e suas subclasses são verificadas.
- · d) Somente exceções criadas pelo programador são verificadas.
- · e) Nenhuma exceção é verificada a partir do Java 7.

> **Resposta: b**
>
> Essa é a regra literal do material. Consequência prática: `IllegalArgumentException` e `NullPointerException` não obrigam a nada, mas `FileNotFoundException` obriga `try..catch` ou `throws`.

**Palavras-chave:** exceção verificada, checked, Error, RuntimeException, FileNotFoundException, obrigatório tratar

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seção 6

---

### B39 — somatória

Sobre a propagação de erros, some os números das afirmativas CORRETAS:

- **✅ 01. Quando um método é interrompido por um erro, o controle retorna ao método que o chamou.**
- **✅ 02. Se o chamador também não puder tratar o erro, ele também é interrompido.**
- **✅ 04. A propagação sobe pela cadeia de chamadas até que algum método consiga tratar o erro.**
- **✅ 08. O último método que tem a oportunidade de tratar o erro é o `main()`.**
- · 16. Se nem o `main()` tratar o erro, o Java escolhe automaticamente um tratamento padrão e o programa continua.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> Se nem o `main()` trata, o programa é interrompido. Não existe tratamento automático de resgate.

**Palavras-chave:** propagação, chamador, cadeia de chamadas, main, programa interrompido

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seção 5

---

### B40 — assinalar

Uma variável é declarada dentro do bloco `try`. Sobre usá-la no `catch`, assinale a alternativa correta:

- · a) Funciona normalmente, pois `try` e `catch` compartilham o mesmo escopo.
- **✅ b) Não funciona: `try` e `catch` são blocos distintos e cada um define seu próprio escopo de variáveis.**
- · c) Funciona apenas se a variável for `static`.
- · d) Funciona apenas se a variável for inicializada com `null`.
- · e) Funciona, mas o valor sempre chega como `null` ao `catch`.

> **Resposta: b**
>
> Cada bloco define escopo próprio. Se precisar do valor nos dois lugares, declare a variável ANTES do `try`.

**Palavras-chave:** escopo do try, escopo do catch, blocos distintos, declarar antes

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seção 9

---

### B41 — assinalar

A partir de qual versão do Java uma única cláusula `catch` pode tratar várias classes de erro, e com qual operador?

- · a) Java 5, com o operador `&`.
- **✅ b) Java 7, com o operador `|`.**
- · c) Java 8, com o operador `||`.
- · d) Java 11, com vírgula.
- · e) Não é possível em nenhuma versão.

> **Resposta: b**
>
> O multi-catch existe desde o Java 7 e usa uma barra vertical: `catch (IOException | SQLException ex)`. Serve quando o tratamento é o mesmo.

**Palavras-chave:** multi-catch, Java 7, operador pipe, IOException, SQLException

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seção 4

---

## Parte 9 — Qualidade de software e testes de unidade

### B42 — relacionar colunas

Relacione a fase em que o erro é detectado ao seu custo relativo de correção (IBM, 2008):

Coluna da esquerda: A. 1 · B. 5 · C. 15 · D. 30

- **( B )** Implementação
- **( D )** Em produção
- **( A )** Especificação e arquitetura
- **( C )** Testes de sistema

> **Resposta: B – D – A – C**
>
> A progressão é 1, 5, 15, 30. Um erro que custaria 1 na especificação pode custar 30 em produção — é o argumento central a favor de testar cedo.

**Palavras-chave:** custo de correção, IBM 2008, especificação, implementação, testes de sistema, produção, 1 5 15 30

**Onde estudar:** `material-do-professor/Conteudo/Unidade02.md` — Aula 9, seção 1

---

### B43 — somatória

Sobre o plano de testes, some os números das afirmativas CORRETAS:

- **✅ 01. Testes precisam ser planejados, e esse planejamento é registrado formalmente num documento.**
- **✅ 02. O plano pode conter propósito, identificação, itens a testar, critérios de aceite, documentos produzidos e ambiente.**
- **✅ 04. Dentro do plano há um conjunto de casos de teste.**
- **✅ 08. Cada caso de teste descreve um teste particular, com entrada própria e saída esperada.**
- · 16. Um bom plano de testes dispensa a execução dos testes.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> O plano organiza; quem encontra o erro é a execução. A estrutura Caso / Descrição / Entrada / Saída esperada é a que vira código no JUnit.

**Palavras-chave:** plano de testes, casos de teste, critérios de aceite, entrada, saída esperada, ambiente

**Onde estudar:** `material-do-professor/Conteudo/Unidade02.md` — Aula 9, seção 2

---

### B44 — relacionar colunas

Relacione cada método `assert` à sua descrição:

Coluna da esquerda: A. `assertEquals(esperado, real)` · B. `assertEquals(esperado, real, limite)` · C. `assertNotNull(objeto)` · D. `assertThrows(Classe, lambda)`

- **( B )** Compara decimais respeitando uma margem de diferença, por causa de arredondamento.
- **( D )** Verifica se o trecho de código lança a exceção esperada.
- **( A )** Verifica se o valor esperado é igual ao obtido.
- **( C )** Verifica se a variável referencia um objeto.

> **Resposta: B – D – A – C**
>
> A versão de três parâmetros é só para `double`: comparar decimal por igualdade exata é problemático, então aceita-se uma tolerância (delta).

**Palavras-chave:** assertEquals, limite, delta, assertNotNull, assertNull, assertThrows, double

**Onde estudar:** `material-do-professor/Conteudo/Unidade02.md` — Aula 9, seções 6 e 9

---

### B45 — assinalar

Por que o segundo argumento de `assertThrows` precisa ser uma expressão lambda `() -> ...` e não a chamada direta do método?

- · a) Porque lambda é mais legível.
- **✅ b) Porque, sem o lambda, a chamada seria avaliada antes de chegar ao `assertThrows` e o código nem compila.**
- · c) Porque `assertThrows` só aceita métodos `static`.
- · d) Porque o lambda converte a exceção em valor booleano.
- · e) Porque o JUnit exige lambda em todos os asserts.

> **Resposta: b**
>
> Com o lambda, quem executa o trecho é o próprio `assertThrows`, e aí ele consegue capturar e conferir a exceção.

**Palavras-chave:** assertThrows, lambda, avaliado antes, não compila, executar o trecho

**Onde estudar:** `material-do-professor/Conteudo/Unidade02.md` — Aula 9, seção 9

---

### B46 — assinalar

Você precisa de um objeto novo e limpo antes de CADA caso de teste. Qual anotação usar, e por quê?

- · a) `@BeforeAll`, porque roda uma vez e é mais eficiente.
- **✅ b) `@BeforeEach`, porque roda antes de cada método de teste e garante estado independente.**
- · c) `@AfterEach`, porque limpa o estado entre os testes.
- · d) `@Test`, porque já inicializa o contexto automaticamente.
- · e) `@Order(1)`, porque garante que a inicialização venha primeiro.

> **Resposta: b**
>
> `@BeforeAll` roda uma única vez para a classe inteira e por isso exige método `static`. Reserve-a para preparações caras, como abrir uma conexão única.

**Palavras-chave:** @BeforeEach, @BeforeAll, @AfterEach, estado limpo, static, contexto

**Onde estudar:** `material-do-professor/Conteudo/Unidade02.md` — Aula 9, seções 7 e 8

---

### B47 — relacionar colunas

Relacione cada anotação do JUnit à sua funcionalidade:

Coluna da esquerda: A. `@Disabled` · B. `@DisplayName` · C. `@Timeout` · D. `@Tag`

- **( B )** Define um nome legível para o teste, facilitando a leitura dos relatórios.
- **( D )** Agrupa testes, permitindo executar subconjuntos.
- **( A )** Desabilita temporariamente um teste ou classe.
- **( C )** Define tempo máximo de execução; se excedido, o teste falha.

> **Resposta: B – D – A – C**
>
> Todas aparecem na tabela de anotações do material. `@Order(n)` só funciona se a classe tiver `@TestMethodOrder`.

**Palavras-chave:** @Disabled, @DisplayName, @Timeout, @Tag, @Order, @TestMethodOrder, anotações

**Onde estudar:** `material-do-professor/Conteudo/Unidade02.md` — Aula 9, seção 7

---

### B48 — assinalar

Sobre a organização das classes de teste, assinale a alternativa correta:

- · a) Uma única classe de teste deve cobrir todas as classes do sistema.
- **✅ b) Há uma classe de teste paralela para cada classe testada, geralmente com o sufixo `Test`.**
- · c) A classe de teste deve ficar dentro da pasta `src`, junto com a classe testada.
- · d) Os métodos de teste devem retornar `boolean` indicando sucesso.
- · e) A classe de teste precisa estender a classe testada.

> **Resposta: b**
>
> `Calculadora` gera `CalculadoraTest`. A pasta `test` fica FORA de `src` e é marcada como pasta de fontes de teste na IDE.

**Palavras-chave:** classe de teste, sufixo Test, pasta test, fora de src, paralela

**Onde estudar:** `material-do-professor/Conteudo/Unidade02.md` — Aula 9, seções 4 e 5

---

## Parte 10 — Associações, multiplicidade e ArrayList

### B49 — assinalar

Sobre a navegabilidade de uma associação, assinale a alternativa correta:

- · a) Por padrão a navegação é unidirecional, e a seta indica que virou bidirecional.
- **✅ b) Por padrão a navegação é bidirecional, e a seta limita a navegação a uma única direção.**
- · c) A navegabilidade não pode ser representada no diagrama de classes.
- · d) A seta sempre aponta para a classe que contém a chave primária.
- · e) Navegabilidade e multiplicidade são o mesmo adorno.

> **Resposta: b**
>
> O padrão é bidirecional. Desenhar a seta é RESTRINGIR: com a seta de `Livro` para `Pessoa`, do livro chega-se aos autores, mas da pessoa não se chega às obras.

**Palavras-chave:** navegabilidade, bidirecional, unidirecional, seta, Livro, Pessoa

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 1

---

### B50 — relacionar colunas

Relacione cada multiplicidade ao seu significado:

Coluna da esquerda: A. `0..1` · B. `1` · C. `0..*` · D. `1..*`

- **( D )** Há pelo menos um objeto envolvido, podendo haver muitos.
- **( C )** Pode ou não haver instâncias participando do relacionamento.
- **( B )** Exatamente um objeto se relaciona com os objetos da outra classe.
- **( A )** Não precisam estar relacionados; havendo relacionamento, no máximo uma instância.

> **Resposta: D – C – B – A**
>
> A diferença que mais cai: `0..*` admite nenhum, `1..*` exige pelo menos um. Existe ainda a forma `m..n`, como `3..5`.

**Palavras-chave:** multiplicidade, 0..1, 1..1, 0..*, 1..*, 3..5, mínimo, máximo

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 1

---

### B51 — assinalar

A classe `Funcionario` se associa a si mesma pela associação `chefia ▶`, com os papéis `- gerente` e `- empregado`. Esse tipo de associação se chama:

- · a) Associação bidirecional.
- **✅ b) Associação reflexiva: conecta objetos de uma mesma classe.**
- · c) Herança.
- · d) Composição.
- · e) Dependência circular.

> **Resposta: b**
>
> Reflexiva é a associação de uma classe com ela mesma. Como a mesma classe aparece nas duas pontas, são os PAPÉIS que distinguem os lados.

**Palavras-chave:** associação reflexiva, Funcionario, chefia, gerente, empregado, mesma classe, papéis

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 1 (Associação reflexiva)

---

### B52 — somatória

Sobre o `ArrayList`, some os números das afirmativas CORRETAS:

- **✅ 01. Uma instância de `ArrayList` pode armazenar diversos objetos.**
- **✅ 02. Não possui tamanho limitado, como o vetor.**
- **✅ 04. Não armazena dados primitivos, apenas objetos.**
- **✅ 08. Os objetos armazenados são recuperados pela posição.**
- · 16. Dispensa import, por fazer parte do pacote `java.lang`.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> É preciso `import java.util.ArrayList;`. Quem dispensa import é o pacote `java.lang`, onde ficam `String`, `Math` e `Integer`.

**Palavras-chave:** ArrayList, tamanho ilimitado, primitivos, posição, import java.util.ArrayList

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 2

---

### B53 — relacionar colunas

Relacione cada método do `ArrayList` à sua descrição:

Coluna da esquerda: A. `add(E)` · B. `get(int)` · C. `remove(Object)` · D. `size()`

- **( D )** Retorna a quantidade de objetos armazenados.
- **( A )** Guarda um objeto na coleção.
- **( B )** Obtém o objeto na posição indicada.
- **( C )** Remove o objeto da coleção.

> **Resposta: D – A – B – C**
>
> Cuidado com `remove`: numa lista de `Integer`, `remove(1)` remove a POSIÇÃO 1, porque o Java escolhe a versão `remove(int)`.

**Palavras-chave:** add, get, remove, size, ArrayList, métodos

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 2 (Principais métodos)

---

### B54 — assinalar

No trecho `ArrayList<Aluno> turma = new ArrayList<>();`, o que é o `<>` do lado direito?

- · a) Um erro de digitação: o tipo deveria ser repetido.
- **✅ b) O operador diamante, que repete o tipo já declarado do lado esquerdo.**
- · c) Um operador de comparação.
- · d) A indicação de que a lista aceita qualquer tipo.
- · e) Uma anotação do compilador.

> **Resposta: b**
>
> O diamante evita repetir `<Aluno>`. A lista continua tipada: só aceita `Aluno`.

**Palavras-chave:** operador diamante, <>, ArrayList, tipo, new ArrayList<>()

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 2

---

### B55 — somatória

Ao traduzir para código uma associação com multiplicidade acima de 1, some os números das afirmativas CORRETAS:

- **✅ 01. Cria-se uma variável na classe de origem, com identificador igual ao papel.**
- **✅ 02. Na ausência de papel, o nome é derivado do nome da classe de destino, geralmente no plural.**
- **✅ 04. O tipo da variável deve ser `ArrayList`, com o operador diamante e o nome da classe de destino.**
- **✅ 08. A instância do `ArrayList` é criada na declaração da variável ou no construtor.**
- · 16. Deve-se criar um setter para a variável que mantém a associação.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> O material é explícito: NÃO existe setter para a coleção de uma associação. A inclusão e a remoção são feitas por métodos próprios, que é onde ficam as regras.

**Palavras-chave:** traduzir associação, papel, plural, ArrayList, construtor, sem setter, incluir, remover

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 3

---

### B56 — assinalar

A associação entre `Disciplina` e `Aluno` é `1..50`. Como o material sugere impedir a inclusão do aluno 51?

- · a) Ignorando silenciosamente a chamada de `incluirAluno`.
- **✅ b) Verificando `alunos.size()` e lançando uma exceção quando o limite for atingido.**
- · c) Trocando o `ArrayList` por um vetor de 50 posições.
- · d) Chamando `alunos.clear()` antes de incluir.
- · e) Não é possível limitar uma associação em Java.

> **Resposta: b**
>
> É a ideia da aula de exceções aplicada à coleção: `if (alunos.size() == 50) throw ...`. O slide usa `RuntimeException`; `IllegalStateException` comunica melhor "coleção cheia".

**Palavras-chave:** limite, 1..50, size, throw, RuntimeException, IllegalStateException, incluirAluno

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 3 (Método para incluir)

---

### B57 — assinalar

Sobre o getter de uma associação com multiplicidade maior que 1, como `getAlunos()`, o material levanta um ponto de atenção. Qual é?

- · a) O getter deveria ser `private`.
- **✅ b) Retornar diretamente o `ArrayList` interno expõe a coleção, permitindo `add` e `remove` por fora e contornando as regras.**
- · c) O getter deveria retornar um vetor em vez de `ArrayList`.
- · d) O getter não pode existir em associações reflexivas.
- · e) O getter precisa de um parâmetro indicando a posição.

> **Resposta: b**
>
> Quem faz `getAlunos().add(...)` pula a validação de limite que está em `incluirAluno`. A saída é devolver uma cópia da lista, como o `getSeguindo()` do Sonora faz.

**Palavras-chave:** getter da associação, expor coleção, encapsulamento, cópia, getAlunos, contornar regras

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 3 (Getter da associação) · `../Usuario.java`

---

### B58 — relacionar colunas

Relacione cada forma de percorrer uma coleção à situação em que ela é a escolha certa:

Coluna da esquerda: A. `for` com índice · B. `for-each`

- **( B )** Só é preciso ler cada elemento, sem saber a posição.
- **( A )** É preciso saber em que posição o elemento está.
- **( A )** É preciso remover elementos durante a varredura.
- **( B )** O código fica mais enxuto e não há risco de errar o limite do laço.

> **Resposta: B – A – A – B**
>
> Remover dentro de um `for-each` é o erro clássico: às vezes lança `ConcurrentModificationException`, às vezes só encerra o laço mais cedo e devolve resultado errado. Veja `ERROS_PROVA_PRATICA.md`, seção 5.1.

**Palavras-chave:** for, for-each, índice, remover, ConcurrentModificationException, percorrer

**Onde estudar:** `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 2 (Percorrendo um ArrayList)

---
