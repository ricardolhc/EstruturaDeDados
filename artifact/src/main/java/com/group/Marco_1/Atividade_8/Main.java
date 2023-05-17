package com.group.Marco_1.Atividade_8;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int n = 1000;

        Random gerador = new Random();

        Vetor vetor = new Vetor(n);

        for(int j = 0; j < n; j++) {
            int numeroAleatorio = gerador.nextInt(1000);
            vetor.adiciona(numeroAleatorio);
        }

        

    }
}