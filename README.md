# 📚Catálogo de Filmes (IMDB Clone)

Este projeto é um sistema de catálogo de filmes desenvolvido em Java com Spring Boot, simulando funcionalidades básicas do IMDB. O sistema permite cadastrar, consultar, atualizar e remover filmes, diretores e atores, além de associar filmes a seus respectivos diretores e elenco. O projeto dá continuidade aos estudos em backend do curso da Adatech.

## Funcionalidades
- Cadastro de filmes, atores e diretores
- Associação de filmes com diretores e atores
- Pesquisa de filmes por nome (case insensitive)
- API RESTful completa (CRUD) para filmes
- Persistência em banco de dados H2 (em memória)

## Endpoints Obrigatórios
| Método | Rota                | Descrição                        |
|--------|---------------------|----------------------------------|
| GET    | /filmes             | Retorna todos os filmes          |
| GET    | /filmes/{id}        | Retorna um filme por ID          |
| POST   | /filmes             | Cria um novo filme               |
| PUT    | /filmes/{id}        | Atualiza completamente um filme  |
| DELETE | /filmes/{id}        | Deleta um filme                  |
| PATCH  | /filmes/{id}        | Atualiza parcialmente um filme   |

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Lombok

## ⚙️Como Executar o Projeto
1. **Pré-requisitos:**
   - Java 17 instalado
   - Gradle instalado (ou use o wrapper `./gradlew`)
2. **Clone o repositório:**
   ```
   https://github.com/regigomes/catalogo-filmes.git
   ```
3. **Acesse a pasta do projeto:**
   ```
   cd programcaoweb
   ```
4. **Execute a aplicação:**
   ```
   ./gradlew bootRun
   ```
   Ou no Windows:
   ```
   gradlew.bat bootRun
   ```
5. **Acesse a aplicação:**
   - API: http://localhost:8080/filmes
   - Console H2: http://localhost:8080/h2-console (usuário: `sa`, senha: sem senha)

## Estrutura do Projeto
- `src/main/java/com/example/programcaoweb/model` - Entidades do sistema
- `src/main/java/com/example/programcaoweb/controller` - Controllers REST
- `src/main/java/com/example/programcaoweb/repository` - Repositórios JPA
- `src/main/java/com/example/programcaoweb/service` - Lógica de negócio

## Observações
- O projeto utiliza conceitos de POO: encapsulamento, herança, polimorfismo e classes abstratas.
- O banco de dados é reiniciado a cada execução (H2 em memória).

## Autor
- **Regiane Gomes**
- GitHub: [@regigomes](https://github.com/regigomes)


