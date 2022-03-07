package com.cursoEmVideo.POOJava.Aula7;

public class aula7 {
    public static void main (String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador ("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3 ,1);
        l[1] = new Lutador ("PutScript", "Brasil", 29, 1.68f, 57.8f, 14, 2 ,3);
        l[2] = new Lutador ("SnapShadow", "EUA", 35, 1.65f, 80.9f, 12, 2 ,1);
        l[3] = new Lutador ("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0 ,2);
        l[4] = new Lutador ("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3 ,1);
        l[5] = new Lutador ("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3 ,1);

        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();

    }

}
