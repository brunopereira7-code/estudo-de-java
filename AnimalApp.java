import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cachorro cachorro = null;
        Gato gato = null;

        int opcao;

        do {
            System.out.println("\n===== CLÍNICA VETERINÁRIA =====");
            System.out.println("1 - Cadastrar Cachorro");
            System.out.println("2 - Cadastrar Gato");
            System.out.println("3 - Mostrar dados do Cachorro");
            System.out.println("4 - Mostrar dados do Gato");
            System.out.println("5 - Fazer Cachorro emitir som");
            System.out.println("6 - Fazer Gato emitir som");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeCachorro = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idadeCachorro = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Raça: ");
                    String raca = scanner.nextLine();

                    cachorro = new Cachorro(nomeCachorro, idadeCachorro, raca);

                    System.out.println("Cachorro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeGato = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idadeGato = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Cor: ");
                    String cor = scanner.nextLine();

                    gato = new Gato(nomeGato, idadeGato, cor);

                    System.out.println("Gato cadastrado com sucesso!");
                    break;

                case 3:
                    if (cachorro != null) {
                        cachorro.exibirInfo();
                    } else {
                        System.out.println("Nenhum cachorro cadastrado.");
                    }
                    break;

                case 4:
                    if (gato != null) {
                        gato.exibirInfo();
                    } else {
                        System.out.println("Nenhum gato cadastrado.");
                    }
                    break;

                case 5:
                    if (cachorro != null) {
                        cachorro.emitirSom();
                    } else {
                        System.out.println("Nenhum cachorro cadastrado.");
                    }
                    break;

                case 6:
                    if (gato != null) {
                        gato.emitirSom();
                    } else {
                        System.out.println("Nenhum gato cadastrado.");
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}