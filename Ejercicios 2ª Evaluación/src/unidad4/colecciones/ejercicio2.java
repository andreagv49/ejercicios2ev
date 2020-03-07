package unidad4.colecciones;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class ejercicio2 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>(100); 
		
		Random ran = new Random();
		
		for(int i=0; i<100; i++) {
			
			int alot = ran.nextInt(100)+(1);
			
			lista.add(alot);
		}
		
		List<Integer> lista2 = new ArrayList<>();
		
		Iterator<Integer> i = lista.iterator();
		
		int numero=0;
		
		//CREAMOS LA SEGUNDA LISTA CON NUMEROS QUE NO SE REPITAN
		while (i.hasNext()) {
			
			numero = i.next();
			//System.out.println(numero);
			
			if(!lista2.contains(numero)) {
				//System.out.println("no contiene el "+numero);
				lista2.add(numero);
				//System.out.println("Lo añado");
			}
		}
		
		
		//MOSTRAMOS POR PANTALLA METODO 1 (BUCLE FOR)
		Iterator<Integer> j = lista.iterator();
		System.out.println("Metodo 1");
		
		while (j.hasNext()) {
			
			System.out.printf("%d ", j.next());
		}
		
		//MOSTRAMOS POR PANTALLA METODO 2 (BUCLE FOR MEJORADO)
		System.out.println();
		System.out.println("Metodo 2");
		
		for (int num: lista2) {
			
			System.out.printf("%d ", num);
		}
		
		//MOSTRAMOS POR PANTALLA METODO 3 (BUCLE FOREACH)
		System.out.println();
		System.out.println("Metodo 3");
		
		lista2.forEach(n ->System.out.printf("%d ", n));
		
	}

	

}
