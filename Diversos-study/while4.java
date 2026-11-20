import java.util.Scanner;

public class while4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha ="";
        
        while(!senha.equals("1234")){
            System.out.println("Imforme a senha: ");
            senha=sc.nextLine();
            
        }
        System.out.println("Acesso permitido.");
        sc.close();
    }
    
}

