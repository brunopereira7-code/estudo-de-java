import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite o nome da pessoa: ");
        String nome=sc.nextLine();
        
        Cliente cliente=new Cliente(nome);
        cliente.mostrarDados();

        System.out.println("Digite o produto que deseja comprar: ");
        String produto=sc.nextLine();

        System.out.println("Digite a quantidade: ");
        int quantidade=sc.nextInt();

        System.out.println("Digite o valor do produto: ");
        double valor=sc.nextDouble();

        System.out.println("<<<<<Compras>>>");
        cliente.comprar(produto, quantidade, valor);
        System.out.println();
        
        cliente.comprar(produto,quantidade);

        double total=quantidade*valor;

        System.out.println("Pagamento");
        cliente.pagar(total);

        
        
        
        
        
        
        
        
        sc.close();
    }

    
}
