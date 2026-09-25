public class PedidoDelivery extends Pedido implements Pagamento {
    private String endereco;
    private double valor; 
    
    private PedidoDelivery(int numero, String cliente, double valor, String data, String endereco, double valor) {
        super(numero, cliente, valor, data);
        this.endereco = endereco;
        this.valor = valor;
    }

public double calcularTotal() {
    return this.valor + this.valor;
    }
    

    public void pagar(double valor,int parcelas) {
        double valorParcela=valor/parcelas;
        System.out.println("Valor parcela: "+valorParcela);
        System.out.println("Parcelas: "+parcelas);
        System.out.println("Valor de cada parcela: R$ %.2f "+valorParcela);
    }

    @Override 
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Endereco: "+endereco);
        System.out.println("Valor: "+valor);
    }



}

