# beach-product-rental

### 📚 Pré-requisitos

- 🌴 Git
- ☕ Java 11
- 📦 Maven
- ⚙️ Docker

## 📋 Antes de iniciar a aplicação
Rodar arquivo docker-compose.yaml encontrado no diretório devops/docker para que banco de dados seja criado.

## 📋 Ao iniciar a aplicação 
Serão criadas as tabelas conforme arquivo V001__create_table_product_order.sql 
E serão criados os produtos abaixo:

INSERT INTO product (id,product_type,product_value,user_amount) VALUES (1,'SURFBOARD',5000,1560);
<br>
INSERT INTO product (id,product_type,product_value,user_amount) VALUES (2,'BEACH_CHAIR',3500,500);
<br>
INSERT INTO product (id,product_type,product_value,user_amount) VALUES (3,'SUNSHADE',4000,1030);
<br>
INSERT INTO product (id,product_type,product_value,user_amount) VALUES (4,'SAND_BOARD',2500,900);
<br>
INSERT INTO product (id,product_type,product_value,user_amount) VALUES (5,'BEACH_TABLE',2500,810);
<br>

## 🚢 Utilizando API
No diretório devops/postman se encontra a collection de chamadas api

** Importante verificar que é utilizado validação de Token ( simples ) na chamada dos endpoints



