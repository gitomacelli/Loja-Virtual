# 🛒 Loja Virtual em Java

Este projeto é uma simulação de uma **loja virtual básica**, desenvolvida em Java com foco em aplicar os **principais conceitos de Programação Orientada a Objetos (POO)**. Ele permite cadastrar produtos, criar um carrinho de compras, escolher a forma de pagamento e finalizar um pedido.

## 🚀 Tecnologias usadas
- Java 
- Programação Orientada a Objetos
- Interface (`interface`)
- Encapsulamento
- Polimorfismo
- Sobrecarga de método
- Tratamento de exceções

## 📦 Estrutura do Projeto

### `Produto.java`
Classe que representa um produto da loja. Contém nome, preço e quantidade em estoque.

### `Cliente.java`
Classe que representa um cliente, com nome e e-mail.

### `ItemCarrinho.java`
Representa um item dentro do carrinho (produto + quantidade).

### `Carrinho.java`
Contém a lista de itens adicionados, permite adicionar produtos e calcula o total do carrinho. Inclui sobrecarga de método.

### `IPagamento.java`
Interface que define o método `pagar()`. Pode ser implementada com diferentes formas de pagamento.

### `PagamentoCartao.java` e `PagamentoBoleto.java`
Implementações da interface `IPagamento`, simulando pagamentos por cartão e boleto (exemplo de polimorfismo).

### `Pedido.java`
Finaliza o pedido com base nos dados do cliente, carrinho e forma de pagamento. Usa tratamento de exceção para evitar finalização com carrinho vazio.

### `Main.java`
Classe principal onde o programa é executado: cria produtos, cliente, carrinho, define a forma de pagamento e finaliza o pedido.

---

## 🧠 Conceitos Aplicados

- **Encapsulamento:** atributos `private` acessados via `get`/`set`
- **Polimorfismo:** diferentes formas de pagamento através da interface
- **Sobrecarga de método:** `adicionarItem()` com ou sem quantidade
- **Tratamento de exceção:** uso de `try/catch` ao finalizar o pedido
- **Interface:** `IPagamento` implementada por duas classes diferentes

---

## 🧪 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/Loja-Virtual-Java.git
