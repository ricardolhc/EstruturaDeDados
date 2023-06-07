package com.group.Marco_1.TrabalhoT2.Atividade_2.lse;

import com.group.Marco_1.TrabalhoT2.Atividade_2.entities.Aluno;

public class Noh {

    private Aluno info;
    private Noh proximo;

    public Noh(Aluno info) {
        this.info = info;
        this.proximo = null;
    }

    public Aluno getInfo() { 
        return this.info;
    }

    public Noh getProximo() { 
        return this.proximo;
    }

    public void setProximo(Noh n) {
        this.proximo = n;
    }
}