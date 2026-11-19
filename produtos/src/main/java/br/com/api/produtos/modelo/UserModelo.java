package br.com.api.produtos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario") // Nome da tabela no banco de dados[cite: 1]
@Getter
@Setter
public class UserModelo {

    @Id // Chave primária[cite: 1]
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente[cite: 1]
    private Long id; //[cite: 1]

    private String usuario; // Coluna de login[cite: 1]
    private String senha;   // Coluna de senha[cite: 1]
}