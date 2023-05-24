package com.group.Marco_1.Atividade_10;

public class Main {

    public static void main(String[] args) {

        FilaVet fila = new FilaVet(12);

        fila.add(9);
        fila.add(8);
        fila.add(5);
        fila.add(4);
        fila.add(8);
        fila.add(2);
        fila.add(4);
        fila.add(8);
        fila.add(2);
        fila.add(1);
        fila.add(2);
        fila.add(3);

        fila.imprimirFila();
        
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();

        fila.imprimirFila();

        fila.add(17);
        fila.add(12);

        fila.imprimirFila();

        fila.remove();
        fila.remove();
        fila.remove();

        fila.imprimirFila();

        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();

        fila.imprimirFila();

        fila.add(23);
        fila.add(50);

        fila.imprimirFila();


    }
    
}
