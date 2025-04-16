package codigos_converter_temperatura;

public class Main {
	public static void main(String[] args){	
		System.out.println("Temperatura de Celsius pra Kelvin: " + Conversoes.CToK(78.9) + "K");
		System.out.println("Temperatura de Farenheit pra Celsius: " + Conversoes.FahToC(100) + "°");
		System.out.println("Temperatura de Celsius pra Farenheit: " + Conversoes.CToFah(45) + "°");
		System.out.println("Temperatura de Kelvin para Celsius: " + Conversoes.KToC(300) + "°");
		
	}	
}
