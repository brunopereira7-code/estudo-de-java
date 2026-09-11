public class VeiculoApp {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", 2024, 160);
        Carro carro = new Carro("Toyota", 2023, 4);

        moto.exibirInfo();
        System.out.println();

        carro.exibirInfo();
    }
}
