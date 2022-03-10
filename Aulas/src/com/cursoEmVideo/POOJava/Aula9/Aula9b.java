package com.cursoEmVideo.POOJava.Aula9;

public class Aula9b {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Dani", 22, "feminino");
        p[1] = new Pessoa("Simione", 22, "masculino");

        l[0] = new Livro("Game of Thrones", "George R.R", 1000, p[0]);
        l[1] = new Livro("O menino Maluquinho", "Ziraldo", 100, p[1]);
        l[2] = new Livro("Dom Casmurro", "Machado de Assis", 250, p[1]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
