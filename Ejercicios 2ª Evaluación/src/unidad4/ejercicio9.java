package unidad4;
import java.util.Arrays;

public class ejercicio9 {

	public static void main(String[] args) {

		int [] vector = new int[10];
		vector[0] = 9; 
		vector[1] = 2; 
		vector[2] = 2; 
		vector[3] = 3; 
		vector[4] = 2; 
		vector[5] = 5;
		vector[6] = 7; 
		vector[7] = 7; 
		vector[8] = 7;
		vector[9] = 4;
		
		int secuencias = 0;
		boolean secuencia = false;
		
		for (int i=1; i<vector.length; i++)
			
			if (vector[i] == vector[i-1]) {
				
				if (!secuencia) {
					
					secuencias++;
					secuencia = true;
				}
			}
			else
				
				if (secuencia)
					secuencia = false;

		System.out.println(Arrays.toString(vector));
		System.out.println(secuencias);

	}

}
