package br.com.api.produtos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.produtos.modelo.UserModelo;

public interface  UserRepositorio extends JpaRepository<UserModelo, Long> {

    UserModelo findByUsuario(String usuario);
    
}
