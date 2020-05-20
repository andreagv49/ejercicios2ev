package unidad6.excepciones;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
	
	public static double[] ejer_dos(double a, double b, double c) {
		
		if (a==0) {
			
			throw new IllegalArgumentException();
		}
		double d = b*b - a*a*c;
		
		if (d<0) {
			
			throw new ArithmeticException();
		}
		
		double e = Math.sqrt(d);
		double [] soluciones = new double[2];
		soluciones[0] = (-b + e) / (2*a);
		soluciones[1] = (-b - e) / (2*a);
		return soluciones;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Introduzca coeficientes para hacer la ecuación de segundo grado: ");
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.println(Arrays.toString(ejer_dos(scan.nextDouble(), scan.nextDouble(), scan.nextDouble())));
		}catch(IllegalArgumentException e) {
			
			System.out.println("no es una ecuación de segundo grado");
		}catch (ArithmeticException e) {
			
			System.out.println("la ecuación no tiene una solución real");
		}
		
		scan.close();
		
	}

}
