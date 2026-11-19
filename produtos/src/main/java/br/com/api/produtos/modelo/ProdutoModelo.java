package br.com.api.produtos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity // Define que a classe virará uma tabela no banco de dados
@Table(name = "produtos") // Nome da tabela no banco
@Getter // Lombok: gera os métodos Getters automaticamente
@Setter // Lombok: gera os métodos Setters automaticamente
public class ProdutoModelo {

    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremento no banco
    private Long codigo;

    private String nome;
    private String marca;
}