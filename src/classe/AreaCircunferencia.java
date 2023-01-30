package classe;

public class AreaCircunferencia {
	
	//Quando usamos static, o valor passa a pertencer a classe.
	//O final bloqueia a vari�vel.
	double raio;
	static final double PI = 3.14;
	
	//Bandeja
	AreaCircunferencia(double raioInicial) {		
		raio = raioInicial;
		
	}
	
	//M�todo Calculo 1
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	//M�todo Calculo 2
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}
