## Pessoas API Spring boot

### Estrutura Típica do Projeto Spring Boot

```
demo
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo
│   │   │               ├── DemoApplication.java       // Classe principal com @SpringBootApplication
│   │   │               ├── controller
│   │   │               │   └── PessoaController.java  // Controlador
│   │   │               ├── entity
│   │   │               │   └── Pessoa.java            // Entidade
│   │   │               ├── repository
│   │   │               │   └── PessoaRepository.java  // Repositório
│   │   │               └── service
│   │   │                   └── PessoaService.java      // Serviço
│   │   └── resources
│   │       └── application.properties                  // Configurações do Spring Boot
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── demo
│                       └── DemoApplicationTests.java // Testes
└── pom.xml                                           // Arquivo de configuração do Maven
```

### Explicação da Estrutura

- **`src/main/java/com/example/demo`**: Este é o diretório onde você colocará todas as suas classes Java. A convenção é que a estrutura de pacotes corresponda ao caminho de diretório. Portanto, para a classe principal, você deve ter um arquivo chamado `DemoApplication.java`, onde você define a classe com a anotação `@SpringBootApplication`.

- **`src/main/java/com/example/demo/controller`**: Aqui você deve criar a classe `PessoaController.java`.

- **`src/main/java/com/example/demo/entity`**: Aqui você deve criar a classe `Pessoa.java`.

- **`src/main/java/com/example/demo/repository`**: Aqui você deve criar a interface `PessoaRepository.java`.

- **`src/main/java/com/example/demo/service`**: Aqui você deve criar a classe `PessoaService.java`.

- **`src/main/resources`**: Este diretório contém arquivos de configuração e recursos, como `application.properties`, que é onde você configura as propriedades do seu aplicativo.

- **`pom.xml`**: Este é o arquivo de configuração do Maven, onde você define as dependências do seu projeto.

### Como Navegar no IntelliJ

1. **Abra o IntelliJ**: Inicie o IntelliJ e abra o projeto que você criou.

2. **Navegue pela Estrutura de Pastas**:
   - No painel à esquerda, vá para a aba **Project** (ou **Projeto**).
   - Expanda a árvore de diretórios seguindo o caminho mencionado acima (`src/main/java/com/example/demo`).

3. **Criar Novas Classes/Pacotes**:
   - Para criar um novo pacote, clique com o botão direito na pasta `demo` e selecione **New > Package**. Nomeie o pacote (por exemplo, `controller`, `entity`, `repository`, `service`).
   - Para criar uma nova classe, clique com o botão direito no pacote desejado e selecione **New > Java Class**.

### Conclusão

Siga essa estrutura para criar suas classes e arquivos de configuração. Se você tiver alguma dúvida ou precisar de mais informações, é só avisar!
