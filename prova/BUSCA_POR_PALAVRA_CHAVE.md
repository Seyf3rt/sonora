# Busca por palavra-chave

Achou uma questão na prova e não lembra? Procure aqui por uma palavra do enunciado. Cada linha dá a resposta direta e diz em qual questão ela aparece por inteiro.

Duas fontes de questões:

- **Q1 a Q30** — as questões da lista de revisão L07, em `QUESTOES_RESPONDIDAS.md`
- **B01 a B58** — questões extras escritas a partir do material do professor, em `BANCO_DE_QUESTOES.md`

Outros lugares para procurar:
- Teoria do professor: `material-do-professor/Conteudo/`
- Código pronto do professor: `material-do-professor/ProjetoPratico/src/`

---

## 1. Respostas relâmpago — lista de revisão (Q1 a Q30)

| Q | Resposta | O que você precisa lembrar |
|---|---|---|
| 1 | **c** | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| 2 | **C – D – A – B** | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| 3 | **11 (01 + 02 + 08)** | Objetivos: compreensão, manutenção, reutilização. Contrapartida: curva de aprendizagem. |
| 4 | **15 (01 + 02 + 04 + 08)** | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| 5 | **b** | A classe é o molde: define atributos e operações. O objeto guarda os valores. |
| 6 | **27 (01 + 02 + 08 + 16)** | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| 7 | **C – D – A – B** | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| 8 | **C – D – A – B** | boolean lógico · int inteiro · double decimal · String texto. |
| 9 | **b** | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| 10 | **15 (01 + 02 + 04 + 08)** | Atributo vira variável de instância · operação vira método · sem retorno = void. |
| 11 | **a** | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| 12 | **15 (01 + 02 + 04 + 08)** | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| 13 | **a** | Diagrama de objetos = fotografia do sistema num instante, só com objetos. |
| 14 | **C – A – B** | Instância: toda a classe · local: o método · bloco: o bloco onde foi declarada. |
| 15 | **15 (01 + 02 + 04 + 08)** | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| 16 | **c** | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| 17 | **b** | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| 18 | **B – C – A** | - private · + public · # protected. |
| 19 | **15 (01 + 02 + 04 + 08)** | Getter: sem parâmetro, retorna o tipo do atributo. Setter: um parâmetro, void. |
| 20 | **b** | this.x = x distingue o atributo do parâmetro de mesmo nome. |
| 21 | **15 (01 + 02 + 04 + 08)** | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| 22 | **a** | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| 23 | **27 (01 + 02 + 08 + 16)** | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| 24 | **15 (01 + 02 + 04 + 08)** | Construtor: mesmo nome da classe, sem tipo de retorno (nem void). Sem nenhum, vem o padrão. |
| 25 | **a** | Exceção = evento em execução que interrompe o fluxo normal. |
| 26 | **a** | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| 27 | **15 (01 + 02 + 04 + 08)** | finally executa SEMPRE. Os catch são verificados na ordem em que foram escritos. |
| 28 | **B – D – A – C** | throws delega ao chamador · finally sempre executa · Error não se trata. |
| 29 | **15 (01 + 02 + 04 + 08)** | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| 30 | **15 (01 + 02 + 04 + 08)** | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |

## 1b. Respostas relâmpago — banco extra (B01 a B58)

| B | Parte | Resposta |
|---|---|---|
| B01 | Paradigmas e conceitos básicos de POO | **b** |
| B02 | Paradigmas e conceitos básicos de POO | **15 (01 + 02 + 04 + 08)** |
| B03 | Paradigmas e conceitos básicos de POO | **15 (01 + 02 + 04 + 08)** |
| B04 | Paradigmas e conceitos básicos de POO | **c** |
| B05 | Paradigmas e conceitos básicos de POO | **a** |
| B06 | Paradigmas e conceitos básicos de POO | **C – A – D – B** |
| B07 | UML: diagrama de classes e diagrama de objetos | **d** |
| B08 | UML: diagrama de classes e diagrama de objetos | **B – A – B – A** |
| B09 | UML: diagrama de classes e diagrama de objetos | **15 (01 + 02 + 04 + 08)** |
| B10 | UML: diagrama de classes e diagrama de objetos | **C – A – D – B** |
| B11 | UML: diagrama de classes e diagrama de objetos | **b** |
| B12 | Implementação, memória e o operador new | **15 (01 + 02 + 04 + 08)** |
| B13 | Implementação, memória e o operador new | **a** |
| B14 | Implementação, memória e o operador new | **b** |
| B15 | Implementação, memória e o operador new | **B – C – A – D** |
| B16 | Escopo de variáveis e inicialização | **c** |
| B17 | Escopo de variáveis e inicialização | **C – D – A – B** |
| B18 | Escopo de variáveis e inicialização | **b** |
| B19 | Escopo de variáveis e inicialização | **a** |
| B20 | Escopo de variáveis e inicialização | **15 (01 + 02 + 04 + 08)** |
| B21 | Encapsulamento | **b** |
| B22 | Encapsulamento | **15 (01 + 02 + 04 + 08)** |
| B23 | Encapsulamento | **a** |
| B24 | Encapsulamento | **b** |
| B25 | Encapsulamento | **B – D – A – C** |
| B26 | Membros de classe, sobrecarga e construtores | **15 (01 + 02 + 04 + 08)** |
| B27 | Membros de classe, sobrecarga e construtores | **a** |
| B28 | Membros de classe, sobrecarga e construtores | **b** |
| B29 | Membros de classe, sobrecarga e construtores | **A – C – D – B** |
| B30 | Membros de classe, sobrecarga e construtores | **15 (01 + 02 + 04 + 08)** |
| B31 | Lançamento de exceções | **b** |
| B32 | Lançamento de exceções | **b** |
| B33 | Lançamento de exceções | **b** |
| B34 | Lançamento de exceções | **D – A – C – B** |
| B35 | Tratamento de exceções | **B – A – D – C** |
| B36 | Tratamento de exceções | **b** |
| B37 | Tratamento de exceções | **15 (01 + 02 + 04 + 08)** |
| B38 | Tratamento de exceções | **b** |
| B39 | Tratamento de exceções | **15 (01 + 02 + 04 + 08)** |
| B40 | Tratamento de exceções | **b** |
| B41 | Tratamento de exceções | **b** |
| B42 | Qualidade de software e testes de unidade | **B – D – A – C** |
| B43 | Qualidade de software e testes de unidade | **15 (01 + 02 + 04 + 08)** |
| B44 | Qualidade de software e testes de unidade | **B – D – A – C** |
| B45 | Qualidade de software e testes de unidade | **b** |
| B46 | Qualidade de software e testes de unidade | **b** |
| B47 | Qualidade de software e testes de unidade | **B – D – A – C** |
| B48 | Qualidade de software e testes de unidade | **b** |
| B49 | Associações, multiplicidade e ArrayList | **b** |
| B50 | Associações, multiplicidade e ArrayList | **D – C – B – A** |
| B51 | Associações, multiplicidade e ArrayList | **b** |
| B52 | Associações, multiplicidade e ArrayList | **15 (01 + 02 + 04 + 08)** |
| B53 | Associações, multiplicidade e ArrayList | **D – A – B – C** |
| B54 | Associações, multiplicidade e ArrayList | **b** |
| B55 | Associações, multiplicidade e ArrayList | **15 (01 + 02 + 04 + 08)** |
| B56 | Associações, multiplicidade e ArrayList | **b** |
| B57 | Associações, multiplicidade e ArrayList | **b** |
| B58 | Associações, multiplicidade e ArrayList | **B – A – A – B** |

