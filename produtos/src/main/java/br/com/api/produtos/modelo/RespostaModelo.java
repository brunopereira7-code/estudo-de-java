package br.com.api.produtos.modelo;

import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Component // Permite que o Spring injete essa classe automaticamente onde for necessário
@Getter
@Setter
public class RespostaModelo {

    private String mensagem; // Guarda o texto de feedback (ex: "O nome do produto é obrigatório!")
}