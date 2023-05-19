package com.group.Marco_1.ProvaPratica_1.Questao_6;

public class LDE implements Lista {// TAD Lista duplamente encadeada

    private Noh inicio;
    private Noh fim;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(int info) {
        Noh novo = new Noh(info);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    @Override
    public void insereFim(int info) {
        Noh novo = new Noh(info);

        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    @Override
    public boolean estahVazia() {
        return inicio == null || fim == null;
    }

    @Override
    public boolean remove(int info) {
        Noh p = consultarInfo(info);

        if (p == null) {
            return false;
        }

        if (p == inicio) {
            inicio = p.getProximo();

            if (inicio != null) {
                inicio.setAnterior(null);
            } else {
                fim = null;
            }

        } else if (p.getProximo() == null) {
            p.getAnterior().setProximo(null);
            fim = p.getAnterior();
        } else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }
        return true;
    }

    public Noh consultarInfo(int info) {
        Noh p = inicio;

        while (p != null && p.getInfo() != info) {
            p = p.getProximo();
        }

        return p;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;

        for (Noh i = inicio; i != null; i = i.getProximo()) {
            tamanho++;
        }

        return tamanho;
    }

    @Override
    public String getListaInicio() {
        String lista = "";

        for (Noh i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }

    @Override
    public String getListaFim() {
        String lista = "";

        for (Noh i = fim; i != null; i = i.getAnterior()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }

    @Override
    public void add_ordenado(int info) {

        Noh novo = new Noh(info);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else if (info < inicio.getInfo()) {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        } else if (info > fim.getInfo()) {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        } else {
            Noh p = inicio;

            while (p != null && p.getInfo() < info) {
                p = p.getProximo();
            }

            novo.setProximo(p);
            novo.setAnterior(p.getAnterior());
            p.getAnterior().setProximo(novo);
            p.setAnterior(novo);
        }
    }

}
