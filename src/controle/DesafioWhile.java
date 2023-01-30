package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {		
		
		Scanner entrada = new Scanner (System.in);		
		System.out.println("Para sair digite: -1 a qualquer momento. ");
		System.out.println("Digite uma nota de 0 a 10:");		
		double nota = entrada.nextDouble();
		
		double contadorNotas = 0;
		double acumuladorNotas = 0;				
		
		while (nota != -1) {
			if(nota >=0 && nota <=10){
				contadorNotas += 1;
				acumuladorNotas += nota;
				System.out.println("Informe uma nota: ");
				nota = entrada.nextDouble();
			}else if(nota != -1) {
				System.out.print("Valor inválido. Digite uma nota válida: ");
				nota = entrada.nextDouble();				
			}			
			
		}		
		
		System.out.println("Foram computadas: " + contadorNotas + " notas");
		System.out.println("A média da sala é: " + acumuladorNotas / 2);
		
		entrada.close();
		
		
	}
}
