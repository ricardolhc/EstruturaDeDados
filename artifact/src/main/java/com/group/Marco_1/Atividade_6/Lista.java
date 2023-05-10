package com.group.Marco_1.Atividade_6;

public interface Lista {

    public void insereInicio(Object info);
    public void insereFim(Object info);
    public boolean estahVazia();
    public boolean remove(Object info);
    public int tamanho();

    // Retorna uma String que representa a lista a partir do inicio até o fim
    public String getListaInicio();

    // Retorna uma String que representa a lista a partir do fim até o inicio
    public String getListaFim();

}
