package classe;

public class EstudoTeste {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
	Estudo valor1 = new Estudo();
	System.out.println(valor1.retornoPi());
	
	valor1.PI = 3.15;
	
	//Estudo valor2 = new Estudo();
	//valor2.PI = 2.18;
	
	System.out.println(valor1.retornoPi());
	//System.out.println(valor2.retornoPi());
		
	}
		
	

}
