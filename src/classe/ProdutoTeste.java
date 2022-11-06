package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook", 4356.89);		
		var p2 = new Produto("Caneta Preta", 12.56);
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);		
		
		double precoFinal1 = p1.precoComDesconto();		
		double precoFinal2 = p2.precoComDesconto();			
			
		double media = (precoFinal1 + precoFinal2);
		System.out.printf("Preço final: R$%.2f\n", media);
		
		
		
		
	}

}
