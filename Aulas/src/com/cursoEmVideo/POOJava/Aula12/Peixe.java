package com.cursoEmVideo.POOJava.Aula12;

public class Peixe extends Animal{

    private char corEscama;

    public char getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(char corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void soltarBolha() {
        System.out.println("Soltou uma bolha. . . GLUB GLUB");
    }
}
