package com.cursoEmVideo.POOJava.Aula11;

public class Bolsista extends Aluno1{
    public float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando a bolsa de " + this.getNome());
    }

    @Override
    public void pagarMatricula() {
        System.out.println(this.getNome() + " é Bolsista! Pagamento sendo feito!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
