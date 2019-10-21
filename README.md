### API de busca de prestadore de saúde
Criação de api para recuperação de prestadores de saúde através da especialidade, 
espera-se como resultado o retorno de dados dos prestadores e distância em KMs a partir 
da Geolocalização informada.

### Como rodar:

Primeiramente, ir na pasta raiz do projeto e compilar com o maven
```
 ./mvnw clean install
```

Executar o Docker

```
 docker-compose up --build
```
Recursos expostos no seguinte endpoint:

```
http://localhost:8080/swagger-ui.html
```
Para execução basta preencher campos "ESPECIALIDADE", "LATITUDE" e "LONGITUDE" do serviço GET que está no contrato SWAGGER criado.

### Observações:
Banco de dados em memória(H2), prestadores cadastrados a partir do arquivo /health-services-api/src/main/resources/data.sql
