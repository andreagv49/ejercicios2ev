package unidad4;

import java.util.Scanner;

public class ejercicio2 {

	/*Programa que lea una cadena en desde el teclado y la muestre invertida en la consola.*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca una cadena:");
		
		String cadena = scan.nextLine();
		
		for (int i = cadena.length()-1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
		scan.close();
	}

}
