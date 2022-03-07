package com.cursoEmVideo.POOJava.Aula7;

import com.cursoEmVideo.POOJava.Aula7.Lutador;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante){
        if (desafiado.getCategoria() == desafiante.getCategoria() && desafiado != desafiante) {
            System.out.println("Luta marcada!");
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        } else {
            System.out.println("Luta não pode acontecer!");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("-------- DESAFIADO --------");
            this.desafiado.apresentar();
            System.out.println("-------- DESAFIANTE --------");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor) {
                case 0:
                    System.out.println("-----------------------------");
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("------------------------------");
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }
}
