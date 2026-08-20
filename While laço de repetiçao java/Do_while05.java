// import java.util.Scanner;

// public class Do_while05 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int op;

//         do { 
//             System.out.println("\n--- MENU DE OPÇÕES ---");
//             System.out.println("1 - Iniciar o jogo"); 
//             System.out.println("2 - Opções"); 
//             System.out.println("0 - Sair"); 
//             System.out.print("Escolha uma opção: ");
            
//             // Lendo a opção digitada pelo usuário
//             op = sc.nextInt();
            
//             // Pequena lógica para responder à escolha
//             if (op == 1) {
//                 System.out.println("Carregando o jogo...");
//             } else if (op == 2) {
//                 System.out.println("Abrindo configurações...");
//             } else if (op != 0) {
//                 System.out.println("Opção inválida, tente de novo.");
//             }

//         // Condição de parada: repete ENQUANTO o usuário não digitar 0
//         } while (op != 0); 
        
//         System.out.println("Programa encerrado.");
//         sc.close();
//     }
// } 

import java.util.Scanner;

public class Do_while05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do { 
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1 - Iniciar o jogo"); 
            System.out.println("2 - Opções"); 
            System.out.println("0 - Sair"); 
            System.out.print("Escolha uma opção: ");
            
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Carregando o jogo...");
                    break;
                case 2:
                    System.out.println("Abrindo configurações...");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida, tente de novo.");
                    break;
            }

        } while (op != 0); 
        
        sc.close();
    }
}