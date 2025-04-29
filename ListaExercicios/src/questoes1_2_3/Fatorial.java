package questoes1_2_3;

public class Fatorial {
    public int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
    	Fatorial fat = new Fatorial();
    	double fatorialA = fat.calcularFatorial(9);
    	System.out.print(fatorialA);
    }
    
}