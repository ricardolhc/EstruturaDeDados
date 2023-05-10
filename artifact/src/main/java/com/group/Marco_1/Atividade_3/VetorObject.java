package com.group.Marco_1.Atividade_3;

public class VetorObject implements IVetorObject {

    private Object[] vetor;
    private int total;

    public VetorObject(int tamanhoMaximo) {
        vetor = new Object[tamanhoMaximo];
        total = 0;
    }

    public VetorObject() {
        vetor = new Object[3];
        total = 0;
    }

    @Override
    public void adiciona(Object aluno) {
        garanteEspaco();
        vetor[total] = aluno;
        total++;
    }

    @Override
    public boolean contem(Object aluno) {
        for (int i = 0; i < total; i++) {
            if (vetor[i].equals(aluno)) {
                return true;
            } 
        }
        return false;
    }

    @Override
    public int getTamanho() {
        return total;
    }

    @Override
    public boolean cheio() {
        if(total == vetor.length) {
            return true;
        }
        return false;
    }

    private void garanteEspaco() {
        if(cheio()) {
            Object[] novoVetor = new Aluno[vetor.length * 2];
            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            vetor = novoVetor;
        }
    }

    @Override
    public boolean remove(Object aluno) {
        int posicao = -1;
        for (int i = 0; i < total; i++) {
            if(vetor[i].equals(aluno)) {
                posicao = i;
                break;
            }
        }
        if(posicao != -1) {
            for (int i = posicao; i < total - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[total - 1] = null;
            total--;
            return true;
        }
        return false;
    }
    
}
