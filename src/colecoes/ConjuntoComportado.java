package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("A");
		listaAprovados.add("Rodrigo");
		listaAprovados.add("Carla");
		listaAprovados.add("Miguel");
		listaAprovados.add("Gatos");
		listaAprovados.add("As");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}	
		
		Set<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(32);
		nums.add(252);		
		
		for(int n: nums) {
			System.out.println(n);
			
		}			
		
	}

}
