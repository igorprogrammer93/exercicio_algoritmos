public class Main {
    public static void main(String[] args) {
        // Teste da Pilha
        System.out.println("=== Teste: MinhaPilha ===");
        MinhaPilha pilha = new MinhaPilha(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Pop: " + pilha.pop());
        System.out.println("Tamanho: " + pilha.size());

        // Teste da Fila
        System.out.println("\n=== Teste: MinhaFila ===");
        MinhaFila fila = new MinhaFila(5);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        System.out.println("Frente: " + fila.front());
        System.out.println("Fim: " + fila.rear());
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Tamanho: " + fila.size());

        // Teste da Lista Encadeada
        System.out.println("\n=== Teste: ListaEncadeada ===");
        ListaEncadeada lista = new ListaEncadeada();
        ListaEncadeada.Node n1 = new ListaEncadeada.Node(100);
        ListaEncadeada.Node n2 = new ListaEncadeada.Node(200);
        ListaEncadeada.Node n3 = new ListaEncadeada.Node(300);
        lista.push(n1);
        lista.push(n2);
        lista.insert(1, n3);
        lista.printList();
        System.out.println("Elemento na posição 1: " + lista.elementAt(1).valor);
        lista.remove(1);
        lista.printList();
        System.out.println("Pop: " + lista.pop().valor);
        lista.printList();

        // Teste do Mapa de Hash
        System.out.println("\n=== Teste: MeuHashMap ===");
        MeuHashMap mapa = new MeuHashMap();
        mapa.put(1, 1000);
        mapa.put(11, 1100); // colisão com 1 (1 % 10 == 1)
        mapa.put(2, 2000);
        System.out.println("Valor da chave 1: " + mapa.get(1));
        System.out.println("Valor da chave 11: " + mapa.get(11));
        mapa.delete(1);
        System.out.println("Valor da chave 1 após delete: " + mapa.get(1));
        mapa.clear();
        System.out.println("Valor da chave 2 após clear: " + mapa.get(2));
    }
}
