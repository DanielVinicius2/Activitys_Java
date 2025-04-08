package codigos;

public class DescontoProduto {
	private double desconto;
	
	public DescontoProduto(double desconto) {
		this.desconto = desconto;
	}
	
	public double getDesconto() {
		return desconto;
	}

	public double calcularDesconto(double desconto) {
		return desconto / 100;
	}
}

