import java.io.FileReader;
import java.io.IOException;
public class Ex05 { 

    public static void main (String[] args){

        try{
            FileReader fr=new FileReader("dado.txt"); 
            int caracter;

            while((caracter=fr.read())!=-1){
                System.out.print((char)caracter);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }

    }
    
}
