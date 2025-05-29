// Define o pacote onde a classe está localizada.
package NossaLoja;

// Importa as classes necessárias para usar listas dinâmicas.
import java.util.ArrayList;
import java.util.List;

// Declaração da classe Carrinho, que representa o carrinho de compras do cliente.
public class Carrinho {

    // Lista privada que armazena todos os itens adicionados ao carrinho.
    private List<ItemCarrinho> itens = new ArrayList<>();

    // Método para adicionar um item ao carrinho com uma quantidade específica.
    public void adicionarItem(Produto produto, int quantidade) {
        // Cria um novo ItemCarrinho e adiciona à lista.
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    // Sobrecarga de método: mesmo nome (adicionarItem), mas sem quantidade.
    // Se não for informada a quantidade, assume 1 por padrão.
    public void adicionarItem(Produto produto) {
        adicionarItem(produto, 1); // Chama o método acima passando a quantidade como 1.
    }

    // Método getter que retorna a lista de itens no carrinho.
    public List<ItemCarrinho> getItens() {
        return itens;
    }

    // Método que calcula o valor total de todos os itens do carrinho.
    public double calcularTotal() {
        double total = 0;
        // Para cada item na lista, soma o subtotal (preço * quantidade) ao total.
        for (ItemCarrinho item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }
}
