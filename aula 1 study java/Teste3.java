import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Digite sua nota: ");
        double nota = teclado.nextDouble();

        System.out.printf(
            "%nAluno: %s%nIdade: %d anos%nNota: %.2f%n",
            nome, idade, nota
        );
}
}