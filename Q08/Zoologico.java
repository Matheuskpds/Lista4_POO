package Q08;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais;

    //método construtor:
    public Zoologico() {
        this.animais = new ArrayList<Animal>();
    }

    public void adicionaAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void alimentaAnimais() {
        for (Animal animal : animais) {
            animal.alimenta();
        }
    }
}
