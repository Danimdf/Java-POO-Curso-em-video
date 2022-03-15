package com.cursoEmVideo.POOJava.Aula11;

import com.cursoEmVideo.POOJava.Aula10.Aluno;

public class Aula11 {
    public static void main(String[] args)
    {
        Visitante p1 = new Visitante();
        p1.setNome("João");
        p1.setIdade(22);
        p1.setSexo("Masculino");
        System.out.println(p1.toString());

        Aluno1 a1 = new Aluno1();

        a1.setCurso("Medicina");
        a1.setMatricula(1500);
        a1.pagarMatricula();

        Bolsista b1 = new Bolsista();

        b1.setBolsa(12.5f);
        b1.setSexo("masculino");
        b1.setNome("Joaquim");
        b1.pagarMatricula();

    }
}
