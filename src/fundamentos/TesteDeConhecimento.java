package fundamentos;

public class TesteDeConhecimento {

	public static void main(String[] args) {

		String titulo1 = "Area da Circunferencia.";
		System.out.println(titulo1.toUpperCase());

		String desafio = "Calcule a area da circunferencia";
		System.out.println(desafio);

		// C = 2.PI(3.14159).R
		var raio = 5;
		var PI = 3.14159;
		var calc = 2 * raio * PI;
		System.out.printf("A area da circunferencia e: %.2f metros.", calc);

		String titulo2 = "Operando Strings.";
		System.out.println(titulo2);

		var nome = "Rodrigo";
		var idade = 37;
		var sexo = "Masculino";

		System.out.printf("Seu nome e %s, voce tem %s anos e e do sexo %s.", nome, idade, sexo.toLowerCase());

		var s = String.format("\nOla %s", nome);
		System.out.println(s);

		System.out.println("Conversao de temperatura: Fierehint para Celsius");

		// (°F-32) * 5/9 = °C

		var Ajuste = 32;
		var f = 50;
		var divisao = 5.0 / 9.0;
		double conversao = (f - Ajuste) * divisao;
		System.out.println("Resultado: " + conversao + " C");

		// Exemplo de casting, usado nos casos de conversão explicita
		double a = 10;
		int b = (int) a;
		System.out.println(b);

	}

}
