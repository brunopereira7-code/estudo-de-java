package br.com.api.produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.modelo.RespostaModelo;
import br.com.api.produtos.repositorio.ProdutoRepositorio;

@Service // Indica que esta classe contém as regras de negócio da aplicação
public class ProdutoServico {

    @Autowired // Injeção de dependência: o Spring instancia o repositório automaticamente
    private ProdutoRepositorio pr;

    @Autowired
    private RespostaModelo rm;

    // Método para listar todos os produtos
    public Iterable<ProdutoModelo> listar() {
        return pr.findAll(); // Busca todos os registros da tabela produtos
    }

    // Método para cadastrar ou alterar produtos
    // ResponseEntity<?> permite retornar tanto um ProdutoModelo quanto uma RespostaModelo (erro)
    public ResponseEntity<?> cadastrarAlterar(ProdutoModelo pm, String acao) {
        
        // Validação: verifica se o nome está vazio
        if (pm.getNome() == null || pm.getNome().equals("")) {
            rm.setMensagem("O nome do produto é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST); // Retorna erro 400
        } 
        // Validação: verifica se a marca está vazia
        else if (pm.getMarca() == null || pm.getMarca().equals("")) {
            rm.setMensagem("O nome da marca é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST); // Retorna erro 400
        } 
        // Se passou nas validações, salva no banco
        else {
            if (acao.equals("cadastrar")) {
                return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.CREATED); // Retorna status 201 (Criado)
            } else {
                return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.OK); // Retorna status 200 (OK)
            }
        }
    }

    // Método para remover produtos pelo código (ID)
    public ResponseEntity<RespostaModelo> remover(Long codigo) {
        pr.deleteById(codigo); // Deleta do banco
        rm.setMensagem("O produto foi removido com sucesso!");
        return new ResponseEntity<RespostaModelo>(rm, HttpStatus.OK);
    }
}