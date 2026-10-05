import java.io.FileWriter;
import java.io.IOException;



public class Ex02 { 
    public static void main(String[] args) {
        
        try{
            FileWriter escritor =new FileWriter("exemplo.txt", true);
            escritor.write("Primeira lina\n");
            escritor.write("Segunda linha\n");
            escritor.write("Terceira linha\n");
        
            escritor.close(); 
            System.out.println("Arquivo escrito com sucesso."); 

        
        }catch(IOException e){
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }






    }
    
}
