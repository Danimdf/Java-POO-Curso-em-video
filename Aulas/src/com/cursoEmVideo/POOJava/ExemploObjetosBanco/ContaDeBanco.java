package com.cursoEmVideo.POOJava.ExemploObjetosBanco;

public class ContaDeBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaDeBanco(int numConta) {
       this.status = false;
       this.saldo = 0.0f;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);

        if (t == "CC")
            setSaldo(50);
        else
            setSaldo(150);
    }
    public void fecharConta() {
        if (saldo > 0)
            System.out.println("Conta com dinheiro");
        else if (saldo < 0)
            System.out.println("Conta em débito!");
        else
            setStatus(false);
    }
    public void depositar(float v) {
        if (status == true)
            setSaldo(getSaldo() + v);
        else
            System.out.println("Impossivel depositar em uma conta inexistente");
    }
    public void sacar(float v) {
        if (status == true) {
            if (saldo > v)
                setSaldo(getSaldo() - v);
            else
                System.out.println("Saldo insuficiente");
        } else
            System.out.println("Conta inexistente, impossível sacar");
    }
    public void pagarMensal() {
        float v;

        if (tipo == "CC")
            v = 12;
        else
            v = 20;

        if (status == true) {
            if (saldo > v)
                setSaldo(getSaldo() - v);
            else
                System.out.println("Saldo Insuficiente");
        } else
            System.out.println("Conta inexistente!");
    }
}
