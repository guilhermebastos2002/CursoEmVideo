package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int escolha1;
        int escolha2;
        int escolha3;
        int escolha4;
        int escolha5;
        int escolha6;
        int escolha7;
        boolean continua = true;

        Scanner sc = new Scanner(System.in);
        Arara ara1 = new Arara(10.5f, 5, 4, "Verde");
        Cachorro cach1 = new Cachorro(40.5f, 8, 4, "Dourado");
        Canguru can1 = new Canguru(60.5f, 13, 4, "Marrom");
        Cobra cob1 = new Cobra(10.5f, 10, 0, "verde");
        Goldfish gol1 = new Goldfish(2.5f, 2, 2, "Laranja");
        Tartaruga tar1 = new Tartaruga(30.5f, 20, 4, "Verde");

        while(continua) {
            System.out.println(" ");
        System.out.println("Escolha uma opção: ");
        System.out.println("Para Arara digite 1.");
        System.out.println("Para Cachorro digite 2.");
        System.out.println("Para Canguru digite 3.");
        System.out.println("Para Cobra digite 4.");
        System.out.println("Para Goldfish digite 5.");
        System.out.println("Para Tartaruga digite 6.");
        System.out.println("Para sair digite 0.");
        escolha1 = sc.nextInt();
        switch(escolha1) {
            case 1:
                System.out.println("Agora digite a ação da Arara: ");
                System.out.println("Para locomover digite 1.");
                System.out.println("Para alimentar digite 2.");
                System.out.println("Para emitir som digite 3.");
                System.out.println("Para fazer ninho digite 4.");
                escolha2 = sc.nextInt();
                switch(escolha2) {
                    case 1:
                        ara1.locomover();
                        break;
                    case 2:
                        ara1.alimentar();
                        break;
                    case 3:
                        ara1.emitirSom();
                        break;
                    case 4:
                        ara1.fazerNinho();
                        break;
                }
                break;
            case 2:
                System.out.println("Agora digite a ação do Cachorro: ");
                System.out.println("Para locomover digite 1.");
                System.out.println("Para alimentar digite 2.");
                System.out.println("Para emitir som digite 3.");
                System.out.println("Para enterrar osso digite 4.");
                escolha3 = sc.nextInt();
                switch(escolha3) {
                    case 1:
                        cach1.locomover();
                        break;
                    case 2:
                        cach1.alimentar();
                        break;
                    case 3:
                        cach1.emitirSom();
                        break;
                    case 4:
                        cach1.enterrarOsso();
                        cach1.getOssos();
                        break;
                }
                break;
            case 3:
                System.out.println("Agora digite a ação do Canguru: ");
                System.out.println("Para locomover digite 1.");
                System.out.println("Para alimentar digite 2.");
                System.out.println("Para emitir som digite 3.");
                System.out.println("Para usar a bolsa digite 4.");
                escolha4 = sc.nextInt();
                switch(escolha4) {
                    case 1:
                        can1.locomover();
                        break;
                    case 2:
                        can1.alimentar();
                        break;
                    case 3:
                        can1.emitirSom();
                        break;
                    case 4:
                        can1.usarBolsa();
                        break;
                }
                break;
            case 4:
                System.out.println("Agora digite a ação da Cobra: ");
                System.out.println("Para locomover digite 1.");
                System.out.println("Para alimentar digite 2.");
                System.out.println("Para emitir som digite 3.");
                escolha5 = sc.nextInt();
                switch(escolha5) {
                    case 1:
                        cob1.locomover();
                        break;
                    case 2:
                        cob1.alimentar();
                        break;
                    case 3:
                        cob1.emitirSom();
                        break;
                }
                break;
            case 5:
                System.out.println("Agora digite a ação do Goldfish: ");
                System.out.println("Para locomover digite 1.");
                System.out.println("Para alimentar digite 2.");
                System.out.println("Para emitir som digite 3.");
                System.out.println("Para soltar bolha digite 4.");
                System.out.println("Para pensar digite 5.");
                escolha6 = sc.nextInt();
                switch(escolha6) {
                    case 1:
                        gol1.locomover();
                        break;
                    case 2:
                        gol1.alimentar();
                        break;
                    case 3:
                        gol1.emitirSom();
                        break;
                    case 4:
                        gol1.soltarBolha();
                        break;
                    case 5:
                        gol1.pensar();
                        break;
                }
                break;
            case 6:
                System.out.println("Agora digite a ação da Tartaruga: ");
                System.out.println("Para locomover digite 1.");
                System.out.println("Para alimentar digite 2.");
                System.out.println("Para emitir som digite 3.");
                escolha7 = sc.nextInt();
                switch(escolha7) {
                    case 1:
                        tar1.locomover();
                        break;
                    case 2:
                        tar1.alimentar();
                        break;
                    case 3:
                        tar1.emitirSom();
                        break;
                }
                break;
            case 0:
                System.out.println("Saindo do programa...");
                continua = false;
                break;
        }

        }
    }
}

