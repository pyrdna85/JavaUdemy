package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");

		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;

		System.out.printf("Seu nome e %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);

		String frase = String.format("\nSeu nome e %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade,
				salario);
		System.out.println(frase);

		System.out.println("Frase qualquerr".contains("qualquer"));
		System.out.println("Frase qualquer".indexOf("qualquer"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 9));
	}

}
