package questao6;

public class CarroPasseio extends Motor {
    private Veiculo veiculo;
    private String cor;
    private String modelo;

    public CarroPasseio() {
        this.veiculo = new Veiculo();
        this.cor = "";
        this.modelo = "";
    }

    public CarroPasseio(int cilindros, int potencia, int peso, int vMax, double preco, String cor, String modelo) {
        super(cilindros, potencia);
        this.veiculo = new Veiculo(peso, vMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void set(int cilindros, int potencia, int peso, int vMax, double preco, String cor, String modelo) {
        super.set(cilindros, potencia);
        this.veiculo.set(peso, vMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void print() {
        super.print();
        veiculo.print();
        System.out.printf("Cor: %s \n",cor );
        System.out.printf("Modelo: %s \n", modelo);
    }
}
