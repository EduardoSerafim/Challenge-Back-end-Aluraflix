# Challenge Back end I Alura
![Logo Aluraflix](https://user-images.githubusercontent.com/64627274/216795074-cc10d754-99ee-4768-bd8b-f1e7d228b3b0.png)

<hr>
:construction: Em Desenvolvimento :construction:

## Descrição

Projeto proposto pela alura na primeira edição do Challenge back end. Consite em um desafio em que se deveria desenvolver uma API Rest com rotas CRUD baseado nas tarefas e regras de negócio especificadas em um quadro do Trello

A proposta é baseada em um challange de front end na qual foi desenvolvida uma plataforma de videos chamada "Aluraflix". Este challnege consiste em desenvolver um back end para essa plataforma, possuindo rotas de CRUD para vídeos e categorias.

## Funcionalidades da API e rotas

A API possui as principais rotas CRUD para as entidades de vídeo e categoria

- **Para vídeos**

  - `GET` Listar todos os vídeos `/videos`
  - `GET` Retornar um vídeo baseado no ID `/videos/{id}`
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
  
 ## Tecnolgias usadas 
 
 As teconlogias usadas no desafio eram de escolha do participante 
 
 - `Java 17` !(Java)[https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_16x16.png]
 - `Spring Boot 3` 
 
   - Spring Web
   - Spring Validation
   - Spring Data JPA
   - Lombok
 - `Banco de dados MySql`
 - `Postman` 

  
