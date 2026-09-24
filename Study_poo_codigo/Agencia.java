// Classe base simples utilizando Encapsulamento.
package Study_poo_codigo;
public class Agencia {
    // Modificador 'private' protege os dados (Encapsulamento).
    private int numero;
    private String nome;

    // Construtor: método especial chamado quando usamos o 'new'.
    public Agencia(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    // Getters e Setters: portas de acesso controladas aos atributos privados.
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método comum para exibir os dados.
    public void mostrarDados() {
        System.out.println("Agência: " + numero + " - " + nome);
    }
}