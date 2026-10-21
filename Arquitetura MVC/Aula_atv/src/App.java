import view.TelaLogin;

public class App {
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                TelaLogin telaInicial = new TelaLogin();
                telaInicial.setVisible(true);
            }
        });
    }
}