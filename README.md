# API de Autenticação Java (Spring Boot)

Projeto de exemplo em Java com Spring Boot, contendo autenticação JWT simples e endpoints para Leads, News, Profile e Sales.

## Pré-requisitos

- Java JDK 21
- Maven
- Visual Studio Code (ou IDE de sua preferência)

## Estrutura

```
api-authentication-java/
├── pom.xml
└── src
    └── main
        ├── java/com/example/api
        │   ├── ApiApplication.java
        │   ├── controller
        │   ├── model/User.java
        │   ├── service/AuthService.java
        │   └── security/JwtUtil.java
        └── resources/application.properties
```

## Execução

Para rodar a API:

```bash
mvn spring-boot:run
```

Acesse em: `http://localhost:8080`

## Endpoints

- POST `/api/login`
- POST `/api/leads/create`
- DELETE `/api/leads/delete`
- GET `/api/news`
- POST `/api/profile/create`
- DELETE `/api/profile/delete`
- PUT `/api/profile/update`
- GET `/api/sales/highlights`
- GET `/api/sales/month`
- GET `/api/sales/stars`
- GET `/api/sales/year`

## Teste rápido

Exemplo login com cURL:

```bash
curl -X POST http://localhost:8080/api/login -H "Content-Type: application/json" -d '{"username":"admin","password":"1234"}'
```

## Observação

Projeto de exemplo com endpoints dummy e autenticação JWT básica.
