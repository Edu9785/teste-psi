package com.example.preparacaoteste;

public class teste {

   public String numeroUm;
   public String NumeroDois;
   public String verificacao;

public teste (String numeroUm, String NumeroDois, String verificacao) {
    this.numeroUm = numeroUm;
    this.NumeroDois = NumeroDois;
    this.verificacao = verificacao;
}

    public void setNumeroUm(String numeroUm) {
        this.numeroUm = numeroUm;
    }

    public void setNumeroDois(String numeroDois) {
        NumeroDois = numeroDois;
    }

    public String getNumeroDois() {
        return NumeroDois;
    }

    public String getNumeroUm() {
        return numeroUm;
    }

    public String getVerificacao() {
        return verificacao;
    }

    public void setVerificacao(String verificacao) {
        this.verificacao = verificacao;
    }

    public teste() {
    }
}
