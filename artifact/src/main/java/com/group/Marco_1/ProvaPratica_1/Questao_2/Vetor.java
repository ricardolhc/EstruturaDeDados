package com.group.Marco_1.ProvaPratica_1.Questao_2;

public class Vetor {

    private float[] valor;
    private int total;

    public Vetor(int tamanhoMaximo) {
        valor = new float[tamanhoMaximo];
        total = 0;
    }

    public void adiciona(int numero) {
        valor[total] = numero;
        total++;
    }

    public void selectionSort () {
        for (int i = valor.length - 1; i >= 0; i--) {
            int maior = this.posMaior(i);
            if (maior != i) {
                this.troca(i, maior);
            }
        }
     }

     /* Métodos auxiliares: */
    private int posMaior (int fim) {
        int maior = fim;

        for (int i = fim-1; i >= 0; i--) {
            if (valor[i] > valor[maior]) {
                maior = i;
            }
        }
        return maior;
    }

    private void troca (int a, int b) {
        float aux;
        aux = valor[a];
        valor[a] = valor[b];
        valor[b] = aux;
    }

    public void imprime () {
        for (int i = 0; i < total; i++) {
            System.out.println(valor[i]);
        }
    }
     
    
}
