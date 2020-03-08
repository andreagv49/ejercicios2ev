package unidad4.colecciones;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Scanner;

public class ejercicio5 {

	static Map<String, Set<Integer>> contactos = new TreeMap<>();
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("> ");
		} while (accion(scan.nextLine()));
		scan.close();

	}
	
	static boolean accion(String texto) {
		
		String [] frase = texto.split(":");
		
		if(frase[0].equals("buscar")){

			if(frase.length != 2) {
				System.out.println("Error: formato no válido.");
			}else {
				
				String contacto = frase[1].trim();
				Set<Integer> telefonos = contactos.get(contacto);
				
				if (telefonos == null) {
					
					System.out.println("No hay contactos con ese nombre");
				}else {
					System.out.println(contactos);	
				}
				
				
			}
			
		}else if(frase[0].equals("eliminar")) {

			if(frase.length != 2) {
				System.out.println("Error: formato no válido.");
			}else {
				
				String contacto = frase[1].trim();
				Set<Integer> telefonos = contactos.get(contacto);
				
				if (telefonos == null) {
					
					System.out.println("No hay contactos con ese nombre");
				}else {
					contactos.remove(contacto);
					System.out.printf("Contacto '%s' eliminado", contacto);	
					System.out.println();
				}
			}
			
		}else if(frase[0].equals("contactos")) {
			
			if(frase.length == 1) {
				contactos.forEach((k, v) -> System.out.println(k+" - "+v));
			}else {
				System.out.println("Error: Comando incorrecto");
			}
			
		}else if(frase[0].equals("salir")) {
			
			if(frase.length == 1) {
				System.out.println("Fin de programa");
				return false;
			}else {
				System.out.println("Error: Comando incorrecto");
			}
		}else {
			
			if(frase.length != 2) {
				System.out.println("Error: Comando incorrecto");
			}else {
				String contacto = frase[1].trim();
				Integer telefono = null;
				
				if(contacto.length() == 9) {
					
					try {
						
						telefono = Integer.parseInt(contacto);
						
						contacto = frase[0].trim();
						
						Set<Integer> telefonos = contactos.get(contacto);
						
						if (telefonos == null) {
							
							telefonos = new HashSet<>();
							contactos.put(contacto, telefonos);
						}
						telefonos.add(telefono);
						
					}catch(NumberFormatException e) {
						System.out.printf("Error: %s No es un formato de número válido",contacto);
						System.out.println();
					}
					
				}else {
					System.out.printf("Error: %s No es un formato de número válido",contacto);
					System.out.println();
				}
				
			}
			
		}
		return true;
	}

}
