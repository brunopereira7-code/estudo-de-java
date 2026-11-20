import java.util.Scanner;

public class Formatacao {
    
    public static void main(String[] args) {
    
        System.out.print("Olá ");
        System.out.print("Turma!");

        System.out.println();

        System.out.println("Aprendendo Java");
        System.out.println("Formatação de saída");

        // String nome = "Carlos";
        // int idade = 18;

        // System.out.printf("Nome: %s | Idade: %d", nome, idade);



        double preco = 12.5;

        System.out.printf("Preço: R$ %.2f", preco);
        double media = 8.4567;

    System.out.printf("Média: %.1f%n", media);
    System.out.printf("Média: %.2f%n", media);
    System.out.printf("Média: %.3f%n", media);


//     String aluno = "Mariana";
//     int idade = 17;
//     double nota = 8.75;

//     System.out.printf(
//     "Aluno: %s | Idade: %d | Nota: %.2f",
//     aluno, idade, nota
// );



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
