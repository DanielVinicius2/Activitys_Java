package questao6;

public class Caminhao extends Motor {
    private Veiculo veiculo;
    private int toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
        this.veiculo = new Veiculo();
    }

    public Caminhao(int cilindros, int potencia, int peso, int vMax, double preco,
    		int toneladas, int alturaMax, int comprimento) {
        
    	super(cilindros, potencia);
        this.veiculo = new Veiculo(peso, vMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void set(int cilindros, int potencia, int peso, int vMax, double preco,
    		int toneladas, int alturaMax, int comprimento) {
        
    	super.set(cilindros, potencia);
        this.veiculo.set(peso, vMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void print() {
        super.print();
        veiculo.print();
        System.out.printf("Toneladas: %d \n", toneladas);
        System.out.printf("Altura Máx: %dcm \n", alturaMax );		
        System.out.printf("Comprimento: %dcm \n",comprimento);
    }
}
