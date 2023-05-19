package com.group.Marco_1.ProvaPratica_1.Questao_6;

// (Questão 5) Implemente um método que retorna o número de elementos pares da lista duplamente encadeada. 
// Este método deve possuir o seguinte protótipo:
// public int nroPares();

public class Main {

    public static void main(String[] args) {

        Lista lista = new LDE();

        lista.insereInicio(1);
        lista.insereInicio(2);
        lista.insereInicio(3);
        lista.insereInicio(4);
        lista.insereInicio(5);

        lista.add_ordenado(6);
    }
    
}
