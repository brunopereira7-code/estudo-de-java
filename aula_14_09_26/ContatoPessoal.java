public class ContatoPessoal extends Contato {

    private String parentesco;

    public ContatoPessoal(String nome, String numero, String parentesco) {
        super(nome, numero);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String exibirDados() {
        return "Nome: " + getNome() + "\n" +
            "Telefone: " + getNumero() + "\n" +
            "Tipo: Pessoal\n" +
        "Parentesco: " + parentesco;
    }
}
