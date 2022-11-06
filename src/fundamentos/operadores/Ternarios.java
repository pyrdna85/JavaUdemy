package fundamentos.operadores;

public class Ternarios {

	public static void main(String[] args) {

		var av1 = 9.0;
		var av2 = 9.0;

		var media = (av1 + av2) / 2;

		String resultadoParcial = media <= 6.0 ? "de recuperacao" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;

		String temDescontoParcial = media >= 5 ? "Parcial de 50%" : "Nao";
		String temDesconto = media >= 7 ? "Sim" : temDescontoParcial;

		if (media > 7) {
			System.out.println("O aluno esta: " + resultadoFinal + " com nota " + media);
			System.out.println("Tem desconto? " + temDesconto);
		}

		var provaRecuperacao = 5;
		String temDescontoRecuperacao = provaRecuperacao >= 7 ? "Parcial de 25%" : "Nao";
		String resultadoRecuperacao = provaRecuperacao >= 7.0 ? "Aprovado" : "Reprovado";

		if (media < 7) {
			System.out.println(
					"Resultado da Prova de Recuperacao: " + resultadoRecuperacao + " com nota " + provaRecuperacao);
			System.out.println("Tem desconto de Recuperacao? " + temDescontoRecuperacao);
		}

	}

}
