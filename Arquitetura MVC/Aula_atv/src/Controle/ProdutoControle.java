package Controle;
import dao.ProdutoDAO;
import modelo.Produto;
import java.util.List;

public class ProdutoControle {
    private ProdutoDAO produtoDAO;

    public ProdutoControle() {
        this.produtoDAO = new ProdutoDAO();
    }

    public void adicionarProduto(int id, String nome, String cat, double preco, int qtd) {
        Produto p = new Produto(id, nome, cat, preco, qtd);
        produtoDAO.salvar(p);
    }

    public List<Produto> buscarTodos() {
        return produtoDAO.listarTodos();
    }

    public void alterarProduto(int id, String nome, String cat, double preco, int qtd) {
        Produto p = new Produto(id, nome, cat, preco, qtd);
        produtoDAO.atualizar(p);
    }

    public void deletarProduto(int id) {
        produtoDAO.remover(id);
    }

    public Produto pesquisarProduto(int id) {
        return produtoDAO.pesquisarPorId(id);
    }
}