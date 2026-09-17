import java.util.Scanner;

public class PagamentoApp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 

        System.out.println("Digite o valor a ser pago: ");
        double valor =sc.nextDouble(); 

        Pix pix=new Pix();
        pix.pagar(valor);

        

        sc.close();
    }  
}
