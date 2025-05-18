package Q3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade;

        while (true) {
            System.out.print("Digite quantos números da sequência de Fibonacci deseja saber: ");
            quantidade = scanner.nextInt();

            try {
                Fibonacci fibonacci = new Fibonacci(quantidade);
                int[] serie = fibonacci.serie();

                System.out.println("A sequência de Fibonacci desejada é:");
                for (int numero : serie) {
                    System.out.print(numero + " ");
                }
                System.out.println();
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Ops: " + e.getMessage());
                System.out.println("Digite outro número\n");
            }
        }
        scanner.close();
    }
}

