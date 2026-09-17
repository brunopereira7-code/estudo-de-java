import java.util.ArrayList;

public class Animais {
    private ArrayList<Animal> listaAnimais;

    public Animais() {
        listaAnimais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal){
        listaAnimais.add(animal);

        System.out.println("Animal cadastrado");
        }
    
public void listarAnimais(){
    if (listaAnimais.isEmpty()){
        System.out.println("Nenhum animal cadastrado");
    } else {
        System.out.println("Lista de animais cadastrados:");
        for (int i = 0; i < listaAnimais.size(); i++){
            System.out.println((i + 1) + ". " + listaAnimais.get(i).exibirInfo());
        }
    }
}
public void atualizarAnimal(int index, Animal animal){
    if (indice >= 0 && indice < listaAnimais.size()){
        listaAnimais.set(indice, novoanimal);
        System.out.println("Animal atualizado com sucesso");
    } else {
        System.out.println("Índice inválido");
    }

public void removerAnimal(int indice){
    if (indice >= 0 && indice < listaAnimais.size()){
        listaAnimais.remove(indice);
        System.out.println("Animal removido com sucesso");
    } else {
        System.out.println("Índice inválido");
    }
}
