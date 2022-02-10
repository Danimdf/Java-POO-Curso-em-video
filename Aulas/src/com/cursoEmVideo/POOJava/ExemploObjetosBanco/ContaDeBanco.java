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

        if (t == "CC") {

        }
        //se for CC ganhar 50 reais
        //se for CP ganah 150,00
    }
    public void fecharConta() {
        if (setSaldo(saldo) > 0) {

        }
        status = false;
        //se tiver dinheiro tem que sacar
        //se tiver devendo não fecha a conta
    }
    public depositar() {
        //status tem que ser true
    }
    public sacar() {
        //status tem que ser true
        //e tem que ter saldo
    }
    public pagarMensal() {
        //mensalidade sendo cobrado diretamente do saldo
        //CC 12,00
        //CP 20,00
    }
}
