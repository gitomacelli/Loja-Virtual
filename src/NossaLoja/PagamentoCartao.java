// Define o pacote onde a classe está localizada.
package NossaLoja;

// A classe PagamentoCartao implementa a interface IPagamento, ou seja, é obrigada a implementar o método pagar.
public class PagamentoCartao implements IPagamento {

    // Sobrescreve (override) o método da interface IPagamento.
    @Override
    public void pagar(double valor) {
        // Imprime uma mensagem simulando que o pagamento foi feito com cartão.
        System.out.println("Pagamento de R$" + valor + " realizado com cartão.");
    }
}
