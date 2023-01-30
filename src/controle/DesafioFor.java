package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		String valor = "#";
		// Minha solução.		
		
		for(int i = "#".length(); i <= "#####".length(); i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Versão do desafio
		// Não pode usar valor numérico para controlar o laço!
		// Solução do professor.
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}
