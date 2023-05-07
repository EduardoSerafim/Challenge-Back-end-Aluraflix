# Challenge Back end I Alura
![Logo Aluraflix](https://user-images.githubusercontent.com/64627274/216795074-cc10d754-99ee-4768-bd8b-f1e7d228b3b0.png)

<hr>
:construction: Em Desenvolvimento :construction:

## Descrição

Projeto proposto pela alura na primeira edição do Challenge back end. Consite em um desafio em que se deveria desenvolver uma API Rest com rotas CRUD baseado nas tarefas e regras de negócio especificadas em um quadro do Trello. Também foi feita autenticação na API, utilizando Spring Security e o padrão Jason Web Tokens

A proposta é baseada em um challange de front end na qual foi desenvolvida uma plataforma de videos chamada "Aluraflix". Este challnege consiste em desenvolver um back end para essa plataforma, possuindo rotas de CRUD para vídeos e categorias.

O desafio foi divido em três partes

- `Semana 1 - Básico` Desenvolvimento das rotas CRUD de vídeos
- `Semana 2 - Intermediário` Desenvolvimento das rotas CRUD de categorias + relacionamento entre as duas entidades + funcionalidades extras
- `Semana 3 e 4 - Avançado ` Autenticação e deploy da aplicação 

## Funcionalidades da API e rotas

A API possui as principais rotas CRUD para as entidades de vídeo e categoria

- **Para vídeos**

  - `GET` Listar todos os vídeos `/videos`
  - `GET` Retornar um vídeo baseado no ID `/videos/{id}`
  - `GET` listar vídeos que não precisam de autenticação `/videos/free`
  - `POST` adicionar um vídeo `/videos`
  - `PUT` Atualizar um vídeo baseado no ID (passado no corpo da requisição) `/videos` 
  - `DELETE` Deletar um vídeo baseado no ID `/videos/{id}` 
  - `GET` Buscar vídeos pelo título `/videos/?search={palavra chave}`
  
- **Para categorias**

  - `GET` Listar todos as categorias `/categorias`
  - `GET` Retornar uma categoria baseado no ID `/categorias/{id}`
  - `POST` adicionar uma categoria `/categorias`
  - `PUT` Atualizar uma categoria baseado no ID (passado no corpo da requisição) `/categorias`
  - `DELETE` Deletar uma categoria baseado no ID `/categorias/{id}`
  - `GET` Listar os vídeos de uma determinada categoria baseado no ID `/categorias/{id}/videos`
  
- **Para usuarios**
  - `POST` realizar login `/login`
  
## Tarefas no Trello 

Para saber de forma mais detalhada como cada funcionalidade foi desenvolvida, confira os quadros do Trello usados para descrever cada tarefa a ser feita

- **[Semana 1](https://trello.com/b/Mj5x6lMZ/alura-challenge-backend-semana-1)**
- **[Semana 2](https://trello.com/b/5DavhAH7/alura-challenge-backend-semana-2)**
- **[Semana 3 e 4](https://trello.com/b/b5sOz9Q5/alura-challenge-backend-semana-3)**
  
 ## Tecnolgias usadas 
 
 As teconlogias usadas no desafio eram de escolha do participante 
 
 - `Java 17` 
 - `Spring Boot 3` 
 
   - Spring Web
   - Spring Validation
   - Spring Data JPA
   - Lombok
   - Spring Security
   - Jason Web Tokens
 - `Banco de dados MySql`
 - `Postman` 

  