---

## 2. Índice alfabético de palavras-chave

| Palavra-chave | Questão | Resposta direta |
|---|---|---|
| 0..* | B50 | A diferença que mais cai: `0..*` admite nenhum, `1..*` exige pelo menos um. |
| 0..1 | B50 | A diferença que mais cai: `0..*` admite nenhum, `1..*` exige pelo menos um. |
| 1 5 15 30 | B42 | A progressão é 1, 5, 15, 30. Um erro que custaria 1 na especificação pode custar 30 em produção — é o argumento central a favor de testar cedo. |
| 1..* | B50 | A diferença que mais cai: `0..*` admite nenhum, `1..*` exige pelo menos um. |
| 1..1 | B50 | A diferença que mais cai: `0..*` admite nenhum, `1..*` exige pelo menos um. |
| 1..50 | B56 | É a ideia da aula de exceções aplicada à coleção: `if (alunos.size() == 50) throw ...`. |
| 14 diagramas | Q6 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| 3..5 | B50 | A diferença que mais cai: `0..*` admite nenhum, `1..*` exige pelo menos um. |
| <> | B54 | O diamante evita repetir `<Aluno>`. |
| @AfterEach | B46 | `@BeforeAll` roda uma única vez para a classe inteira e por isso exige método `static`. |
| @BeforeAll | B46 | `@BeforeAll` roda uma única vez para a classe inteira e por isso exige método `static`. |
| @BeforeEach | B46 | `@BeforeAll` roda uma única vez para a classe inteira e por isso exige método `static`. |
| @Disabled | B47 | Todas aparecem na tabela de anotações do material. `@Order(n)` só funciona se a classe tiver `@TestMethodOrder`. |
| @DisplayName | B47 | Todas aparecem na tabela de anotações do material. `@Order(n)` só funciona se a classe tiver `@TestMethodOrder`. |
| @Order | B47 | Todas aparecem na tabela de anotações do material. `@Order(n)` só funciona se a classe tiver `@TestMethodOrder`. |
| @Tag | B47 | Todas aparecem na tabela de anotações do material. `@Order(n)` só funciona se a classe tiver `@TestMethodOrder`. |
| @Test | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| @TestMethodOrder | B47 | Todas aparecem na tabela de anotações do material. `@Order(n)` só funciona se a classe tiver `@TestMethodOrder`. |
| @Timeout | B47 | Todas aparecem na tabela de anotações do material. `@Order(n)` só funciona se a classe tiver `@TestMethodOrder`. |
| \u0000 | B17 | Numérica inteira começa em `0`, ponto flutuante em `0.0`, lógica em `false` e referência em `null`. |
| abortar execução | B31 | Lançar exceção é criar o objeto que caracteriza o erro e notificar o sistema. |
| abstração | B04, B06 | Abstração é escolher, entre as muitas formas de caracterizar algo do mundo real, apenas as características úteis ao problema que se quer resolver. |
| acessar atributo | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| acesso direto | B21 | O estado do objeto passou a ser alterado por fora, sem passar pela regra de negócio. |
| add | B53 | Cuidado com `remove`: numa lista de `Integer`, `remove(1)` remove a POSIÇÃO 1, porque o Java escolhe a versão `remove(int)`. |
| alocar | B12 | São exatamente as quatro operações listadas no material. |
| ambiente | B43 | O plano organiza; quem encontra o erro é a execução. |
| analogia do carro | B24 | Encapsular método é esconder o "como" e expor só o "o quê". |
| anônimo | B07 | O material diz explicitamente que o diagrama de objetos tem uso limitado justamente porque apresenta somente estruturas de dados, o estado, SEM… |
| anotações | B47 | Todas aparecem na tabela de anotações do material. `@Order(n)` só funciona se a classe tiver `@TestMethodOrder`. |
| argumento inválido | B33 | Ela é subclasse de `RuntimeException`, portanto NÃO é verificada — o compilador não obriga a tratar. |
| ArrayList | B52, B53, B54, B55 | É preciso `import java.util.ArrayList;`. |
| assertEquals | Q30, B44 | A versão de três parâmetros é só para `double`: comparar decimal por igualdade exata é problemático, então aceita-se uma tolerância (delta). |
| assertNotNull | B44 | A versão de três parâmetros é só para `double`: comparar decimal por igualdade exata é problemático, então aceita-se uma tolerância (delta). |
| assertNull | B44 | A versão de três parâmetros é só para `double`: comparar decimal por igualdade exata é problemático, então aceita-se uma tolerância (delta). |
| assertThrows | Q30, B44, B45 | Com o lambda, quem executa o trecho é o próprio `assertThrows`, e aí ele consegue capturar e conferir a exceção. |
| assinatura | Q23, B28 | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| associação reflexiva | B51 | Reflexiva é a associação de uma classe com ela mesma. |
| atribuição explícita | B18 | O material é explícito: tentar ler antes de atribuir gera ERRO DE COMPILAÇÃO, não lixo. |
| atributo | Q4, B15 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| atributo público | Q17 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| autor | B11 | Um autor pode não ter escrito nenhuma obra e não há teto, logo `0..*` no lado das obras. |
| avaliado antes | B45 | Com o lambda, quem executa o trecho é o próprio `assertThrows`, e aí ele consegue capturar e conferir a exceção. |
| Barker | B06 | Objeto empacota estado e comportamento; classe é o molde; estado é o valor dos atributos; operação é o que o objeto sabe fazer. |
| bidirecional | B49 | O padrão é bidirecional. |
| bloco | B16 | O escopo da variável de instância são TODOS os métodos da classe. |
| blocos distintos | B40 | Cada bloco define escopo próprio. |
| boas práticas | B20, B23 | A 16 é o oposto da primeira boa prática: o material manda usar o MENOR escopo possível. |
| boolean | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| brutus | B05 | A classe define a estrutura, ou seja, quais atributos e operações existem. |
| C | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| Cachorro | B05 | A classe define a estrutura, ou seja, quais atributos e operações existem. |
| cadeia de chamadas | B39 | Se nem o `main()` trata, o programa é interrompido. |
| calcularImc | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| características | B04 | Abstração é escolher, entre as muitas formas de caracterizar algo do mundo real, apenas as características úteis ao problema que se quer resolver. |
| casos de teste | B43 | O plano organiza; quem encontra o erro é a execução. |
| catch | Q27, B34 | finally executa SEMPRE. Os catch são verificados na ordem em que foram escritos. |
| chamador | Q29, B39 | Se nem o `main()` trata, o programa é interrompido. |
| chamar método | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| char | B17 | Numérica inteira começa em `0`, ponto flutuante em `0.0`, lógica em `false` e referência em `null`. |
| checked | Q28, B38 | Essa é a regra literal do material. |
| chefia | B51 | Reflexiva é a associação de uma classe com ela mesma. |
| classe | Q1, Q4, B06 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| classe de teste | B48 | `Calculadora` gera `CalculadoraTest`. |
| classe.identificador | Q22 | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| Classe.membro | B27 | Todos os da alternativa (a) são acessados por `Classe.membro`, sem criar objeto. |
| Classe1 | Q16 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| código inalcançável | B32 | Quando o `throw` é SEMPRE executado, nada pode vir depois dele no mesmo bloco. |
| compartilhada | Q21 | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| compartimentos | B08 | O diagrama de classes descreve os tipos (`peso : double`); o de objetos mostra instâncias com valores (`peso = 78`). |
| complementares | B08 | O diagrama de classes descreve os tipos (`peso : double`); o de objetos mostra instâncias com valores (`peso = 78`). |
| componentes acopláveis | Q3 | Objetivos: compreensão, manutenção, reutilização. Contrapartida: curva de aprendizagem. |
| comportamento | B07 | O material diz explicitamente que o diagrama de objetos tem uso limitado justamente porque apresenta somente estruturas de dados, o estado, SEM… |
| compreensão | B03 | Os cinco objetivos do material são compreensão, reutilização, manutenção, evolução, qualidade e produtividade com menor custo. |
| concepção do algoritmo | B36 | O programa compila e roda, mas o raciocínio está errado: índices válidos vão de 0 a length-1. Erros de lógica nascem do programador e devem ser… |
| ConcurrentModificationException | B58 | Remover dentro de um `for-each` é o erro clássico: às vezes lança `ConcurrentModificationException`, às vezes só encerra o laço mais cedo e devolve… |
| constantes | B23 | A regra do material é clara: encapsular todos os atributos, e `public` só se justifica para constantes. |
| construtor | Q24, B12, B29, B30, B33, B55 | Construtor: mesmo nome da classe, sem tipo de retorno (nem void). Sem nenhum, vem o padrão. |
| construtor padrão | Q24, B14, B30 | O construtor padrão só é fornecido quando NENHUM construtor foi implementado. |
| ContaBancaria | Q17, B21 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| contexto | B46 | `@BeforeAll` roda uma única vez para a classe inteira e por isso exige método `static`. |
| contornar regras | B57 | Quem faz `getAlunos().add(...)` pula a validação de limite que está em `incluirAluno`. |
| contrapartidas | B02 | ATENÇÃO, esta é a pegadinha mais provável da prova: o material lista "programas maiores" como CONTRAPARTIDA do POO. Maior produtividade e MENOR custo… |
| cópia | B57 | Quem faz `getAlunos().add(...)` pula a validação de limite que está em `incluirAluno`. |
| critérios de aceite | B43 | O plano organiza; quem encontra o erro é a execução. |
| curva de aprendizagem | Q3, B02 | ATENÇÃO, esta é a pegadinha mais provável da prova: o material lista "programas maiores" como CONTRAPARTIDA do POO. Maior produtividade e MENOR custo… |
| custo | B02 | ATENÇÃO, esta é a pegadinha mais provável da prova: o material lista "programas maiores" como CONTRAPARTIDA do POO. Maior produtividade e MENOR custo… |
| custo de correção | Q30, B42 | A progressão é 1, 5, 15, 30. Um erro que custaria 1 na especificação pode custar 30 em produção — é o argumento central a favor de testar cedo. |
| dados e comportamento | Q1 | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| decimal | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| declarar antes | B40 | Cada bloco define escopo próprio. |
| deixa de fornecer | B14 | O construtor padrão só é fornecido quando NENHUM construtor foi implementado. |
| delegar | Q28, B34 | O par que mais confunde é `throw` (lança, dentro do corpo) e `throws` (declara, na assinatura). |
| delta | B44 | A versão de três parâmetros é só para `double`: comparar decimal por igualdade exata é problemático, então aceita-se uma tolerância (delta). |
| diagrama de classes | Q6, B08 | O diagrama de classes descreve os tipos (`peso : double`); o de objetos mostra instâncias com valores (`peso = 78`). |
| diagrama de objetos | Q13, B07, B08 | Diagrama de objetos = fotografia do sistema num instante, só com objetos. |
| diagrama para código | Q10, B15 | Atributo vira variável de instância · operação vira método · sem retorno = void. |
| do/while | Q14, B16 | Instância: toda a classe · local: o método · bloco: o bloco onde foi declarada. |
| dois compartimentos | B09 | Objeto anônimo é permitido: basta omitir o nome e escrever `: Classe`. |
| double | Q8, B44 | boolean lógico · int inteiro · double decimal · String texto. |
| empregado | B51 | Reflexiva é a associação de uma classe com ela mesma. |
| encapsulamento | Q17, B21, B57 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| encapsulamento de métodos | B24 | Encapsular método é esconder o "como" e expor só o "o quê". |
| encapsular todos | B23 | A regra do material é clara: encapsular todos os atributos, e `public` só se justifica para constantes. |
| endereço | Q12, B13 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| endereço de memória | B12 | São exatamente as quatro operações listadas no material. |
| entrada | B43 | O plano organiza; quem encontra o erro é a execução. |
| erro de compilação | B18, B32 | O material é explícito: tentar ler antes de atribuir gera ERRO DE COMPILAÇÃO, não lixo. |
| erro de execução | B36 | O programa compila e roda, mas o raciocínio está errado: índices válidos vão de 0 a length-1. Erros de lógica nascem do programador e devem ser… |
| erro de lógica | B36 | O programa compila e roda, mas o raciocínio está errado: índices válidos vão de 0 a length-1. Erros de lógica nascem do programador e devem ser… |
| Error | Q28, B35, B38 | `Throwable` é a raiz, com dois ramos: `Error` (não trate) e `Exception` (trate). |
| escopo | Q14, B16 | Instância: toda a classe · local: o método · bloco: o bloco onde foi declarada. |
| escopo do catch | B40 | Cada bloco define escopo próprio. |
| escopo do try | B40 | Cada bloco define escopo próprio. |
| especificação | B42 | A progressão é 1, 5, 15, 30. Um erro que custaria 1 na especificação pode custar 30 em produção — é o argumento central a favor de testar cedo. |
| estado | Q4, B05, B06 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| estado do sistema | Q13 | Diagrama de objetos = fotografia do sistema num instante, só com objetos. |
| estado limpo | B46 | `@BeforeAll` roda uma única vez para a classe inteira e por isso exige método `static`. |
| estrutura | B05 | A classe define a estrutura, ou seja, quais atributos e operações existem. |
| evento | Q25 | Exceção = evento em execução que interrompe o fluxo normal. |
| evolução | B03 | Os cinco objetivos do material são compreensão, reutilização, manutenção, evolução, qualidade e produtividade com menor custo. |
| exceção | Q25 | Exceção = evento em execução que interrompe o fluxo normal. |
| exceção verificada | Q28, B38 | Essa é a regra literal do material. |
| Exception | B35 | `Throwable` é a raiz, com dois ramos: `Error` (não trate) e `Exception` (trate). |
| Exception por último | B37 | Só UMA cláusula `catch` executa: a primeira compatível encontrada na ordem de escrita. |
| executar o trecho | B45 | Com o lambda, quem executa o trecho é o próprio `assertThrows`, e aí ele consegue capturar e conferir a exceção. |
| exibir | Q16 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| expor coleção | B57 | Quem faz `getAlunos().add(...)` pula a validação de limite que está em `incluirAluno`. |
| false | Q15, B17 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| Fibonacci | B01 | Um paradigma fornece e determina a visão sobre a estruturação e a execução do programa. |
| FileNotFoundException | B38 | Essa é a regra literal do material. |
| finally | Q27, Q28 | throws delega ao chamador · finally sempre executa · Error não se trata. |
| fluxo normal | Q25 | Exceção = evento em execução que interrompe o fluxo normal. |
| for | B58 | Remover dentro de um `for-each` é o erro clássico: às vezes lança `ConcurrentModificationException`, às vezes só encerra o laço mais cedo e devolve… |
| for-each | B58 | Remover dentro de um `for-each` é o erro clássico: às vezes lança `ConcurrentModificationException`, às vezes só encerra o laço mais cedo e devolve… |
| fora de src | B48 | `Calculadora` gera `CalculadoraTest`. |
| fotografia | Q13, B07 | Diagrama de objetos = fotografia do sistema num instante, só com objetos. |
| função | Q9, B22 | O material diz o contrário da 16: um setter que só atribui NÃO agrega proteção nenhuma. |
| funcional | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| Funcionario | B51 | Reflexiva é a associação de uma classe com ela mesma. |
| gerente | B51 | Reflexiva é a associação de uma classe com ela mesma. |
| get | B53 | Cuidado com `remove`: numa lista de `Integer`, `remove(1)` remove a POSIÇÃO 1, porque o Java escolhe a versão `remove(int)`. |
| getAlunos | B57 | Quem faz `getAlunos().add(...)` pula a validação de limite que está em `incluirAluno`. |
| getter | Q19, B22 | Getter: sem parâmetro, retorna o tipo do atributo. Setter: um parâmetro, void. |
| getter da associação | B57 | Quem faz `getAlunos().add(...)` pula a validação de limite que está em `incluirAluno`. |
| Haskell | Q2, B01 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| Heap | Q12, B13 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| herança | B02 | ATENÇÃO, esta é a pegadinha mais provável da prova: o material lista "programas maiores" como CONTRAPARTIDA do POO. Maior produtividade e MENOR custo… |
| hierarquia | B35 | `Throwable` é a raiz, com dois ramos: `Error` (não trate) e `Exception` (trate). |
| hierarquia de exceções | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| i <= length | B36 | O programa compila e roda, mas o raciocínio está errado: índices válidos vão de 0 a length-1. Erros de lógica nascem do programador e devem ser… |
| IBM 2008 | B42 | A progressão é 1, 5, 15, 30. Um erro que custaria 1 na especificação pode custar 30 em produção — é o argumento central a favor de testar cedo. |
| identificador da classe | B29 | O construtor é o único que não declara tipo de retorno. `static` é o que dá o comportamento de classe, sublinhado no diagrama. |
| IllegalArgumentException | Q26, B33 | Ela é subclasse de `RuntimeException`, portanto NÃO é verificada — o compilador não obriga a tratar. |
| IllegalStateException | B56 | É a ideia da aula de exceções aplicada à coleção: `if (alunos.size() == 50) throw ...`. |
| IMC | B04 | Abstração é escolher, entre as muitas formas de caracterizar algo do mundo real, apenas as características úteis ao problema que se quer resolver. |
| imperativo | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| implementação | B42 | A progressão é 1, 5, 15, 30. Um erro que custaria 1 na especificação pode custar 30 em produção — é o argumento central a favor de testar cedo. |
| import java.util.ArrayList | B52 | É preciso `import java.util.ArrayList;`. |
| incluir | B55 | O material é explícito: NÃO existe setter para a coleção de uma associação. |
| incluirAluno | B56 | É a ideia da aula de exceções aplicada à coleção: `if (alunos.size() == 50) throw ...`. |
| índice | B58 | Remover dentro de um `for-each` é o erro clássico: às vezes lança `ConcurrentModificationException`, às vezes só encerra o laço mais cedo e devolve… |
| inicialização | Q15 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| inicialização automática | B17 | Numérica inteira começa em `0`, ponto flutuante em `0.0`, lógica em `false` e referência em `null`. |
| inicializar | B12, B30 | Não é obrigatório criar construtor: sem nenhum, o compilador fornece o padrão sem argumentos. |
| instância | Q1, B05, B16 | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| instante | Q13 | Diagrama de objetos = fotografia do sistema num instante, só com objetos. |
| int | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| Integer.MAX_VALUE | Q22, B27 | Todos os da alternativa (a) são acessados por `Classe.membro`, sem criar objeto. |
| integridade | Q17 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| integridade dos dados | B21 | O estado do objeto passou a ser alterado por fora, sem passar pela regra de negócio. |
| inteiro | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| interrompe execução | Q25 | Exceção = evento em execução que interrompe o fluxo normal. |
| IOException | B41 | O multi-catch existe desde o Java 7 e usa uma barra vertical: `catch (IOException | SQLException ex)`. |
| Java | B01 | Um paradigma fornece e determina a visão sobre a estruturação e a execução do programa. |
| Java 7 | B41 | O multi-catch existe desde o Java 7 e usa uma barra vertical: `catch (IOException | SQLException ex)`. |
| JOptionPane | B27 | Todos os da alternativa (a) são acessados por `Classe.membro`, sem criar objeto. |
| JUnit | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| lambda | B45 | Com o lambda, quem executa o trecho é o próprio `assertThrows`, e aí ele consegue capturar e conferir a exceção. |
| lançamento | B31 | Lançar exceção é criar o objeto que caracteriza o erro e notificar o sistema. |
| lançar | B34 | O par que mais confunde é `throw` (lança, dentro do corpo) e `throws` (declara, na assinatura). |
| legibilidade | Q23 | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| limite | B44, B56 | É a ideia da aula de exceções aplicada à coleção: `if (alunos.size() == 50) throw ...`. |
| lista de parâmetros | Q23, B28 | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| Livro | B11, B49 | O padrão é bidirecional. |
| lixo | B18 | O material é explícito: tentar ler antes de atribuir gera ERRO DE COMPILAÇÃO, não lixo. |
| local | B16 | O escopo da variável de instância são TODOS os métodos da classe. |
| lógico | Q2, Q8 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| lowerCamelCase | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| main | Q29, B39 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| mais | Q18, B10 | - private · + public · # protected. |
| manutenção | Q3, B03 | Os cinco objetivos do material são compreensão, reutilização, manutenção, evolução, qualidade e produtividade com menor custo. |
| Marta | B04 | Abstração é escolher, entre as muitas formas de caracterizar algo do mundo real, apenas as características úteis ao problema que se quer resolver. |
| Math.abs | Q22, B27 | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| Math.max | B27 | Todos os da alternativa (a) são acessados por `Classe.membro`, sem criar objeto. |
| Math.sqrt | Q22, B27 | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| máximo | B50 | A diferença que mais cai: `0..*` admite nenhum, `1..*` exige pelo menos um. |
| membro de classe | Q21 | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| membro estático | Q22, B27 | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| memória | Q12 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| menor escopo | B19, B20, B25 | A 16 é o oposto da primeira boa prática: o material manda usar o MENOR escopo possível. |
| menos | Q18, B10 | A tabela do material tem quatro símbolos. |
| mensagem da exceção | Q26 | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| mesma classe | B51 | Reflexiva é a associação de uma classe com ela mesma. |
| mesmo nome | Q16 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| mesmo nome da classe | Q24 | Construtor: mesmo nome da classe, sem tipo de retorno (nem void). Sem nenhum, vem o padrão. |
| método | Q9, Q10, B29 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| método de classe | B26, B29 | A 16 nega a própria razão de existir do `static`: membro de classe pode ser usado SEM que haja instância alguma. |
| métodos | B53 | Cuidado com `remove`: numa lista de `Integer`, `remove(1)` remove a POSIÇÃO 1, porque o Java escolhe a versão `remove(int)`. |
| métodos de acesso | Q19 | Getter: sem parâmetro, retorna o tipo do atributo. Setter: um parâmetro, void. |
| mínimo | B50 | A diferença que mais cai: `0..*` admite nenhum, `1..*` exige pelo menos um. |
| mínimo e máximo | B11 | Um autor pode não ter escrito nenhuma obra e não há teto, logo `0..*` no lado das obras. |
| modelar | B04 | Abstração é escolher, entre as muitas formas de caracterizar algo do mundo real, apenas as características úteis ao problema que se quer resolver. |
| modelo | Q4, Q5 | A classe é o molde: define atributos e operações. O objeto guarda os valores. |
| molde | Q5, B06 | A classe é o molde: define atributos e operações. O objeto guarda os valores. |
| monitorar | B34 | O par que mais confunde é `throw` (lança, dentro do corpo) e `throws` (declara, na assinatura). |
| motivação | B21 | O estado do objeto passou a ser alterado por fora, sem passar pela regra de negócio. |
| multi-catch | Q29, B41 | O multi-catch existe desde o Java 7 e usa uma barra vertical: `catch (IOException | SQLException ex)`. |
| multiparadigma | B01 | Um paradigma fornece e determina a visão sobre a estruturação e a execução do programa. |
| multiplicidade | B11, B50 | Um autor pode não ter escrito nenhuma obra e não há teto, logo `0..*` no lado das obras. |
| múltiplos catch | Q27, B37 | Só UMA cláusula `catch` executa: a primeira compatível encontrada na ordem de escrita. |
| mundo real | Q4 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| não compila | B45 | Com o lambda, quem executa o trecho é o próprio `assertThrows`, e aí ele consegue capturar e conferir a exceção. |
| não inicializada | Q16 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| não verificada | B33 | Ela é subclasse de `RuntimeException`, portanto NÃO é verificada — o compilador não obriga a tratar. |
| navegabilidade | B49 | O padrão é bidirecional. |
| necessidade | B23 | A regra do material é clara: encapsular todos os atributos, e `public` só se justifica para constantes. |
| new | Q11, Q12, Q24, B12 | São exatamente as quatro operações listadas no material. |
| new ArrayList<>() | B54 | O diamante evita repetir `<Aluno>`. |
| nome de atributo | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| nome de classe | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| nome de operação | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| nomenclatura | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| nomes sem espaço | Q6 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| notação | B09 | Objeto anônimo é permitido: basta omitir o nome e escrever `: Classe`. |
| notificar | B31 | Lançar exceção é criar o objeto que caracteriza o erro e notificar o sistema. |
| null | Q15, B17 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| objetivos | B03 | Os cinco objetivos do material são compreensão, reutilização, manutenção, evolução, qualidade e produtividade com menor custo. |
| objetivos POO | Q3 | Objetivos: compreensão, manutenção, reutilização. Contrapartida: curva de aprendizagem. |
| objeto | Q4, B06, B13 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| objeto anônimo | B09 | Objeto anônimo é permitido: basta omitir o nome e escrever `: Classe`. |
| objeto corrente | B25 | `this` refere-se ao objeto corrente. |
| objeto de exceção | B31 | Lançar exceção é criar o objeto que caracteriza o erro e notificar o sistema. |
| obra | B11 | Um autor pode não ter escrito nenhuma obra e não há teto, logo `0..*` no lado das obras. |
| obrigatório | B30 | Não é obrigatório criar construtor: sem nenhum, o compilador fornece o padrão sem argumentos. |
| obrigatório tratar | B38 | Essa é a regra literal do material. |
| ocultar complexidade | B24 | Encapsular método é esconder o "como" e expor só o "o quê". |
| operação | Q9, B06, B15 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| operador | B12 | São exatamente as quatro operações listadas no material. |
| operador de membro | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| operador diamante | B54 | O diamante evita repetir `<Aluno>`. |
| operador pipe | Q29, B41 | O multi-catch existe desde o Java 7 e usa uma barra vertical: `catch (IOException | SQLException ex)`. |
| operador ponto | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| ordem | Q27, B37 | Só UMA cláusula `catch` executa: a primeira compatível encontrada na ordem de escrita. |
| ordem dos catch | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| orientado a objetos | Q1 | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| pacote | B10 | A tabela do material tem quatro símbolos. |
| padrão internacional | Q6 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| papéis | B51 | Reflexiva é a associação de uma classe com ela mesma. |
| papel | B11, B55 | Um autor pode não ter escrito nenhuma obra e não há teto, logo `0..*` no lado das obras. |
| papel da classe | Q5 | A classe é o molde: define atributos e operações. O objeto guarda os valores. |
| paradigma | Q1, B01 | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| paradigmas | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| paralela | B48 | `Calculadora` gera `CalculadoraTest`. |
| parâmetro | Q19, B25 | `this` refere-se ao objeto corrente. |
| parâmetro de mesmo nome | Q20 | this.x = x distingue o atributo do parâmetro de mesmo nome. |
| Pascal | Q2, B01 | Um paradigma fornece e determina a visão sobre a estruturação e a execução do programa. |
| pasta test | B48 | `Calculadora` gera `CalculadoraTest`. |
| pega tudo | B37 | Só UMA cláusula `catch` executa: a primeira compatível encontrada na ordem de escrita. |
| percorrer | B58 | Remover dentro de um `for-each` é o erro clássico: às vezes lança `ConcurrentModificationException`, às vezes só encerra o laço mais cedo e devolve… |
| Pessoa | B11, B49 | Um autor pode não ter escrito nenhuma obra e não há teto, logo `0..*` no lado das obras. |
| pingo | B05 | A classe define a estrutura, ou seja, quais atributos e operações existem. |
| plano de testes | B43 | O plano organiza; quem encontra o erro é a execução. |
| plural | B55 | O material é explícito: NÃO existe setter para a coleção de uma associação. |
| polimorfismo | B02 | ATENÇÃO, esta é a pegadinha mais provável da prova: o material lista "programas maiores" como CONTRAPARTIDA do POO. Maior produtividade e MENOR custo… |
| posição | B52 | É preciso `import java.util.ArrayList;`. |
| preferência | B19 | `var1` sem qualificador é a LOCAL, que vale 5. `this.var1` é a de instância, que acabou de ser alterada para 10. A linguagem sempre dá preferência à… |
| prefixo is | Q19, B22 | O material diz o contrário da 16: um setter que só atribui NÃO agrega proteção nenhuma. |
| primeira compatível | B37 | Só UMA cláusula `catch` executa: a primeira compatível encontrada na ordem de escrita. |
| primitivos | B52 | É preciso `import java.util.ArrayList;`. |
| private | Q17, Q18, B10 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| procedimento | Q9, B15, B22 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| produção | B42 | A progressão é 1, 5, 15, 30. Um erro que custaria 1 na especificação pode custar 30 em produção — é o argumento central a favor de testar cedo. |
| produtividade | B02, B03 | ATENÇÃO, esta é a pegadinha mais provável da prova: o material lista "programas maiores" como CONTRAPARTIDA do POO. Maior produtividade e MENOR custo… |
| programa interrompido | B39 | Se nem o `main()` trata, o programa é interrompido. |
| programas maiores | B02 | ATENÇÃO, esta é a pegadinha mais provável da prova: o material lista "programas maiores" como CONTRAPARTIDA do POO. Maior produtividade e MENOR custo… |
| Prolog | Q2, B01 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| propagação | Q29, B39 | Se nem o `main()` trata, o programa é interrompido. |
| proteção | B22 | O material diz o contrário da 16: um setter que só atribui NÃO agrega proteção nenhuma. |
| protected | Q18, B10 | - private · + public · # protected. |
| public | Q18, B10, B23, B25 | A regra do material é clara: encapsular todos os atributos, e `public` só se justifica para constantes. |
| qualidade | B03 | Os cinco objetivos do material são compreensão, reutilização, manutenção, evolução, qualidade e produtividade com menor custo. |
| qualidade de software | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| quatro operações | B12 | São exatamente as quatro operações listadas no material. |
| relevante | B04 | Abstração é escolher, entre as muitas formas de caracterizar algo do mundo real, apenas as características úteis ao problema que se quer resolver. |
| remove | B53 | Cuidado com `remove`: numa lista de `Integer`, `remove(1)` remove a POSIÇÃO 1, porque o Java escolhe a versão `remove(int)`. |
| remover | B55, B58 | Remover dentro de um `for-each` é o erro clássico: às vezes lança `ConcurrentModificationException`, às vezes só encerra o laço mais cedo e devolve… |
| retângulo | B09 | Objeto anônimo é permitido: basta omitir o nome e escrever `: Classe`. |
| reusar | B26 | A 16 nega a própria razão de existir do `static`: membro de classe pode ser usado SEM que haja instância alguma. |
| reutilização | Q3, B03, B24 | Objetivos: compreensão, manutenção, reutilização. Contrapartida: curva de aprendizagem. |
| RuntimeException | Q28, B33, B35, B38, B56 | Ela é subclasse de `RuntimeException`, portanto NÃO é verificada — o compilador não obriga a tratar. |
| saída esperada | B43 | O plano organiza; quem encontra o erro é a execução. |
| saldo | Q17, B21 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| sem argumentos | B14 | O construtor padrão só é fornecido quando NENHUM construtor foi implementado. |
| sem instância | B26 | A 16 nega a própria razão de existir do `static`: membro de classe pode ser usado SEM que haja instância alguma. |
| sem setter | B55 | O material é explícito: NÃO existe setter para a coleção de uma associação. |
| sem tipo de retorno | Q24, B30 | Construtor: mesmo nome da classe, sem tipo de retorno (nem void). Sem nenhum, vem o padrão. |
| sem valor inicial | B18 | O material é explícito: tentar ler antes de atribuir gera ERRO DE COMPILAÇÃO, não lixo. |
| seta | B49 | O padrão é bidirecional. |
| setSalario | Q26 | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| setter | Q19, B22, B33 | Getter: sem parâmetro, retorna o tipo do atributo. Setter: um parâmetro, void. |
| setTitular | Q20, B25 | this.x = x distingue o atributo do parâmetro de mesmo nome. |
| shadowing | B19 | `var1` sem qualificador é a LOCAL, que vale 5. `this.var1` é a de instância, que acabou de ser alterada para 10. A linguagem sempre dá preferência à… |
| size | B53, B56 | É a ideia da aula de exceções aplicada à coleção: `if (alunos.size() == 50) throw ...`. |
| sobrecarga | Q23, B28 | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| sobrecarga de construtor | B14 | O construtor padrão só é fornecido quando NENHUM construtor foi implementado. |
| somar | B28 | O que diferencia é a assinatura, isto é, a lista de parâmetros. |
| sombreamento | Q16, B19 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| sombreamento aceito | B20 | A 16 é o oposto da primeira boa prática: o material manda usar o MENOR escopo possível. |
| SQLException | B41 | O multi-catch existe desde o Java 7 e usa uma barra vertical: `catch (IOException | SQLException ex)`. |
| Stack | Q12, B13 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| static | Q21, B26, B46 | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| String | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| sublinhado | Q21, B07, B09, B15, B29 | O material diz explicitamente que o diagrama de objetos tem uso limitado justamente porque apresenta somente estruturas de dados, o estado, SEM… |
| sufixo Test | B48 | `Calculadora` gera `CalculadoraTest`. |
| superclasse | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| sustenido | Q18, B10 | A tabela do material tem quatro símbolos. |
| tamanho ilimitado | B52 | É preciso `import java.util.ArrayList;`. |
| teste de sistema | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| teste de unidade | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| testes de sistema | B42 | A progressão é 1, 5, 15, 30. Um erro que custaria 1 na especificação pode custar 30 em produção — é o argumento central a favor de testar cedo. |
| texto | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| this | Q16, Q20, Q21, B19, B25, B26 | this.x = x distingue o atributo do parâmetro de mesmo nome. |
| throw | Q26, B31, B34, B56 | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| throw incondicional | B32 | Quando o `throw` é SEMPRE executado, nada pode vir depois dele no mesmo bloco. |
| Throwable | Q27, B35 | `Throwable` é a raiz, com dois ramos: `Error` (não trate) e `Exception` (trate). |
| throws | Q28, B34 | throws delega ao chamador · finally sempre executa · Error não se trata. |
| til | B10 | A tabela do material tem quatro símbolos. |
| tipo | B08, B54 | O diagrama de classes descreve os tipos (`peso : double`); o de objetos mostra instâncias com valores (`peso = 78`). |
| tipo de dado | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| tipo de retorno | Q10, Q19, Q23, B28 | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| tipos de dado | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| tipos primitivos | Q12 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| tradução | B15 | Atributo vira variável de instância, operação vira método, membro estático aparece sublinhado e quem não devolve nada é `void`. |
| traduzir associação | B55 | O material é explícito: NÃO existe setter para a coleção de uma associação. |
| try | Q27, B34 | finally executa SEMPRE. Os catch são verificados na ordem em que foram escritos. |
| UML | Q6, Q18 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| unidirecional | B49 | O padrão é bidirecional. |
| unreachable | B32 | Quando o `throw` é SEMPRE executado, nada pode vir depois dele no mesmo bloco. |
| UpperCamelCase | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| uso limitado | B07 | O material diz explicitamente que o diagrama de objetos tem uso limitado justamente porque apresenta somente estruturas de dados, o estado, SEM… |
| validação | Q26, B22 | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| valor | B08 | O diagrama de classes descreve os tipos (`peso : double`); o de objetos mostra instâncias com valores (`peso = 78`). |
| valor de retorno | Q9 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| valor padrão | Q15, B17, B20 | Numérica inteira começa em `0`, ponto flutuante em `0.0`, lógica em `false` e referência em `null`. |
| valores concretos | Q5 | A classe é o molde: define atributos e operações. O objeto guarda os valores. |
| var1 | B16, B19 | O escopo da variável de instância são TODOS os métodos da classe. |
| var2 | B16 | O escopo da variável de instância são TODOS os métodos da classe. |
| var3 | B16 | O escopo da variável de instância são TODOS os métodos da classe. |
| variável de bloco | Q14 | Instância: toda a classe · local: o método · bloco: o bloco onde foi declarada. |
| variável de classe | Q21, B29 | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| variável de instância | Q10, Q14, Q20, B26 | Atributo vira variável de instância · operação vira método · sem retorno = void. |
| variável de referência | Q12, B13 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| variável local | Q14, Q16, B18, B20 | O material é explícito: tentar ler antes de atribuir gera ERRO DE COMPILAÇÃO, não lixo. |
| variável local não inicializada | Q15 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| verbo | Q9 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| verificada | B35 | `Throwable` é a raiz, com dois ramos: `Error` (não trate) e `Exception` (trate). |
| vetor | B36 | O programa compila e roda, mas o raciocínio está errado: índices válidos vão de 0 a length-1. Erros de lógica nascem do programador e devem ser… |
| visão estática | Q6 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| visibilidade | Q18, B10 | - private · + public · # protected. |
| void | Q10, Q24, B15, B25 | Atributo vira variável de instância · operação vira método · sem retorno = void. |
| zero | Q15, B17 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |

