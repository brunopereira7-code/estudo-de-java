import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para a tabuada: ");
                    int numTabuada = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numTabuada + " x " + i + " = " + (numTabuada * i));
                    }
                    break;
                case 2:
                    System.out.print("Digite o número inicial da contagem: ");
                    int numContagem = sc.nextInt();
                    for (int i = numContagem; i >= 0; i--) {
                        System.out.println(i);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}