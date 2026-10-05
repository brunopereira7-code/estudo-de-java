import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 { 

    public static void main(String[] args){

        try{

            BufferedWriter bw=new BufferedWriter(new BufferedWriter(new FileWriter("dado.txt",true))); 
            
            bw.write("terceira linha\n");
            bw.write("quarta linha\n");
            bw.close();
         
            System.out.println("Arquivo escrito com sucesso."); 
            
        
        
        
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
