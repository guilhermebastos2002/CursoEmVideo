package org.example;

public class Canguru extends Mamifero{
    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa() {
        System.out.println("O canguru usou a bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Canguru está pulando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo comida de canguru");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de Canguru");
    }
}
