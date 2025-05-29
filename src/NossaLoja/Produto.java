// Define o pacote onde essa classe está localizada.
package NossaLoja;

// Declaração da classe Produto, que representa um item disponível para venda na loja virtual.
public class Produto {
    
    // Atributo privado que armazena o nome do produto.
    private String nome;
    
    // Atributo privado que armazena o preço do produto.
    private double preco;
    
    // Atributo privado que armazena a quantidade de unidades disponíveis em estoque.
    private int estoque;

    // Construtor da classe Produto.
    // Esse método é chamado quando um novo produto é criado.
    // Ele recebe o nome, preço e quantidade em estoque e inicializa os atributos do objeto.
    public Produto(String nome, double preco, int estoque) {
        super(); // Chamada ao construtor da superclasse (opcional nesse caso, pois não há herança direta aqui).
        this.nome = nome;         // Atribui o valor do parâmetro 'nome' ao atributo 'nome' do objeto.
        this.preco = preco;       // Atribui o valor do parâmetro 'preco' ao atributo 'preco' do objeto.
        this.estoque = estoque;   // Atribui o valor do parâmetro 'estoque' ao atributo 'estoque' do objeto.
    }

    // Método getter para obter o nome do produto.
    public String getNome() {
        return nome;
    }

    // Método setter para alterar o nome do produto.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o preço do produto.
    public double getPreco() {
        return preco;
    }

    // Método setter para alterar o preço do produto.
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método getter para obter a quantidade em estoque do produto.
    public int getEstoque() {
        return estoque;
    }

    // Método setter para alterar a quantidade em estoque do produto.
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
