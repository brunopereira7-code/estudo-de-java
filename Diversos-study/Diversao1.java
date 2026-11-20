
import java.util.Scanner;

public class Diversao1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero =sc.nextInt();

        if (numero<0){
            System.out.println("Número negativo.");
        }else if(numero==0){
            System.out.println("Número nulo.");
        }else{
            System.out.println("Número positivo.");
        }


    }
    
}
