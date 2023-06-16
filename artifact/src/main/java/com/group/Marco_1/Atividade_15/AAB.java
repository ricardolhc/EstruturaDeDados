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

    public boolean contains(int element) {
        if (isEmpty()) {
            return false;
        }

        Noh aux = this.raiz;
        while (aux != null) {
            if (element == aux.getValor()) {
                return true;
            } else if (element < aux.getValor()) {
                aux = aux.getEsq();
            } else {
                aux = aux.getDir();
            }
        }

        return false;
    }

    @Override
    public String toString() {
        if(isEmpty()) {
            return "AAB está vazia";
        }

        StringBuilder conteudo = new StringBuilder();

        traverseInOrder(raiz, conteudo);

        return conteudo.toString();
    }

    private void traverseInOrder(Noh node, StringBuilder str) {
        if (node != null) {
            traverseInOrder(node.getEsq(), str);
            str.append(node.getValor() + " ");
            traverseInOrder(node.getDir(), str);
        }
    }

}
