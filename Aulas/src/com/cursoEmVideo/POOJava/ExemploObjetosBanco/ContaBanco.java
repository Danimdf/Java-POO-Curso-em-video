package com.cursoEmVideo.POOJava.ExemploObjetosBanco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo de conta: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
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

        if (this.getTipo() == "CC")
            v = 12;
        else
            v = 20;

        if (getStatus() == true) {
            if (saldo > v)
                this.setSaldo(this.getSaldo() - v);
            else
                System.out.println("Mensalidades Paga por " + getDono());
        } else
            System.out.println("Conta inexistente!");
    }

    public ContaBanco() {
       this.setStatus(false);
       this.setSaldo(0);
    }

    public int getNumConta() {
        return this.numConta;
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
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
