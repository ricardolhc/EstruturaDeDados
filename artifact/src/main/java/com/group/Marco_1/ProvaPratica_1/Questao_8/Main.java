package com.group.Marco_1.ProvaPratica_1.Questao_8;

// Questão 8) Implemente um método que concatene duas listas duplamente encadeadas de números inteiros. 
// Por exemplo, dada a LDE [1,2,3,4] e outra LDE [5,6,7, 8] o resultado será uma nova LDE resultante da 
// concatenação das duas anteriores [1,2,3,4,5,6,7,8]. O protótipo é o seguinte:
// public void concat(LDE l);


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
