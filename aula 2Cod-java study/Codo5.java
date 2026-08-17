import java.util.Scanner;

public class Codo5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("informe o nome:"); 
        String nome=sc.nextLine();

        System.out.println("informe a senha"); 
        String senha=sc.nextLine();

        if(nome.equals("ana")&& senha.equals("12345")){
            System.out.println("login realizado com sucesso"); 
        }else if(nome.equals("maria")&& senha.equals("5678")){

        }else{
            System.out.println("dados incorretos"); 

        }
        sc.close();
    }    
}
