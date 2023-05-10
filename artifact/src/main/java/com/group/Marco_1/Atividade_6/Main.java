package com.group.Marco_1.Atividade_6;

public class Main {

    public static void main(String[] args) {

        Lista lista = new LDE();

        Aluno aluno_1 = new Aluno("João", 20, 7.5);
        Aluno aluno_2 = new Aluno("Maria", 19, 8.5);
        Aluno aluno_3 = new Aluno("José", 21, 6.5);
        Aluno aluno_4 = new Aluno("Ana", 20, 9.5);

        System.out.println(lista.estahVazia());

        lista.insereInicio(aluno_1);
        lista.insereFim(aluno_2);
        lista.insereFim(aluno_3);
        lista.insereFim(aluno_4);

        System.out.println(lista.estahVazia());

        System.out.println(lista.getListaInicio());
        System.out.println(lista.getListaFim());

        lista.remove(aluno_2);

        System.out.println(lista.getListaInicio());

    }
    
}
