# TESTE PRÁTICO - Contas a pagar (Temática do crescimento de uma rede de padarias)
## Teste prático realizado por Fabiano de Castro Monteiro, em Fevereiro de 2018.

### Descrição
Para o desenvolvimento do back-end deste projeto foi utilizado o framework Spring Boot aplicando conceitos de REST (Webservice), JPA (Persitência de dados) e gerenciamento de dependências [MAVEN]. Para a construção do front-end, foi utilizado o AngularJS.

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
				└── application.properties
				└── persistence-mysql.properties
			└── webapp
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
						└── contasPagarBaixa.html
						└── contasPagarForm.html
						└── contasPagarPagamento.html
						└── empresas.html
						└── fluxoCaixa.html
						└── home.html
						└── login.html
						└── usuarios.html
					└── index.jsp
	└── pom.xml
	└── README.md
				
### Como executar? 

  - Faça o Download/clone do projeto. 
  - Na IDE de sua preferência Eclipse ou STS, importe o projeto da seguinte maneira: import project in Spring Tool Suite (STS) from File > Import > Exists Maven Project. 
  - Utilizando o banco MySQL crie o banco da dados, com o seguinte nome: 
	- database.driverClassName=com.mysql.jdbc.Driver
	- database.url=jdbc:mysql://localhost:3306/bakery	
	- database.username=root
	- database.password=

	[Obs:] O usuário e senha são os de instalação do MySQL.
	
  - No arquivo **application.properties** existem algumas configurações do projeto dentre elas o nome do sistema em: server.context-path 
  - Execupte o projeto normalmente, de acordo com a IDE de sua preferência. Após iniciar, vá a um navegador de sua preferência e acesse a seguite url:
	- http://localhost:8080/bakery
  - Aparecerá a tela de boas-vindas! O sistema estará pronto para utilizar.

