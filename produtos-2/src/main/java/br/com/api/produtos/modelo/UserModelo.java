package br.com.api.produtos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "usuario")
public class UserModelo {

    @Id
    private Long id;
    private String usuario;
    String senha;
    
}