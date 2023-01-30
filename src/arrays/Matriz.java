package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos: ");
		int quantidadeAlunos = entrada.nextInt();		
		
		System.out.println("Informe a quantidade de notas por aluno: ");
		int quantidadeNotas = entrada.nextInt();
		
		double[][] notasTurma = new double [quantidadeAlunos][quantidadeNotas]; // Estudar mais.
		
		double total = 0;
		for(int a = 0; a < notasTurma.length; a++) {
			
			for(int n = 0; n < notasTurma[a].length; n++) { // Percorre o array nota e insere na posição atual
				
				System.out.printf("\nInforme a nota %d do aluno %d ", n+1, a+1);
				notasTurma[a][n] = entrada.nextDouble(); // Estudar mais.
				total += notasTurma[a][n];
				
				
			}
		}
		
		double media = total / (quantidadeNotas * quantidadeAlunos);
		System.out.println("Média da turma é: " + media);
		for(double[] notasAlunos: notasTurma) {
			System.out.println(Arrays.toString(notasAlunos));
		}
		
		
		entrada.close();
	}

}
