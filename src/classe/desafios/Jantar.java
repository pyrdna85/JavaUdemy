package classe.desafios;

public class Jantar {	

	public static void main(String[] args) {		
		
		Comida c1 = new Comida("Arroz", 0.280);
		Comida c2 = new Comida("Feijao", 0.300);
		Comida c3 = new Comida("Bisteca", 1);
		
		Pessoa p = new Pessoa("Rodrigo", 99.0);
		
		System.out.println(p.apresentar());		
		
		p.Comer(c1);		
		System.out.println(p.apresentar());
		
		p.Comer(c2);		
		System.out.println(p.apresentar());
		
		p.Comer(c3);		
		System.out.println(p.apresentar());
		
		
		
		
	}

}
