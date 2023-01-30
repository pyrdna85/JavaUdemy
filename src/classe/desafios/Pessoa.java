package classe.desafios;

public class Pessoa {
	
	String nome;
	double pesoPessoa;
	String msg = "Valor n�o informado";
	
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
		return "Ol� eu sou o " + nome + " e tenho " + pesoPessoa + " Kgr";
	}	
	
}
