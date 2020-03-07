package unidad4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ejercicio13 {

	/*Programa que cree una matriz de números enteros aleatorios con un número de filas y de 
	 * columnas aleatorios que estén comprendidos entre 2 y 20.
	Escribir un método que reciba una matriz de números enteros y retorne un vector que contenga 
	la suma de los valores de cada fila.
	Escribir otro método que reciba una matriz de números enteros y retorne un vector que contenga
	la suma de los valores de cada columna.
	Mostrar en la consola la matriz, la suma de las filas a su derecha y la suma de las columnas 
	en la parte inferior.*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("Introduzca un numero de filas entre 2 y 20");
		int filas = scan.nextInt();
		System.out.println("Introduzca un numero de columnas entre 2 y 20");
		int columnas = scan.nextInt();
		
		int [][] vector = new int[filas][columnas];
		
		for(int i=0; i<vector.length; i++) {
			
			for(int j=0; j<vector[i].length; j++) {
				
				vector[i][j] = ran.nextInt(50);
			}
		}
		
		int [] sumaFilas = suma_filas(vector);
		int [] sumaColumnas = suma_columnas(vector);
		
		for(int i=0; i<vector.length; i++) {
			
			System.out.println(Arrays.toString(vector[i]) + " [" + sumaFilas[i] + "]");
			
		}
		
		System.out.println();
		System.out.println(Arrays.toString(sumaColumnas));
		scan.close();

	}
	
	static int [] suma_filas(int [][] v) {
		
		int [] res = new int [v.length];
		
		for (int i=0; i<v.length; i++) {
			
			res[i] = 0;
			
			for (int j=0; j<v[i].length; j++) {

				res[i] += v[i][j];
				
			}
		}
		
		return res;
	}

	static int [] suma_columnas(int [][] v) {
		
		int [] res = new int [v[0].length];
		
		for (int i=0; i<v[0].length; i++) {
			
			res[i] = 0;
			
			for (int j=0; j<v.length; j++) {

				res[i] += v[j][i];
				
			}
		}
		
		return res;
	}
}
