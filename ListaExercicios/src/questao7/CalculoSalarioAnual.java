package questao7;

public class CalculoSalarioAnual implements CalcSalario {
    @Override
    public double calcularSalarioAnual(Empregado empregado) {
        return empregado.getSalarioMensal() * 12;
    }
}
