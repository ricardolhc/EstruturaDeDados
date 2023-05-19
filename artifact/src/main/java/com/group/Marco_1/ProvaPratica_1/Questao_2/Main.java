package com.group.Marco_1.ProvaPratica_1.Questao_2;

// O método Selection Sort, abaixo, sofreu um pequeno ajuste: passou a trabalhar com a seleção do maior valor, 
// colocando-o na última posição; do segundo maior valor colocando-o na penúltima posição e, assim, sucessivamente. Complete-o!

public class Main {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adiciona(5);
        vetor.adiciona(4);
        vetor.adiciona(3); 
        vetor.adiciona(2);
        vetor.adiciona(1);

        vetor.selectionSort();
        vetor.imprime();

    }
    
}
