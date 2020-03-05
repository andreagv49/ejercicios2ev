package unidad4;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio11 {
	
	/*Definir un método que reciba un vector de cadenas y retorne la cadena de mayor longitud 
	 * almacenada en dicho vector.
	Poner a prueba el método invocándolo desde otro método que cree un vector con los nombres de 
	10 personas introducidos por teclado.*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca 5 frases, una en cada línea");
		
		String [] frases = new String[5];
		
		
		for (int i=0; i<frases.length; i++) {
			
			frases[i] = scan.nextLine();
		}
		
		
		
		System.out.println(cadena_mayor(frases));
		System.out.println(Arrays.toString(frases));
		scan.close();
	}
	
	static String cadena_mayor( String [] vec) {
		
		int posicionMayor = 0;
		
		for (int i=1; i<vec.length; i++) {
			
			if(vec[i].length() > vec[posicionMayor].length())
				
				posicionMayor = i;	
		}
		
		return vec[posicionMayor];
		
	}

}
