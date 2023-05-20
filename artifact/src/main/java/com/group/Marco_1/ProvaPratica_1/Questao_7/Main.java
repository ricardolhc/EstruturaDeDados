package com.group.Marco_1.ProvaPratica_1.Questao_7;

// Questão 7) Implemente um método para imprimir números inteiros de forma recursiva de uma lista 
// simplesmente encadeada. O protótipo é o seguinte:
// public void imprime_rec();


public class Main {

    public static void main(String[] args) {
        Lista lista = new LSE();

        lista.insereFim(1);
        lista.insereFim(2);
        lista.insereFim(3);
        lista.insereInicio(4);

        lista.imprime_rec();
    }   
}
