package questao6;

public class Veiculo {
    private int peso;
    private int vMax;
    private double preco;

    public Veiculo() {
        this(0, 0, 0f);
    }

    public Veiculo(int peso, int vMax, double preco) {
        this.peso = peso;
        this.vMax = vMax;
        this.preco = preco;
    }

    public void set(int peso, int vMax, double preco) {
        this.peso = peso;
        this.vMax = vMax;
        this.preco = preco;
    }

    public void print() {
        System.out.printf("Peso: %dkg \n",peso);
        System.out.printf("Velocidade Máx: %dkm/h \n", vMax);
        System.out.printf("Preço: %.2fR$ \n",preco);
    }
}