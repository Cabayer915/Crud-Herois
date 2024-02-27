# Projeto CRUD em Spring Boot utilizando alguns métodos HTTP

Este projeto é uma aplicação simples de CRUD (Create, Read, Update, Delete) desenvolvida em Spring Boot, demonstrando as funcionalidades básicas de consulta, atualização e remoção (Read, Update, Delete) por meio de operações `GetMapping`, `PostMapping`, `PutMapping`, `DeleteMapping`. Foi construído com propósitos didáticos para entender os princípios fundamentais do Spring Boot e suas capacidades de mapeamento de URLs.

## Funcionalidades

O projeto possui as seguintes funcionalidades básicas:

- **Listagem de Entidades**: Os recursos podem ser consultados através dos endpoints `GetMapping`, `PostMapping`, `PutMapping`, `DeleteMapping`.
- **Consulta de uma Entidade específica**: É possível consultar uma entidade específica com base em um identificador único.
- **Utiliza os principais métodos HTTP**: Por questões didáticas e de simplicidade, estão sendo tratados os métodos GET, POST, PUT, DELETE.

## Tecnologias Utilizadas

- Spring Boot
- Java
- Maven

<div style="display: flex; gap: 3px;">


<img alt="center" src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white">

<img aling="center" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>

<img alt="center" src="https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white">

</div>

## Estrutura do Projeto

O projeto segue uma estrutura básica de aplicativos Spring Boot:

- **`src/`**: Contém todo o código fonte da aplicação.
  - **`src/main/java/`**: Contém os pacotes Java da aplicação.
  - **`src/main/resources/`**: Contém os arquivos de configuração e recursos estáticos.
- **`src/test/`**: Contém os testes unitários e de integração.

## Como Executar

Para executar este projeto localmente, siga as etapas abaixo:

1. Certifique-se de ter o Java JDK e o Maven instalados em sua máquina.
2. Clone este repositório em seu ambiente local.
3. Navegue até o diretório raiz do projeto.
4. Execute o seguinte comando no terminal:

```bash
mvn spring-boot:run
