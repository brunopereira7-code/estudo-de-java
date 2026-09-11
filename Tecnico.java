public class Tecnico extends Funcionario {
    private String setor;

    public Tecnico(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Setor: " + setor);
    }
}
