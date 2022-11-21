package com.example.preparacaoteste;

public class teste {

   public int numeroUm;
   public int numeroDois;
   public int verificacao;

    public teste() {
    }

    public teste (int numeroUm, int numeroDois, int verificacao) {
    this.numeroUm = numeroUm;
    this.numeroDois = numeroDois;
    this.verificacao = verificacao;
    }

    public void setNumeroUm(int numeroUm) {
        this.numeroUm = numeroUm;
    }

    public void setNumeroDois(int numeroDois) {
        this.numeroDois = numeroDois;
    }

    public int getNumeroDois() {
        return numeroDois;
    }

    public int getNumeroUm() {
        return numeroUm;
    }

    public int getVerificacao() {
        return verificacao;
    }

    public void setVerificacao(int verificacao) {
        this.verificacao = verificacao;
    }

}
