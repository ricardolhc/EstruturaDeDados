package com.group.Marco_1.ProvaPratica_1.Questao_3;

// Questão 3) Implemente, em Linguagem Java, um método que calcula o enésimo termo da série de 
// Fibonacci, tendo como base a descrição matemática recursiva a seguir.
// Exemplo:
// Primeiros números da série de Fibonacci 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, …


public class Main {
    
    public static void main(String[] args) {

        int n = 11;

        for(int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else { 
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
