package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[5];
		
		notasAlunoA [0] = 7;
		notasAlunoA [1] = 9.5;
		notasAlunoA [2] = 8.8;
		notasAlunoA [3] = 9.2;
		notasAlunoA [4] = 7.5;		
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // Para imprimir �ltima nota.
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double notaExtra = 8.9;
		double[] notasAlunoB = {7.8, notaExtra, 10};
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
		
		
	}

}
