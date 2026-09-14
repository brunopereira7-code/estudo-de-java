import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContato {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {

            System.out.println("\n<<<<<<<<<<< SDC >>>>>>>>>>");
            System.out.println("1 - Cadastrar Contato Pessoal");
            System.out.println("2 - Cadastrar Contato Profissional");
            System.out.println("3 - Listar Contatos");
            System.out.println("4 - Pesquisar Contato");
            System.out.println("5 - Alterar Contato");
            System.out.println("6 - Excluir Contato");
            System.out.println("7 - Cadastrar Contato de Emergência");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nomePessoal = sc.nextLine();

                    System.out.print("Digite o número do contato: ");
                    String numeroPessoal = sc.nextLine();

                    System.out.print("Digite o parentesco: ");
                    String parentesco = sc.nextLine();

                    contatos.add(new ContatoPessoal(
                            nomePessoal,
                            numeroPessoal,
                            parentesco
                    ));

                    System.out.println("Contato pessoal cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do contato: ");
                    String nomeProfissional = sc.nextLine();

                    System.out.print("Digite o número do contato: ");
                    String numeroProfissional = sc.nextLine();

                    System.out.print("Digite a empresa: ");
                    String empresa = sc.nextLine();

                    System.out.print("Digite o cargo: ");
                    String cargo = sc.nextLine();

                    contatos.add(new ContatoProfissional(
                            nomeProfissional,
                            numeroProfissional,
                            empresa,
                            cargo
                    ));

                    System.out.println("Contato profissional cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\nLista de Contatos:");

                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {

                        for (int i = 0; i < contatos.size(); i++) {

                            System.out.println("\n" + (i + 1) + " - ");
                            System.out.println(contatos.get(i).exibirDados());
                        }
                    }

                    break;

                case 4:
                    System.out.print("Digite o nome do contato que deseja pesquisar: ");
                    String busca = sc.nextLine();

                    boolean encontrada = false;

                    for (int i = 0; i < contatos.size(); i++) {

                        if (contatos.get(i).getNome().equalsIgnoreCase(busca)) {

                            System.out.println("\nContato encontrado!");
                            System.out.println(contatos.get(i).exibirDados());

                            encontrada = true;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("Contato não encontrado.");
                    }

                    break;

                case 5:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                        break;
                    }

                    System.out.println("\nLista de Contatos:");

                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - "
                                + contatos.get(i).getNome());
                    }

                    System.out.print("Digite o índice do contato que deseja alterar: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos > 0 && pos <= contatos.size()) {

                        System.out.print("Digite o novo nome do contato: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Digite o novo número do contato: ");
                        String novoNumero = sc.nextLine();

                        contatos.get(pos - 1).setNome(novoNome);
                        contatos.get(pos - 1).setNumero(novoNumero);

                        System.out.println("Contato alterado com sucesso!");

                    } else {
                        System.out.println("Contato inválido!");
                    }

                    break;

                case 6:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                        break;
                    }

                    System.out.println("\nLista de Contatos:");

                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i + 1) + " - "
                                + contatos.get(i).getNome());
                    }

                    System.out.print("Digite o índice do contato que deseja excluir: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index > 0 && index <= contatos.size()) {

                        contatos.remove(index - 1);

                        System.out.println("Contato excluído com sucesso!");

                    } else {
                        System.out.println("Contato inválido!");
                    }

                    break;

                case 7:
                    System.out.print("Digite o nome do contato: ");
                    String nomeEmergencia = sc.nextLine();

                    System.out.print("Digite o número do contato: ");
                    String numeroEmergencia = sc.nextLine();

                    System.out.print("Digite o grau de prioridade: ");
                    String prioridade = sc.nextLine();

                    contatos.add(new ContatoEmergencia(
                            nomeEmergencia,
                            numeroEmergencia,
                            prioridade
                    ));

                    System.out.println("Contato de emergência cadastrado com sucesso!");
                    break;

                case 8:
                    System.out.println("Fui...........");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}