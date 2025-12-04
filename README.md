# LPOO 2025/2 — Locadora OJogos

O sistema Locadora OJogos consiste na gerência de uma locadora de jogos, possibilitando Registrar e Gerenciar clientes, funcionários, jogos e locações.


## Diagrama de Classes

```mermaid
classDiagram
    namespace model {
        class Pessoa
        class Cliente
        class Funcionario
        class Jogo
        class FormaPGTO
        class Locacao
    }

    class Pessoa {
        <<abstract>>
        - nome : String
        - cpf: String
    }

    class Cliente {
        - id : int
    }

    class Funcionario {
        - id : int
        - salario : double
    }

    class Jogo {
        - id : int
        - nome : String
        - valor : double
        - locado : boolean
    }

    class FormaPGTO {
        <<enumeration>>
        AVISTA
        PRAZO
    }

    class Locacao {
        - id : int
        - dataLocacao : LocalDateTime
        - dataDevolucao : LocalDateTime
        - prazo : int
    }

    Pessoa <|-- Cliente
    Pessoa <|-- Funcionario

    Cliente --o Locacao
    Funcionario --o Locacao
    Jogo --o Locacao
    FormaPGTO --o Locacao
```

## Features

O sistema, atualmente, pode:

- Registrar e Gerenciar clientes.
- Registrar e Gerenciar funcionários.
- Registrar e Gerenciar jogos.
- Registrar e Gerenciar Locações.
