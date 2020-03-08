package unidad4.colecciones;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean preguntarDeNuevo = true;
		String fraseGuardar = new String();
		Set<String> palabrasOrdenadas= new TreeSet<String>();
		
		while(preguntarDeNuevo) {
			
			System.out.print("> ");
			String frase = scan.nextLine();
			
			//convertimos a minusculas y eliminamos espacios del principio y del final
			frase = frase.toLowerCase().trim();
			
			if(frase.length() >= 6) {
				
				String texto = frase.substring(0,6);
				
				fraseGuardar = frase.substring(6).trim();
				
				if (texto.equals("texto:")) {
					//empieza bien y podemos continuar leyendo la siguiente linea
					//System.out.println("empieza por texto:");
					preguntarDeNuevo = false;
				}else {
					//no empieza bien y tenemos que volver a preguntarlo
					System.out.println("Entrada no válida");
					preguntarDeNuevo = true;
				}
			}else {
				System.out.println("Entrada no válida");
			}
			
		}
		
		
		/*------------------------------------------------------------------------------------------------*/
		 
		
		
		//guardamos la ultima palabra de la frase
		for (int i=fraseGuardar.length()-1; i>=0;i--) {
			
			char caracter = fraseGuardar.charAt(i);
			
			if(Character.isWhitespace(caracter)) {
				
				palabrasOrdenadas.add(fraseGuardar.substring(i).trim());
				fraseGuardar = fraseGuardar.substring(0, i).trim();
										
			}
		}
		
		//añadimos lo que queda
		palabrasOrdenadas.add(fraseGuardar.trim());
				
		//obtenemos el numero de longitud de palabras a mostrar
		boolean repetir = true;
		String frase2 = new String();
		Set<String> palabrasMostrar= new TreeSet<String>();
		
		int numeroCaract = 0;
		
		while(repetir) {
			System.out.print("> ");
			frase2 = scan.nextLine();
			
			if(frase2.length() >= 7) {
				
				//convertimos a minusculas y eliminamos espacios del principio y del final
				frase2 = frase2.toLowerCase().trim();
				
				String linea = frase2.substring(0,5);
				
				String numeroCaracteres = frase2.substring(5).trim();
				
				try { 
					numeroCaract = Integer.parseInt(numeroCaracteres);
					
					if(linea.equals("linea") && numeroCaract>0) {
						
						repetir = false;
						
					}else {
						//no empieza bien y tenemos que volver a preguntarlo
						System.out.println("Entrada no válida");
						repetir = true;
					}
					
				} catch (java.lang.NumberFormatException e) {
					
					System.out.printf("error: no es un número entero\n");
					repetir = true;
				}
				
			}else {
				
				System.out.println("Entrada no válida");
				repetir = true;
			}
		}
		
				
		Iterator<String> i = palabrasOrdenadas.iterator();
		
		while (i.hasNext()) {
		    
			String palabra = i.next();
			int longitud = palabra.length();
			
			if(numeroCaract == longitud) {
				
				palabrasMostrar.add(palabra);
				
			}
		}
		if(palabrasMostrar.size()>0) {
			System.out.println(palabrasMostrar);
		}else {
			System.out.println("No hay palabras de longitud "+numeroCaract);
		}
		scan.close();
	}
}
