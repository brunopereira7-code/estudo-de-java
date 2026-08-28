import java.util.Scanner;
public class Atvloja {





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidade = new int[5];

        int qtd = 0;
        int opcao;

        do {

            System.out.println("\n===== SISTEMA DA LOJA =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            // 1 - CADASTRAR
            if (opcao == 1) {

                if (qtd == 5) {
                    System.out.println("A loja já está cheia!");
                } else {

                    System.out.print("Digite o nome do produto: ");
                    produtos[qtd] = sc.nextLine();

                    System.out.print("Digite a quantidade em estoque: ");
                    quantidade[qtd] = sc.nextInt();
                    sc.nextLine();

                    qtd++;

                    System.out.println("Produto cadastrado com sucesso!");
                }

            // 2 - LISTAR
            } else if (opcao == 2) {

                if (qtd == 0) {
                    System.out.println("Nenhum produto cadastrado.");
                } else {

                    System.out.println("\n===== PRODUTOS =====");

                    for (int i = 0; i < qtd; i++) {
                        System.out.println(
                            "Índice: " + i +
                            " | Nome: " + produtos[i] +
                            " | Quantidade: " + quantidade[i]
                        );
                    }
                }

            // 3 - PESQUISAR
            } else if (opcao == 3) {

                System.out.print("Digite o nome do produto: ");
                String nomeBusca = sc.nextLine();

                boolean encontrado = false;

                for (int i = 0; i < qtd; i++) {

                    if (produtos[i].equalsIgnoreCase(nomeBusca)) {

                        System.out.println("Produto encontrado!");
                        System.out.println("Índice: " + i);
                        System.out.println("Nome: " + produtos[i]);
                        System.out.println("Quantidade: " + quantidade[i]);

                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Produto não encontrado.");
                }

            // 4 - ALTERAR
            } else if (opcao == 4) {

                System.out.print("Digite o nome do produto que deseja alterar: ");
                String nomeBusca = sc.nextLine();

                boolean encontrado = false;

                for (int i = 0; i < qtd; i++) {

                    if (produtos[i].equalsIgnoreCase(nomeBusca)) {

                        System.out.print("Digite o novo nome: ");
                        produtos[i] = sc.nextLine();

                        System.out.print("Digite a nova quantidade: ");
                        quantidade[i] = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Produto alterado com sucesso!");

                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Produto não encontrado.");
                }

            // 5 - REMOVER
            } else if (opcao == 5) {

                System.out.print("Digite o nome do produto que deseja remover: ");
                String nomeBusca = sc.nextLine();

                int indice = -1;

                // Procurando o produto
                for (int i = 0; i < qtd; i++) {

                    if (produtos[i].equalsIgnoreCase(nomeBusca)) {
                        indice = i;
                        break;
                    }
                }

                if (indice == -1) {

                    System.out.println("Produto não encontrado.");

                } else {

                    // Deslocando os elementos para a esquerda
                    for (int i = indice; i < qtd - 1; i++) {

                        produtos[i] = produtos[i + 1];
                        quantidade[i] = quantidade[i + 1];
                    }

                    // Limpando a última posição
                    produtos[qtd - 1] = null;
                    quantidade[qtd - 1] = 0;

                    qtd--;

                    System.out.println("Produto removido com sucesso!");
                }

            // 6 - SAIR
            } else if (opcao == 6) {

                System.out.println("Saindo do sistema...");

            } else {

                System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
// Java com Switch case-------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Atvloja {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidade = new int[5];

        int qtd = 0;
        int opcao;

        do {

            System.out.println("\n===== SISTEMA DA LOJA =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                // 1 - CADASTRAR
                case 1:

                    if (qtd == 5) {
                        System.out.println("A loja já está cheia!");
                    } else {

                        System.out.print("Digite o nome do produto: ");
                        produtos[qtd] = sc.nextLine();

                        System.out.print("Digite a quantidade em estoque: ");
                        quantidade[qtd] = sc.nextInt();
                        sc.nextLine();

                        qtd++;

                        System.out.println("Produto cadastrado com sucesso!");
                    }

                    break;

                // 2 - LISTAR
                case 2:

                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {

                        System.out.println("\n===== PRODUTOS =====");

                        for (int i = 0; i < qtd; i++) {

                            System.out.println(
                                "Índice: " + i +
                                " | Nome: " + produtos[i] +
                                " | Quantidade: " + quantidade[i]
                            );
                        }
                    }

                    break;

                // 3 - PESQUISAR
                case 3:

                    System.out.print("Digite o nome do produto: ");
                    String nomeBusca = sc.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < qtd; i++) {

                        if (produtos[i].equalsIgnoreCase(nomeBusca)) {

                            System.out.println("Produto encontrado!");
                            System.out.println("Índice: " + i);
                            System.out.println("Nome: " + produtos[i]);
                            System.out.println("Quantidade: " + quantidade[i]);

                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }

                    break;

                // 4 - ALTERAR
                case 4:

                    System.out.print("Digite o nome do produto que deseja alterar: ");
                    String nomeAlterar = sc.nextLine();

                    encontrado = false;

                    for (int i = 0; i < qtd; i++) {

                        if (produtos[i].equalsIgnoreCase(nomeAlterar)) {

                            System.out.print("Digite o novo nome: ");
                            produtos[i] = sc.nextLine();

                            System.out.print("Digite a nova quantidade: ");
                            quantidade[i] = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Produto alterado com sucesso!");

                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }

                    break;

                // 5 - REMOVER
                case 5:

                    System.out.print("Digite o nome do produto que deseja remover: ");
                    String nomeRemover = sc.nextLine();

                    int indice = -1;

                    // Procurando o produto
                    for (int i = 0; i < qtd; i++) {

                        if (produtos[i].equalsIgnoreCase(nomeRemover)) {

                            indice = i;
                            break;
                        }
                    }

                    if (indice == -1) {

                        System.out.println("Produto não encontrado.");

                    } else {

                        // Deslocando os elementos para a esquerda
                        for (int i = indice; i < qtd - 1; i++) {

                            produtos[i] = produtos[i + 1];
                            quantidade[i] = quantidade[i + 1];
                        }

                        // Limpando a última posição
                        produtos[qtd - 1] = null;
                        quantidade[qtd - 1] = 0;

                        qtd--;

                        System.out.println("Produto removido com sucesso!");
                    }

                    break;

                // 6 - SAIR
                case 6:

                    System.out.println("Saindo do sistema...");

                    break;

                // OPÇÃO INVÁLIDA
                default:

                    System.out.println("Opção inválida!");

                    break;
            }

        } while (opcao != 6);

        sc.close();
    }
}

