# 🚀 API REST — Spring Boot & JPA

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9-blue)
![H2](https://img.shields.io/badge/Database-H2-lightgrey)
![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-blue)

---

## 📌 Visão Geral

Esta aplicação é uma **API REST desenvolvida em Java com Spring Boot**, utilizando **JPA/Hibernate** para persistência de dados.  
O projeto segue **boas práticas de arquitetura backend**, com foco em **organização, clareza e manutenibilidade**, simulando um cenário próximo ao utilizado em **ambientes corporativos e financeiros**.

O banco **H2** é utilizado para o ambiente de testes, permitindo rápida execução e validação da aplicação.

---

## 🧱 Arquitetura

A aplicação está estruturada em **camadas bem definidas**, promovendo separação de responsabilidades:

- **Resource (Controller)**  
  Responsável por expor os endpoints REST e lidar com requisições HTTP.

- **Service**  
  Contém as regras de negócio e orquestra as operações da aplicação.

- **Repository**  
  Camada de acesso a dados utilizando Spring Data JPA.

Essa abordagem facilita **testes**, **evolução do código** e **manutenção**, alinhada a padrões usados em projetos corporativos.

---

## 🧠 Conceitos e práticas aplicadas

- Arquitetura em camadas
- Injeção de dependência
- Padrão REST
- CRUD completo
- JPA / Hibernate
- Mapeamento de entidades e relacionamentos
- Banco de dados em memória (H2)
- Profiles de ambiente (test)
- Tratamento global de exceções
- Boas práticas de organização de código

---

## 🛠️ Tecnologias

<p align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="40"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="40"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/hibernate/hibernate-original.svg" width="40"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="40"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postman/postman-original.svg" width="40"/>
</p>

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database**
- **Maven**
- **Postman**

---

## ▶️ Execução do projeto

### 📋 Pré-requisitos
- Java 17 ou superior
- Maven

## ▶️ Passos para execução

```bash
git clone https://github.com/miqueelino/workshop-springboot4-jpa.git
cd workshop-springboot4-jpa
mvn spring-boot:run


---


🔎 Testes e validação

Os endpoints podem ser testados utilizando ferramentas como:

Postman

Insomnia

curl

📈 Evoluções futuras (roadmap)

Integração com banco de dados relacional (PostgreSQL)

Autenticação e autorização (Spring Security / JWT)

Documentação de API com Swagger / OpenAPI

Testes automatizados (JUnit / Mockito)

Versionamento de API

📄 Considerações finais

Projeto desenvolvido com foco em aprendizado prático, aplicando conceitos amplamente utilizados em times backend de instituições financeiras e grandes empresas, priorizando código limpo, organização e padrões de mercado.
