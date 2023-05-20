package com.group.Marco_1.ProvaPratica_1.Questao_6;

// Questão 6) Implemente um método que insere números inteiros em uma lista duplamente encadeada de 
// forma ordenada. Por exemplo, suponha que [2, 5, 7, 10] é uma LDE. Se o número 6 for inserido isso 
// ocorrerá entre os elementos 5 e 7. O protótipo do método deve ser o seguinte. Explique no seu PIÁ a 
// complexidade para o pior caso. 
// public void add_ordenado(int info);
// 3n + 11


public class Main {

    public static void main(String[] args) {

        Lista lista = new LDE();

        lista.insereFim(2);
        lista.insereFim(5);
        lista.insereFim(7);
        lista.insereFim(10);

        lista.add_ordenado(6);

        System.out.println(lista.getListaInicio());
    }
    
}
