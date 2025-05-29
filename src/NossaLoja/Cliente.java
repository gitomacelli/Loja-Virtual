// Define o pacote onde a classe está localizada.
package NossaLoja;

// Declaração da classe Cliente, que representa uma pessoa que realiza compras na loja virtual.
public class Cliente {

    // Atributo privado que armazena o nome do cliente.
    private String nome;

    // Atributo privado que armazena o e-mail do cliente.
    private String email;

    // Construtor da classe Cliente.
    // Esse método é chamado quando um novo cliente é criado.
    // Recebe o nome e o email e inicializa os atributos do objeto.
    public Cliente(String nome, String email) {
        super();             // Chamada ao construtor da superclasse (opcional aqui, pois não há herança direta).
        this.nome = nome;    // Atribui o parâmetro 'nome' ao atributo 'nome' do objeto.
        this.email = email;  // Atribui o parâmetro 'email' ao atributo 'email' do objeto.
    }

    // Método getter que retorna o nome do cliente.
    public String getNome() {
        return nome;
    }

    // Método setter que permite alterar o nome do cliente.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter que retorna o e-mail do cliente.
    public String getEmail() {
        return email;
    }

    // Método setter que permite alterar o e-mail do cliente.
    public void setEmail(String email) {
        this.email = email;
    }
}
