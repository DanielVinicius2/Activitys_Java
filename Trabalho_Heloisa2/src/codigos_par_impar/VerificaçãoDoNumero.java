package codigos_par_impar;

public class VerificaçãoDoNumero {
	public static void verificacao(int numero){
		if(numero % 2 == 0) {
			System.out.printf("O numero '%d' é par \n",numero );
		}
		else {
			System.out.printf("O numero '%d' é impar \n",numero );
		}
	}

}


