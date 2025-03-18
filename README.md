# Santander Dev Week 2023 (Decola Tech 2025)


## Diagrama de Classes

```mermaid
classDiagram
    class Client {
        +String name
        +Account account
        +Card card
        +List~Feature~ features
        +List~News~ news
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Card {
        +String number
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class News {
        +String icon
        +String description
    }

    Client --> Account
    Client --> Card
    Client --> "*" Feature
    Client --> "*" News

```
