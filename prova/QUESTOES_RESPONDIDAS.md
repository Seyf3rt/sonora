# Questões respondidas — L07 Revisão para a Prova

As 30 questões da lista de revisão, com o texto **na íntegra** (para você achar por Ctrl+F o mesmo enunciado que cair na prova), a resposta marcada, o porquê em uma frase, as palavras-chave e onde estudar o assunto.

**Como usar na hora da prova:** Ctrl+F com um trecho literal do enunciado, ou com uma palavra-chave da lista em `BUSCA_POR_PALAVRA_CHAVE.md`.

Nas linhas "Onde estudar", `.../unidadeNN/` é abreviação de
`material-do-professor/ProjetoPratico/src/exemplos/unidadeNN/`.

Legenda: **✅** alternativa correta · **·** alternativa incorreta · nas somatórias, o número de cada afirmativa correta entra na soma.

---

## Parte 1 — Paradigmas e conceitos básicos de POO

### Questão 1 — assinalar

Um paradigma de programação determina a visão que o programador tem sobre a estruturação e a execução do programa. Sobre o paradigma orientado a objetos, assinale a alternativa correta:

- · a) Trata a computação como avaliação de funções matemáticas, evitando estados e dados mutáveis.
- · b) Baseia-se exclusivamente em fatos e regras que descrevem relações entre dados.
- **✅ c) Organiza o código em objetos, que são instâncias de classes, combinando dados e comportamentos.**
- · d) Baseia-se apenas em comandos sequenciais que modificam o estado do programa, sem noção de objeto.
- · e) É um paradigma que não pode ser aplicado à linguagem Java.

> **Resposta: c**
>
> POO organiza o programa em objetos, que são instâncias de classes e juntam dados (atributos) com comportamento (métodos). As outras alternativas descrevem funcional (a), lógico (b) e imperativo (d).

**Palavras-chave:** paradigma, orientado a objetos, instância, classe, dados e comportamento

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 1 (Paradigmas de programação)

---

### Questão 2 — relacionar colunas

Relacione cada paradigma de programação (coluna da esquerda) à sua característica (coluna da direita):

Coluna da esquerda: A. Imperativo · B. Funcional · C. Lógico · D. Orientado a objetos

- **( C )** Programas consistem em fatos e regras (ex.: Prolog).
- **( D )** Empacota dados e comportamento em objetos (ex.: Java).
- **( A )** Comandos sequenciais que alteram o estado (ex.: C, Pascal).
- **( B )** Avaliação de funções matemáticas, evitando estado mutável (ex.: Haskell).

> **Resposta: C – D – A – B**
>
> Prolog é lógico, Java é orientado a objetos, C e Pascal são imperativos, Haskell é funcional.

**Palavras-chave:** imperativo, funcional, lógico, Prolog, Haskell, C, Pascal, paradigmas

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 1 (Imperativo / Funcional / Lógico / Orientado a Objetos)

---

### Questão 3 — somatória

Sobre os objetivos e as contrapartidas do paradigma orientado a objetos, some os números das afirmativas CORRETAS:

- **✅ 01. Um dos objetivos é melhorar a compreensão do sistema e facilitar sua manutenção e evolução.**
- **✅ 02. Busca alto grau de reutilização por meio de componentes acopláveis.**
- · 04. Garante que qualquer programa OO será sempre menor que o equivalente imperativo.
- **✅ 08. Tem como contrapartida uma maior curva de aprendizagem.**
- · 16. É sempre a melhor escolha para qualquer tipo de problema, sem exceção.

> **Resposta: 11  (01 + 02 + 08)**
>
> A 04 e a 16 são exageros: POO não garante código menor e não é a melhor escolha para todo problema. Reutilização e curva de aprendizagem são, respectivamente, objetivo e contrapartida.

**Palavras-chave:** objetivos POO, reutilização, componentes acopláveis, curva de aprendizagem, manutenção

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 2 (O paradigma orientado a objetos)

