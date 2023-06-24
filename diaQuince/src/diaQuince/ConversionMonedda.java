package diaQuince;

import java.util.Scanner;

public class ConversionMonedda {
	
	public static void main(String[] args) {
		Divisas conversion = new Divisas();
		
		Scanner dato = new Scanner(System.in);
		System.out.print("Ingrese la cantidad en peso mexicano: ");
		conversion.setPesos(dato.nextDouble());
		
		
		System.out.println("La cantidad en quetzales es : " + conversion.quetzales());
		
		System.out.println("La cantidad en soles es : " + conversion.soles());
		
		System.out.println("La cantidad en dolares es : " + conversion.dolares());
		
		
		
		
		
		
		
	}
	
	

}
