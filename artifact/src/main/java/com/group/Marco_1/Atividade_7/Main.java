package com.group.Marco_1.Atividade_7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 1000;

        Random gerador = new Random();

        Vetor vetor = new Vetor(n);

        for(int j = 0; j < n; j++) {
            int numeroAleatorio = gerador.nextInt();
            vetor.adiciona(numeroAleatorio);
        }

        System.out.println("Máximo iterativa: " + vetor.maximoIterativa());
        System.out.println("Máximo recursiva: " + vetor.maximoRecursiva());
        
        




    }

    


}