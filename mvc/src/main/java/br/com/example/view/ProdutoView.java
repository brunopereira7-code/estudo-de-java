package br.com.example.view;

import java.util.ArrayList;
import java.util.Scanner;
import br.com.example.controle.ProdutoControle;
import br.com.example.modelo.Produto;

public class ProdutoView {

    private Scanner sc = new Scanner(System.in);
    private ProdutoControle produtoControle = new ProdutoControle();

    public void menu() {
        int opcao;

        do {
            System.out.println("\n===== MENU DE PRODUTOS =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Alterar");
            System.out.println("5 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: cadastrar(); break;
                case 2: listar(); break;
                case 3: buscar(); break;
                case 4: alterar(); break;
                case 5: remover(); break;
                case 0: System.out.println("sistema encerrado"); break;
                default: System.out.println("Opção inválida"); break;
            }
        } while (opcao != 0);

        sc.close();
    }

    private void cadastrar() {
        System.out.println("\n---CADASTRO---");
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine();

        if (produtoControle.cadastrar(codigo, nome, preco)) {
            System.out.println("Produto cadastrado com sucesso!");
        } else {
            System.out.println("Não foi possível cadastrar.");
        }
    }
    private void listar() {
        System.out.println("---PRODUTOS---");
        ArrayList<Produto> produtos = produtoControle.listar();

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado");
        } else {
            for (Produto produto : produtos) {
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("--------------------------------");
            }
        }
    }

    public void buscar(){
        System.out.println("digite o codigo:");
        int codigo=sc.nextInt();
        Produto produto=produtoControle.buscar(codigo);

        if (produto !=null) { 
            System.out.println("Codigo"+produto.getCodigo());

            
        }
    }
    public void alterar(){
        System.out.println("Codigo de produto:");
        int codigo=sc.nextInt();
        sc.nextLine(); 
        Produto produto=produtoControle.buscar(codigo);

        if(produto==null){
            System.out.println("produto nao encontrado"); 
            return;
        }

        System.out.println("novo nome:"); 
        String nome=sc.nextLine();
        System.out.println("Novo preço"); 
        double preco=sc.nextDouble();

        if (produtoControle.alterar(codigo,nome,preco)){
            System.out.println("Produto alterado com sucesso"); 

        }else{
            System.out.println("Nao foi possivel alterar"); 


        }
    }

   
public void remover() {

    System.out.println("\n===== REMOVER PRODUTO =====");

    System.out.print("Digite o ID do produto que deseja remover: ");
    int id = sc.nextInt();
    sc.nextLine();

    boolean removido = produtoControle.remover(id);

    if (removido) {
        System.out.println("Produto removido com sucesso!");
    } else {
        System.out.println("Produto não encontrado ou não foi possível remover.");
    }
}





}