package oo.composicao;

public class Carro {
	
	Motor motor = new Motor();
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.4) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desliga() {
		motor.ligado = false;
	}
	
	boolean estaligado() {
		return motor.ligado;
	}

}
