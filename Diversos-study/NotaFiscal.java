public class NotaFiscal {
 public static void main(String[] var0) {
     String Cliente= "JoãoSilva";
     String Produto="Mouse";
     int Quantidade= 3;
     double ValorUnitario=45.90;
     
    
    double total = Quantidade * ValorUnitario;
    System.out.println("------------------------------Nota Fiscal------------------------------------------");
    System.out.printf("Cliente: %s%n | Produto: %s%n  | Quantidade: %d%n  | Valor Unitário: %.2f%n  | Total: %.2f%n",
    Cliente,
    Produto,
    Quantidade,
    ValorUnitario,
    total
    );
}
}
