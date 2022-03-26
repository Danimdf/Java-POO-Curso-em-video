package com.cursoEmVideo.POOJava.Aula12;

public class Aula12b {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru cang = new Canguru();
        Cachorro k = new Cachorro();
        Goldfish gold = new Goldfish();

        cang.locomover();
        k.emitirSom();
        gold.soltarBolha();
    }
}
