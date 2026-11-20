package br.com.api.produtos.servico;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.modelo.RespostaModelo;
import br.com.api.produtos.modelo.UserModelo;
import br.com.api.produtos.repositorio.UserRepositorio;

@Service 
public class LoginServico {
    
    private final UserRepositorio userRepo;

    public LoginServico (UserRepositorio userRepo){
        this.userRepo = userRepo;
    }

    public ResponseEntity<RespostaModelo> login (UserModelo usuarioReq) {
        RespostaModelo resposta = new RespostaModelo();
        
        String usuario = usuarioReq.getUsuario();
        String senha = usuarioReq.getSenha();

        if (usuario == null || usuario.isBlank() || senha == null || senha.isBlank()) {
            resposta.setMensagem("informe o usuário e senha");
            return ResponseEntity.badRequest().body(resposta);

        }
        UserModelo user = userRepo.findByUsuario(usuario);

        if (user == null) {
            resposta.setMensagem("Usuario não encontrado");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resposta);
        }
    if (!senha.equals(user.getSenha())) {
            resposta.setMensagem("Senha incorreta.");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(resposta);
    }
        return null;
    
    
}}