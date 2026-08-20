import java.util.Scanner;
public class Atv3 {

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


public class Menus_embalagem {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("MENU DE EMBALAGEM");
            System.out.println("1- CAIXA DE PAPELÃO");
            System.out.println("2- SACOLA DE PLASTICA");
            System.out.println("3- EMBOLAGEM DE VIDRO");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\nIdeal para transportar e armazenamento.\n");
                    break;
                    
                    case 2:
                        System.out.println("\nLeve e prática, mas pouco sustentável.\n");
                        break;
                        
                        case 3:
                            System.out.println("\nResistente e reutilizável.\n");
                            break;
                            
                            case 4:
                                System.out.println("\nSAIR\n");
                                break;
                        
                                
                                default:
                                    System.out.println("Opção inválida!\n");
                                    break;
                                }
                            }while (op!= 4);
                            }
                            }



public class Menus_mochila {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1- Mochila escolar");
            System.out.println("2- Mochila Esportiva");
            System.out.println("3- Mochila de viagem");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\nMochila escolar: Compacta e ideal para estudantes.\n");
                    break;
                    
                    case 2:
                        System.out.println("\nMochila esportiva: Leve, Resistente e ergonômica.\n");
                        break;
                        
                        case 3:
                            System.out.println("\n Mochila de viagem: Espaçosa, ideal para longas jornadas..\n");
                            break;
                            
                            case 4:
                                System.out.println("\nSaindo do Menu...\n");
                                break;
                                
                                
                                default:
                                    System.out.println("Opção inválida!\n");
                                    break;
                                }
                            }while (op!= 4);
                            }
                            }


    



    



    



}
