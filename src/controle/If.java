package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();

		if (media >= 7.0 && media <=10) {
			System.out.println("Aprovado!");
		}
		if (media >= 4.0 && media < 7.0) {
			System.out.println("Recuperacao");
		}
		if (media >=0 && media < 4.0) {
			System.out.println("Reprovado");
		}

		entrada.close();

	}

}
