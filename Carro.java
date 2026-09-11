public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String marca, int ano, int qtdPortas) {
        super(marca, ano);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Quantidade de portas: " + qtdPortas);
    }
}
