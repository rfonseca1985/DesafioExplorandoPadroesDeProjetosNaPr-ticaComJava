# Terror Movie Streaming

O Terror Movie Streaming é uma aplicação para gerenciar filmes de terror.

## Pré-requisitos

Certifique-se de ter os seguintes requisitos antes de começar:

- Java 8 ou superior
- Maven
- Banco de dados (por exemplo, h2)

## Configuração do Banco de Dados

1. Crie um banco de dados chamado `terror_movie_db`.
2. Configure as propriedades de conexão com o banco de dados no arquivo `application.properties`.


# Configurações para o H2
spring.datasource.url=jdbc:h2:mem:terror_movie_db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

Como Executar
Clone este repositório:

git clone https://github.com/rfonseca1985/DesafioExplorandoPadroesDeProjetosNaPr-ticaComJava

Endpoints da API
GET /api/movies: Obter todos os filmes
GET /api/movies/{id}: Obter um filme por ID
POST /api/movies: Adicionar um novo filme
PUT /api/movies/{id}: Atualizar um filme existente
DELETE /api/movies/{id}: Excluir um filme por ID
