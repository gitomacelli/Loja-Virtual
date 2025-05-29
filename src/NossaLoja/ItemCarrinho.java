// Define o pacote onde a classe está localizada.
package NossaLoja;

// Declaração da classe ItemCarrinho, que representa um item (produto + quantidade) dentro do carrinho de compras.
public class ItemCarrinho {

    // Atributo privado que armazena o produto adicionado ao carrinho.
    private Produto produto;

    // Atributo privado que armazena a quantidade desse produto no carrinho.
    private int quantidade;

    // Construtor da classe ItemCarrinho.
    // Recebe um objeto Produto e a quantidade desejada, e inicializa os atributos.
    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;       // Atribui o produto recebido ao atributo da classe.
        this.quantidade = quantidade; // Atribui a quantidade recebida ao atributo da classe.
    }

    // Método getter que retorna o produto deste item do carrinho.
    public Produto getProduto() {
        return produto;
    }

    // Método getter que retorna a quantidade deste item no carrinho.
    public int getQuantidade() {
        return quantidade;
    }

    // Método que calcula o subtotal do item.
    // Multiplica o preço unitário do produto pela quantidade.
    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }
}
