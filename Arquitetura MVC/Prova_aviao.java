import java.util.Scanner;

public class SweetFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays solicitados para armazenar os dados
        int[] numerosAvioes = new int[4];
        int[] assentosDisponiveis = new int[4];
        String[] nomesPassageiros = new String[20];
        int[] avioesReservados = new int[20];

        // Variáveis de controle
        int qtdAvioes = 0;
        int totalReservas = 0;
        boolean assentosCadastrados = false; // Garante que a opção 2 foi executada

        int opcao = 0;

        // Loop principal do menu
        while (opcao != 8) {
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

            // Tratamento para evitar erro caso o usuário digite texto no menu
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                scanner.next(); // Limpa a entrada inválida
                opcao = 0; 
            }

            if (opcao == 1) {
                // 1 - CADASTRAR AVIÕES
                System.out.print("Quantos aviões deseja cadastrar? (Máximo 4): ");
                int qtd = scanner.nextInt();

                // Validação utilizando while
                while (qtd < 1 || qtd > 4) {
                    System.out.print("Quantidade inválida! Informe um valor entre 1 e 4: ");
                    qtd = scanner.nextInt();
                }

                qtdAvioes = qtd;
                assentosCadastrados = false; // Reseta caso um novo cadastro seja feito
                totalReservas = 0; // Zera as reservas anteriores

                // Solicitando o número de cada avião utilizando for
                for (int i = 0; i < qtdAvioes; i++) {
                    System.out.print("Informe o número do " + (i + 1) + "º avião: ");
                    boolean repetido;
                    
                    do {
                        repetido = false;
                        numerosAvioes[i] = scanner.nextInt();
                        
                        // Sistema não permite dois aviões com mesmo número
                        for (int j = 0; j < i; j++) {
                            if (numerosAvioes[j] == numerosAvioes[i]) {
                                System.out.print("Este número já está cadastrado! Informe outro: ");
                                repetido = true;
                                break;
                            }
                        }
                    } while (repetido);
                }
                System.out.println("Aviões cadastrados com sucesso!");

            } else if (opcao == 2) {
                // 2 - CADASTRAR QUANTIDADE DE ASSENTOS
                if (qtdAvioes == 0) {
                    System.out.println("Nenhum avião cadastrado ainda!");
                } else {
                    for (int i = 0; i < qtdAvioes; i++) {
                        System.out.print("Quantidade de assentos para o avião " + numerosAvioes[i] + " (0 a 20): ");
                        int assentos = scanner.nextInt();

                        // Validação com while
                        while (assentos < 0 || assentos > 20) {
                            System.out.print("Quantidade inválida! Informe entre 0 e 20: ");
                            assentos = scanner.nextInt();
                        }
                        assentosDisponiveis[i] = assentos;
                    }
                    assentosCadastrados = true;
                    System.out.println("Assentos cadastrados com sucesso!");
                }

            } else if (opcao == 3) {
                // 3 - LISTAR AVIÕES
                if (qtdAvioes == 0) {
                    System.out.println("Nenhum avião cadastrado.");
                } else {
                    for (int i = 0; i < qtdAvioes; i++) {
                        int assentos = assentosCadastrados ? assentosDisponiveis[i] : 0;
                        System.out.println("Avião: " + numerosAvioes[i] + " | Assentos disponíveis: " + assentos);
                    }
                }

            } else if (opcao == 4) {
                // 4 - REALIZAR RESERVA
                if (qtdAvioes == 0 || !assentosCadastrados) {
                    System.out.println("Certifique-se de cadastrar os aviões e os assentos primeiro!");
                } else if (totalReservas >= 20) {
                    System.out.println("O limite máximo de 20 reservas foi atingido!");
                } else {
                    System.out.print("Informe o número do avião desejado: ");
                    int numDesejado = scanner.nextInt();

                    int indiceAviao = -1;
                    
                    // Percorre o array para verificar se o avião existe
                    for (int i = 0; i < qtdAvioes; i++) {
                        if (numerosAvioes[i] == numDesejado) {
                            indiceAviao = i;
                            break;
                        }
                    }

                    if (indiceAviao == -1) {
                        System.out.println("Este avião não existe!");
                    } else if (assentosDisponiveis[indiceAviao] == 0) {
                        System.out.println("Não há assentos disponíveis para este avião!");
                    } else {
                        scanner.nextLine(); // Limpa o buffer do teclado
                        System.out.print("Informe o nome do passageiro: ");
                        String nome = scanner.nextLine();

                        // Nome não pode ficar vazio
                        while (nome.trim().isEmpty()) {
                            System.out.print("Nome não pode ficar vazio! Informe novamente: ");
                            nome = scanner.nextLine();
                        }

                        // Armazena dados da reserva e atualiza os totais
                        nomesPassageiros[totalReservas] = nome;
                        avioesReservados[totalReservas] = numDesejado;
                        assentosDisponiveis[indiceAviao]--; // Diminui 1 assento disponível
                        totalReservas++; // Aumenta 1 no total de reservas

                        System.out.println("Reserva realizada com sucesso!");
                    }
                }

            } else if (opcao == 5) {
                // 5 - CONSULTAR RESERVAS DE UM AVIÃO
                System.out.print("Informe o número do avião: ");
                int numAviao = scanner.nextInt();

                boolean aviaoExiste = false;
                for (int i = 0; i < qtdAvioes; i++) {
                    if (numerosAvioes[i] == numAviao) {
                        aviaoExiste = true;
                        break;
                    }
                }

                if (!aviaoExiste) {
                    System.out.println("Este avião não existe!");
                } else {
                    boolean achouReserva = false;
                    for (int i = 0; i < totalReservas; i++) {
                        if (avioesReservados[i] == numAviao) {
                            System.out.println("- " + nomesPassageiros[i]);
                            achouReserva = true;
                        }
                    }
                    if (!achouReserva) {
                        System.out.println("Não há reservas realizadas para este avião!");
                    }
                }

            } else if (opcao == 6) {
                // 6 - PESQUISAR PASSAGEIRO
                scanner.nextLine(); // Limpa o buffer do teclado
                System.out.print("Informe o nome do passageiro: ");
                String nomeBusca = scanner.nextLine();

                boolean achouPassageiro = false;
                for (int i = 0; i < totalReservas; i++) {
                    // equalsIgnoreCase ignora maiúsculas e minúsculas
                    if (nomesPassageiros[i].equalsIgnoreCase(nomeBusca)) {
                        System.out.println("Passageiro(a) possui reserva no Avião: " + avioesReservados[i]);
                        achouPassageiro = true;
                    }
                }

                if (!achouPassageiro) {
                    System.out.println("Não há reservas realizadas para este passageiro!");
                }

            } else if (opcao == 7) {
                // 7 - MOSTRAR RESUMO
                int totalAssentos = 0;
                int qtdComAssentos = 0;
                int qtdSemAssentos = 0;
                int maiorQtd = -1;
                int aviaoComMaiorQtd = -1;

                for (int i = 0; i < qtdAvioes; i++) {
                    int assentos = assentosCadastrados ? assentosDisponiveis[i] : 0;
                    totalAssentos += assentos;

                    if (assentos > 0) {
                        qtdComAssentos++;
                    } else {
                        qtdSemAssentos++;
                    }

                    if (assentos > maiorQtd) {
                        maiorQtd = assentos;
                        aviaoComMaiorQtd = numerosAvioes[i];
                    }
                }

                System.out.println("\n--- RESUMO DO SISTEMA ---");
                System.out.println("- Quantidade de aviões cadastrados: " + qtdAvioes);
                System.out.println("- Quantidade total de reservas realizadas: " + totalReservas);
                System.out.println("- Quantidade total de assentos disponíveis: " + totalAssentos);
                System.out.println("- Aviões com assentos disponíveis: " + qtdComAssentos);
                System.out.println("- Aviões sem assentos disponíveis: " + qtdSemAssentos);
                
                if (qtdAvioes > 0 && assentosCadastrados) {
                    System.out.println("- Avião com maior quantidade de assentos disponíveis: " + aviaoComMaiorQtd + " (" + maiorQtd + " assentos)");
                } else {
                    System.out.println("- Avião com maior quantidade de assentos disponíveis: N/A");
                }

            } else if (opcao == 8) {
                // 8 - SAIR
                System.out.println("Sistema encerrado. Até logo!");
            } else {
                // VALIDAÇÃO DO MENU (Opção inválida)
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
