# Sistema de Votação em Java

Este é um projeto simples de um sistema de votação desenvolvido em Java. Ele permite o cadastro de pessoas candidatas e eleitoras, a realização de votos e a apuração dos resultados em tempo real, tudo através de uma interface de linha de comando.

## 🚀 Funcionalidades

-   **Cadastro de Pessoas Candidatas**: Permite adicionar novas pessoas candidatas com nome e número únicos.
-   **Cadastro de Pessoas Eleitoras**: Permite registrar pessoas eleitoras com nome e CPF único.
-   **Votação**: Permite que uma pessoa eleitora, identificada pelo CPF, vote em uma pessoa candidata, identificada pelo número.
-   **Apuração de Resultados**: Exibe o resultado parcial ou final da votação, mostrando a quantidade de votos e a porcentagem para cada candidato, além do total de votos computados.
-   **Validações**: O sistema impede que uma pessoa eleitora vote mais de uma vez e que sejam cadastrados candidatos com o mesmo número ou eleitores com o mesmo CPF.

## 🛠️ Tecnologias Utilizadas

-   **Java**: Linguagem principal do projeto.
-   **Maven**: Para gerenciamento de dependências e build do projeto.
-   **JUnit 5**: Para a execução dos testes unitários.

## 📂 Estrutura do Projeto

O projeto está organizado da seguinte forma:

-   `src/main/java/io/github/pedr88/sistemadevotacao/`: Contém o código-fonte da aplicação.
    -   `Pessoa.java`: Classe abstrata base que define o atributo `nome`.
    -   `PessoaCandidata.java`: Representa uma pessoa candidata, herdando de `Pessoa` e adicionando `numero` e contagem de `votos`.
    -   `PessoaEleitora.java`: Representa uma pessoa eleitora, herdando de `Pessoa` e adicionando o `cpf`.
    -   `GerenciamentoVotacao.java`: Classe principal da lógica de negócio. Gerencia os cadastros, a votação e a apuração.
    -   `GerenciamentoVotacaoInterface.java`: Interface que define o contrato para a classe de gerenciamento.
    -   `Principal.java`: Ponto de entrada da aplicação (método `main`), responsável pela interação com o usuário via console.
-   `src/test/java/io/github/pedr88/sistemadevotacao/`: Contém os testes unitários para garantir o funcionamento correto das classes.

## ▶️ Como Executar o Projeto

### Pré-requisitos

-   É necessário ter o **JDK (Java Development Kit)** instalado em sua máquina.

### Execução via Linha de Comando

1.  Clone o repositório para sua máquina local.

2.  Navegue até o diretório raiz do projeto e compile os arquivos Java:
    ```bash
    # A partir da pasta 'sistema-de-votacao', compile todos os fontes
    javac -d . src/main/java/io/github/pedr88/sistemadevotacao/*.java
    ```

3.  Execute a classe principal:
    ```bash
    java io.github.pedr88.sistemadevotacao.Principal
    ```

### Execução via Maven

1.  Clone o repositório para sua máquina local.

2.  Navegue até o diretório raiz do projeto e compile os arquivos Java:
    ```bash
    mvn compile
    ```

3.  Execute a classe principal:
    ```bash
    mvn exec:java -Dexec.mainClass="io.github.pedr88.sistemadevotacao.Principal"
    ```

## ✅ Como Executar os Testes

Os testes foram escritos com JUnit 5 e podem ser executados com o Maven.

1.  Navegue até o diretório raiz do projeto.
2.  Execute o seguinte comando:
    ```bash
    mvn test
    ```
