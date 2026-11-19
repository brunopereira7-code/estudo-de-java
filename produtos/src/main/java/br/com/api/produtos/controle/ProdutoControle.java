package br.com.api.produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.modelo.ProdutoModelo;
import br.com.api.produtos.modelo.RespostaModelo;
import br.com.api.produtos.servico.ProdutoServico;

@RestController // Define que esta classe é um controlador REST (recebe e responde JSON)
@CrossOrigin(origins = "*") // Libera o acesso da API para qualquer front-end (evita erro de CORS)
public class ProdutoControle {

    @Autowired
    private ProdutoServico ps;

    // Rota de teste: GET http://localhost:8080/
    @GetMapping("/")
    public String rotaTeste() {
        return "API de produtos funcionando!";
    }

    // Rota para listar todos: GET http://localhost:8080/listar
    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar() {
        return ps.listar();
    }

    // Rota para cadastrar: POST http://localhost:8080/cadastrar
    @PostMapping("/cadastrar")
    // @RequestBody pega o JSON enviado na requisição e transforma em um objeto ProdutoModelo
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm) {
        return ps.cadastrarAlterar(pm, "cadastrar");
    }

    // Rota para alterar: PUT http://localhost:8080/alterar
    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModelo pm) {
        return ps.cadastrarAlterar(pm, "alterar");
    }

    // Rota para deletar: DELETE http://localhost:8080/remover/1
    @DeleteMapping("/remover/{codigo}")
    // @PathVariable captura o número passado na URL ({codigo})
    public ResponseEntity<RespostaModelo> remover(@PathVariable Long codigo) {
        return ps.remover(codigo);
    }
}