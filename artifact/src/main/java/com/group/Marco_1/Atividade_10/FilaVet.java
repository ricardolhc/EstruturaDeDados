package com.group.Marco_1.Atividade_10;

public class FilaVet implements IFila {

    private int numeroElementosFila;
    private int inicio;
    private int[] vetFila;

    public FilaVet(int tamanho) {
        this.numeroElementosFila = 0;
        this.inicio = 0;
        this.vetFila = new int[tamanho];
    }

    @Override
    public boolean add(int info) {
        if(numeroElementosFila == vetFila.length) {
            System.out.println("Fila cheia!");
            return false;
        }
        int fim = (inicio + numeroElementosFila) % vetFila.length;
        vetFila[fim] = info;
        numeroElementosFila++;
        return true;
    }

    @Override
    public boolean remove() {
        if(this.isEmpty()) {
            System.out.println("Filá vazia!");
            return false;
        }
        inicio = (inicio + 1) % vetFila.length;
        numeroElementosFila--;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return numeroElementosFila == 0;
    }

    @Override
    public int size() {
        return numeroElementosFila;
    }

    @Override
    public void imprimirFila() {
        if(this.isEmpty()) {
            System.out.println("Filá vazia!");
            return;
        }
        int fim = (inicio + numeroElementosFila) % vetFila.length;
        for(int i = inicio; i < fim; i++) {
            System.out.println(vetFila[i]);
        }
    }

}