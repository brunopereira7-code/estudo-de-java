public class Desafio3 {
    public static void main(String[] args) {
        String nome_cliente = "Carlos";
        String nome_prd = "Xícara";
        int quantidade = 12;
        double valor_unitario = 17.80;

        double total = quantidade * valor_unitario;

        System.out.printf("Nome do Cliente: %s | Nome do produto: %s | Quantidade: %d | Valor Unitario: %.2f | Total: %.2f%n",
            nome_cliente,
            nome_prd,
            quantidade,
            valor_unitario,
            total
        );
    }
}
