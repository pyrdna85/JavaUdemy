package pratico;

public class UsuarioDao {
	
	String nomeProduto;
	double valorProduto;
	double desconto = 0.25;
	
	UsuarioDao(String nomeProduto, double valorProduto){
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
	}
	
	double DescontoProduto(){
		return valorProduto * ( 1- (desconto));
	}
	
	
	

}
