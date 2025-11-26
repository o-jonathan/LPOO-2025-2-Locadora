# LPOO 2025/2 -- Locadora OJogos

---

```mermaid
classDiagram
    namespace model {
        Class Pessoa
    }

    class Pessoa {
        <<abstract>>
        - nome : String
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
```