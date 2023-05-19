package com.group.Marco_1.ProvaPratica_1.Questao_8;

// (Questão 5) Implemente um método que retorna o número de elementos pares da lista duplamente encadeada. 
// Este método deve possuir o seguinte protótipo:
// public int nroPares();

public class Main {

    public static void main(String[] args) {

        LDE lista1 = new LDE();

        lista1.insereFim(1);
        lista1.insereFim(2);
        lista1.insereFim(3);
        lista1.insereFim(4);

        LDE lista2 = new LDE();

        lista2.insereFim(5);
        lista2.insereFim(6);
        lista2.insereFim(7);
        lista2.insereFim(8);

        lista1.concat(lista2);

        System.out.println(lista1.getListaInicio());
    }
    
}
