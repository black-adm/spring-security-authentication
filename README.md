### spring security
# Autenticação e autorização com Spring Security e Mysql.

<p align="center">
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
<img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" />
<img src="https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white" />
<img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white" />
</p>
<br>

Esse projeto foi desenvolvido para fins de estudos do *Spring Security*, a idéia é formar bem a base para implementar segurança em aplicações **Java**. 

A aplicação tem cadastro de produtos, de usuários e a listagem de usuários e produtos. Desenvolvi algumas restrições para rotas que não devem ser acessadas por um usuário sem cadastro.

<img src="https://i.ibb.co/PYy1WQ4/Design-sem-nome.png" />
</br>

> Como testar o projeto na sua máquina
- Clone o projeto com o comando `git clone https://github.com/black-adm/spring-security-authentication`.

- Instale as dependências do projeto com o **Maven** e gere as migrations do banco rodando o projeto na sua  IDE.

- Certifique-se de ter a imagem mais recente do *Mysql* no *Docker* instalada,  e crie um container com esse comando `docker run --name mysql -e MYSQL_ROOT_PASSWORD=docker -e MYSQL_DATABASE=docker -p 3306:3306 -d mysql
`.
