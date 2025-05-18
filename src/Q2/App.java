package Q2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mega mega = new Mega();

        int[] numeros = new int[6];

        System.out.println("Digite 6 números para a Mega-Sena (de 1 a 60), sem repetir:");

        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                int num = scanner.nextInt();

                if (num < 1 || num > 60) {
                    System.out.println("Número fora do intervalo, digite um número entre 1 e 60.");
                    continue;
                }

                boolean repetido = false;
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == num) {
                        repetido = true;
                        break;
                    }
                }

                if (repetido) {
                    System.out.println("Número repetido, digite outro número.");
                    continue;
                }

                numeros[i] = num;
                break;
            }
        }

        if (mega.escolherNumeros(numeros)) {
            System.out.println("Números registrados.");
        } else {
            System.out.println("Erro ao registrar números.");
        }

        mega.imprimirNumeros();
        scanner.close();
    }
}

