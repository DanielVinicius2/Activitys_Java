package questao7;

public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Maria", "Silva", 3579);
        Empregado empregado2 = new Empregado("João", "Oliveira", 6834);

        CalcSalario calculadora = new CalculoSalarioAnual();

        System.out.printf("Salário anual da %s: %.2fR$\n ",empregado1.getNome(),calculadora.calcularSalarioAnual(empregado1));
        System.out.printf("Salário anual da %s: %.2fR$ ",empregado2.getNome(),calculadora.calcularSalarioAnual(empregado2));
        
        AplicacaoAumento aumento10 = new AumentoPrct(10);
        aumento10.aplicarAumento(empregado1);
        aumento10.aplicarAumento(empregado2);

        System.out.println("\nApós aumento de 10%:");
        System.out.printf("Salário anual da %s: %.2fR$\n ",empregado1.getNome(),calculadora.calcularSalarioAnual(empregado1));
        System.out.printf("Salário anual da %s: %.2fR$ ",empregado2.getNome(),calculadora.calcularSalarioAnual(empregado2));
    }
}
