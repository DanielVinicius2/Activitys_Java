package questao6;

public class Main {
    public static void main(String[] args) {
        CarroPasseio carro = new CarroPasseio(4, 180, 1100, 210, 80000f, "Roxo", "Hatch");
        Caminhao caminhao = new Caminhao(8, 400, 8000, 120, 250000f, 20, 400, 1000);

        System.out.println("Carro Passeio:");
        carro.print();

        System.out.println("\nCaminhão:");
        caminhao.print();
    }
}