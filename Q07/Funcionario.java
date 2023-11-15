package Q07;

public class Funcionario {
    private final int id;
    private final String nome;
    private String alocacao;
    private double valorHora;

    //Método Construtor:
    public Funcionario(int id, String nome, String alocacao, double valorHora) {
        this.id = id;
        this.nome = nome;
        this.alocacao = alocacao;
        this.valorHora = valorHora;
    }

    //Métodos Getters:
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getAlocacao() {
        return alocacao;
    }
    public double getValorHora() {
        return valorHora;
    }

    //Métodos Setters:
    public void setAlocacao(String alocacao) {
        this.alocacao = alocacao;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    //Método toString:
    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", alocacao=" + alocacao + ", valorHora=" + valorHora + '}';
    }

    //Método para calcular o salário:
    public double calculaSalario(double horasTrabalhadas){
        return valorHora * horasTrabalhadas;
    }
    public double calculaSalario(){
        return valorHora * 160;
    }

}
