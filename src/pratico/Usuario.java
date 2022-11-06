package pratico;
import java.util.Scanner;

public class Usuario {
	
	public static void main(String[] args) {
		
		String nomeProduto;
		double valorProduto;
		
		Scanner entrada = new Scanner(System.in);		
		
		System.out.println("Nome do produto: ");
		nomeProduto = entrada.nextLine();		
		
		System.out.println("Valor do produto: ");
		valorProduto = entrada.nextDouble();
		
		UsuarioDao usuario = new UsuarioDao(nomeProduto, valorProduto);
		
		double iformaCalculo = usuario.DescontoProduto();		
		
		System.out.printf("Valor no atacado  R$%.2f:(desconto de R$%.2f)\n", iformaCalculo,  iformaCalculo - valorProduto);
		System.out.printf("Valor no varejo R$%.2f: ", valorProduto);
		
		entrada.close();
		
	}
}
