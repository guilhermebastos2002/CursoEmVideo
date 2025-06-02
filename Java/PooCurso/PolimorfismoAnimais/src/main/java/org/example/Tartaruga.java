package org.example;

public class Tartaruga extends Reptil{
    public Tartaruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        System.out.println("Tartaruga está andando devagar.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo comida de tartaruga.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de tartaruga.");
    }
}
