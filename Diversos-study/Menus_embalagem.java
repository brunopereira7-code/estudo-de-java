import java.util.Scanner;

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


    


