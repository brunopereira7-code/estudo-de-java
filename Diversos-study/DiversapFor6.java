import java.util.Scanner;

public class DiversapFor6 {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1- Calcular tabuada");
            System.out.println("2- Contagem regressiva");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Informe o número: ");
                    int numero=sc.nextInt();
                    System.out.println("===Tabuada===");
                    for (int i=1;i<=10;i++){
                    System.out.println(numero+" x "+i+" = "+(numero*i));
}
                    break;
                    
                    case 2:
                        for (int i=10;i>=1;i--){
                        System.out.println("Número:"+i);
}
                        break;
} sc.close();
                            }while (op!= 3);
                            }
                            }
