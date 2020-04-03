package repaso2ev;

public class Matrices {
	
	static int[][] cuadrada1(int dim) {

		int matriz[][] = new int[dim][dim];
		int num = 1; 
		
		//llenamos la matriz por columnas de arriba abajo
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				
				matriz[j][i] = num;

				//aumentamos fila
				num += 1;
			}
		}

		return matriz;

	}
	
	static int[][] cuadrada2(int dim) {

		int matriz[][] = new int[dim][dim];
		int num = 1;

		//llenamos la matriz por columnas
		
		for (int i = 0; i < dim; i++) {

			//columna par -> de abajo arriba
			if (i % 2 == 0) {

				// recorremos la columna, de la fila 0 hasta su longitud
				for (int j = 0; j < dim; j++) {

					matriz[j][i] = num;
					num += 1;
				}
				//columna impar -> de arriba abajo
			} else {

				for (int j=dim-1; j>=0; j--) {

					matriz[j][i] = num;
					num += 1;
				}
			}
		}
		
		return matriz;

	}
	
	static String[][] palindromo(int d, int f) {

		if ((d >= 1 && d <= 26) && (f >= 1 && f <= 26)) {

			String matriz[][] = new String[d][f];

			for (int i = 0; i<d; i++) {
				
				for (int j=0; j<f; j++) {

					int caracter;

					if (i + j <= 25) {
						
						caracter = i + j + 97;
					} else {
						
						caracter = i + j + 39;
					}

					matriz[i][j] = (String.valueOf((char)(i + 97)) + String.valueOf((char)caracter) + String.valueOf((char)(i + 97)));
				}
			}

			return matriz;
		}else {
			
			return null;
		}

		
	}
	
	static int max3x3sum(int[][] matriz) {

		int sumMax = 0;
		
		for (int i=0; i<=(matriz.length-3); i++) {

			for (int j=0; j<=(matriz[i].length-3); j++) {
				
				int suma = 0;

				for (int k = i; k <= (i + 2); k++) {

					for (int l = j; l <= (j + 2); l++) {

						suma += matriz[k][l];
					}
				}

				if (suma > sumMax) {
					sumMax = suma;

				}
			}
		}

		return sumMax;
	}

}
