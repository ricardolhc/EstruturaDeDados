package com.group.Marco_1.TrabalhoT2.Atividade_2;

import com.group.Marco_1.TrabalhoT2.Atividade_2.entities.Aluno;
import com.group.Marco_1.TrabalhoT2.Atividade_2.lse.LSE;

public class Main {

    public static void main(String[] args) {

        LSE lista = new LSE();

        Aluno aluno1 = new Aluno("Marco", 1, 1);
        Aluno aluno2 = new Aluno("João", 2, 2);
        Aluno aluno3 = new Aluno("Maria", 3, 3);
        Aluno aluno4 = new Aluno("José", 4, 4);
        Aluno aluno5 = new Aluno("Pedro", 5, 5);

        lista.insereInicio(aluno1);
        lista.insereFim(aluno2);
        lista.insereFim(aluno3);
        lista.insereFim(aluno4);
        lista.insereFim(aluno5);

        System.out.println("Lista normal: " + lista.imprimirLista());

        lista.inverterLista();

        System.out.println("Lista invertida: " + lista.imprimirLista());
    }
    
}
