# Revisão Java - Exercício Banco

Você vai criar um programa para gerenciar diferentes tipos de contas bancárias no Banco. O objetivo é usar classes abstratas e interfaces para definir comportamentos comuns e específicos para diferentes tipos de contas.

##Requisitos

1.  Crie uma interface chamada `Conta` com os métodos `consultarSaldo()` e `depositar(double valor)`.

2.  Crie uma classe abstrata chamada `ContaBancaria` que implementa a interface `Conta`.

3.  Crie uma classe chamada `ContaCorrente` que estende a classe `ContaBancaria`.

4.  Na `ContaCorrente`, implemente o método `depositar(double valor)` para adicionar o valor integralmente ao saldo.

5.  Crie uma classe chamada `ContaPoupanca` que também estende a classe `ContaBancaria`.

6.  Na `ContaPoupanca`, implemente o método `depositar(double valor)` para adicionar o valor ao saldo com uma pequena taxa de depósito (por exemplo, deduzir 1% do valor depositado).

## Desafio Adicional

Como desafio adicional, adicione um `enum` chamado `TipoConta` para representar os diferentes tipos de contas, como `CORRENTE` e `POUPANCA`. Modifique as classes `ContaCorrente` e `ContaPoupanca` para usar esse enum e adicione um método sobrecarregado em uma classe principal (`BancoKonoha`, por exemplo) para realizar transferências entre contas.