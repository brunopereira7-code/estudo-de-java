
import java.util.Scanner;

public class Why05 { 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int op=0; 
        while (op!=5)  { 
            System.out.println("\n===Menu==="); 
            
            System.out.println("1 cadastro");
            System.out.println("2 LIstar");
            System.out.println("3 Alterar");
            System.out.println("4 Remover"); 
            System.out.println("5 Sair"); 
            System.out.println("Escolha a opçao"); 
            op=sc.nextInt(); 




            switch (op) {
                case 1:
                    System.out.println("Cadastrar"); 
                    break;
                case 2:
                    System.out.println("Cadastrar"); 
                    break;
                case 3:
                    System.out.println("Cadastrar"); 
                    break;
                case 4:
                    System.out.println("Saindo"); 
                    break;
            
                default:
                    System.out.println("opçao invalida");
                    break;
            }

            
        }



        sc.close();
    }
    
}
