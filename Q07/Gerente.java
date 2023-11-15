package Q07;

public class Gerente extends Funcionario{
    private int quantidadeDeSubordinados;

    //Método Construtor:
    public Gerente(int id, String nome, String alocacao, double valorHora, int quantidadeDeSubordinados) {
        super(id, nome, alocacao, valorHora);
        this.quantidadeDeSubordinados = quantidadeDeSubordinados;
    }

    @Override
    public double calculaSalario(double horasTrabalhadas) {
        double salariobase = super.calculaSalario(horasTrabalhadas);
        double bonificacao = salariobase * 0.4;
        return salariobase + bonificacao;
    }

    @Override
    public double calculaSalario() {
        double salariobase = super.calculaSalario();
        double bonificacao = salariobase * 0.4;
        return salariobase + bonificacao;
    }

    //Método toString:
    @Override
    public String toString() {
        return "Gerente{" + "quantidadeDeSubordinados=" + quantidadeDeSubordinados + '}';
    }
}
