package questoes1_2_3;

public class CalculadoraDesconto {
	public double calcularDesconto(double preco, double desconto) {
		return preco -(preco * desconto);
	}
	
	public static void main(String[] args) {
		CalculadoraDesconto calc = new CalculadoraDesconto();
		double precoA = calc.calcularDesconto(100.0, 0.10);
		System.out.print(precoA);	
		}
}
