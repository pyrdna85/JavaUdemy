package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F-32) * 5/9 = °C

		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Convertendo " + fahrenheit + " fahrenheit em graus celcius sao: " + celsius + " graus C.");

		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Convertendo " + fahrenheit + " fahrenheit em graus celsius sao: " + celsius + " graus C.");
	}

}
