import java.util.Scanner;
public class Atv2 {
    public class RepeticaoFrase {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Nunca mais vou fazer bagunça");
        }
    }
}


public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        } while (numero >= 0);

        sc.close();
    }
}


public class ProfessorSenai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        do {
            System.out.print("Digite o nome do professor mais fofo do senai: ");
            nome = sc.nextLine();
        } while (!nome.equalsIgnoreCase("Anderson"));

        sc.close();
    }
}




}