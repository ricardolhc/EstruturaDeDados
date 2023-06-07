package com.group.Marco_1.TrabalhoT2.Atividade_2.lse;

import com.group.Marco_1.TrabalhoT2.Atividade_2.entities.Aluno;

public interface Lista {

    public void insereInicio(Aluno info);
    public void insereFim(Aluno info);
    public boolean estahVazia();
    public boolean remove(Aluno info);
    public int tamanho();
    public String imprimirLista();
    
}
