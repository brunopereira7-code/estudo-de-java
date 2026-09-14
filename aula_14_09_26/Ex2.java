
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        System.out.println("Números Cadastrados:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Digite um número que deswja remover da lista:");
        int numeroRemover = sc.nextInt();

        numeros.remove(Integer.valueOf(numeroRemover));
        System.out.println("Lista após remoção:");
        
        for (Integer numero : numeros) {
            System.out.println(numero);
























    }



















    
}
