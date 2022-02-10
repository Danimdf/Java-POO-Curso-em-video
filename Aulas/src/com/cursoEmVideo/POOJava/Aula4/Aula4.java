package com.cursoEmVideo.POOJava.Aula4;

public class Aula4 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("Nick", "Amarela", 1.4f);
        c1.status();

        Caneta c2 = new Caneta("adsa", "Azul", 5.0f);
        c2.status();
        /*c1.setModelo("BIC");
        c1.setPonta(0.5f);

        System.out.println("Tenho uma caneta " + c1.getModelo());
        System.out.println("Tenho uma caneta com a ponta " + c1.getPonta());*/

    }
}
