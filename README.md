# Avalia��o T�cnica
- Esta � uma aplica��o web que tem como objetivo realizar o cadastro e manuten��o um determinado usu�rio.

## Entradas para Cadstro
- Cadastro consiste em um formul�rio contendo as seguintes informa��es:
-- Nome, CPF, login e senha.

##### Poss�veis Melhorias
- incluir valida��o de CPF
- implementar valida��o de campos obrigat�rios

## Tecnolog�as Utilizadas
  - Backend: [Java], [Spring-boot], [Spring-data-rest]
  - Integra��es: [Rest], [Restful]
  - Documenta��o: [Swagger]

## Arquitetura 
- A solu��o foi feita em um unico projeto de Backend representando um unico microservi�o focado no dominio de usu�rio.

### Backend
- Solu��o desenvolvida em Java utilizando Spring-boot, Spring-data-rest, hibernate, JPA, Lombok 
 - API Restful dispon�vel na porta 8080 contendo documenta��o swagger dos endpoints dispon�vel em `http://localhost:8080/swagger-ui.html`.

### Banco de dados
- para esta prova de conceito foi utilizado banco de dados em mem�ria, H2, os dados iniciais s�o populados atrav�s de um script sql na pasta de resources.

### Build
- para subir o servidor dessa aplica��o � poss�vel gerar um container docker atrav�s do Dockerfile  basta acessar o diret�rio raiz do projeto e executar
```sh 
$ mvn clean package docker:build
``` 
- ser� gerado uma imagem docker chamada `fiap-server-0.1.0` que pode ser executada atrav�s do comando
```sh 
$ docker run -d --name fiap-server -p8080:8080 fiap-server
```
##### Backend com Maven
- para compilar este projeto basta acessar o diret�rio raiz do projeto e executar o comando 
```sh 
$ mvn clean package
``` 
- para executar a aplica��o basta acessar o diret�rio raiz do projeto e executar o comando 
```sh 
$ mvn spring-boot:run
``` 
## Documenta��o
- esta solu��o possui documenta��o da API Rest dispon�vel atrav�s da ferramenta Swagger em /swagger-ui.html

   [Java]: <http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html>
   [Spring-boot]: <https://projects.spring.io/spring-boot/>
   [Rest]: <https://www.w3.org/2001/sw/wiki/REST>
   [Swagger]: <https://swagger.io/>  
   [Spring-data-rest]: <https://spring.io/projects/spring-data-rest>
   [Restful]:<https://www.devmedia.com.br/introducao-a-web-services-restful/37387>
   [Hateoas]: <https://spring.io/understanding/HATEOAS>
   
   

