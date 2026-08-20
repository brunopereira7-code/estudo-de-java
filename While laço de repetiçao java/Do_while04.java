import java.util.Scanner;

public class Do_while04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String senha = "";
        String senhaCorreta = "12345"; // Defini uma senha para testarmos

        // O 'do' garante que ele vai pedir a senha pelo menos uma vez
        do { 
            System.out.print("Digite a senha: ");
            senha = sc.nextLine(); // Atualizando o estado (Dica 2 que vimos!)
            
            if (!senha.equals(senhaCorreta)) {
                System.out.println("Senha incorreta! Tente novamente.\n");
            }
            
        // A condição de parada: continua ENQUANTO a senha não for igual à correta
        } while (!senha.equals(senhaCorreta)); 
        
        System.out.println("Acesso permitido!");
        sc.close();
    }
}