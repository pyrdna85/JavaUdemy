package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		double num1 = entrada.nextDouble();
		System.out.print("Informe outro numero: ");
		double num2 = entrada.nextDouble();
		System.out.print("Informe um operando: ");
		String operador = entrada.next();
		System.out.println(operador);

		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;

		System.out.printf("O resultado e %.2f %s %.2f = %.2f ", num1, operador, num2, resultado);
		entrada.close();

	}

}