---

### Questão 4 — somatória

Considerando os conceitos de classe, objeto, atributo e estado, some os números das afirmativas CORRETAS:

- **✅ 01. Um objeto normalmente representa um elemento do mundo real e pertence a uma classe.**
- **✅ 02. Uma classe descreve as características comuns de um grupo de objetos e funciona como um modelo para criá-los.**
- **✅ 04. O estado de um objeto corresponde ao valor de seus atributos, e esse estado pode mudar ao longo do tempo.**
- **✅ 08. O valor de um atributo é um dado que pertence apenas àquele objeto.**
- · 16. Objetos possuem apenas atributos; não são capazes de executar operações.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: objeto tem atributos E operações. O resto é a definição padrão de classe, objeto, atributo e estado.

**Palavras-chave:** classe, objeto, atributo, estado, mundo real, modelo

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 3 (Conceitos básicos de POO)

---

### Questão 5 — assinalar

Assinale a alternativa que descreve corretamente o papel de uma classe em POO:

- · a) A classe armazena os valores concretos de um único objeto em tempo de execução.
- **✅ b) A classe define quais atributos os objetos podem possuir e quais operações podem realizar.**
- · c) A classe é uma fotografia do estado do sistema em um instante específico.
- · d) A classe só existe depois que o operador new é chamado.
- · e) A classe é sinônimo de variável de referência.

> **Resposta: b**
>
> A classe é o molde: define os atributos e as operações. Quem guarda valores concretos é o objeto (a), e a fotografia do sistema é o diagrama de objetos (c).

**Palavras-chave:** papel da classe, molde, modelo, valores concretos

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 3 (Classe)

---

## Parte 2 — UML e diagrama de classes

### Questão 6 — somatória

Sobre a UML e o diagrama de classes, some os números das afirmativas CORRETAS:

- **✅ 01. A UML é uma linguagem visual para modelar sistemas sob o paradigma de orientação a objetos.**
- **✅ 02. O diagrama de classes modela uma visão estática do software, mostrando classes e seus relacionamentos.**
- · 04. É obrigatório modelar todo sistema utilizando os 14 diagramas da UML.
- **✅ 08. Nos nomes de classes, atributos e operações não se utilizam espaços.**
- **✅ 16. A UML é a linguagem padrão de modelagem de software adotada internacionalmente pela indústria.**

> **Resposta: 27  (01 + 02 + 08 + 16)**
>
> A 04 é a falsa: usam-se os diagramas necessários, não os 14. As demais são a definição de UML, do diagrama de classes e da convenção de nomes sem espaço.

**Palavras-chave:** UML, diagrama de classes, visão estática, 14 diagramas, nomes sem espaço, padrão internacional

**Onde estudar:** `material-do-professor/L01 - Classes.pdf` · e o diagrama pronto em `../docs/MODELAGEM.md`

---

### Questão 7 — relacionar colunas

Relacione o elemento ao estilo/convenção de nomenclatura correto:

Coluna da esquerda: A. Nome de classe · B. Nome de atributo · C. Nome de operação · D. Tipo de dado

- **( C )** lowerCamelCase; é um verbo ou locução verbal, com parênteses após o nome.
- **( D )** delimita os valores possíveis (ex.: int, double, boolean, String).
- **( A )** UpperCamelCase; substantivo do vocabulário do sistema (ex.: ContaBancaria).
- **( B )** lowerCamelCase; substantivo que representa uma propriedade da classe.

> **Resposta: C – D – A – B**
>
> Classe é UpperCamelCase e substantivo; atributo é lowerCamelCase e substantivo; operação é lowerCamelCase, verbo e com parênteses; tipo de dado delimita os valores possíveis.

**Palavras-chave:** UpperCamelCase, lowerCamelCase, nomenclatura, nome de classe, nome de atributo, nome de operação, tipo de dado

**Onde estudar:** `material-do-professor/L01 - Classes.pdf` (convenções de nomenclatura)

