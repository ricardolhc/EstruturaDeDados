package com.group.Marco_1.ProvaPratica_1.Questao_12;


// Implemente, em Java, um método recursivo que representa a definição matemática recursiva a seguir. Além disso, 
// responda: a implementação recursiva seria sua primeira opção para resolver o problema do somatório de números inteiros? 
// Justifique sua resposta, mostrando matematicamente o porquê!


/*
 * ANOTAÇÕES
 * 
 * Caso 1: n = m retorna o próprio valor de n ou m, visto que k não precisa variar pois m já atingiu n, e também k não
 * existe no algoritmo visto que ele é recursivo
 * 
 * Caso 2: n > m, k deve variar de m até n, somando os valores de k a cada iteração, entretando visto que a atividade
 * pediu que seja recursiva, k não existe no algoritmo
 * 
 */

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
