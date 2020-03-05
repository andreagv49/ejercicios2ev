package unidad4;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio8 {

	public static void main(String[] args) {
		
		/*Programa que realice las tareas siguientes:
		 Crear un vector de números enteros de un tamaño especificado por el usuario que estará
		comprendido entre 10 y 200 elementos.
		 Llenar el vector con números aleatorios comprendidos entre -100 y 100.
		 Mostrar la suma de los números almacenados teniendo en cuenta que hay quien piensa que 
		el número 13 es el número de la mala suerte. Por tanto, si en alguna posición se 
		encuentra almacenado el número 13, no se sumará ni este número ni los que se encuentren 
		almacenados en las 13 posiciones siguientes (o las que haya hasta el final del vector 
		si estas son menos de 13) si la suma de todos ellos es distinta de 7.
		 Mostrar el contenido del vector y la cantidad de números que no se han sumado.*/
		
		Scanner scan = new Scanner(System.in);
		int tamaño;
		
		
		do {
			
			System.out.println("¿De qué tamaños hacemos el vector? Escribe un número entre 10 y 200.");
			tamaño = scan.nextInt();
			
		}while(tamaño < 10 || tamaño > 200);
		
		//creamos el vector
		int [] vector = new int[tamaño];
		
	
		//llenamos el vector
		for(int i=0; i<tamaño; i++) {
			
			int numAlot = (int) Math.floor(Math.random()*(100-(-100)+1)+(-100));
			vector[i] = numAlot;
		}
		
		//buscamos numero 13
		
		int contador = 0;
		int posicionTrece = 0;
		int contadorposTrece = 0;
		int numeros = 0;
		int contadorAux = 0;
				
		for(int i=0; i<tamaño; i++) {
				
			if(vector[i] == 13) {
				
				posicionTrece = i;
				System.out.println("se encuentra el 13 en la posición "+posicionTrece);
				break;
				
			}
			contador += vector[i];					
		}
		
		for(int i=posicionTrece; i<tamaño;i++) {
			contadorAux += 1;
		}
		
		System.out.println("contadorAux: "+contadorAux);
		
		if(contadorAux > 13) {
			System.out.println("hay mas de 13 numeros");
			for(int i=posicionTrece;i < posicionTrece+14 ;i++) {
				
				numeros += 1;
				contadorposTrece += vector[i];
				
			}
		}else {
			System.out.println("hay menos de 13 numeros");
			for(int i=posicionTrece;i < tamaño ;i++) {
				
				numeros += 1;
				contadorposTrece += vector[i];
			}
		}
		
		if(contadorposTrece != 7) {
			//no se suman
			System.out.println("no se suman");
		}else {
			//si se suman
			System.out.println("si se suman");
			contador += contadorposTrece;
		}
		
		//sumamos los que faltan
		for (int i=posicionTrece+14; i<tamaño; i++) {
			contador += vector[i];
		}
		
		
		System.out.println("contador: "+contador);
		
		
		System.out.println(Arrays.toString(vector));
		
		System.out.println("Cantidad de números no sumados = " + numeros);
		scan.close();
	}

}
