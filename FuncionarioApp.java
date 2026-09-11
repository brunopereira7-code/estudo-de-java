import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Professor professor = null;
        Tecnico tecnico = null;

        int opcao;

        do {
            System.out.println("===== SISTEMA DE FUNCIONÁRIOS =====");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Técnico");
            System.out.println("3 - Exibir Professor");
            System.out.println("4 - Exibir Técnico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeProfessor = scanner.nextLine();

                    System.out.print("Salário: ");
                    double salarioProfessor = scanner.nextDouble();
                    scanner.nextLine();
                
                    System.out.print("Disciplina: ");
                    String disciplina = scanner.nextLine();

                    professor = new Professor(nomeProfessor, salarioProfessor, disciplina);

                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeTecnico = scanner.nextLine();

                    System.out.print("Salário: ");
                    double salarioTecnico = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Setor: ");
                    String setor = scanner.nextLine();

                    tecnico = new Tecnico(nomeTecnico, salarioTecnico, setor);

                    System.out.println("Técnico cadastrado com sucesso!");
                    break;

                case 3:
                    if (professor != null) {
                        professor.exibirInfo();
                    } else {
                        System.out.println("Nenhum professor cadastrado.");
                    }
                    break;

                case 4:
                    if (tecnico != null) {
                        tecnico.exibirInfo();
                    } else {
                        System.out.println("Nenhum técnico cadastrado.");
                    }
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();

        } while (opcao != 0);

        scanner.close();
    }
}

