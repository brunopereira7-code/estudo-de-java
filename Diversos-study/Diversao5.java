import java.util.Scanner;

public class atv05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            System.out.print("Digite outro número (ou um negativo para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}