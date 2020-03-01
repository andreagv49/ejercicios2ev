package unidad4;
import java.util.Scanner;

public class ejercicio1 {
	
	/*Programa que lea una cadena desde el teclado y muestre en la consola 
	 * el número de veces que se repite cada vocal.*/
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("Introduzca una cadena");
		String cadena = scan.nextLine().toLowerCase();
		
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		
		for(int j = 0; j<cadena.length(); j++) {
			
			char caracter = cadena.charAt(j);
			
			if(caracter == 'a') {
				a+=1;
			}
			if(caracter == 'e') {
				e+=1;
			}
			if(caracter == 'i') {
				i+=1;
			}
			if(caracter == 'o') {
				o+=1;
			}
			if(caracter == 'u') {
				u+=1;
			}
		}
		
		System.out.println("La letra 'a' se repite "+a+" veces.");
		System.out.println("La letra 'e' se repite "+e+" veces.");
		System.out.println("La letra 'i' se repite "+i+" veces.");
		System.out.println("La letra 'o' se repite "+o+" veces.");
		System.out.println("La letra 'u' se repite "+u+" veces.");
		
		scan.close();
	}

}
