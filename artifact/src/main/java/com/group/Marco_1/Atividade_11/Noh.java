package com.group.Marco_1.Questao_11;

public class Noh {
    
    private Object info;
    private Noh proximo;

    public Noh(Object info) {
        this.info = info;
        this.proximo = null;
    }

    public Object getInfo() {
        return info;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProx(Noh n) {
        this.proximo = n;
    }


}
