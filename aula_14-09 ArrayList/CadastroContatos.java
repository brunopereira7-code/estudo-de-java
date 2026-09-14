import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("<<<<<<<<SDCC>>>>>>>>");
            System.out.println("1-Cadastrar contato");
            System.out.println("2-Listar contato");
            System.out.println("3-Excluir contato");
            System.out.println("4-Alterar contato");
            System.out.println("5-Pesquisar contato");
            System.out.println("6-Sair");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe o número: ");
                    String numero = sc.nextLine();

                    contatos.add(new Contato(nome, numero));
                    System.out.println("Cadastro realizado!");
                    
                    break;
                case 2:
                    System.out.println("Nomes cadastrados");
                    for(int i=0;i<contatos.size();i++){
                        System.out.println((i+1)+" - "+contatos.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Informe o indice para remover: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index>0 && index<=contatos.size()) {
                        contatos.remove(index-1);
                        System.out.println("contato removido!");
                    } else {
                        System.out.println("contato inválido!");
                    }
                break;
                case 4:
                    System.out.println("Informe o número para alterar: ");
                    int pos=sc.nextInt();
                    sc.nextLine();

                    if (pos>0 && pos<=contatos.size()) {
                        System.out.println("Novo nome");
                        String novoNome=sc.nextLine();

                        System.out.println("Vovo número");
                        String novoNumero=sc.nextLine();
                        contatos.get(pos-1).setNome(novoNome);
                        contatos.get(pos-1).setNumero(novoNumero);
                        System.out.println("contato alterado!");
                    } else {
                        System.out.println("contato inválido");
                    }
                break;
                case 5:
                    System.out.println("Informe o nome para pesquisar: ");

                    boolean encontrado=fase;

                    for(int i=0;i<contatos.size();i++){
                        if (contatos.get(i).getNome().equalsIgnoreCase(busca)) {}
                    }

                break;
            
                default:
                    break;
            }
        }


        sc.close();
    }
}
