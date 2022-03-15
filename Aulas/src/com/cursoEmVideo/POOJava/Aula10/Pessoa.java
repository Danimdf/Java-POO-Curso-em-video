package com.cursoEmVideo.POOJava.Aula10;

public class Pessoa implements FichaPessoal {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerNiver() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String FichaPessoal() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
