# Frontend - Gestão Vagas

## Descrição

O frontend da aplicacao Gestao Vagas foi desenvolvido utilizando **Spring Boot** com **Thymeleaf** para renderizacao das paginas HTML. Ele fornece uma interface amigável para candidatos, empresas e administradores gerenciarem vagas de emprego.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.1**
- **Thymeleaf** (motor de templates)
- **Spring Security** (para autenticacao e autorizacao)
- **Lombok** (para reduzir código boilerplate)
- **Spring Boot DevTools** (atualização automática em desenvolvimento)
- **Thymeleaf Extras Spring Security** (integração com Spring Security)

## Funcionalidades

- **Autenticação e Autorização**: Gerenciamento de usuarios e permissoes com Spring Security.
- **Interface para Gestao de Vagas**: Criação, edição, exclusão e listagem de vagas de emprego.
- **Cadastro e Gerenciamento de Empresas**: Empresas podem se cadastrar e associar vagas a seus perfis.
- **Cadastro e Gerenciamento de Candidatos**: Candidatos podem se cadastrar e visualizar as vagas disponiveis.
- **Segurança**: Proteção de rotas baseadas em permissões de usuario.

## Como Executar o Projeto

### Pre requisitos

- Java 17+
- Maven 3+

### Executando o Projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/srmatheusmaciel/front_gestao_vagas.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd front_gestao_vagas
   ```
3. Compile e execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```
4. A aplicação estará disponivel em `http://localhost:8080`

## Estrutura do Projeto

```
front_gestao_vagas/
├── src/main/java/br/com/matheusmaciel/front_gestao_vagas/
│   ├── modules/     # Logica de negocio e integracoes
│   ├── security/    # Configuracao de seguranca
│   ├── utils/       # Tratamento de erros
├── src/main/resources/templates/ # Paginas HTML renderizadas pelo Thymeleaf
├── src/main/resources/application.properties  # Configuracoes do sistema
```

## Testes

Para executar os testes, utilize:

```sh
mvn test
```

## Contribuicão

Contribuições são bem-vindas! Para contribuir:

1. Fork o repositório
2. Crie um branch para sua feature: `git checkout -b minha-feature`
3. Faça commit das mudanças: `git commit -m 'Adiciona minha feature'`
4. Faça push para o branch: `git push origin minha-feature`
5. Abra um Pull Request

## Licença

Este projeto esta sob a licença MIT. Para mais detalhes, consulte o arquivo `LICENSE`.

