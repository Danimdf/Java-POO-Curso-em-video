package com.cursoEmVideo.POOJava.Aula12;

public class Reptil extends Animal{

    private char corEscama;

    public char getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(char corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
}
