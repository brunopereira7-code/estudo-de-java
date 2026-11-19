package br.com.api.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Inicia todas as configurações automáticas do Spring Boot
public class ProdutosApplication {

    public static void main(String[] args) {
        // Método principal que coloca o servidor (Tomcat) no ar
        SpringApplication.run(ProdutosApplication.class, args);
    }
}