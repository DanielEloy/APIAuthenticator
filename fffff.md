## Execução

Para rodar a API:

```bash
mvn spring-boot:run


Acesse em: http://localhost:8080


Endpoints

POST /api/login
POST /api/leads/create
DELETE /api/leads/delete
GET /api/news
POST /api/profile/create
DELETE /api/profile/delete
PUT /api/profile/update
GET /api/sales/highlights
GET /api/sales/month
GET /api/sales/stars
GET /api/sales/year

Teste rápido

Exemplo login com cURL:

curl -X POST http://localhost:8080/api/login \
-H "Content-Type: application/json" \
-d '{"username":"admin","password":"1234"}'

Observação
Projeto de exemplo com endpoints dummy e autenticação JWT básica.

Se você quiser, posso **gerar o README.md completo já pronto para colocar na pasta do projeto**. Quer que eu faça isso?
