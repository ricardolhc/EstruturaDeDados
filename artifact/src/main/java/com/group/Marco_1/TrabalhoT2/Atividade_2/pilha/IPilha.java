package com.group.Marco_1.TrabalhoT2.Atividade_2.pilha;

import com.group.Marco_1.TrabalhoT2.Atividade_2.entities.Aluno;

public interface IPilha {

    public boolean push(Aluno info);
    public Aluno pop();
    public Aluno top();
    public boolean isEmpty();
    public int size();

}