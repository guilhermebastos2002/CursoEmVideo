package org.example;

public class Cachorro extends Mamifero{
    private int ossos;
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
        this.ossos = 0;
    }

    public int getOssos() {
        return ossos;
    }

    public void setOssos(int ossos) {
        this.ossos = ossos;
    }

    @Override
    public void alimentar() {
        System.out.println("O cachorro comeu comida de cachorro.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro está latindo.");
    }

    @Override
    public void locomover() {
        System.out.println("Cachorro está andando.");
    }

    public void enterrarOsso() {
        System.out.println("O cachorro enterrou um osso.");
        this.ossos = this.getOssos() + 1;
        System.out.println("Tem " + this.getOssos() + " osso(s) enterrados.");
    }

    public void abanarRabo() {
        System.out.println("O cacorro abanou o rabo.");
    }
}
