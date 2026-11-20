import java.util.Scanner;

public class Menus_caneta {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1- Caneta esferográfica");
            System.out.println("2- Caneta de gel");
            System.out.println("3- Caneta tinteiro");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\nCaneta esferográfica: Econômica e de longa duração.\n");
                    break;
                    
                    case 2:
                        System.out.println("\nCaneta de gel: Tinta mais pigmentada e escrita suave.\n");
                        break;
                        
                        case 3:
                            System.out.println("\nCaneta tinteiro: Clássica e elegante, Usada para caligrafia.\n");
                            break;
                            
                            case 4:
                                System.out.println("\nSaindo do menu...\n");
                                break;
                                
                                
                                default:
                                    System.out.println("Opção inválida!\n");
                                    break;
                                }
                            }while (op!= 4);
                            }
                            }


    


