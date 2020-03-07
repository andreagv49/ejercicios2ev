package unidad4.colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ejercicio1 {
	
	public static void main(String[] args) {
	
		List<String> nombres = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un número de veces");
		int num = scan.nextInt();
		
		for (int i=0; i<num; i++) {
			
			String nombre = scan.next();
			
			if(!nombres.contains(nombre))
				nombres.add(nombre);
		}
		scan.close();
		System.out.println(nombres);
	}

}
