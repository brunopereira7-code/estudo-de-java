import java.util.Scanner;

public class Cond02 {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Imformar a nota do aluno: ");
        double nota=sc.nextDouble();
        
        System.out.println("Imformar a frequência do aluno: ");
        double frequência=sc.nextDouble();

        if(nota>=7 && frequência>=25){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

        sc.close();
}
}
