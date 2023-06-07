package com.group.Marco_1.TrabalhoT2.Atividade_2.lse;

import com.group.Marco_1.TrabalhoT2.Atividade_2.pilha.PilhaLista;
import com.group.Marco_1.TrabalhoT2.Atividade_2.entities.Aluno;

public class LSE implements Lista {

    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    @Override
    public void insereInicio(Aluno info) {

        Noh novo = new Noh(info);

        if(this.inicio == null) {
            this.inicio = novo;
        } else {
            novo.setProximo(this.inicio);
            this.inicio = novo;
        }

    }

    @Override
    public void insereFim(Aluno info) {

        Noh novo = new Noh(info);

        if(inicio == null) {
            inicio = novo;
        } else {
            Noh ultimo = null;
            for(Noh i = inicio; i != null; i = i.getProximo()) {
                ultimo = i;
            }
            ultimo.setProximo(novo);
        }

    }

    @Override
    public boolean estahVazia() {
        return inicio == null;
    }

    @Override
    public boolean remove(Aluno info) {

        Noh anterior = null;
        Noh atual = inicio;

        while(atual != null && !atual.getInfo().equals(info)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if(atual == null) {
            return false;
        }

        if(anterior == null) {
            inicio = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }

        return true;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            tamanho++;
        }

        return tamanho;
    }

    public void inverterLista() {
        PilhaLista pilha = new PilhaLista();

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            pilha.push(i.getInfo());
        }

        inicio = null;

        while(!pilha.isEmpty()) {
            insereFim(pilha.pop());
        }
    }

    @Override
    public String imprimirLista() {

        String lista = "";

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }
}
