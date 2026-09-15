# Busca por palavra-chave

Achou uma questão na prova e não lembra? Procure aqui por uma palavra do enunciado. Cada linha diz a resposta direta e em qual questão da lista de revisão ela aparece por inteiro.

- Questão completa, com todas as alternativas: `QUESTOES_RESPONDIDAS.md`
- Teoria do professor: `material-do-professor/Conteudo/`
- Código pronto do professor: `material-do-professor/ProjetoPratico/src/`

---

## 1. Respostas relâmpago, por questão

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

---

## 2. Índice alfabético de palavras-chave

| Palavra-chave | Questão | Resposta direta |
|---|---|---|
| 14 diagramas | Q6 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| @Test | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| acessar atributo | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| assertEquals | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| assertThrows | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| assinatura | Q23 | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| atributo | Q4 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| atributo público | Q17 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| boolean | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| C | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| calcularImc | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| catch | Q27 | finally executa SEMPRE. Os catch são verificados na ordem em que foram escritos. |
| chamador | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| chamar método | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| checked | Q28 | throws delega ao chamador · finally sempre executa · Error não se trata. |
| classe | Q1, Q4 | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| classe.identificador | Q22 | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| Classe1 | Q16 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| compartilhada | Q21 | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| componentes acopláveis | Q3 | Objetivos: compreensão, manutenção, reutilização. Contrapartida: curva de aprendizagem. |
| construtor | Q24 | Construtor: mesmo nome da classe, sem tipo de retorno (nem void). Sem nenhum, vem o padrão. |
| construtor padrão | Q24 | Construtor: mesmo nome da classe, sem tipo de retorno (nem void). Sem nenhum, vem o padrão. |
| ContaBancaria | Q17 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| curva de aprendizagem | Q3 | Objetivos: compreensão, manutenção, reutilização. Contrapartida: curva de aprendizagem. |
| custo de correção | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| dados e comportamento | Q1 | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| decimal | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| delegar | Q28 | throws delega ao chamador · finally sempre executa · Error não se trata. |
| diagrama de classes | Q6 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| diagrama de objetos | Q13 | Diagrama de objetos = fotografia do sistema num instante, só com objetos. |
| diagrama para código | Q10 | Atributo vira variável de instância · operação vira método · sem retorno = void. |
| do/while | Q14 | Instância: toda a classe · local: o método · bloco: o bloco onde foi declarada. |
| double | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| encapsulamento | Q17 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| endereço | Q12 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| Error | Q28 | throws delega ao chamador · finally sempre executa · Error não se trata. |
| escopo | Q14 | Instância: toda a classe · local: o método · bloco: o bloco onde foi declarada. |
| estado | Q4 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| estado do sistema | Q13 | Diagrama de objetos = fotografia do sistema num instante, só com objetos. |
| evento | Q25 | Exceção = evento em execução que interrompe o fluxo normal. |
| exceção | Q25 | Exceção = evento em execução que interrompe o fluxo normal. |
| exceção verificada | Q28 | throws delega ao chamador · finally sempre executa · Error não se trata. |
| exibir | Q16 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| false | Q15 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| finally | Q27, Q28 | finally executa SEMPRE. Os catch são verificados na ordem em que foram escritos. |
| fluxo normal | Q25 | Exceção = evento em execução que interrompe o fluxo normal. |
| fotografia | Q13 | Diagrama de objetos = fotografia do sistema num instante, só com objetos. |
| função | Q9 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| funcional | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| getter | Q19 | Getter: sem parâmetro, retorna o tipo do atributo. Setter: um parâmetro, void. |
| Haskell | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| Heap | Q12 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| hierarquia de exceções | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| IllegalArgumentException | Q26 | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| imperativo | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| inicialização | Q15 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| instância | Q1 | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| instante | Q13 | Diagrama de objetos = fotografia do sistema num instante, só com objetos. |
| int | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| Integer.MAX_VALUE | Q22 | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| integridade | Q17 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| inteiro | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| interrompe execução | Q25 | Exceção = evento em execução que interrompe o fluxo normal. |
| JUnit | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| legibilidade | Q23 | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| lista de parâmetros | Q23 | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| lógico | Q2, Q8 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| lowerCamelCase | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| main | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| mais | Q18 | - private · + public · # protected. |
| manutenção | Q3 | Objetivos: compreensão, manutenção, reutilização. Contrapartida: curva de aprendizagem. |
| Math.abs | Q22 | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| Math.sqrt | Q22 | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| membro de classe | Q21 | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| membro estático | Q22 | Math.sqrt(), Math.abs(), Integer.MAX_VALUE são membros estáticos (classe.identificador). |
| memória | Q12 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| menos | Q18 | - private · + public · # protected. |
| mensagem da exceção | Q26 | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| mesmo nome | Q16 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| mesmo nome da classe | Q24 | Construtor: mesmo nome da classe, sem tipo de retorno (nem void). Sem nenhum, vem o padrão. |
| método | Q9, Q10 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| métodos de acesso | Q19 | Getter: sem parâmetro, retorna o tipo do atributo. Setter: um parâmetro, void. |
| modelo | Q4, Q5 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| molde | Q5 | A classe é o molde: define atributos e operações. O objeto guarda os valores. |
| multi-catch | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| múltiplos catch | Q27 | finally executa SEMPRE. Os catch são verificados na ordem em que foram escritos. |
| mundo real | Q4 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| não inicializada | Q16 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| new | Q11, Q12, Q24 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| nome de atributo | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| nome de classe | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| nome de operação | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| nomenclatura | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| nomes sem espaço | Q6 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| null | Q15 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| objetivos POO | Q3 | Objetivos: compreensão, manutenção, reutilização. Contrapartida: curva de aprendizagem. |
| objeto | Q4 | Estado do objeto = valor dos seus atributos, e muda ao longo do tempo. |
| operação | Q9 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| operador de membro | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| operador pipe | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| operador ponto | Q11 | O ponto é o operador de membro: acessa atributo e chama método do objeto. |
| ordem | Q27 | finally executa SEMPRE. Os catch são verificados na ordem em que foram escritos. |
| ordem dos catch | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| orientado a objetos | Q1 | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| padrão internacional | Q6 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| papel da classe | Q5 | A classe é o molde: define atributos e operações. O objeto guarda os valores. |
| paradigma | Q1 | POO = objetos, que são instâncias de classes, juntando dados + comportamento. |
| paradigmas | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| parâmetro | Q19 | Getter: sem parâmetro, retorna o tipo do atributo. Setter: um parâmetro, void. |
| parâmetro de mesmo nome | Q20 | this.x = x distingue o atributo do parâmetro de mesmo nome. |
| Pascal | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| prefixo is | Q19 | Getter: sem parâmetro, retorna o tipo do atributo. Setter: um parâmetro, void. |
| private | Q17, Q18 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| procedimento | Q9 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| Prolog | Q2 | Prolog→lógico · Java→OO · C/Pascal→imperativo · Haskell→funcional. |
| propagação | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| protected | Q18 | - private · + public · # protected. |
| public | Q18 | - private · + public · # protected. |
| qualidade de software | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| reutilização | Q3 | Objetivos: compreensão, manutenção, reutilização. Contrapartida: curva de aprendizagem. |
| RuntimeException | Q28 | throws delega ao chamador · finally sempre executa · Error não se trata. |
| saldo | Q17 | Atributo público quebra a integridade. Solução: private + métodos que validam. |
| sem tipo de retorno | Q24 | Construtor: mesmo nome da classe, sem tipo de retorno (nem void). Sem nenhum, vem o padrão. |
| setSalario | Q26 | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| setter | Q19 | Getter: sem parâmetro, retorna o tipo do atributo. Setter: um parâmetro, void. |
| setTitular | Q20 | this.x = x distingue o atributo do parâmetro de mesmo nome. |
| sobrecarga | Q23 | Sobrecarga = mesmo nome, ASSINATURA diferente. Tipo de retorno não diferencia. |
| sombreamento | Q16 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| Stack | Q12 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| static | Q21 | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| String | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| sublinhado | Q21 | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| superclasse | Q29 | Sem tratamento, o erro sobe até main. Catch da subclasse vem ANTES do da superclasse. |
| sustenido | Q18 | - private · + public · # protected. |
| teste de sistema | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| teste de unidade | Q30 | Unidade testada = o método. @Test público, void, sem parâmetro. assertEquals(esperado, obtido). |
| texto | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| this | Q16, Q20, Q21 | Sombreamento: a local esconde a de instância; this.var1 aponta para a de instância. |
| throw | Q26 | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| Throwable | Q27 | finally executa SEMPRE. Os catch são verificados na ordem em que foram escritos. |
| throws | Q28 | throws delega ao chamador · finally sempre executa · Error não se trata. |
| tipo de dado | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| tipo de retorno | Q10, Q19, Q23 | Atributo vira variável de instância · operação vira método · sem retorno = void. |
| tipos de dado | Q8 | boolean lógico · int inteiro · double decimal · String texto. |
| tipos primitivos | Q12 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| try | Q27 | finally executa SEMPRE. Os catch são verificados na ordem em que foram escritos. |
| UML | Q6, Q18 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| UpperCamelCase | Q7 | Classe UpperCamelCase · atributo e método lowerCamelCase · método é verbo com (). |
| validação | Q26 | throw LANÇA e interrompe o método na hora; a atribuição depois dele não acontece. |
| valor de retorno | Q9 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| valor padrão | Q15 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| valores concretos | Q5 | A classe é o molde: define atributos e operações. O objeto guarda os valores. |
| variável de bloco | Q14 | Instância: toda a classe · local: o método · bloco: o bloco onde foi declarada. |
| variável de classe | Q21 | static é compartilhado, usa-se sem instância, não usa this, e vai sublinhado na UML. |
| variável de instância | Q10, Q14, Q20 | Atributo vira variável de instância · operação vira método · sem retorno = void. |
| variável de referência | Q12 | Heap guarda objetos · Stack guarda locais, parâmetros e chamadas · new não serve para primitivo. |
| variável local | Q14, Q16 | Instância: toda a classe · local: o método · bloco: o bloco onde foi declarada. |
| variável local não inicializada | Q15 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |
| verbo | Q9 | Operação ou altera o estado (void) ou devolve um valor calculado a partir dele. |
| visão estática | Q6 | Diagrama de classes = visão ESTÁTICA. Não é obrigatório usar os 14 diagramas. |
| visibilidade | Q18 | - private · + public · # protected. |
| void | Q10, Q24 | Atributo vira variável de instância · operação vira método · sem retorno = void. |
| zero | Q15 | Só variável de INSTÂNCIA recebe valor padrão (0, false, null). Local não recebe nada. |

---

## 3. Assuntos que não estão na lista de revisão mas podem cair

A L07 cobre paradigmas, UML, memória, escopo, encapsulamento, membros de classe, exceções e testes. Não cobre ArrayList nem associações — que é justamente o conteúdo da Fase 05 e o mais provável de cair na **prova prática**.

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
