package com.group.Marco_1.ProvaPratica_1.Questao_9;

// Questão 9) Implemente um método que ordene uma lista simplesmente encadeada de inteiros utilizando o 
// algoritmo bubbleSort.

public class Main {

    public static void main(String[] args) {

        LSE lse = new LSE();

        lse.insereInicio(1);
        lse.insereFim(2);
        lse.insereFim(4);
        lse.insereFim(3);
        lse.insereFim(5);
        lse.insereInicio(6);

        lse.bubbleSort();

        System.out.println(lse.imprimirLista());

    }   
}
