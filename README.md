# Projeto Banco Digital

Este projeto faz parte do curso "Desenvolvimento Java com IA" da DIO. O objetivo é reforçar o conhecimento em Programação Orientada a Objetos (POO) em Java através da implementação de um banco digital. Este desafio prático explora os pilares da orientação a objetos em um contexto bancário, permitindo a aplicação prática dos conceitos aprendidos.

## Objetivo

O objetivo deste projeto é aplicar e consolidar os conceitos de POO em Java, criando um banco digital que gerencia contas correntes e contas poupança. 

## Descrição

Neste projeto, você encontrará a implementação de um banco digital utilizando os conceitos de POO. O projeto simula operações bancárias básicas como depósito, saque e transferência entre contas, além de aplicar taxas para certas operações. O banco também acumula lucro com essas taxas.

## Estrutura do Projeto

- **Banco:** Representa o banco, armazenando uma lista de contas e calculando o lucro das taxas.
- **Cliente:** Representa o cliente do banco, com atributos básicos como nome, CPF e idade.
- **Conta:** Classe abstrata que define os métodos básicos de uma conta bancária. Possui subclasses `ContaCorrente` e `ContaPoupança` que implementam comportamentos específicos para cada tipo de conta.
- **IConta:** Interface que define os métodos essenciais que toda conta deve implementar.
- **SaldoException:** Exceção personalizada para tratar casos de saldo insuficiente.

## Funcionalidades

- **Conta Corrente:**
  - Saque com taxa de operação.
  - Transferência com taxa de operação.
  
- **Conta Poupança:**
  - Saque gratuito até o 4º saque; a partir do 5º saque, é aplicada uma taxa.
  
- **Banco:**
  - Gerenciamento de contas.
  - Cálculo de lucro proveniente das taxas das operações.

## Como Executar o Projeto

1. Clone o repositório do projeto para o seu ambiente local.
2. Importe o projeto em sua IDE Java preferida.
3. Compile e execute a classe `App` para simular operações bancárias e visualizar o funcionamento do sistema.

