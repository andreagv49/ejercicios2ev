package unidad4;

import java.util.Arrays;
import java.util.Random;

public class ejercicio6 {

	/*Programa que realice las tareas siguientes:
		 Crear un vector de números enteros de un tamaño aleatorio comprendido entre 10 y 50 
		elementos.
		 Llenar el vector con números aleatorios comprendidos entre -100 y 100 sin repetir 
		ninguno.
		 Crear un segundo vector que contenga los elementos del anterior almacenados en orden 
		inverso.
		 Mostrar ambos vectores en la consola.*/
	
	public static void main(String[] args) {

		int num1 = (int) Math.floor(Math.random()*(50-10+1)+10);
		
		int[] vector1 = new int[num1];
		int[] vector2 = new int[num1];
		
		for (int i = 0; i < num1; i++) {
			
			int num2;
			
			int seguir = 1;
			
			do {
				
				num2 = (int) Math.floor(Math.random()*(100-(-100)+1)+(-100));
				
				for (int j=0; j<vector1.length; j++) {
					
					if(vector1[j] == num2) {
						seguir = 1;
					}else {
						seguir = 0;
					}
				}
				
			} while (seguir == 1);
			
			vector1[i] = num2;

		}
		
		int longitud = vector1.length;
		
		
		for (int i=0; i<longitud; i++) {
		
			vector2[i] = vector1[longitud - i - 1];
		}
		
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));
	}

}
