package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário

		// Tipos numéricos inteiros

		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 567899999;
		long pontosAcumulados = 3_147_483_647L;

		// Tipos numéricos reais

		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipos boolenano

		boolean estaDeFerias = false; // false ou true

		// Tipo caractere

		char status = 'A';

		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);

		// Numero de viagens
		System.out.println(numeroDeVoos / 2);

		// Pontos acumulados por real
		System.out.println(vendasAcumuladas / vendasAcumuladas);

		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);

		System.out.println(pontosAcumulados);

	}

}
