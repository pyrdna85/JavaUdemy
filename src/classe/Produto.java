package classe;
public class Produto {	
	//Atributos: nome, preco, desconto.
	
	String nome;
	double preco;
	static double desconto = 0.25;
	static double descontoGerente = 0.10;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial){
		nome = nomeInicial;		
	}	
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoGerente){
		return preco * (1 - (desconto + descontoGerente));
	}

}
