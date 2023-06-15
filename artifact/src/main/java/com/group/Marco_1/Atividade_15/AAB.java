package com.group.Marco_1.Atividade_15;

public class AAB {

    private Noh raiz;

    public AAB() {
        this.raiz = null;
    }

    public AAB(Noh raiz) {
        this.raiz = raiz;
    }

    public Noh getRaiz() {
        return raiz;
    }

    public void setRaiz(Noh raiz) {
        this.raiz = raiz;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    public void add(int element) {
        if (isEmpty()){
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.getValor()) {
                    if (aux.getEsq() == null) {
                        Noh newNode = new Noh(element);
                        aux.setEsq(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getEsq();
                
    
                } else {
                    if (aux.getDir() == null) {
                        Noh newNode = new Noh(element);
                        aux.setDir(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getDir();
                } // fim else
            } // fim while
        } // fim else
    }

    public void recursiveAdd(int element) {
        if (isEmpty()){
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    private void recursiveAdd(Noh node, int element) {
        if (element < node.getValor()) {
            if (node.getEsq() == null) {
                Noh newNode = new Noh(element);
                node.setEsq(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveAdd(node.getEsq(), element);
        } else {
            if (node.getDir() == null) {
                Noh newNode = new Noh(element);
                node.setDir(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveAdd(node.getDir(), element);
        }
    }

    @Override
    public String toString() {
        if(isEmpty()) {
            return "AAB está vazia";
        }

        String conteudo = "";

        traverseInOrder(raiz, conteudo);

        return conteudo;
    }

    private void traverseInOrder(Noh node, String str) {
        if (node != null) {
            traverseInOrder(node.getEsq(), str);
            str = str + node.getValor() + " ";
            traverseInOrder(node.getDir(), str);
        }
    }

}
