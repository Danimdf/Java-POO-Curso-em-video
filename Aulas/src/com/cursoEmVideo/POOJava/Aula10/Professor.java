package com.cursoEmVideo.POOJava.Aula10;

public class Professor extends Pessoa{
    private String espec;
    private float salario;

    public Professor() {
        this.espec = espec;
        this.salario = salario;
    }

    public void aumento(int valor) {
        this.setSalario(this.getSalario() + valor);
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
