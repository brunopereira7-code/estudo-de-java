import java.util.Scanner;

public class SweetFlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. DECLARAÇÃO DOS ARRAYS (Armários para guardar os dados)
        int[] numerosAvioes = new int[4];
        int[] assentosDisponiveis = new int[4];
        String[] nomesPassageiros = new String[20];
        int[] aviaoReserva = new int[20];

        // Variáveis para controlar quantos itens já foram cadastrados
        int qtdAvioesCadastrados = 0;
        int totalReservas = 0;

        while (true) {
            // Exibição do menu
            System.out.println("\n=========================================");
            System.out.println("      SWEET FLIGHT – SISTEMA DE RESERVAS");
            System.out.println("=========================================");
            System.out.println("1 - Cadastrar aviões");
            System.out.println("2 - Cadastrar quantidade de assentos");
            System.out.println("3 - Listar aviões");
            System.out.println("4 - Realizar reserva");
            System.out.println("5 - Consultar reservas de um avião");
            System.out.println("6 - Pesquisar passageiro");
            System.out.println("7 - Mostrar resumo");
            System.out.println("8 - Sair");
            System.out.print("\nEscolha uma opção: ");

            // Lemos a opção como texto e convertemos para número para evitar o "bug" do nextInt()
            int opcao;
            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcao = 0; // Se o usuário digitar letra em vez de número
            }

            // Validação do menu
            if (opcao < 1 || opcao > 8) {
                System.out.println("Opção inválida!");
                continue; // Volta para o início do while
            }

            if (opcao == 8) {
                System.out.println("Sistema encerrado. Até logo!");
                break; // Encerra o loop e o programa
            }

            switch (opcao) {
                case 1:
                    // CADASTRAR AVIÕES
                    int qtd = 0;
                    while (qtd < 1 || qtd > 4) {
                        System.out.print("Quantos aviões deseja cadastrar (1 a 4)? ");
                        qtd = Integer.parseInt(sc.nextLine());
                    }
                    
                    qtdAvioesCadastrados = qtd; // Salvamos quantos aviões o sistema vai gerenciar

                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        boolean repetido;
                        int numeroAviao;
                        do {
                            repetido = false;
                            System.out.print("Digite o número do avião " + (i + 1) + ": ");
                            numeroAviao = Integer.parseInt(sc.nextLine());
                            
                            // Verifica se já existe um avião com esse número nos anteriores
                            for (int j = 0; j < i; j++) {
                                if (numerosAvioes[j] == numeroAviao) {
                                    System.out.println("Este número já existe! Tente outro.");
                                    repetido = true;
                                    break;
                                }
                            }
                        } while (repetido);
                        
                        numerosAvioes[i] = numeroAviao; // Salva no array
                    }
                    System.out.println("Aviões cadastrados com sucesso!");
                    break;

                case 2:
                    // CADASTRAR ASSENTOS
                    if (qtdAvioesCadastrados == 0) {
                        System.out.println("Nenhum avião cadastrado ainda.");
                        break;
                    }

                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        int assentos = -1;
                        while (assentos < 0 || assentos > 20) {
                            System.out.print("Quantos assentos para o avião " + numerosAvioes[i] + " (0 a 20)? ");
                            assentos = Integer.parseInt(sc.nextLine());
                        }
                        assentosDisponiveis[i] = assentos; // Salva os assentos
                    }
                    System.out.println("Assentos cadastrados com sucesso!");
                    break;

                case 3:
                    // LISTAR AVIÕES
                    if (qtdAvioesCadastrados == 0) {
                        System.out.println("Nenhum avião cadastrado.");
                    } else {
                        for (int i = 0; i < qtdAvioesCadastrados; i++) {
                            System.out.println("Avião: " + numerosAvioes[i] + " | Assentos disponíveis: " + assentosDisponiveis[i]);
                        }
                    }
                    break;

                case 4:
                    // REALIZAR RESERVA
                    if (totalReservas >= 20) {
                        System.out.println("Limite máximo de reservas atingido!");
                        break;
                    }

                    System.out.print("Informe o número do avião desejado: ");
                    int aviaoDesejado = Integer.parseInt(sc.nextLine());

                    int indiceAviao = -1;
                    // Procurando o avião no array
                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        if (numerosAvioes[i] == aviaoDesejado) {
                            indiceAviao = i;
                            break;
                        }
                    }

                    if (indiceAviao == -1) {
                        System.out.println("Este avião não existe!");
                    } else if (assentosDisponiveis[indiceAviao] <= 0) {
                        System.out.println("Não há assentos disponíveis para este avião!");
                    } else {
                        String nomePassageiro = "";
                        while (nomePassageiro.trim().isEmpty()) {
                            System.out.print("Digite o nome do passageiro: ");
                            nomePassageiro = sc.nextLine();
                        }

                        // Salvando a reserva nos arrays de reservas
                        nomesPassageiros[totalReservas] = nomePassageiro;
                        aviaoReserva[totalReservas] = aviaoDesejado;
                        
                        // Modificando os dados
                        assentosDisponiveis[indiceAviao]--;
                        totalReservas++;
                        
                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;

                case 5:
                    // CONSULTAR RESERVAS DE UM AVIÃO
                    System.out.print("Informe o número do avião: ");
                    int numAviaoConsulta = Integer.parseInt(sc.nextLine());

                    // Verifica se o avião existe
                    boolean aviaoExiste = false;
                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        if (numerosAvioes[i] == numAviaoConsulta) {
                            aviaoExiste = true;
                            break;
                        }
                    }

                    if (!aviaoExiste) {
                        System.out.println("Este avião não existe!");
                    } else {
                        boolean encontrouReserva = false;
                        for (int i = 0; i < totalReservas; i++) {
                            if (aviaoReserva[i] == numAviaoConsulta) {
                                System.out.println("- " + nomesPassageiros[i]);
                                encontrouReserva = true;
                            }
                        }
                        if (!encontrouReserva) {
                            System.out.println("Não há reservas realizadas para este avião!");
                        }
                    }
                    break;

                case 6:
                    // PESQUISAR PASSAGEIRO
                    System.out.print("Digite o nome do passageiro: ");
                    String nomeBusca = sc.nextLine();

                    boolean passageiroEncontrado = false;
                    for (int i = 0; i < totalReservas; i++) {
                        // equalsIgnoreCase ignora maiúsculas e minúsculas
                        if (nomesPassageiros[i].equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Reserva encontrada no avião: " + aviaoReserva[i]);
                            passageiroEncontrado = true;
                        }
                    }

                    if (!passageiroEncontrado) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;

                case 7:
                    // MOSTRAR RESUMO
                    int assentosTotais = 0;
                    int avioesComAssento = 0;
                    int avioesSemAssento = 0;
                    int maiorQtdAssentos = -1;
                    int aviaoMaiorAssento = -1;

                    for (int i = 0; i < qtdAvioesCadastrados; i++) {
                        assentosTotais += assentosDisponiveis[i];

                        if (assentosDisponiveis[i] > 0) {
                            avioesComAssento++;
                        } else {
                            avioesSemAssento++;
                        }

                        if (assentosDisponiveis[i] > maiorQtdAssentos) {
                            maiorQtdAssentos = assentosDisponiveis[i];
                            aviaoMaiorAssento = numerosAvioes[i];
                        }
                    }

                    System.out.println("\n--- RESUMO ---");
                    System.out.println("Aviões cadastrados: " + qtdAvioesCadastrados);
                    System.out.println("Total de reservas realizadas: " + totalReservas);
                    System.out.println("Total de assentos disponíveis: " + assentosTotais);
                    System.out.println("Aviões com assentos disponíveis: " + avioesComAssento);
                    System.out.println("Aviões sem assentos disponíveis: " + avioesSemAssento);
                    if (qtdAvioesCadastrados > 0) {
                        System.out.println("Avião com maior quantidade de assentos: " + aviaoMaiorAssento + " (" + maiorQtdAssentos + " assentos)");
                    }
                    break;
            }
        }
        sc.close(); // Fecha o Scanner apenas UMA vez, fora do loop (quando encerra)
    }
}