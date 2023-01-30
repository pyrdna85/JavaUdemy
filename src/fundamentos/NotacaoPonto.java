package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "boa tarde X";

		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);

		String x = "Everyone".toUpperCase();
		System.out.println(x);

		String y = "Bom dia X".replace("X", "Everyone").toUpperCase().concat("!!!");
		System.out.println(y);

		// Tipos primitivos não tem o operaor "." (notação ponto).
		int a = 3;
		// Exempplo (variável com ponto a.)
		System.out.println(a);
	}

};
