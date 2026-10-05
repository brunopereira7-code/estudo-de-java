import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Manipulacao { 

    public static void main(String[] args){

        try{
    
            File arquivo=new File("arquivo.txt");
            if(arquivo.createNewFile()){
                System.out.println("Arquivo criado: "+arquivo.getName());
            }else{
                System.out.println("Arquivo já existe.");
            }
        }catch(IOException e){
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    
    


        // Escrever 

        try{
        FileWriter writer =new FileWriter("arquivo.txt", true);
        writer.write("Primeira lina\n");
        writer.write("Segunda linha\n");
        writer.write("Terceira linha\n");

        writer.close(); 
        System.out.println("Arquivo escrito com sucesso.");
        }
        catch(IOException e){
        e.printStackTrace();
        }

        //Ler arquivo 

        try{
        BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt")); 
        String linha;
        while((linha=reader.readLine())!=null){
        System.out.println(linha);
        }
        reader.close();
        }catch(IOException e){
        e.printStackTrace();
        }

        // Alterar 

        try{

        FileWriter fw= new FileWriter("arquivo.txt", true);
        fw.write("conteudo alterado\n");
        fw.close();
        System.out.println("Arquivo alterado com sucesso."); 

        }catch(IOException e){
        e.printStackTrace();
        }

        //Deletar 
        File arquivo =new File("arquivo.txt");
        if(arquivo.delete()){
            System.out.println("Arquivo deletado com sucesso.");



        }else{
            System.out.println("Falha ao deletar o arquivo.");
        }
    }
}