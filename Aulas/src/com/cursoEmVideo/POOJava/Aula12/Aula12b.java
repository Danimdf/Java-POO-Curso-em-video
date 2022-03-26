package com.cursoEmVideo.POOJava.Aula12;

public class Aula12b {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        a.setCorPena("Azul");
        System.out.println("A cor da pena é: " + a.getCorPena());
        p.soltarBolha();
        r.alimentar();
        m.locomover();
    }
}
