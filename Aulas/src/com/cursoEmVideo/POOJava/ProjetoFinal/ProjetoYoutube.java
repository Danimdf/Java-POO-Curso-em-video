package com.cursoEmVideo.POOJava.ProjetoFinal;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 14 de Java");

        Gafanhoto g[] = new Gafanhoto[3];

        g[0] = new Gafanhoto("Daniela", 22, "F", "danimdf");
        g[1] = new Gafanhoto("Tiago", 44, "M", "Tiago2000");
        g[2] = new Gafanhoto("Gatinho", 5, "*", "gatinho123");

        System.out.println(g[1].toString());
        System.out.println(v[0].toString());
    }
}
