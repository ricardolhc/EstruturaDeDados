package com.group.Marco_1.ProvaPratica_1.Questao_5;

public class Noh {

    private int info;
    private Noh proximo;
    private Noh anterior;

    public Noh(int info) {
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public int getInfo() { 
        return this.info;
    }

    public Noh getProximo() { 
        return this.proximo;
    }

    public void setProximo(Noh n) {
        this.proximo = n;
    }

    public Noh getAnterior() { 
        return this.anterior;
    }

    public void setAnterior(Noh n) {
        this.anterior = n;
    }
}