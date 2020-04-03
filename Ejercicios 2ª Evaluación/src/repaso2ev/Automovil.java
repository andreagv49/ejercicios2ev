package repaso2ev;

public class Automovil {

	private String modelo;
	private double capacidadDeposito;
	private double cantidadInicialDeposito;
	private double consumo;
	private double kmRecorridos;
	private double combustibleConsumido;
	
	public Automovil (String modelo, double capacidadDeposito, double cantidadInicialDeposito, double consumo) {
		
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.cantidadInicialDeposito = cantidadInicialDeposito;
		this.consumo = consumo;
		this.kmRecorridos = 0;
		this.combustibleConsumido = 0;
	}
	
	public Automovil (String modelo, double capacidadDeposito, double consumo) {
		
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.consumo = consumo;
		this.cantidadInicialDeposito = capacidadDeposito;
		this.kmRecorridos = 0;
		this.combustibleConsumido = 0;
	}
	
	public double llenar_deposito() {
		
		cantidadInicialDeposito = capacidadDeposito;
		return 0;
	}
	
	public double llenar_deposito (int litros) {
		
		if(litros+cantidadInicialDeposito > capacidadDeposito)
			
			return litros+cantidadInicialDeposito-capacidadDeposito;
		else
			
			return 0;
	}
	
	public double desplazarse (double km) {
		
		if (cantidadInicialDeposito > consumo*km) {
			//se puede
			kmRecorridos = kmRecorridos + km;
			combustibleConsumido = combustibleConsumido + consumo*km;
			return cantidadInicialDeposito - (consumo*km);
		}else {
			//no se puede
			return -1;
		}
	}
	
	public String get_modelo() {
		
		return modelo;
	}
	
	public double get_consumo() {
		
		return consumo;
	}
	public double get_capacidadDeposito() {
		
		return capacidadDeposito;
	}
	public double get_kmRecorridos() {
		
		return kmRecorridos;
	}
	public double get_combustibleConsumido() {
		
		return combustibleConsumido;
	}
	
	@Override
	public String toString() {
		return modelo + " " + capacidadDeposito + " " + cantidadInicialDeposito+ " " + consumo;
	}

}
