package TesteProgramacao; 
import java.util.Scanner;

public class FizzBuzz { 
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero para saber quais s�o seus multiplos de 0 a 100: ");
	    int a = entrada.nextInt();      
	    
	    int b = 1;              
	    int contador = 1;
	    int comparador = 1;
	    
	    while(contador <= 100) {
	        int calc = a * b;
	        if(calc == comparador) {                
	            System.out.println(comparador + " � multiplo de " + a);             
	            b += 1;                             
	        }
	        comparador += 1;
	        contador += 1;          
	    }
	    
	    entrada.close();
	}
    
}   