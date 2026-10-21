package Controle;
import dao.UsuarioDAO;
import modelo.Usuario;

public class Login {
    private UsuarioDAO usuarioDAO;

    public Login() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticar(String login, String senha) {
        Usuario usuario = new Usuario(login, senha);
        return usuarioDAO.validarLogin(usuario);
    }
}