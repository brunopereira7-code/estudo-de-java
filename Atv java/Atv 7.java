import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a cor do CD (Verde, Azul, Amarelo, Vermelho): ");
        String cor = sc.nextLine().toLowerCase();

        switch (cor) {
            case "verde":
                System.out.println("R$ 10,00");
                break;
            case "azul":
                System.out.println("R$ 20,00");
                break;
            case "amarelo":
                System.out.println("R$ 30,00");
                break;
            case "vermelho":
                System.out.println("R$ 40,00");
                break;
            default:
                System.out.println("Cor inválida");
        }

        sc.close();
    }
}