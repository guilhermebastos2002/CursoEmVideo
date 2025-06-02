package org.example;

public class Goldfish extends Peixe{
    public Goldfish(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Goldfish está nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo comida de Goldfish");
    }

    public void pensar() {
        System.out.println("Goldfish está pensando, ele tem uma memória de apenas 3 segundos");
    }
}