---

### Questão 8 — relacionar colunas

Relacione cada tipo de dado Java à sua descrição:

Coluna da esquerda: A. boolean · B. int · C. double · D. String

- **( C )** Representa números decimais.
- **( D )** Representa texto.
- **( A )** Tipo lógico, com valores verdadeiro ou falso.
- **( B )** Representa números inteiros.

> **Resposta: C – D – A – B**
>
> double é decimal, String é texto, boolean é lógico, int é inteiro.

**Palavras-chave:** boolean, int, double, String, tipos de dado, decimal, texto, inteiro, lógico

**Onde estudar:** `material-do-professor/L01 - Classes.pdf` (tipos de dado)

---

### Questão 9 — assinalar

Sobre as operações de uma classe, assinale a alternativa correta:

- · a) Toda operação obrigatoriamente altera o estado do objeto.
- **✅ b) Uma operação pode alterar o estado do objeto ou, a partir do estado, produzir um valor de retorno.**
- · c) O nome de uma operação deve ser um substantivo em UpperCamelCase.
- · d) Operações não podem receber parâmetros.
- · e) Operações e atributos são a mesma coisa em UML.

> **Resposta: b**
>
> Operação pode ser procedimento (altera o estado, retorna void) ou função (calcula a partir do estado e devolve valor). Nome de operação é verbo em lowerCamelCase, não substantivo.

**Palavras-chave:** operação, método, valor de retorno, procedimento, função, verbo

