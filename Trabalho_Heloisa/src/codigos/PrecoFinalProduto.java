package codigos;

class PrecoFinalProduto {
	private Produto produto;
	private DescontoProduto desconto;
	
	public PrecoFinalProduto(Produto produto, DescontoProduto desconto){
		this.produto = produto;
		this.desconto = desconto;
	}
	
	public double calcularPrecoFinal() {
		double valorDesconto = desconto.calcularDesconto(desconto.getDesconto());
		return produto.getPreco() * (1 - valorDesconto); 
	}
	
	public void exibirPreco() {
		System.out.println(
	    produto.getNome() +
	    " | Preço: R$ " + produto.getPreco() +
	    " | Desconto: " + (desconto.calcularDesconto(desconto.getDesconto() * 100)) + "%" +
	    " | Preço final: R$ " + calcularPrecoFinal());
	}

}