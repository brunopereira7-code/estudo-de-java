import java.util.Scanner;

public class Cond05 {
    public class Cond03 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Imformar o nome: ");
        String nome=sc.nextLine();

        System.out.println("Informe a senha: ");
        String senha=sc.nextLine();

        if (nome.equals("Lucas") && senha.equals("1234")){
            System.out.println("Acesso autorizado.");
        }else if (nome.equals("Gui") && senha.equals("5678")){
            System.out.println("Acesso com supervisão, autorizado");
        }else{
            System.out.println("Acesso negado.");
        }

        
        sc.close();
        }
    }
    
}
