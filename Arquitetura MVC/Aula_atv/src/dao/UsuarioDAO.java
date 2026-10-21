package dao;
import modelo.Usuario;

public class UsuarioDAO {
    
    public boolean validarLogin(Usuario usuario) {
        
        return usuario.getLogin().equals("admin") && usuario.getSenha().equals("123");
    }
}