**Onde estudar:** `material-do-professor/L01 - Classes.pdf` (operações) · `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 3 (Objetos: operações e comportamento)

---

## Parte 3 — Implementação, memória e diagrama de objetos

### Questão 10 — somatória

Sobre a tradução de um diagrama de classes para código Java, some os números das afirmativas CORRETAS:

- **✅ 01. Os atributos da classe geralmente são traduzidos em variáveis de instância.**
- **✅ 02. As operações da classe são traduzidas em métodos.**
- **✅ 04. Um método que apenas altera o estado do objeto e não devolve valor deve declarar o tipo de retorno void.**
- **✅ 08. Um método que devolve um valor deve declarar o tipo do dado devolvido.**
- · 16. Métodos nunca podem usar o valor dos atributos do próprio objeto para realizar cálculos.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: usar os próprios atributos em cálculos é exatamente o que os métodos fazem. O resto é a tradução direta diagrama → Java.

**Palavras-chave:** diagrama para código, variável de instância, método, void, tipo de retorno

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 1, seção 3 · exemplo em `material-do-professor/ProjetoPratico/src/exemplos/unidade01/classes/Carro.java`

---

### Questão 11 — assinalar — leitura de código

Considere o trecho abaixo, em que a classe Pessoa possui os atributos públicos altura e peso e o método calcularImc():

```java
Pessoa marta = new Pessoa();
marta.altura = 1.70;
marta.peso = 79;
double imc = marta.calcularImc();
```

Assinale a alternativa correta sobre esse código:

- **✅ a) O operador de membro (ponto) é usado para acessar atributos e chamar métodos do objeto.**
- · b) A palavra new não é necessária para criar o objeto marta.
- · c) A variável marta armazena diretamente os valores dos atributos, não um endereço.
- · d) O método calcularImc() precisa receber altura e peso como parâmetros para funcionar.
- · e) A linha "double imc = marta.calcularImc();" provoca erro de compilação.

> **Resposta: a**
>
> O ponto é o operador de acesso a membro. new é obrigatório (b), a variável guarda o endereço e não os valores (c), e o método usa os atributos do próprio objeto, sem precisar de parâmetros (d).

**Palavras-chave:** operador ponto, operador de membro, new, chamar método, acessar atributo, calcularImc

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3 (O operador new) · exemplo em `.../unidade01/classes/App.java`

---

### Questão 12 — somatória

Sobre variáveis de referência, o operador new e as áreas de memória do Java, some os números das afirmativas CORRETAS:

- **✅ 01. Uma variável de referência armazena o endereço de um objeto, e não o objeto em si.**
- **✅ 02. A área Heap armazena os objetos.**
- **✅ 04. A área Stack armazena variáveis locais, parâmetros e chamadas de métodos.**
- **✅ 08. O operador new cria o objeto na memória, inicializa as variáveis de instância e retorna o endereço criado.**
- · 16. O operador new é usado apenas para tipos primitivos como int e double.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: new é para objetos; int e double são primitivos e não usam new. Heap guarda objetos, Stack guarda variáveis locais, parâmetros e chamadas.

**Palavras-chave:** variável de referência, endereço, new, Heap, Stack, memória, tipos primitivos

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.3 (O operador new) e Aula 3, seção 1 (Diagrama de Objetos)

---

### Questão 13 — assinalar

Sobre o diagrama de objetos, assinale a alternativa correta:

- **✅ a) Mostra uma fotografia do estado do sistema em um determinado instante e contém somente objetos.**
- · b) Substitui completamente o diagrama de classes, pois contém as mesmas informações.
- · c) Contém apenas classes e seus relacionamentos, sem objetos.
- · d) É usado para modelar o comportamento dinâmico de métodos ao longo do tempo.
- · e) Não pode representar os valores dos atributos de um objeto.

> **Resposta: a**
>
> Diagrama de objetos é a fotografia do sistema num instante, com objetos e os valores dos atributos. Ele complementa o diagrama de classes, não substitui.

**Palavras-chave:** diagrama de objetos, fotografia, instante, estado do sistema

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 1 (Diagrama de Objetos)

---

## Parte 4 — Escopo de variáveis

### Questão 14 — relacionar colunas

Relacione cada tipo de variável ao seu escopo:

Coluna da esquerda: A. Variável de instância · B. Variável local · C. Variável de bloco

- **( C )** Seu escopo é o bloco (ex.: dentro de um do/while) em que foi declarada.
- **( A )** Seu escopo são todos os métodos da classe.
- **( B )** Seu escopo é o próprio método em que foi declarada.

> **Resposta: C – A – B**
>
> Bloco vale só dentro do bloco; instância vale em todos os métodos da classe; local vale só no método onde foi declarada.

**Palavras-chave:** escopo, variável de instância, variável local, variável de bloco, do/while

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 2, seções 2 a 4 · exemplo em `.../unidade01/escopoVariavel/Pessoa.java`

---

### Questão 15 — somatória

Sobre inicialização e valores padrão de variáveis em Java, some os números das afirmativas CORRETAS:

- **✅ 01. Variáveis locais não possuem valor inicial; só podem ser lidas após atribuição explícita.**
- **✅ 02. Variáveis de instância numéricas são inicializadas automaticamente com 0.**
- **✅ 04. Variáveis de instância booleanas são inicializadas automaticamente com false.**
- **✅ 08. Variáveis de instância de referência são inicializadas automaticamente com null.**
- · 16. Variáveis locais recebem os mesmos valores padrão das variáveis de instância.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: variável local NÃO recebe valor padrão. Só as de instância recebem (0, false, null).

**Palavras-chave:** inicialização, valor padrão, zero, false, null, variável local não inicializada

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 2, seção 5 (Inicialização de variáveis)

---

### Questão 16 — assinalar — leitura de código

Considere a classe abaixo:

```java
public class Classe1 {
    int var1 = 20;
    void exibir() {
        int var1;
        this.var1 = 10;
        System.out.println(var1);
    }
}
```

Ao chamar o método exibir(), o que será impresso e por quê? Assinale a alternativa correta:

- · a) Imprime 10, porque this.var1 e var1 local são a mesma variável.
- · b) Imprime 20, porque this.var1 sobrescreve a variável local.
- **✅ c) A saída é indefinida (lixo), pois a variável local var1 não foi inicializada antes do println.**
- · d) Erro de compilação, pois não é permitido repetir o nome var1.
- · e) Imprime 0, pois toda variável local começa em zero.

> **Resposta: c**
>
> A local var1 foi declarada e nunca inicializada, e é ela que o println lê — this.var1 = 10 mexe na variável de instância, que é outra. ATENÇÃO: o compilador Java recusa esse código com "variable var1 might not have been initialized"; veja a observação no fim deste arquivo.

**Palavras-chave:** sombreamento, this, variável local, mesmo nome, não inicializada, Classe1, exibir

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 2, seção 7 (Sombreamento)

---

## Parte 5 — Encapsulamento

### Questão 17 — assinalar

Uma classe ContaBancaria possui o atributo saldo com acesso público. Em outra classe, é possível escrever: conta.saldo = 10000; sem realizar um depósito. Assinale a alternativa que explica corretamente o problema e a solução:

- · a) Não há problema, pois atributos públicos garantem a integridade dos dados.
- **✅ b) O problema é o acesso direto ao atributo; a solução é encapsular (tornar saldo privado) e controlar o acesso por métodos.**
- · c) A solução é declarar o atributo saldo como static.
- · d) O problema só ocorre se a classe não tiver construtor.
- · e) A solução é remover o atributo saldo da classe.

> **Resposta: b**
>
> Atributo público deixa qualquer classe alterar o saldo sem passar pelas regras. A solução é encapsular: private + métodos que validam (depositar/sacar).

**Palavras-chave:** encapsulamento, atributo público, saldo, ContaBancaria, private, integridade

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.1 (Motivação) · `.../unidade01/encapsulamento/ContaBancaria.java`

---

### Questão 18 — relacionar colunas

Relacione o símbolo de visibilidade da UML à palavra reservada / significado em Java:

Coluna da esquerda: A. -  (menos) · B. +  (mais) · C. #  (sustenido)

- **( B )** public — visível para qualquer classe.
- **( C )** protected — protegido.
- **( A )** private — somente visível pela própria classe.

> **Resposta: B – C – A**
>
> Menos é private, mais é public, sustenido é protected.

**Palavras-chave:** visibilidade, UML, mais, menos, sustenido, public, private, protected

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.3 (Modificadores de acesso)

---

### Questão 19 — somatória

Sobre métodos de acesso (getters e setters), some os números das afirmativas CORRETAS:

- **✅ 01. Um getter recupera o valor de um atributo; nunca tem parâmetro e sempre retorna um valor.**
- **✅ 02. Um setter atribui valor a um atributo; sempre tem um parâmetro e normalmente é do tipo void (procedimento).**
- **✅ 04. Para um atributo booleano, o getter pode usar o prefixo "is" em vez de "get".**
- **✅ 08. O tipo de retorno de um getter deve ser igual ao tipo do atributo correspondente.**
- · 16. Getters e setters devem ser sempre privados para funcionar.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: getter e setter existem justamente para serem públicos. O resto é a regra dos métodos de acesso, incluindo o prefixo is para boolean.

**Palavras-chave:** getter, setter, métodos de acesso, prefixo is, tipo de retorno, parâmetro

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.4 (Métodos de acesso)

---

### Questão 20 — assinalar — leitura de código

Considere o setter abaixo:

```java
private String titular;
public void setTitular(String titular) {
    this.titular = titular;
}
```

Qual o papel da palavra this nesse código? Assinale a alternativa correta:

- · a) this é opcional e não faz diferença alguma nesse caso.
- **✅ b) this.titular refere-se à variável de instância, distinguindo-a do parâmetro de mesmo nome.**
- · c) this.titular refere-se ao parâmetro recebido pelo método.
- · d) this transforma o atributo titular em uma variável de classe (static).
- · e) this provoca erro de compilação quando o parâmetro tem o mesmo nome do atributo.

> **Resposta: b**
>
> Quando o parâmetro tem o mesmo nome do atributo, ele sombreia o atributo dentro do método. this.titular desfaz a ambiguidade e aponta para a variável de instância.

**Palavras-chave:** this, parâmetro de mesmo nome, setTitular, variável de instância

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 2.5 (A palavra-chave this)

---

## Parte 6 — Membros de classe, sobrecarga e construtores

### Questão 21 — somatória

Sobre membros de classe (estáticos), some os números das afirmativas CORRETAS:

- **✅ 01. Uma variável de classe (static) é comum e compartilhada entre todas as instâncias.**
- **✅ 02. Membros de classe podem ser usados sem que haja uma instância da classe.**
- **✅ 04. Um método de classe (static) não pode utilizar a palavra this.**
- **✅ 08. No diagrama de classes, os membros de classe são sublinhados.**
- · 16. Um método static pode manipular variáveis de instância livremente, sem uma instância explícita.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: método static não tem objeto, então não acessa variável de instância sem uma instância explícita — e por isso também não pode usar this.

**Palavras-chave:** static, membro de classe, variável de classe, compartilhada, sublinhado, this

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.1 (Membros de classe) · `.../unidade01/membroClasse/ContaBancaria.java`

---

### Questão 22 — assinalar

Assinale a alternativa que contém apenas exemplos de membros estáticos (de classe), acessados pela sintaxe classe.identificador:

- **✅ a) Math.sqrt(), Math.abs(), Integer.MAX_VALUE**
- · b) new Pessoa(), conta.sacar(), marta.altura
- · c) this.titular, this.saldo, this.nome
- · d) getTitular(), setTitular(), depositar()
- · e) try, catch, finally

> **Resposta: a**
>
> Math.sqrt(), Math.abs() e Integer.MAX_VALUE são acessados pelo nome da classe, sem instância. As outras alternativas usam objetos (b, c), métodos de instância (d) ou palavras reservadas (e).

**Palavras-chave:** Math.sqrt, Math.abs, Integer.MAX_VALUE, classe.identificador, membro estático

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.1 (Exemplos de membros estáticos da biblioteca Java)

---

### Questão 23 — somatória

Sobre a sobrecarga de métodos em Java, some os números das afirmativas CORRETAS:

- **✅ 01. Sobrecarga é a implementação de vários métodos com o mesmo nome na mesma classe.**
- **✅ 02. Métodos sobrecarregados devem ter assinaturas diferentes (lista de parâmetros diferente).**
- · 04. O compilador diferencia métodos sobrecarregados apenas pelo tipo de retorno.
- **✅ 08. Dois métodos com a mesma assinatura mas retornos diferentes não podem coexistir na mesma classe.**
- **✅ 16. A sobrecarga deve ser usada com moderação, pois o excesso pode reduzir a legibilidade.**

> **Resposta: 27  (01 + 02 + 08 + 16)**
>
> A 04 é a falsa: o tipo de retorno NÃO diferencia sobrecarga. O que diferencia é a assinatura, isto é, a lista de parâmetros.

**Palavras-chave:** sobrecarga, assinatura, lista de parâmetros, tipo de retorno, legibilidade

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.2 (Sobrecarga) · `.../unidade01/sobrecargaMetodos/Calculadora.java`

---

### Questão 24 — somatória

Sobre construtores, some os números das afirmativas CORRETAS:

- **✅ 01. Um construtor é invocado exclusivamente durante a criação de objetos e serve para inicializá-los.**
- **✅ 02. O construtor não possui tipo de dado de retorno e tem o mesmo identificador da classe.**
- **✅ 04. Se nenhum construtor for implementado, o compilador fornece um construtor padrão (sem argumentos).**
- **✅ 08. O operador new, ao criar o objeto, executa o construtor utilizado.**
- · 16. Todo construtor obrigatoriamente deve declarar void como tipo de retorno.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: construtor não declara tipo de retorno nenhum, nem void. Se declarar, vira um método comum com o nome da classe.

**Palavras-chave:** construtor, construtor padrão, sem tipo de retorno, mesmo nome da classe, new, void

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 3, seção 3.3 (Construtores) · `.../unidade01/construtores/Carro.java`

---

## Parte 7 — Lançamento e tratamento de exceções

### Questão 25 — assinalar

Assinale a alternativa que define corretamente o que é uma exceção:

- **✅ a) Um evento que ocorre durante a execução do programa e interrompe o fluxo normal de execução.**
- · b) Um erro de digitação detectado apenas pelo editor de texto.
- · c) Um tipo primitivo do Java usado para representar números muito grandes.
- · d) Um comentário especial que documenta o código.
- · e) Uma variável de classe compartilhada entre instâncias.

> **Resposta: a**
>
> Exceção é um evento em tempo de execução que interrompe o fluxo normal do programa.

**Palavras-chave:** exceção, evento, fluxo normal, interrompe execução

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 6, seção 1 (O que é uma exceção)

---

### Questão 26 — assinalar — leitura de código

Considere o método abaixo:

```java
public void setSalario(double novoSalario) {
    if (novoSalario < 0) {
        throw new IllegalArgumentException("Salário incorreto");
    }
    salario = novoSalario;
}
```

Assinale a alternativa correta sobre esse código:

- **✅ a) Se novoSalario for negativo, uma exceção é lançada e a atribuição a salario não ocorre.**
- · b) A palavra throw serve para capturar (tratar) a exceção.
- · c) O método sempre lança a exceção, independentemente do valor de novoSalario.
- · d) A mensagem "Salário incorreto" não pode ser recuperada no tratamento da exceção.
- · e) O código não compila, pois throw não existe em Java.

> **Resposta: a**
>
> O throw interrompe o método na hora, então a linha de atribuição não chega a executar. throw lança; quem captura é o catch.

**Palavras-chave:** throw, IllegalArgumentException, setSalario, validação, mensagem da exceção

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 6, seção 3 · `.../unidade01/lancamentoExcecao/ContaBancaria.java`

---

### Questão 27 — somatória

Sobre o comando try..catch e o tratamento de exceções, some os números das afirmativas CORRETAS:

- **✅ 01. Qualquer erro em um comando do bloco try desvia o fluxo para o bloco catch.**
- **✅ 02. Se nenhum erro ocorrer no try, os comandos do catch não são executados.**
- **✅ 04. O comando catch exige um parâmetro que pode ser qualquer classe que estenda de Throwable.**
- **✅ 08. Em múltiplos catch, as cláusulas são verificadas na ordem em que foram escritas.**
- · 16. A cláusula finally só é executada quando ocorre um erro no bloco try.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: finally executa sempre, com ou sem erro. Veja a ressalva sobre a afirmativa 01 no fim deste arquivo.

**Palavras-chave:** try, catch, finally, múltiplos catch, ordem, Throwable

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seções 3, 4 e 8 · `.../unidade01/tratamentoExcecoes/Estacionamento.java`

---

### Questão 28 — relacionar colunas

Relacione cada conceito de tratamento de exceções à sua descrição:

Coluna da esquerda: A. throws · B. finally · C. Exceção verificada · D. Classe Error

- **( B )** Bloco cujos comandos sempre executam, com ou sem erro (ex.: liberar recursos).
- **( D )** Indica erros graves, que não se espera que sejam tratados pelo programa.
- **( A )** Cláusula que delega ao método chamador o tratamento de uma exceção.
- **( C )** Deve ser tratada ou postergada; não é subclasse de RuntimeException nem de Error.

> **Resposta: B – D – A – C**
>
> finally sempre executa; Error é erro grave que não se espera tratar; throws delega ao chamador; exceção verificada é a que o compilador obriga a tratar ou declarar.

**Palavras-chave:** throws, finally, exceção verificada, checked, Error, RuntimeException, delegar

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seções 2, 6, 7 e 8

---

### Questão 29 — somatória

Sobre a hierarquia de erros, propagação e cláusulas catch, some os números das afirmativas CORRETAS:

- **✅ 01. A classe Exception e suas subclasses indicam erros que poderiam ser tratados pelos programas.**
- **✅ 02. Se um método não trata o erro, ele é propagado ao método chamador, até chegar em main().**
- **✅ 04. Uma exceção pode ser capturada por um catch cujo parâmetro seja da mesma classe ou de uma superclasse do erro (polimorfismo).**
- **✅ 08. A partir do Java 7, um único catch pode tratar várias classes de erro usando o operador | (ex.: IOException | SQLException).**
- · 16. É válido declarar um catch de uma subclasse depois de um catch de sua superclasse (ex.: Exception antes de NumberFormatException).

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: catch de subclasse depois da superclasse é código inalcançável e não compila. A ordem certa é da mais específica para a mais genérica.

**Palavras-chave:** hierarquia de exceções, propagação, chamador, main, superclasse, multi-catch, operador pipe, ordem dos catch

**Onde estudar:** `material-do-professor/Conteudo/Unidade01.md` — Aula 7, seções 2, 4 e 5 (hierarquia, múltiplos catch, propagação)

---

## Parte 8 — Qualidade de software e testes de unidade

### Questão 30 — somatória

Sobre qualidade de software, testes de unidade e JUnit, some os números das afirmativas CORRETAS:

- **✅ 01. Quanto mais cedo os erros são detectados no ciclo de desenvolvimento, menor o custo de correção.**
- **✅ 02. Em POO, a "unidade" testada em um teste de unidade é o método.**
- **✅ 04. No JUnit, um método de teste recebe a anotação @Test, é público, não tem parâmetros e não retorna valor (void).**
- **✅ 08. assertEquals verifica se o valor esperado é igual ao valor obtido; assertThrows verifica se uma exceção esperada é lançada.**
- · 16. Um teste de unidade avalia o sistema inteiro sob o ponto de vista do usuário final, em ambiente de produção.

> **Resposta: 15  (01 + 02 + 04 + 08)**
>
> A 16 é a falsa: avaliar o sistema inteiro pelo olhar do usuário final é teste de sistema/aceitação, não de unidade.

**Palavras-chave:** qualidade de software, teste de unidade, JUnit, @Test, assertEquals, assertThrows, custo de correção, teste de sistema

**Onde estudar:** `material-do-professor/Conteudo/Unidade02.md` — Aula 9 inteira · testes prontos em `material-do-professor/ProjetoPratico/test/` e em `../test/`

---

## Duas ressalvas importantes

### Questão 16 — o compilador não deixa esse código rodar

A alternativa (c) é a que aponta a causa certa: a variável local `var1` nunca recebeu valor, e é ela que o `println` lê. Mas em Java de verdade o código nem compila:

```
error: variable var1 might not have been initialized
        System.out.println(var1);
```

Ou seja, a conclusão da alternativa (d) — erro de compilação — está certa, só que pelo motivo errado: repetir o nome é permitido, isso se chama **sombreamento**. Se a prova perguntar o que o compilador faz, a resposta é erro de compilação por variável local não inicializada. Se perguntar qual variável o `println` lê, é a local.

### Questão 27, afirmativa 01 — "qualquer erro desvia para o catch"

Vale como correta na leitura da aula, mas o desvio só acontece se existir um `catch` cujo parâmetro seja da mesma classe do erro ou de uma superclasse dele. Sem `catch` compatível, a exceção é **propagada ao método chamador** — que é exatamente o que a afirmativa 02 da questão 29 diz.

### Padrão das somatórias

Em todas as somatórias desta lista a afirmativa **16 é a incorreta** — ela sempre exagera ("garante", "sempre", "nunca", "livremente", "apenas"). Nas questões 3, 6 e 23 há uma segunda incorreta no meio da lista (a 04, nas três). Isso dá o padrão: **15** quando só a 16 é falsa, **11** ou **27** quando a 04 também é.
