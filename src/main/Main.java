// Define que esta classe está no pacote "main"
package main;

// Importa todas as classes necessárias do pacote NossaLoja
import NossaLoja.Carrinho;
import NossaLoja.Cliente;
import NossaLoja.Pedido;
import NossaLoja.Produto;
import NossaLoja.IPagamento;
import NossaLoja.PagamentoCartao;

// Classe principal que executa o sistema
public class Main {
    // Método principal, onde o programa começa a rodar
    public static void main(String[] args) {

        // Cria um objeto do tipo Produto chamado "camisa", com nome, preço e estoque
        Produto camisa = new Produto("Camisa Polo", 59.90, 10);

        // Cria outro produto chamado "tenis"
        Produto tenis = new Produto("Tênis Esportivo", 199.90, 5);

        // Cria um cliente com nome e e-mail
        Cliente cliente = new Cliente("Giovanna", "gi@loja.com");

        // Cria um carrinho de compras
        Carrinho carrinho = new Carrinho();

        // Adiciona 2 camisas ao carrinho (método com quantidade específica)
        carrinho.adicionarItem(camisa, 2); // Exemplo de sobrecarga de método

        // Adiciona 1 tênis ao carrinho (usa a versão sobrecarregada que assume quantidade 1)
        carrinho.adicionarItem(tenis);

        // Cria uma forma de pagamento com cartão. Isso é possível porque a variável é do tipo da interface IPagamento.
        // Polimorfismo: podemos trocar facilmente por PagamentoBoleto, por exemplo.
        IPagamento pagamento = new PagamentoCartao();

        // Cria o pedido com o cliente, o carrinho e a forma de pagamento escolhida
        Pedido pedido = new Pedido(cliente, carrinho, pagamento);

        // Tenta finalizar o pedido (método pode lançar exceção)
        try {
            pedido.finalizarPedido();
        } catch (Exception e) {
            // Em caso de erro (como carrinho vazio), exibe a mensagem da exceção
            System.out.println("Erro ao finalizar pedido: " + e.getMessage());
        }
    }
}
