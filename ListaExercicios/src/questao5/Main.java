package questao5;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("123", "PC Gamer Pichau", 2, 150.0);
        System.out.println("Total da Fatura: R$ " + fatura.getTotalFatura());
    }
}
