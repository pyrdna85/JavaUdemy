package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>(); 
		
//		fila.add("Rodrigo");
//		fila.offer("Carla");
//		fila.add("Miguel");
//		fila.offer("Pedro");
//		fila.add("Preta");
//		fila.offer("Magrela");
		
		System.out.println(fila.peek()); // retorna null.
		System.out.println(fila.element()); // retorna uma exceção.
		
	}

}
