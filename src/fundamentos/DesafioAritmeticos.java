package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		int a = 2 + 3 * 4;
		int b = (int) Math.pow(a, 3);
		System.out.println(b);

		var calc1 = 6 * (3 + 2);
		var pot1 = Math.pow(calc1, 2);
		var base1 = pot1 / (3 * 2);

		var calc2 = (1 - 5) * (2 - 7) / 2;
		var pot2 = Math.pow(calc2, 2);

		var resultado = base1 - pot2;
		var calc3 = Math.pow(resultado, 3);

		var resposta = calc3 / Math.pow(10, 3);
		System.out.println(resposta);

	}

}
