public class MinhaFila {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public MinhaFila(int capacidade) {
        elementos = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enqueue(int valor) {
        if (tamanho == elementos.length) {
            throw new IllegalStateException("Fila cheia");
        }
        elementos[fim] = valor;
        fim = (fim + 1) % elementos.length;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        int valor = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valor;
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return elementos[inicio];
    }

    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return elementos[(fim - 1 + elementos.length) % elementos.length];
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
