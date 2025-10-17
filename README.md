# 📚 Sistema de Empréstimo de Biblioteca

Este projeto é um exemplo de aplicação Java com testes unitários, simulando o funcionamento básico de um sistema de **empréstimo de livros** em uma biblioteca.

## 🧾 Descrição do Projeto

O sistema permite:
- Cadastrar usuários (leitores);
- Cadastrar livros (itens disponíveis);
- Realizar e gerenciar empréstimos;
- Validar regras de senha de usuários;
- Executar testes automatizados para garantir o correto funcionamento das funcionalidades.

## 🧱 Estrutura do Projeto

```
biblioteca-emprestimo/
├── pom.xml                                 # Arquivo de configuração do Maven
├── src/
│   ├── main/java/aula0810/testeunitario/
│   │   ├── ItemLivro.java                  # Representa um livro disponível para empréstimo
│   │   ├── Leitor.java                     # Representa um usuário da biblioteca
│   │   ├── RegistroEmprestimo.java         # Lógica de empréstimo e devolução
│   │   └── ValidadorSenha.java             # Regras de validação de senha
│   └── test/java/aula0810/testeunitario/
│       ├── AllTestsSuite.java              # Suite de testes automatizados
│       ├── ItemLivroTest.java              # Testes da classe ItemLivro
│       ├── LeitorTest.java                 # Testes da classe Leitor
│       ├── RegistroEmprestimoTest.java     # Testes da lógica de empréstimo
│       └── ValidadorSenhaTest.java         # Testes da validação de senha
└── target/                                 # Arquivos gerados após build
```

## 🧠 Conceitos Envolvidos

- Boas práticas de testes unitários
- Encapsulamento e orientação a objetos
- Validação de dados de entrada
- Uso de Maven e JUnit

