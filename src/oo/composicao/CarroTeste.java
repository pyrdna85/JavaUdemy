package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaligado());
		
		c1.ligar();
		System.out.println("O motor est� ligado? " + c1.estaligado());
		
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
				
		System.out.println("O motor est� em: " + c1.motor.giros() + " giros.");
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();		
		
		System.out.println("O motor est� em: " + c1.motor.giros() + " giros.");
	}

}
