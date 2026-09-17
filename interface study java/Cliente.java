public class Cliente extends Pessoa implements Pagamento{
    
    public Cliente(String nome) {
        super(nome);

    }
    // metodo da interface
    @Override 
    public void pagar(double valor){
        System.out.println("Pagamento de R$" +valor+ " realizado com sucesso!");

    }
    public void comprar(String produto, int quantidade){
        System.out.println("O cliente " +nome+ " comprou o produto: " +produto); 
        System.out.println("Quantidade: " +quantidade);
        
    }

    public void comprar(String produto, int quantidade,double valor){
        System.out.println("O cliente " +nome+ " comprou o produto: " +produto); 
        System.out.println("Quantidade: " +quantidade);
        System.out.println("Valor unitario:"+valor);
        System.out.println("Total: R$" +(quantidade*valor));

    }

}
