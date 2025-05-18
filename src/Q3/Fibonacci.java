package Q3;

public class Fibonacci {
    private int quantidade;

    public Fibonacci(int quantidade) {
        if (!validarSerie(quantidade)) {
            throw new IllegalArgumentException("Digite um número inteiro maior que zero");
        }
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int[] serie() {
        int[] serieFibonacci = new int[quantidade];

        if (quantidade >= 1) {
            serieFibonacci[0] = 0;
        }
        if (quantidade >= 2) {
            serieFibonacci[1] = 1;
        }

        for (int i = 2; i < quantidade; i++) {
            serieFibonacci[i] = serieFibonacci[i - 1] + serieFibonacci[i - 2];
        }

        return serieFibonacci;
    }

    private boolean validarSerie(int quantidade) {
        return quantidade >= 1;
    }

}

