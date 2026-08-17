public class Cod03 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("informe a idade"); 
        int idade=sc.nextInt();

        System.out.println("É estudante? digite 1 para sim ou 0 pra não"); 
        int estudante=sc.nextInt();

        if (idade>=60 || estudante ==1){
            System.out.println("Você tem direito de desconto"); 
            
        }else{
            System.out.println("você nao tem direito ao desconto");

        }

        sc.close();

    } 
    
}
