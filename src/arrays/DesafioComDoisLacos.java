package arrays;

import java.util.Scanner;

public class DesafioComDoisLacos {
	
	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sugestão branch");
		
		System.out.println("Informe quantas notas você quer inserir: ");
		
		int quantidadeDeNotas = entrada.nextInt();		
		
		double[] notasAlunos = new double [quantidadeDeNotas];		

		for(int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Informe a " + (i + 1) + "� nota.");
			notasAlunos[i] = entrada.nextDouble();			
		}	
		
		double total = 0;
		for(double nota: notasAlunos ) {			
			total += nota;
		}
		
		System.out.println("A m�dia � " + (total / notasAlunos.length));
		entrada.close();		
	}
}
