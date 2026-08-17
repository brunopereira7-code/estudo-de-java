
import java.util.Scanner;

public class Cod02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("informe a nota do aluno:");
        double nota=sc.nextDouble();


        System.out.println("informe a frequencia do aluno:");
        double frequencia=sc.nextDouble();

        if (nota>=7 && frequencia>=75){
            System.out.println("ap");
        }else{
            System.out.println("rep");
        }
    
        sc.close();
    }
    
}
