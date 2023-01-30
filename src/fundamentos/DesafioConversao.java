package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o primeiro salario: ");
		String valor1 = entrada.nextLine().replace(",", ".");

		System.out.print("Informe o segundo salario: ");
		String valor2 = entrada.nextLine().replace(",", ".");

		System.out.print("Informe o terceiro salario: ");
		String valor3 = entrada.nextLine().replace(",", ".");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double soma = salario1 + salario2 + salario3;
		double media = (salario1 + salario2 + salario3) / 3;

		System.out.printf("\nSoma e: " + soma);
		System.out.printf("\nMedia e: " + media);

		entrada.close();

	}

}
