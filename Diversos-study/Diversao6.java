import java.util.Scanner;

public class atv06 {
    public atv06 (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";

        while (!nome.equalsIgnoreCase("Anderson")) {
            System.out.print("Digite o nome do professor mais fofo do SENAI: ");
            nome = scanner.nextLine();
        }

        System.out.println("Resposta correta!");
        scanner.close();
    }
}