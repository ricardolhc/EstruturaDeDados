package com.group.Marco_1.Atividade_18;

public class Main {
    
    public static void main(String[] args) {

        int[] arrayDesordenado = { 5, 3, 2, 4, 7, 1, 0, 6 };

        Sorts sorts = new Sorts();

        System.out.println("Heap Sort");
        sorts.heapSort(arrayDesordenado);

        System.out.println("\nQuick Sort");
        sorts.quickSort(arrayDesordenado);

        

    }

}
