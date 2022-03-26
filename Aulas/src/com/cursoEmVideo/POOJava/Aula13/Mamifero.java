package com.cursoEmVideo.POOJava.Aula13;

public class Mamifero {
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public void locomover() {
        System.out.println("Correndo");
    }

    public void alimentar() {
        System.out.println("Mamando");
    }

    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
