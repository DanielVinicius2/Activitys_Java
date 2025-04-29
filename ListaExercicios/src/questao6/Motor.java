package questao6;

public class Motor {
    private int cilindros;
    private int potencia;

    public Motor() {
        this(0, 0);
    }

    public Motor(int cilindros, int potencia) {
        this.cilindros = cilindros;
        this.potencia = potencia;
    }

    public void set(int cilindros, int potencia) {
        this.cilindros = cilindros;
        this.potencia = potencia;
    }

    public void print() {
        System.out.printf("Cilindros: %d \n", cilindros );
        System.out.printf("Potência: %dcv \n", potencia );
    }
}
