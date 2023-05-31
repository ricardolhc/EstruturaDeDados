package com.group.Marco_1.Atividade_12;

public class PilhaLista implements IPilha {

    private Noh topo;

    public PilhaLista() {
        this.topo = null;
    }

    @Override
    public boolean push(Object info) {
        Noh novo = new Noh(info);

        if(isEmpty()) {
            topo = novo;
        } else {
            novo.setProximo(topo);
            topo = novo;
        }

        return true;
    }

    @Override
    public Object pop() {
        Object info = null;

        if(!isEmpty()) {
            info = topo.getInfo();
            topo = topo.getProximo();
        }

        return info;
    }

    @Override
    public Object top() {
        Object info = null;

        if(!isEmpty()) {
            info = topo.getInfo();
        }

        return info;

    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        int cont = 0;
        Noh aux = topo;

        while(aux != null) {
            cont++;
            aux = aux.getProximo();
        }

        return cont;
    }
    
}
