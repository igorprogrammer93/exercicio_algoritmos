public class MinhaPilha {
    private int[] elementos;
    private int topo;

    public MinhaPilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == elementos.length - 1) {
            throw new IllegalStateException("Pilha cheia");
        }
        elementos[++topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return elementos[topo--];
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }
}
