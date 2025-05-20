public class ListaEncadeada {

    static class Node {
        int valor;
        Node proximo;

        Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Node cabeca;
    private int tamanho;

    public void push(Node node) {
        if (cabeca == null) {
            cabeca = node;
        } else {
            Node atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = node;
        }
        tamanho++;
    }

    public Node pop() {
        if (cabeca == null) {
            throw new IllegalStateException("Lista vazia");
        }
        if (cabeca.proximo == null) {
            Node temp = cabeca;
            cabeca = null;
            tamanho--;
            return temp;
        }
        Node atual = cabeca;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        Node temp = atual.proximo;
        atual.proximo = null;
        tamanho--;
        return temp;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        if (index == 0) {
            node.proximo = cabeca;
            cabeca = node;
        } else {
            Node atual = cabeca;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            node.proximo = atual.proximo;
            atual.proximo = node;
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        if (index == 0) {
            cabeca = cabeca.proximo;
        } else {
            Node atual = cabeca;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
        }
        tamanho--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        Node atual = cabeca;
        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    public int size() {
        return tamanho;
    }

    public void printList() {
        Node atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
