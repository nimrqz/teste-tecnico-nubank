# Desafio Back-End Nubank

Projeto de treino baseado no desafio técnico aplicado no processo seletivo do Nubank. Uma API REST desenvolvida em Java e Spring Boot com persistência via Spring Data JPA, demonstrando o domínio de conceitos essenciais exigidos pelo mercado para engenharia de software.

### Requisitos Técnicos

A aplicação deve conter:

- Cadastro de Cliente: `POST /clientes`
- Cadastro de Contato associado a um cliente existente: `POST /contatos`
- Listagem de todos os clientes com seus contatos: `GET /clientes`
- Listagem de contatos de um cliente específico: `GET /clientes/{id}/contatos`
- Uso do **Spring Boot** + **Spring Data JPA**
- Banco de Dados **PostgreSQL**
- Entidades **Cliente** e **Contato** com relacionamento `@OneToMany` / `@ManyToOne`

### Requisitos de Código

Esperamos que o código siga boas práticas de desenvolvimento, incluindo:

- Separação de responsabilidades (`controller`, `service`, `repository`)
- Uso de **DTOs** para entrada e saída de dados
- Tratamento adequado de erros
- Uso de **Lombok**

### Diferenciais (Não obrigatórios)

- Uso de **Docker** para subir o PostgreSQL
- **Testes automatizados**
- Documentação com **Swagger**

## Tecnologias Usadas
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)&nbsp;
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)&nbsp;
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-007396?style=for-the-badge&logo=hibernate&logoColor=white)&nbsp;
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?style=for-the-badge&logo=postgresql&logoColor=white)&nbsp;
![Lombok](https://img.shields.io/badge/Lombok-FF0000?style=for-the-badge&logo=lombok&logoColor=white)&nbsp;
