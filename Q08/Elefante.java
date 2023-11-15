package Q08;

public class Elefante extends Animal{
    //método construtor:
    public Elefante(String nome) {
        this.nome = nome;
    }

    @Override
    public void alimenta() {
        System.out.println(super.nome + " Comendo amendoin...");
    }
}
