import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();


        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");



        System.out.println("Lista");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.set(1, "kid");
        System.out.println("Lista após alteração:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove(0);
        System.out.println("Lista após remoção:");
        for (String nome : nomes) {
            System.out.println(nome);









    }
}













    





































}
