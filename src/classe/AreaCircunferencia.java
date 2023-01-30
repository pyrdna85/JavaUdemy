package classe;

public class AreaCircunferencia {
	
	//Quando usamos static, o valor passa a pertencer a classe.
	//O final bloqueia a variável.
	double raio;
	static final double PI = 3.14;
	
	//Bandeja
	AreaCircunferencia(double raioInicial) {		
		raio = raioInicial;
		
	}
	
	//Método Calculo 1
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	//Método Calculo 2
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}
