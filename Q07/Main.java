package Q07;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso
        Funcionario funcionario = new Funcionario(1, "Matheus", "Departamento de Informática", 20.0);
        System.out.println("Salário do funcionário: " + funcionario.calculaSalario(180));

        Gerente gerente = new Gerente(2, "Kauan", "Departamento de Administração", 25.0, 5);
        System.out.println("Salário do gerente: " + gerente.calculaSalario(180));
        System.out.println("Gerente: " + gerente);
        System.out.println("Funcionário: " + funcionario);
    }
}