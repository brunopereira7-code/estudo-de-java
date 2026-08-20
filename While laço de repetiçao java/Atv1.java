import java.util.Scanner;

public class Atv1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoPrincipal;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Acessar Menu de Embalagens");
            System.out.println("2 - Acessar Menu de Canetas");
            System.out.println("3 - Acessar Menu de Mochilas");
            System.out.println("0 - Encerrar o Programa");
            System.out.print("Escolha uma categoria: ");
            opcaoPrincipal = sc.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    menuEmbalagens(sc);
                    break;
                case 2:
                    menuCanetas(sc);
                    break;
                case 3:
                    menuMochilas(sc);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcaoPrincipal != 0);

        sc.close();
    }

    public static void menuEmbalagens(Scanner sc) {
        int opcao;
        do {
            System.out.println("\n--- MENU DE EMBALAGENS ---");
            System.out.println("1 - Caixa de papelão");
            System.out.println("2 - Sacola plástica");
            System.out.println("3 - Embalagem de vidro");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: System.out.println("Ideal para transporte e armazenamento"); break;
                case 2: System.out.println("Leve e prática, mas pouco sustentável"); break;
                case 3: System.out.println("Resistente e reutilizável"); break;
                case 0: break;
                default: System.out.println("Opção inválida"); break;
            }
        } while (opcao != 0);
    }

    public static void menuCanetas(Scanner sc) {
        int opcao;
        do {
            System.out.println("\n--- MENU DE CANETAS ---");
            System.out.println("1 - Caneta Esferográfica");
            System.out.println("2 - Caneta Gel");
            System.out.println("3 - Caneta Tinteiro");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: System.out.println("Econômica e de longa duração"); break;
                case 2: System.out.println("Tinta mais pigmentada e escrita suave"); break;
                case 3: System.out.println("Clássica e elegante, usada para caligrafia"); break;
                case 0: break;
                default: System.out.println("Opção inválida"); break;
            }
        } while (opcao != 0);
    }

    public static void menuMochilas(Scanner sc) {
        int opcao;
        do {
            System.out.println("\n--- MENU DE MOCHILAS ---");
            System.out.println("1 - Mochila Escolar");
            System.out.println("2 - Mochila de Viagem");
            System.out.println("3 - Mochila Esportiva");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: System.out.println("Compacta e ideal para estudantes"); break;
                case 2: System.out.println("Espaçosa, ideal para longas jornadas"); break;
                case 3: System.out.println("Leve, resistente e ergonômica"); break;
                case 0: break;
                default: System.out.println("Opção inválida"); break;
            }
        } while (opcao != 0);
    }
}