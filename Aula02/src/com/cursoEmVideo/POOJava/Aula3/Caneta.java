package com.cursoEmVideo.POOJava.Aula3;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    protected void rabiscar () {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar por que a caneta esta tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    protected void tampar () {
        this.tampada = true;
    }

    void destampar () {
        this.tampada = false;
    }
}
