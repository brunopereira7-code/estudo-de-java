
import java.util.Scanner;

public class Vet07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] nomes=new String[3]; 

        //Cadastrar 
        System.out.println("====Cadastro de nomes==="); 
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome: "); 
            nomes[i]=sc.nextLine(); 

        sc.close();
        }
        System.out.println("\nDigite a posiçao pra alterar:"); 
        int posAlterar=sc.nextInt();
        sc.nextLine(); 
        if (posAlterar>= 0 && posAlterar<nomes.length) {
            System.out.println("digite o novo nome: "); 
            nomes[posAlterar]=sc.nextLine();

            
        }else{
            System.out.println("posiçao invalida"); 

        }
        
        System.out.println("lista atualizada"); 
        listar(nomes);


        sc.close();

    }
    public static void listar(String[] array) { 
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+"-"+array[i]);
            
        }
        
    }
}
