package questao4;

public class Main {
	public static void main(String[] args) {
		
		CalculadoraCientifica cientifica = new CalculadoraCientifica();
		
		double calc1 = cientifica.somar(2, 19);
		double calc2 = cientifica.subtrair(2, 19);
		double calc3 = cientifica.multiplicar(2, 19);
		double calc4 = cientifica.dividir(2, 19);
		double calc5 = cientifica.raizQuadrada(2);
		double calc6 = cientifica.potencia(2, 19);
	
		System.out.println(calc1);
		System.out.println(calc2);
		System.out.println(calc3);
		System.out.println(calc4);
		System.out.println(calc5);
		System.out.println(calc6);
	
	}
}
