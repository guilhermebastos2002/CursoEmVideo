package org.example;

public class Cobra extends Reptil{
    public Cobra(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("A cobra está rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo comida de cobra.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de cobra.");
    }
}
