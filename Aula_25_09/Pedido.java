public class Pedido { 

    private int numero;
    private String cliente; 
    private double valor;
    private String data;
    
    public Pedido(int numero, String cliente, double valor, String data) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
        this.data = data;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;

    }
    public void mostrarDados(){
        System.out.println("=====Dados Pedidos=====");
        System.out.println("Numero: "+numero);
        System.out.println("Cliente: "+cliente);
        System.out.println("Valor: "+valor);
        System.out.println("Data: "+data);
    }
    
}
