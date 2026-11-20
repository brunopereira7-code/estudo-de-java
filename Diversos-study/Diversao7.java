import java.util.Scanner;

public class Diversao7 {
    
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    System.out.println("Digite a cor (verde, azul, amarelo, vermelho): ");
    String operador=sc.nextLine();
    



    if (operador.equals("verde")){

        System.out.println("O preço é R$ 10,00");

    } else if ( operador.equals("azul")){
        System.out.println("O preço é R$ 20,00");

    }else if (operador.equals("amarelo")){
    System.out.println("O preço é R$ 30,00");

    }else if (operador.equals("vermelho")){
        System.out.println("O preço é R$ 40,00");

    }else{
        System.out.println( "Erro: cor  inválida!");
}

        
        sc.close();
    
        }
}
