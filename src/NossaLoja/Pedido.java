// Define o pacote da classe.
package NossaLoja;

// Classe Pedido representa uma compra feita por um cliente, contendo o carrinho e a forma de pagamento.
public class Pedido {
    
    // Atributo que representa o cliente que está fazendo o pedido.
    private Cliente cliente;
    
    // Carrinho com os produtos que o cliente deseja comprar.
    private Carrinho carrinho;
    
    // Interface de pagamento, permite usar diferentes formas de pagamento (cartão, boleto, etc.).
    private IPagamento pagamento;

    // Construtor da classe, inicializa o cliente, o carrinho e a forma de pagamento.
    public Pedido(Cliente cliente, Carrinho carrinho, IPagamento pagamento) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.pagamento = pagamento;
    }

    // Método que finaliza o pedido, processando o pagamento.
    public void finalizarPedido() throws Exception {
        // Verifica se o carrinho está vazio. Se estiver, lança uma exceção com uma mensagem de erro.
        if (carrinho.getItens().isEmpty()) {
            throw new Exception("Carrinho vazio!");
        }

        // Se o carrinho tem itens, realiza o pagamento com o valor total.
        pagamento.pagar(carrinho.calcularTotal());

        // Exibe uma mensagem de sucesso com o nome do cliente.
        System.out.println("Pedido finalizado com sucesso para: " + cliente.getNome());
    }
}
