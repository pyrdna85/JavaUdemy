package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>(); 
		
		fila.add("Ana"); // retorna false quando a fila est� cheia.
		fila.offer("Bia"); // retorna exce��o quando a fila est� cheia.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // retorna null.
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna uma exce��o.
		System.out.println(fila.element());
		
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove("Gui"));
		
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
		
	}

}
