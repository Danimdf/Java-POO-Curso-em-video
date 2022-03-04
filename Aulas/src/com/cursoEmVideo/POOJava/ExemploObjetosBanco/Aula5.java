package com.cursoEmVideo.POOJava.ExemploObjetosBanco;

public class Aula5 {
    public static void main (String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.abrirConta("CC");
        p1.setDono("Danii");
        p1.depositar(250);
        p1.estadoAtual();
    }
}
