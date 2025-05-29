// Define o pacote onde essa classe está localizada.
package NossaLoja;

// A classe PagamentoBoleto implementa a interface IPagamento.
// Isso significa que ela deve fornecer sua própria implementação do método pagar.
public class PagamentoBoleto implements IPagamento {

    // Sobrescreve o método da interface IPagamento.
    // Aqui está sendo implementada a lógica de pagamento via boleto.
    @Override
    public void pagar(double valor) {
        // Exibe uma mensagem no console indicando que o pagamento foi feito com boleto.
        System.out.println("Pagamento de R$" + valor + " realizado com boleto.");
    }
}