---

## 3. Consulta rápida de sintaxe

Assuntos que a L07 não cobre, mas que o banco extra cobre (B49 a B58) e que são o que mais aparece na **prova prática**.

| Assunto | Sobre | Resposta direta | Onde estudar |
|---|---|---|---|
| ArrayList | declarar e usar | ArrayList<Tipo> lista = new ArrayList<>(); e import java.util.ArrayList; | `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 2 |
| add, get, remove, size | métodos do ArrayList | add(obj) inclui · get(i) devolve · remove(i) remove pela posição · size() conta. | `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 2 (Principais métodos) |
| for-each | percorrer coleção | for (Musica m : musicas) { ... } — não use quando precisar remover. | `material-do-professor/Conteudo/Unidade03.md` — Aula 11 (Percorrendo um ArrayList) |
| operador diamante | new ArrayList<>() | O <> vazio à direita repete o tipo declarado à esquerda. | `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 2 |
| associação | relacionamento entre classes | Um para muitos vira coleção no lado "muitos". Adornos: papel, nome com direção, multiplicidade, navegabilidade. | `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 1 · `../docs/MODELAGEM.md` |
| multiplicidade | 0..1, 1, 0..*, 1..* | 0..* = pode não ter nenhum e não tem teto · 1 = exatamente um (construtor recusa nulo). | `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 1 · `../docs/MODELAGEM.md` |
| navegabilidade | seta da associação | Só existe navegação onde existe atributo. Seta aberta = único lado navegável. | `../docs/MODELAGEM.md` |
| associação reflexiva | classe ligada a ela mesma | ArrayList do próprio tipo dentro da classe; papéis diferentes nas duas pontas (seguindo/seguidores). | `material-do-professor/Conteudo/Unidade03.md` — Aula 11, seção 1 · `../Usuario.java` |
| padrão AAA | Arrange-Act-Assert | Monta o cenário, executa a ação, verifica o resultado — um assert por ideia. | `material-do-professor/Conteudo/Unidade02.md` — Aula 9 |
| @BeforeEach | cenário comum dos testes | Roda antes de CADA teste, para montar o mesmo cenário sem repetir código. | `material-do-professor/Conteudo/Unidade02.md` — Aula 9, seção 8 |
| assertThrows | testar exceção | assertThrows(IllegalArgumentException.class, () -> new Musica("", "Q", 355)); | `material-do-professor/Conteudo/Unidade02.md` — Aula 9, seção 9 |

---

## 4. Pegadinhas que se repetem

| Se a alternativa disser… | Provavelmente é… |
|---|---|
| "garante que SEMPRE…", "é sempre a melhor…", "NUNCA pode…" | **falsa** — nas somatórias da L07, a afirmativa 16 é sempre desse tipo |
| "é obrigatório modelar com os 14 diagramas" | falsa — usa-se o que for necessário |
| "o tipo de retorno diferencia a sobrecarga" | falsa — quem diferencia é a assinatura |
| "construtor declara void" | falsa — construtor não tem tipo de retorno |
| "variável local recebe valor padrão" | falsa — só as de instância recebem |
| "finally só executa quando dá erro" | falsa — executa sempre |
| "getters e setters devem ser privados" | falsa — são públicos por definição |
| "método static usa variável de instância livremente" | falsa — sem instância, não dá |
| "new serve para int e double" | falsa — new é para objetos |
| "teste de unidade avalia o sistema inteiro" | falsa — isso é teste de sistema |
| "catch da superclasse antes da subclasse é válido" | falsa — vira código inalcançável |
