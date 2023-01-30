package fundamentos;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F).
		// Trabalho na quinta (V ou F).
		// Se apena um trabalho der certo será comprada a TV de 32" .
		// Se os dois trabalhos derem certo será comprada a TV de 50".
		// Nos dois casos, será comprado sorvete.

		boolean trabalho1 = true;
		boolean trabalho2 = true;

		boolean cond1 = trabalho1 ^ trabalho2;
		boolean cond2 = trabalho1 && trabalho2;

		boolean sorvete = cond1 || cond2;
		boolean maisSaudavel = !sorvete;

		String resposta1 = cond1 ? "Sim" : "Nao";
		String resposta2 = cond2 ? "Sim" : "Nao";
		String respostaSorvete = sorvete ? "Sim" : "Nao";
		String respostaSaudavel = maisSaudavel ? "Sim" : "Nao";

		System.out.println("Sera comprada a TV de 32 Polegadas? " + resposta1);

		System.out.println("Sera comprada a TV de 50 Polegadas? " + resposta2);

		System.out.println("O sorvete esta garantido? " + respostaSorvete);

		System.out.println("Mais saudavel? " + respostaSaudavel);

	}

}
