public class MeuHashMap {

    static class Entrada {
        int chave;
        int valor;
        Entrada proximo;

        Entrada(int chave, int valor) {
            this.chave = chave;
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Entrada[] tabela;

    public MeuHashMap() {
        tabela = new Entrada[10];
    }

    private int hash(int chave) {
        return chave % 10;
    }

    public void put(int chave, int valor) {
        int indice = hash(chave);
        Entrada atual = tabela[indice];

        while (atual != null) {
            if (atual.chave == chave) {
                atual.valor = valor;
                return;
            }
            atual = atual.proximo;
        }

        Entrada novaEntrada = new Entrada(chave, valor);
        novaEntrada.proximo = tabela[indice];
        tabela[indice] = novaEntrada;
    }

    public Integer get(int chave) {
        int indice = hash(chave);
        Entrada atual = tabela[indice];

        while (atual != null) {
            if (atual.chave == chave) {
                return atual.valor;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void delete(int chave) {
        int indice = hash(chave);
        Entrada atual = tabela[indice];
        Entrada anterior = null;

        while (atual != null) {
            if (atual.chave == chave) {
                if (anterior == null) {
                    tabela[indice] = atual.proximo;
                } else {
                    anterior.proximo = atual.proximo;
                }
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        }
    }

    public void clear() {
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = null;
        }
    }
}
