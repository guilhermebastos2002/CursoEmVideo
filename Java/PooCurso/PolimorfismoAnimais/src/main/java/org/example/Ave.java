package org.example;

public class Ave extends Animal{
    private String corPena;

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
    System.out.println("Arara está voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo comida de ave");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons do ave");
    }

    public void fazerNinho() {
        System.out.println("Ave está fazendo o seu ninho");
    }
}
