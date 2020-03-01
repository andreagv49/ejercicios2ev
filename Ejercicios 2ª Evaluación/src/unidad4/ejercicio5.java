package unidad4;

import java.util.Scanner;
public class ejercicio5 {

	/*Programa que lea desde el teclado una línea que contenga un NIF completo (número y letra) 
	 * y a continuación verifique que es correcto. Para obtener la letra de validación del N.I.F.
	 * se realiza la división entera de la parte numérica entre 23 y el resto se utiliza como 
	 * índice de la tabla siguiente:
		Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
		Letra T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
		La validación consiste en comprobar que la letra obtenida en la tabla coincide con la 
	 * letra introducida por teclado.*/
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un N.I.F");
		String nif = scan.nextLine().toUpperCase();
		
		char letra = nif.charAt(nif.length()-1);
		String numeros = nif.substring(0,nif.length()-1);
		
		int num = Integer.parseInt(numeros);
		
		char[] caracteres = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		if(caracteres[num % 23] == letra) {
			System.out.println("N.I.F válido");
		}else {
			System.out.println("N.I.F no válido");
		}
		
		scan.close();
	}

}
