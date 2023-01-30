package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia!\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\nSalario: R$ %.2f", 8500.000);

		Scanner entrada = new Scanner(System.in);

		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		try {
			System.out.print("Digite a sua idade: ");
			int idade = entrada.nextInt();
			System.out.printf("%s %s tem %d de anos.%n", nome, sobrenome, idade);

		} catch (Exception e) {
			System.out.println("Voce nao pode usar texto");
		}
		entrada.close();

	}
}
