package com.cursoEmVideo.POOJava.Aula10;

public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    public Aluno() {
        this.matr = matr;
        this.curso = curso;
    }

    public void cancelarmatr() {
        System.out.println("Matrícula Cancelada!");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
