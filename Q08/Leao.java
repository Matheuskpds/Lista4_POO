package Q08;

public class Leao extends Animal{
    //método construtor:
    public Leao(String nome) {
        this.nome = nome;
    }
    @Override
    public void alimenta() {
        System.out.println(super.nome + " Comendo carne...");
    }
}
