package codigos_converter_temperatura;

public class RootArchiveConverterTemperatura {
	public double celToFa(double temperatura) {
		return temperatura * 9 / 5 + 32;//Exemplo
	}
	
	
	 public static double converter(String tipo, double valor) {
	        if (tipo.equals("CtoF")) {
	            return valor * 9 / 5 + 32;
	        } else if (tipo.equals("FtoC")) {
	            return (valor - 32) * 5 / 9;
	        } else if (tipo.equals("CtoK")) {
	            return valor + 273.15;
	        } else if (tipo.equals("KtoC")) {
	            return valor - 273.15;
	        } else {
	            throw new IllegalArgumentException("Conversão inválida");
	        }
	    }
}