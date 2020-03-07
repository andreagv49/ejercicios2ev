package unidad4.colecciones;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("introduce una frase");
		String frase = scan.nextLine();
		frase.split(" ");
		
		Scanner sc = new Scanner(frase);
		List<String> coleccion1 = new ArrayList<>();
		List<String> coleccion2 = new ArrayList<>();
		
		while(sc.hasNext()) {
			
			String palabra = sc.next();
			
			if (!coleccion1.contains(palabra)) {
				coleccion1.add(palabra);
			}else {
				coleccion2.add(palabra);
				coleccion1.remove(palabra);
			}

		}
		
		System.out.println(coleccion1);
		System.out.println(coleccion2);;
		
		scan.close();
		sc.close();

	}

}
