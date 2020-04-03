package repaso2ev;

import repaso2ev.Matrices;

import java.util.Scanner;
import java.util.Random;

public class PruebaMatrices {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		//CUADRADA 1
		System.out.println("---- MATRIZ CUADRADA 1 ----");
		
		System.out.println("Introduce dimensión: ");
		int dim = scan.nextInt();
		
		int[][] cuadrada1 = Matrices.cuadrada1(dim);
		
		for (int i=0; i<cuadrada1.length; i++) {
			
			for (int j=0; j<cuadrada1[i].length; j++) {
				
				System.out.print(cuadrada1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//CUADRADA 2
		System.out.println("---- MATRIZ CUADRADA 2 ----");
		
		System.out.println("Introduce dimensión: ");
		dim = scan.nextInt();
		
		int[][] cuadrada2 = Matrices.cuadrada2(dim);
		
		for (int i=0; i<cuadrada2.length; i++) {
			
			for (int j=0; j<cuadrada2[i].length; j++) {
				
				System.out.print(cuadrada2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//PALINDROMO
		System.out.println("---- PALINDROMOS ----");
		
		System.out.println("Introduzca número de filas (entre 1 y 26): ");
		int filas = scan.nextInt();

		System.out.print("Introduzca número de columnas (entre 1 y 26): ");
		int columnas = scan.nextInt();

		String[][] palindromo = Matrices.palindromo(filas, columnas);

		if (palindromo != null) {

			for (int i = 0; i < palindromo.length; i++) {
				
				for (int j = 0; j < palindromo[i].length; j++) {
					System.out.print(palindromo[i][j] + " ");
				}
				System.out.println();
			}
			

		} else {

			System.out.println("No es posible realizar la matriz");
		}
		
		System.out.println();
		
		//max3x3sum
		System.out.println("---- max3x3sum ----");
		int fil;
		int col;
		
		System.out.print("Introduzca número de filas (>= 3): ");
		fil = scan.nextInt();

		System.out.print("Introduzca número de columnas (>= 3): ");
		col = scan.nextInt();
		
		int[][] matriz = new int[fil][col];

		llenar_matriz(matriz);

		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print(matriz[i][j] + "\t");

			}
			System.out.println(); 
		}

		int SumMax = Matrices.max3x3sum(matriz);

		System.out.println("El valor máximo de todos los resultados que se obtienen sumando los elementos de cada matriz de 3x3 es "+ SumMax);

		scan.close();
	}

	static void llenar_matriz(int[][] m) {
		
		Random random = new Random();
		
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = random.nextInt(100);
	
	}
}
