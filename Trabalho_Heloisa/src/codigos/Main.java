package codigos;

public class Main {
    public static void main(String[] args) {
    	Produto celular = new Produto("Celular", 2000);
    	Produto notebook = new Produto("Notebook", 4500);
    	Produto tablet = new Produto("Tablet", 1500);
    	
    	DescontoProduto descontoCelular = new DescontoProduto(10);
    	DescontoProduto descontoNotebook = new DescontoProduto(15);
    	DescontoProduto descontoTablet = new DescontoProduto(5);
    	
    	PrecoFinalProduto exibirCelular = new PrecoFinalProduto(celular, descontoCelular);
    	PrecoFinalProduto exibirNotebook = new PrecoFinalProduto(notebook, descontoNotebook);
    	PrecoFinalProduto exibirTablet = new PrecoFinalProduto(tablet, descontoTablet);
    	
    	exibirCelular.exibirPreco();
    	exibirNotebook.exibirPreco();
    	exibirTablet.exibirPreco();
    	/*
    	String produto1 = "Celular";
        double preco1 = 2000.0;
        double desconto1 = preco1 * 0.10; // 10% de desconto
        double precoFinal1 = preco1 - desconto1;
        System.out.println(produto1 + " - Preço final: R$ " + precoFinal1);

        String produto2 = "Notebook";
        double preco2 = 4500.0;
        double desconto2 = preco2 * 0.15; // 15% de desconto
        double precoFinal2 = preco2 - desconto2;
        System.out.println(produto2 + " - Preço final: R$ " + precoFinal2);

        String produto3 = "Tablet";
        double preco3 = 1500.0;
        double desconto3 = preco3 * 0.05; // 5% de desconto
        double precoFinal3 = preco3 - desconto3;
        System.out.println(produto3 + " - Preço final: R$ " + precoFinal3);
        */

    }
}