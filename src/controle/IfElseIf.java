package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		
		double nota = entrada.nextDouble();		
		
		if(nota < 0 || nota > 10) {
			System.out.println("Nota invalida");
		}else if(nota >= 8.1) {
				System.out.println("Conceito A");
			
		}else if(nota >= 6.1) {
			System.out.println("Conteito B");
		}else if(nota >= 5.1) {
			System.out.println("Conteito C");
		}else if(nota >= 4.1) {
			System.out.println("Conteito D");
		}else {
			System.out.println("Conceito E");
		}
		
		System.out.println("Fim!");
		entrada.close();
		
	}
	
	

}
