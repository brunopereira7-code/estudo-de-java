package br.com.api.produtos.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.api.produtos.modelo.ProdutoModelo;

@Repository // Indica ao Spring que esta interface é responsável pelo acesso ao banco de dados
// CrudRepository já traz prontos os métodos: save(), findAll(), findById(), deleteById(), etc.
public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long> {
    
}