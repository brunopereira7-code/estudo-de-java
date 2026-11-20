import java.util.Scanner;

public class Do_while4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha ="";

        do {
            System.out.println("Imforme a senha: ");
            senha=sc.nextLine();

        }while(!senha.equals("1234"));
            System.out.println("Acesso permitido.");
                    
            sc.close();
    }
    }
    

