package unidad6.excepciones;

public class ejercicio1 {

	public static boolean isInt(String n) {
		
		try {
			Integer.parseInt(n);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
		
	}
	
	public static boolean isDouble(String n) {
		
		try {
			Double.parseDouble(n);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(isInt("15"));
		System.out.println(isInt("hola"));
		System.out.println(isInt("0.5"));
		System.out.println(isDouble("15"));
		System.out.println(isDouble("hola"));
		System.out.println(isDouble("0.5"));
		
	}


}
