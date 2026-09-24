// Herança ('extends Conta'): Herda atributos e métodos da classe Conta.
// Interface ('implements Pagamento'): Assina o contrato da interface Pagamento.
package Study_poo_codigo;
public class ContaCorrente extends Conta implements Pagamento {

    // Construtor da classe filha
    public ContaCorrente(int numero, String titular, double saldo, Agencia agencia) {
        // 'super' chama o construtor da classe pai (Conta) para inicializar os dados herdados.
        super(numero, titular, saldo, agencia);
    }

    // @Override indica que estamos implementando o método obrigatório da interface Pagamento.
    @Override
    public void pagar(double valor) {
        if (valor <= 0 || valor > getSaldo()) {
            System.out.println("Valor inválido ou saldo insuficiente!");
            return;
        }
        // Usa o setSaldo (herdado) e o getSaldo (herdado) para atualizar o valor.
        setSaldo(getSaldo() - valor);
        System.out.println("Pagamento em dinheiro realizado com sucesso!");
        System.out.printf("Saldo atualizado: R$ %.2f\n", getSaldo());
    }

    // SOBRECARGA 1: Mesmo nome ('pagar'), mas recebe parâmetros diferentes (valor, chavePix).
    public void pagar(double valor, String chavePix) {
        if (valor <= 0 || valor > getSaldo()) {
            System.out.println("Valor inválido ou saldo insuficiente!");
            return;
        }
        setSaldo(getSaldo() - valor);
        System.out.println("Pagamento via PIX realizado para a chave: " + chavePix);
        System.out.printf("Saldo atualizado: R$ %.2f\n", getSaldo());
    }

    // SOBRECARGA 2: Mesmo nome ('pagar'), mas recebe (valor, parcelas).
    public void pagar(double valor, int parcelas) {
        if (valor <= 0 || parcelas <= 0 || valor > getSaldo()) {
            System.out.println("Dados inválidos ou saldo insuficiente!");
            return;
        }
        double valorParcela = valor / parcelas;
        setSaldo(getSaldo() - valor);
        System.out.printf("Pagamento no cartão realizado! %dX de R$ %.2f\n", parcelas, valorParcela);
        System.out.printf("Saldo atualizado: R$ %.2f\n", getSaldo());
    }

    // Método extra do desafio
    public void transferir(double valor, int contaDestino) {
        if (valor <= 0 || valor > getSaldo()) {
            System.out.println("Valor inválido ou saldo insuficiente!");
            return;
        }
        setSaldo(getSaldo() - valor);
        System.out.println("Transferência realizada para a conta " + contaDestino + "!");
        System.out.printf("Saldo atualizado: R$ %.2f\n", getSaldo());
    }
}