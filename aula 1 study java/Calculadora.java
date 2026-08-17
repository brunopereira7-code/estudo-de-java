
import java.util.Scanner;


public class Calculadora { 
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        System.out.println("informe o nome:");
        String nome=sc.nextLine();

        System.out.println("informe o N1:"); 
        double N1=sc.nextDouble();

        System.out.println("Informe o N2"); 
        double N2=sc.nextDouble();

        System.out.println("informe o N3");
        double N3=sc.nextDouble();

        double media=(N1+N2+N3)/3;
        double soma=N1+N2+N3;
        double subtracao=N1-N2-N3;
        double multiplicacao=N1*N2*N3;
        double divisao=N1/N2/N3;

        System.out.println("sua media é "+media);
        System.out.println("sua soma é"+soma);
        System.out.println("resultado da subtraçao"+subtracao);
        System.out.println("resultado da multiplicaçao"+multiplicacao);
        System.out.println("resultado da divisao"+divisao);



        System.out.println("ola"+nome+"sua media é:"+media); 
        sc.close();
    }

    
}
