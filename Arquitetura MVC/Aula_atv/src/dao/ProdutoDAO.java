package dao;
import modelo.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private static List<Produto> bancoDeDados = new ArrayList<>();

    public void salvar(Produto produto) {
        bancoDeDados.add(produto);
    }

    public List<Produto> listarTodos() {
        return bancoDeDados;
    }

    public void atualizar(Produto produtoAtualizado) {
        for (int i = 0; i < bancoDeDados.size(); i++) {
            if (bancoDeDados.get(i).getId() == produtoAtualizado.getId()) {
                bancoDeDados.set(i, produtoAtualizado);
                break;
            }
        }
    }

    public void remover(int id) {
        bancoDeDados.removeIf(p -> p.getId() == id);
    }

    public Produto pesquisarPorId(int id) {
        for (Produto p : bancoDeDados) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}