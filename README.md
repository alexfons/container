# Avaliação Técnica
- Esta é uma aplicação web que tem como objetivo realizar o cadastro e manutenção um determinado usuário.

## Entradas para Cadstro
- Cadastro consiste em um formulário contendo as seguintes informações:
-- Nome, CPF, login e senha.

##### Possíveis Melhorias
- incluir validação de CPF
- implementar validação de campos obrigatórios

## Tecnologías Utilizadas
  - Backend: [Java], [Spring-boot], [Spring-data-rest]
  - Integrações: [Rest], [Restful]
  - Documentação: [Swagger]

## Arquitetura 
- A solução foi feita em um unico projeto de Backend representando um unico microserviço focado no dominio de usuário.

### Backend
- Solução desenvolvida em Java utilizando Spring-boot, Spring-data-rest, hibernate, JPA, Lombok 
 - API Restful disponível na porta 8080 contendo documentação swagger dos endpoints disponível em `http://localhost:8080/swagger-ui.html`.

### Banco de dados
- para esta prova de conceito foi utilizado banco de dados em memória, H2, os dados iniciais são populados através de um script sql na pasta de resources.

### Build
- para subir o servidor dessa aplicação é possível gerar um container docker através do Dockerfile  basta acessar o diretório raiz do projeto e executar
```sh 
$ mvn clean package docker:build
``` 
- será gerado uma imagem docker chamada `fiap-server-0.1.0` que pode ser executada através do comando
```sh 
$ docker run -d --name fiap-server -p8080:8080 fiap-server
```
##### Backend com Maven
- para compilar este projeto basta acessar o diretório raiz do projeto e executar o comando 
```sh 
$ mvn clean package
``` 
- para executar a aplicação basta acessar o diretório raiz do projeto e executar o comando 
```sh 
$ mvn spring-boot:run
``` 
## Documentação
- esta solução possui documentação da API Rest disponível através da ferramenta Swagger em /swagger-ui.html

   [Java]: <http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html>
   [Spring-boot]: <https://projects.spring.io/spring-boot/>
   [Rest]: <https://www.w3.org/2001/sw/wiki/REST>
   [Swagger]: <https://swagger.io/>  
   [Spring-data-rest]: <https://spring.io/projects/spring-data-rest>
   [Restful]:<https://www.devmedia.com.br/introducao-a-web-services-restful/37387>
   [Hateoas]: <https://spring.io/understanding/HATEOAS>
   
   

