package questao7;

public class AumentoPrct implements AplicacaoAumento {
    private double percentual;

    public AumentoPrct(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public void aplicarAumento(Empregado empregado) {
        double salarioAtual = empregado.getSalarioMensal();
        double novoSalario = salarioAtual * (1 + percentual / 100);
        empregado.setSalarioMensal(novoSalario);
    }
}
