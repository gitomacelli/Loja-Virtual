// Define o pacote onde a interface está localizada.
package NossaLoja;

// Declaração da interface IPagamento.
// Uma interface define um "contrato", ou seja, métodos que as classes que a implementarem devem obrigatoriamente possuir.
public interface IPagamento {

    // Método abstrato que obriga as classes que implementarem essa interface a definir como será feito o pagamento.
    // Recebe como parâmetro o valor a ser pago.
    void pagar(double valor);
}
