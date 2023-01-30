package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class DesafioComUmLaco {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome do aluno: ");
		String nome = entrada.next();
		System.out.println("Quantas notas voc� deseja informar? ");
		int quantidadeDeNotas = entrada.nextInt();	
			
		int contador = 1;
		
		double[] arrayNotas = new double [quantidadeDeNotas];
		
		for(int i = 0; i < quantidadeDeNotas; i++) {		
			
			try {
				System.out.println("Insira a " + contador + "� nota");
				double notas = entrada.nextDouble();			
				arrayNotas[i] += notas;
				contador += 1;
			}catch(Exception e) {
				System.out.println("Voc� inseriu um valor incorreto.");
				break;
			}
			
		}
		
		System.out.println("As notas de " + nome + " foram " + Arrays.toString(arrayNotas));
		entrada.close();
	
	}

}
