# TESTE PRÁTICO - Contas a pagar (Temática do crescimento de uma rede de padarias)
## Teste prático realizado por Fabiano de Castro Monteiro, em Fevereiro de 2018.

### Descrição
Para o desenvolvimento do back-end deste projeto foi utilizado o framework Spring Boot aplicando conceitos de REST (Webservice), JPA (Persitência de dados) e gerenciamento de dependências [MAVEN/GRADLE]. Para a construção do front-end, foi utilizado o AngularJS.

### Pré-requisitos
- [JDK 1.8]
- [Gradle 4.5.1]
- [Spring Tool Suite 3.9.2] ou [Eclipse Oxygen]
- [MySql]

### Tecnologias aplicadas
* [Java 8]
* [Spring Boot 2.0.0]
* [Spring Data JPA]
* [MySql]
* [AngularJS 1.4.8]

### Estrutura do projeto

	bakery-boot [Project]
	└── src
		└── main
			└── java
				└── br
					└── com
						└── bakery
							└── Config
								└── DatabaseConfig.java
							└── Model
								└── Usuario.java
							└── Repository
								└── UsuarioRepository.java
							└── Resource
								└── UsuarioResource.java
							└── Service
								└── UsuarioService.java
								└── UsuarioServiceImpl.java
							└── Application.java
			└── resources
				└── scripts
					└── inital-data.sql
				└── static
					└── css
						└── app.css
					└── img
						└── favicon.ico
						└── logo-padaria.png
						└── logo-padaria-login.png
					└── js
						└── angular-locale_pt-br.js
						└── app.js
						└── rw-money-mask.min.js
					└── partials
						└── acessoNegado.html
						└── contasPagar.html
						└── empresas.html
						└── usuarios.html
					└── index.jsp
				
				
				
				
				
				└── css
					└── bakery
						└── Application.java
						└── Config
							└── DatabaseConfig.java
						└── Model
                    		└── Usuario.java
						└── Repository
                    		└── UsuarioRepository.java
						└── Resource
                    		└── UsuarioResource.java
						└── Service
                    		└── UsuarioService.java
                    		└── UsuarioServiceImpl.java



    └── assets
        └── javascripts
            └── bootdemo
                └── user
                    └── controllers
                    └── services
                    └── directives
					└── templates //all html template files goes here
                    └── bootdemo.user.js //main js file of module.
                    └── routes.js //configuring routes for this module 


### How to run 

  - Download/clone the project. 
  - Open command prompt and go to the root location of the downloaded project. Then run following command to install bower dependencies:
```sh
        gradlew clientInstall 
```
  - This will install client dependencies in side src/assets/vendor. Once installed client dependencies, import project in Spring Tool Suite (STS) from File > Import > Gradle (STS) Project. Note that you need to install Gradle plugin in STS first if not installed yet. 
  - In STS, right click on the project and click on Gradle (STS) > Refresh Dependencies.
  - Now open **application.properties** file and change database related properties as per your [MySql] database. Change for both spring datasource and [flyway] datasource. Also create a databse with name you have specified in **application.properties**. In this demo I have named database as demo.
  - Open **App.java** and Run as **Java Application**. This will start the application and you can check on http://localhost:8080
  - Note that, when you run the app for first time, [Flyway] will create tables for you by executing **V1__create_db.sql** placed in resources/db/migration.
  - Once application started, you can login with provided credentials on index page.

### What this project coantains

This Spring boot web project has implementaion of simple CRUD operation of User and Task entities. The implementaion is based on Angular JS. So for User entity, there is a seperate folder called user under **src/assets/javascript/bootdemo**. This folder has controllers, services, directives and templates related to User module.

------------------------------------------------------------------------------------------------------------------------
Typical structure of Angular JS files for each module/entity will be as follow:
 ```sh
└── src
    └── assets
        └── javascripts
            └── bootdemo
                └── user
                    └── controllers
                    └── services
                    └── directives
					└── templates //all html template files goes here
                    └── bootdemo.user.js //main js file of module.
                    └── routes.js //configuring routes for this module 
```
The project also has Spring Security and Auditor Aware cofigured with it. Authentication in Spring Security is done from database. 

### Tecnologias aplicadas
* [Spring Boot]
* [Spring Data JPA]
* [MySql]
* [AngularJS]

### Update 25th May 2016
Added Spring Security (database authentication) and AuditorAware to track who edited/added entity. Most of the code related to Spring Secuty has been taken from [jhipster-sample-app].

### Reference

* [Spring Boot Asset Pipeline Gradle Adapter]
* [Client Dependencies Gradle Plugin]

License
----
MIT



[Spring Boot]: http://projects.spring.io/spring-boot/
[Spring Data JPA]: http://projects.spring.io/spring-data-jpa/
[MySql]: https://www.mysql.com/
[Bower]: http://bower.io/
[Asset Pipeline]: https://github.com/bertramdev/asset-pipeline/tree/master/asset-pipeline-spring-boot
[Materialize CSS]: http://materializecss.com/
[Gradle]: http://gradle.org/
[Flyway]: https://flywaydb.org/
[Spring Boot Asset Pipeline Gradle Adapter]: https://github.com/bertramdev/asset-pipeline/tree/master/asset-pipeline-spring-boot  
[Client Dependencies Gradle Plugin]:https://github.com/craigburke/client-dependencies-gradle
[Client Dependencies Management using Gradle]: https://github.com/craigburke/client-dependencies-gradle
[Spring Tool Suite]:https://spring.io/tools
[JDK 1.8]: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[MySql]: https://www.mysql.com/
[jhipster-sample-app]: https://github.com/jhipster/jhipster-sample-app
