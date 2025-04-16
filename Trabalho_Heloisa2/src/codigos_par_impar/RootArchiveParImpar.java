package codigos_par_impar;

public class RootArchiveParImpar {
    public static void verificarNumero(int numero) {
        boolean ehPar = false;
        int resto = numero % 2;

        if (resto == 0) {
            ehPar = true;
        }

        if (ehPar == true) {
            System.out.println("O número " + numero + " é par.");
        } else if (ehPar == false) {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }

    public static void main(String[] args) {
        verificarNumero(7);
        verificarNumero(10);
    }
}