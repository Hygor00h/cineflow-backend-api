🎬 CineFlow API
O CineFlow é uma API robusta desenvolvida para a gestão completa de sistemas de cinema. O projeto foca em escalabilidade e organização, utilizando padrões de projeto modernos como DTOs, Mappers e Documentação Automática.

Status do Projeto: 🚧 Em Desenvolvimento (Fase de Implementação de Autenticação e Mapeamento).

🚀 Tecnologias Utilizadas
O projeto utiliza o que há de mais moderno no ecossistema Java:

Java 21 (LTS)

Spring Boot 3.4.x

Spring Data JDBC / PostgreSQL (Persistência de dados)

Spring Security & JWT (Proteção de endpoints)

MapStruct (Mapeamento de objetos de forma performática)

OpenAPI (Swagger) (Design-First com geração de código via Plugin Maven)

RabbitMQ (Processamento assíncrono de vendas de ingressos)

Flyway (Migração e versionamento de banco de dados)

Como Rodar o Projeto
Pré-requisitos:

Java 21 instalado.

Maven 3.9+ instalado.

PostgreSQL rodando (padrão porta 5432).

Configuração do Banco:
Crie um banco de dados chamado cineflow e ajuste as credenciais no arquivo src/main/resources/application.properties.

Compilação e Geração de Código:
Como o projeto utiliza geração automática de classes via Swagger e MapStruct, rode o comando abaixo para gerar os fontes:
mvn clean compile

Execução:
mvn spring-boot:run

🧠 O que estou praticando neste projeto?
Padrão Mapper: Uso do MapStruct para separar as Entidades de Banco dos DTOs de API, mantendo o código limpo.

Design-First: Escrita do contrato da API em YAML (OpenAPI) antes da implementação do código.

Mensageria: Integração com RabbitMQ para que a compra de um ingresso não trave a aplicação enquanto processa o pagamento.

Segurança: Implementação de fluxos de Login e Cadastro com criptografia de senhas (BCrypt) e Tokens JWT.

