package Study_poo_codigo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CADASTRO INICIAL ===");
        System.out.print("Número da agência: ");
        int numAgencia = Integer.parseInt(sc.nextLine());

        System.out.print("Nome da agência: ");
        String nomeAgencia = sc.nextLine();

        System.out.print("Número da conta: ");
        int numConta = Integer.parseInt(sc.nextLine());

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = Double.parseDouble(sc.nextLine());

        // =========================================================================
        // COMO OS ARQUIVOS SÃO "TRAZIDOS":
        // Como Agencia.java está na mesma pasta, o Java reconhece a classe 'Agencia'.
        // O comando 'new' vai até o arquivo Agencia.java e roda o Construtor.
        Agencia agencia = new Agencia(numAgencia, nomeAgencia);
        
        // A mesma coisa acontece aqui. O Java vai no arquivo ContaCorrente.java,
        // que por sua vez vai no arquivo Conta.java (por causa da herança).
        // A variável 'agencia' criada acima é injetada dentro da conta.
        ContaCorrente conta = new ContaCorrente(numConta, titular, saldoInicial, agencia);
        // =========================================================================

        // Loop infinito para manter o menu rodando
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar com PIX");
            System.out.println("5 - Pagar com cartão");
            System.out.println("6 - Pagar em dinheiro");
            System.out.println("7 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 0) {
                System.out.println("Sistema encerrado.");
                break; // Quebra o while(true)
            }

            // Estrutura de decisão para chamar o método correto do objeto 'conta'
            switch (opcao) {
                case 1:
                    conta.mostrarDados(); // Herdado de Conta.java
                    break;
                case 2:
                    conta.consultarSaldo(); // Herdado de Conta.java
                    break;
                case 3:
                    System.out.print("Valor do depósito: ");
                    double vDep = Double.parseDouble(sc.nextLine());
                    conta.depositar(vDep); // Herdado de Conta.java
                    break;
                case 4:
                    System.out.print("Valor do pagamento PIX: ");
                    double vPix = Double.parseDouble(sc.nextLine());
                    System.out.print("Chave PIX: ");
                    String chave = sc.nextLine();
                    // Chama a versão do método pagar() com 2 parâmetros (String)
                    conta.pagar(vPix, chave); 
                    break;
                case 5:
                    System.out.print("Valor da compra: ");
                    double vCartao = Double.parseDouble(sc.nextLine());
                    System.out.print("Quantidade de parcelas: ");
                    int parcelas = Integer.parseInt(sc.nextLine());
                    // Chama a versão do método pagar() com 2 parâmetros (int)
                    conta.pagar(vCartao, parcelas); 
                    break;
                case 6:
                    System.out.print("Valor do pagamento em dinheiro: ");
                    double vDin = Double.parseDouble(sc.nextLine());
                    // Chama a versão original do método pagar() com 1 parâmetro (da Interface)
                    conta.pagar(vDin); 
                    break;
                case 7:
                    System.out.print("Conta de destino: ");
                    int dest = Integer.parseInt(sc.nextLine());
                    System.out.print("Valor: ");
                    double vTransf = Double.parseDouble(sc.nextLine());
                    conta.transferir(vTransf, dest); // Método exclusivo de ContaCorrente
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close(); // Fecha o leitor de teclado
    }
}