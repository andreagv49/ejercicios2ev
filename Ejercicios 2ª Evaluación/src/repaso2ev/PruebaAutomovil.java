package repaso2ev;

import repaso2ev.Automovil;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class PruebaAutomovil {
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int nAutos = Integer.parseInt(scan.nextLine());
		
		DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
		simbolos.setDecimalSeparator('.');
		DecimalFormat formatea = new DecimalFormat("0.00",simbolos);
		
		//definimos el mapa de automoviles
		Map<String, Automovil> automoviles = new TreeMap<>();
		//ejemplo (1,auto1);
		
		
		//añadimos al mapa las n entradas siguientes
		
		for (int i=0; i<nAutos; i++) {
			
			String entradaArr [] = scan.nextLine().split(" ");
			
			String modelo = entradaArr[0];
			double capacidadDep = Double.parseDouble(entradaArr[1]);
			double litrosHay = Double.parseDouble(entradaArr[2]);
			double consumo = Double.parseDouble(entradaArr[3]);
			
			//creamos el objeto auto
			Automovil auto = new Automovil(modelo, capacidadDep, litrosHay, consumo);
			
			//añadimos el objeto al mapa
			automoviles.put(modelo, auto);
			
		}
		
		boolean repetir = true;
		
		while (repetir = true) {
			
			String accion = scan.nextLine().trim();
			String accionArr [] = accion.split(" ");
			
			
			if(accionArr.length != 1) {
				
				
				accion = accionArr[0];
				String modelo = accionArr[1];
				double kilometros = Double.parseDouble(accionArr[2]);
				
				if(accion.equals("desplazar")) {
					
					for (Entry<String, Automovil> e: automoviles.entrySet()) {
						
						if(e.getKey().equals(modelo)) {
							
							Automovil auto = e.getValue();
							double cantidadDeposito = auto.desplazarse(kilometros);
							
							if(cantidadDeposito == -1) {
								System.out.println("Combustible insuficiente para este desplazamiento");
							}else {
								
								double consumo = auto.get_consumo();
								double consumido = consumo*kilometros;
								System.out.println(modelo + " " + formatea.format(cantidadDeposito) + " " + formatea.format(consumido));
								
								//añadimos al objeto auto 
								//sustituimos la cantidad inicial del depósito
								double capacidadDeposito = auto.get_capacidadDeposito();
								//Automovil autoSustituir = new Automovil(modelo, capacidadDeposito ,cantidadDeposito, consumo);
								//automoviles.put(modelo,autoSustituir);
								
							}
							
						}
					}
					
				}else {
					System.out.println("nada de mmento");
				}
				
				repetir = true;	
				//System.out.println(automoviles);
			}else {
				
				accion = accionArr[0];
				if(accion.equals("fin")) {
				System.out.println("-------------------");
				for (String e: automoviles.keySet()) {
					
					String modelo = automoviles.get(e).get_modelo();
					double combRestante = automoviles.get(e).get_cantidadInicialDeposito();
					double combCons = automoviles.get(e).get_combustibleConsumido();
					double kmRec = automoviles.get(e).get_kmRecorridos();
					
					System.out.println(modelo + " " + formatea.format(combRestante)+ " " + formatea.format(kmRec) + " " + formatea.format(combCons));
				}
				}
				repetir = false;
			}
		}
		
		scan.close();
		
	}

}
