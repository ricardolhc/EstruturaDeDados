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

        long tempoComeco = System.nanoTime();
        boolean buscaBinariaIterativa = vetor.buscaBinariaIterativa(500);
        long tempoFinal = System.nanoTime();

        long duracao = tempoFinal - tempoComeco;

        System.out.println("Busca iterativa: " + buscaBinariaIterativa + "; Tempo: " + duracao + "ns");

        tempoComeco = System.nanoTime();
        boolean buscaBinariaRecursiva = vetor.buscaBinariaRecursiva(500);
        tempoFinal = System.nanoTime();

        duracao = tempoFinal - tempoComeco;

        System.out.println("Busca recursiva: " + buscaBinariaRecursiva + "; Tempo: " + duracao + "ns");
    }
}