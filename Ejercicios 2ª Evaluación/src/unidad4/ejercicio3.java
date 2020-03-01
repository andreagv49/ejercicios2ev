package unidad4;

import java.util.Scanner;

public class ejercicio3 {

	/*Programa que lea dos cadenas desde el teclado y muestre 
	 * el número de veces que la segunda está contenida en la primera.*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca una cadena:");
		
		String cadena1 = scan.nextLine().toLowerCase();
		
		System.out.println("Introduzca otra cadena:");
		
		String cadena2 = scan.nextLine().toLowerCase();
		int indice = 0;
		int contador = 0;
		
		if(cadena2.length() > cadena1.length()) {
			System.out.println("La segunda debe ser más pequeña");
		}else {
			
			do {
				
				indice = cadena1.indexOf(cadena2,indice);
				if(indice != -1) {
					indice++;
					contador+=1;
				}
				
			} while (indice != -1);
			
			
			
			System.out.println("La cadena '" +cadena2+ "' aparece "+contador+" veces en la cadena '"+cadena1+"'.");
			scan.close();
		}
		
		
		
	}

}
