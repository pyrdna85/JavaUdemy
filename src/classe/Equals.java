package classe;

import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Rodrigo Andrade";
		u1.email = "conta.rdna85@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Rodrigo Andrade";
		u2.email = "conta.rdna85@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(new Date()));
		
		
	
	}

}
