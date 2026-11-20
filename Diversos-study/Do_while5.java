import java.util.Scanner;

public class Do_while5 {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1-iniciar jogo");
            System.out.println("2-carregar jogo");
            System.out.println("3-configuracao jogo");
            System.out.println("4-sair");
            System.out.println("Escolha uma opcao: ");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\nIniciando jogo...\n");
                    break;
                    
                    case 2:
                        System.out.println("\nCarregando jogo...\n");
                        break;
                        
                        case 3:
                            System.out.println("\nAbrindo configurações...\n");
                            break;
                            
                            case 4:
                                System.out.println("\nSaindo do jogo...\n");
                                break;
                                
                                
                                default:
                                    System.out.println("Opção inválida!\n");
                                    break;
                                }
                            }while (op!= 4);
                            }
                            }


    


