package com.group.Marco_1.Atividade_12;

public class Main {
    
    public static void main(String[] args) {

        PilhaLista pilha = new PilhaLista();

        System.out.println("Pilha: " + pilha.toString());

        pilha.push("a");
        pilha.push("r");
        pilha.push("a");
        pilha.push("r");
        pilha.push("a");

        System.out.println("Pilha: " + pilha.toString());

        System.out.println("É um palindromo: " + pilha.isPalindromo());
    }

}
