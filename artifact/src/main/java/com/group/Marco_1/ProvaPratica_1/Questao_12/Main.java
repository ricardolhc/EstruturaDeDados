package com.group.Marco_1.ProvaPratica_1.Questao_12;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de m: ");
        int m = scanner.nextInt();

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        if(m > n) {
            System.out.println("O valor de m deve ser menor que o valor de n");
            scanner.close();
            return;
        }

        int resultado = calcularSomatorio(m, n);

        System.out.println("O resultado do somatório é: " + resultado);

        scanner.close();
    }

    public static int calcularSomatorio(int m, int n) {
        if (n == m) {
            return m;
        } else {
            return m + calcularSomatorio(m + 1, n);
        }
    }

}
