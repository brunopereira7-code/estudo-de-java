import java.util.Scanner;
public class Entrada {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("informe o nome:");
        String nome=sc.nextLine();

        System.out.println("informe o nota1:");
        double N1=sc.nextDouble();

        System.out.println("informe o nota2:");
        double N2=sc.nextDouble(); 
        
        double media=(N1+N2/2);
        System.out.println("ola "+nome+"sua media é "+media);
        
    sc.close();
    }
}
