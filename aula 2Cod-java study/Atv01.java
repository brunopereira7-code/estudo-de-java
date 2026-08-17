
// import java.util.Scanner;

// public class Atv01 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.println("informe a cor");
//         String cor=sc.nextLine().toLowerCase();



//         if (cor.equals ("Verde")){
//             System.out.println("Valor 10");
//         }else if (cor.equals ("azul")) {
//             System.out.println("valor 20");
            
//         }else if (cor.equals ("amarelo")){
//             System.out.println("valor 30");
//         }else if (cor.equals ("vermelho")){
//             System.out.println("Valor 40");

//         }else{
//             System.out.printf("nao temos essas cor digite umas dessas:%nVerde%n azul%n amarelo%n e vermelho%n");
//         }
//         sc.close();
//     }
    
// }
import java.util.Scanner;

public class Atv01 {
    // Adicionamos 'throws Exception' para o Java permitir rodar o comando do terminal
    public static void main(String[] args) throws Exception {
        
        // 1. Limpa o terminal antes de pedir a cor
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Scanner sc = new Scanner(System.in);

        System.out.println("informe a cor");
        String cor = sc.nextLine().toLowerCase();

        // 2. Limpa o terminal novamente depois de pressionar Enter, para mostrar só a resposta
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        // Testes condicionais (todas as palavras em minúsculo!)
        if (cor.equals("verde")){
            System.out.println("Valor 10");
        } else if (cor.equals("azul")) {
            System.out.println("valor 20");
        } else if (cor.equals("amarelo")){
            System.out.println("valor 30");
        } else if (cor.equals("vermelho")){
            System.out.println("Valor 40");
        } else {
            System.out.printf("nao temos essa cor digite uma dessas:%nVerde%nazul%namarelo%n vermelho%n");
        }

        sc.close();
    }
}