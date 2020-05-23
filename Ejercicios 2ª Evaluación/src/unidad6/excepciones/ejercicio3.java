package unidad6.excepciones;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio3 {

	static double cateto (String catet) {
		
		double c = Double.parseDouble(catet);
		
		if(c<0) {
			throw new IllegalArgumentException();
		}
		return c;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		double cateto1 = 0;
		double cateto2 = 0;
		double hipo = 0;
		
		boolean repetir = true;
		
		while(repetir){
			
			System.out.print("> ");
			String [] comandos = scan.nextLine().split(" ");
			
			try {
				
				if(comandos.length == 2 && comandos[0].equalsIgnoreCase("a")) {
					
					cateto1 = cateto(comandos[1]);
					repetir = true;
				}else if (comandos.length == 2 && comandos[0].equalsIgnoreCase("b")) {
					
					cateto2 = cateto(comandos[1]);
					repetir = true;
				}else if (comandos.length == 1 && comandos[0].equalsIgnoreCase("c")) {
					
					hipo = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
					
					System.out.printf(Locale.US, "La hipotenusa es %.2f\n", hipo);
					
					cateto1 = 0;
					cateto2 = 0;
					repetir = true;
				}else if(comandos.length == 1 && comandos[0].equalsIgnoreCase("f")) {
					
					System.out.println("Fin de programa");
					repetir = false;
				}else {
					System.out.println("No es un comando válido");
					repetir = true;
				}
			}catch(NumberFormatException e) {
				
				System.out.println("No es un numero");
				
			}catch (IllegalArgumentException e) {
				
				System.out.printf("'%s' no es un valor válido para el cateto\n", comandos[1]);
			}

		}
		
		scan.close();
		
		

	}

}
