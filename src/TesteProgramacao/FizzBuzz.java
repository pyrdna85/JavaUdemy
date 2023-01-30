package TesteProgramacao; 
import java.util.Scanner;

public class FizzBuzz { 
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para saber quais são seus multiplos de 0 a 100: ");
	    int a = entrada.nextInt();      
	    
	    int b = 1;              
	    int contador = 1;
	    int comparador = 1;
	    
	    while(contador <= 100) {
	        int calc = a * b;
	        if(calc == comparador) {                
	            System.out.println(comparador + " é multiplo de " + a);             
	            b += 1;                             
	        }
	        comparador += 1;
	        contador += 1;          
	    }
	    
	    entrada.close();
	}
    
}   