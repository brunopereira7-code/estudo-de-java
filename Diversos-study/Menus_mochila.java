import java.util.Scanner;

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


    


