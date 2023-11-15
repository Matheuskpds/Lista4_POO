package Q08;

public class Girafa extends Animal{
    //método construtor:
    public Girafa(String nome) {
        this.nome = nome;
    }

    @Override
    public void alimenta() {
        System.out.println(super.nome + " Comendo folhas...");
    }
}
