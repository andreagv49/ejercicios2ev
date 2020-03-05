package unidad4;

import java.util.Scanner;
import java.util.Arrays;

public class ejercicio7 {

	/*Programa que realice las tareas siguientes:
		 Crear un vector de números enteros de un tamaño especificado por el usuario entre 10 
		y 1.000.000 de elementos.
		 Llenar el vector con números aleatorios comprendidos entre -999.999 y 1.000.000 sin 
		repetir ninguno.
		 Mostrar en la consola los datos siguientes:
			o Tamaño del vector.
			o Tiempo empleado en llenarlo
			o Diferencia entre el menor y el mayor de los números almacenados en el vector.
			o Tiempo empleado en calcular la diferencia entre el menor y el mayor de los números
			almacenados.
		*/
	public static void main(String[] args) {

		int seguir = 1;
		int tamaño;
		Scanner scan = new Scanner(System.in);
		do {
			
			
			System.out.println("Introduzca un valor entre 10 y 1.000.000");
			tamaño = scan.nextInt();
			
			if(tamaño < 10 || tamaño > 1000000) {
				seguir = 1;
			}else {
				seguir = 0;
			}
			
		}while(seguir == 1);
		
		int[] vector = new int[tamaño];
		
		System.out.println("Tamaño: " + tamaño);
		//^^^---AQUI YA HEMOS CREADO EL VECTOR DEL TAMAÑO ESPECIFICADO---^^^
		
		//Ahora rellenamos el vector
		
		long tInitLlenar = System.currentTimeMillis();
		
		for (int i = 0; i < tamaño; i++) {
			
			int num;
			
			do {

				num = (int) Math.floor(Math.random()*(1000000-(-1000000)+1)+(-1000000));
				
				
			}while(coincide(vector, num, i));
			
			vector[i] = num;
		}
		long tEndLlenar = System.currentTimeMillis();
		
		String tLlenar = tiempo(tEndLlenar, tInitLlenar); //tiempo en milisegundos
		System.out.println("Tiempo en llenarlo: "+tLlenar);
		System.out.println(Arrays.toString(vector));
		
		//^^^---AQUI YA HEMOS RELLENADO EL VECTOR---^^^
		
		int numMayor = 0;
		int numMenor = 0;
		
		
		long tIniDif = System.currentTimeMillis();
		
		for (int i = 0; i < tamaño; i++) {
			
			if(numMayor < vector[i]) {
				
				numMayor = vector[i];
			}else if(numMenor > vector[i]) {
				numMenor = vector[i];
			}
		}
		
		//System.out.println(numMayor);
		//System.out.println(numMenor);
		
		int diferencia = numMayor - numMenor;
		
		long tFinDif = System.currentTimeMillis();
		
		System.out.println("Diferencia: "+diferencia);
		System.out.println("Tiempo en calcular la diferencia: "+tiempo(tFinDif, tIniDif));
		
		scan.close();

	}
	
	static boolean coincide(int [] vector, int num, int i)
	{
		for (int j=0; j < i; j++)
			if (vector[j] == num) {
				return true;
			}
		return false;
			
	}
	
	static String tiempo(long fin, long ini) {
	
		long tiempo = fin - ini;
		
		String cuanto = tiempo/1000+" segundos y "+tiempo%1000+" milisegundos.";
		
		return cuanto;
	}

}
