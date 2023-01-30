package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {

		int a = 3;
		int b = a;
		int c = a + b; // 6

		c += b; // 9
		c -= a; // 6
		c *= b; // 18
		c /= a; // 6

		System.out.println(c);
		c %= 2;
		System.out.println(c);
	}

}
