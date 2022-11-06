package classe.desafios;

public class Pessoa {
	
	String nome;
	double pesoPessoa;
	String msg = "Valor não informado";
	
	Pessoa(String nome, double peso){
		this.nome = nome;		
		this.pesoPessoa = peso;
	}
	
	void Comer(Comida comida){
		if(comida != null) {
			this.pesoPessoa += comida.peso;
		}
	}	
	
	String apresentar() {		
		return "Olá eu sou o " + nome + " e tenho " + pesoPessoa + " Kgr";
	}	
	
}
