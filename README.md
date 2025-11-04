# Catálogo de Filmes (IMDB Clone)

Este projeto é um sistema de catálogo de filmes desenvolvido em Java com Spring Boot, seguindo os conceitos de programação orientada a objetos (POO) e boas práticas REST.

## Funcionalidades
- Cadastro de filmes, atores e diretores
- Associação de filmes com seus atores e diretores
- Pesquisa de filmes pelo nome (ignorando maiúsculas/minúsculas)
- CRUD completo para todas as entidades
- Persistência em banco de dados H2 (em memória)

## Endpoints principais
- `GET /filmes` - Lista todos os filmes
- `GET /filmes/{id}` - Busca filme por ID
- `POST /filmes` - Cadastra novo filme
- `PUT /filmes/{id}` - Atualiza completamente um filme
- `PATCH /filmes/{id}` - Atualiza parcialmente um filme
- `DELETE /filmes/{id}` - Remove um filme
- `GET /filmes/pesquisa?nome=...` - Pesquisa filme por nome

## Como executar
1. Instale o Java 17+ e o Maven ou Gradle
2. Execute o projeto pelo IntelliJ ou pelo terminal:
   - `./gradlew bootRun` (Linux/Mac)
   - `gradlew.bat bootRun` (Windows)
3. Acesse a API em `http://localhost:8080`
4. Acesse o console H2 em `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:catalogofilmes`)

## Estrutura de POO
- Uso de classes abstratas, herança, polimorfismo e encapsulamento
- Entidades: Filme, Pessoa (abstrata), Ator, Diretor

## Observações
- Utilize ferramentas como Postman para testar os endpoints
- O projeto segue boas práticas de código limpo e REST

