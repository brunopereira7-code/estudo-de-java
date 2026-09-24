// Esta será a "Classe Pai" (Superclasse) na herança.
package Study_poo_codigo;
public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    // Composição: A classe Conta "tem uma" Agencia dentro dela.
    private Agencia agencia; 

    // Construtor da classe pai.
    public Conta(int numero, String titular, double saldo, Agencia agencia) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    // Apenas Getters (sem setters) para evitar alterações diretas no titular e número.
    public int getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public Agencia getAgencia() { return agencia; }

    // 'protected' permite que apenas as classes filhas (ContaCorrente) alterem o saldo diretamente.
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depósito com validação.
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido!");
            return;
        }
        this.saldo += valor;
        System.out.printf("Depósito realizado com sucesso! Novo saldo: R$ %.2f\n", this.saldo);
    }

    public void consultarSaldo() {
        System.out.printf("Saldo disponível: R$ %.2f\n", this.saldo);
    }

    public void mostrarDados() {
        // Chama o método mostrarDados() que está dentro do objeto Agencia.
        agencia.mostrarDados(); 
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}