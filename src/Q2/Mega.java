package Q2;

import java.util.HashSet;
import java.util.Set;

public class Mega {

    private int[] numeros = null;

    public Mega() {}

    public int[] getNumeros() {
        if (numeros != null) {
            return numeros.clone();
        }
        return null;
    }


    public boolean escolherNumeros(int[] entrada) {
        if (!validarNumeros(entrada)) {
            System.out.println("Deve haver exatamente 6 números.");
            return false;
        }

        Set<Integer> unicos = new HashSet<>();
        for (int numero : entrada) {
            if (numero < 1 || numero > 60) {
                System.out.println("Número inválido: " + numero + " (deve estar entre 1 e 60).");
                return false;
            }

            if (!unicos.add(numero)) {
                System.out.println("O número: " + numero + " está repetido.");
                return false;
            }
        }

        this.numeros = entrada.clone();
        return true;
    }

    public void imprimirNumeros() {
        if (numeros == null) {
            System.out.println("Nenhum número foi escolhido.");
            return;
        }

        System.out.print("Números escolhidos: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private boolean validarNumeros(int[] numeros) {
        return numeros != null && numeros.length == 6;
    }
}
