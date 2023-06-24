package diaQuince;

public class Divisas {
	
	private double pesos;
	
	public void setPesos(double pesos) {
		this.pesos = pesos;
	}
	
	public double soles() {
		double pesoSol = pesos * 0.21;
		return pesoSol;
		
	}
	
	public double quetzales() {
		double pesoQuet = pesos * 0.46;
		return pesoQuet;
		
	}
	
	public double dolares() {
		double pesoDolar = pesos * 0.058;
		return pesoDolar;
		
	}

}
