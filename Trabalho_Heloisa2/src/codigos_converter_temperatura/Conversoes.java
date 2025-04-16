package codigos_converter_temperatura;

public class Conversoes {
	public static double CToK(double temperatura) {
		return temperatura + 273.15;
	}
	
	public static double CToFah(double temperatura) {
		return temperatura * 9 / 5 + 32;
	}

	public static double FahToC(double temperatura) {
		return ((temperatura - 32)/9) *5;
	}

	public static double KToC(double temperatura) {
		return temperatura - 273.25;
	
	}
}