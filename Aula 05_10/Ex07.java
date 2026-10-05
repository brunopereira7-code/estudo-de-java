import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex07 { 

    public static void main (String[] args){

        try{
            BufferedReader br=new BufferedReader(new FileReader("dado.txt"));
            String linha;

            while((linha=br.readLine())!=null){
                System.out.println(linha);
            }

        }catch(IOException e){
            System.out.println("Erro ao digitar o arquivo.");
            e.printStackTrace();

        }
    }
    
}
