package Q08;

public class Teste {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        //Adicionando os animais:
        zoologico.adicionaAnimal(new Leao("Leão"));
        zoologico.adicionaAnimal(new Girafa("Girafa"));
        zoologico.adicionaAnimal(new Elefante("Elefante"));

        zoologico.alimentaAnimais();
    }
}
