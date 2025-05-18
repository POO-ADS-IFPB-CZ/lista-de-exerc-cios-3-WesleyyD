package Q1;

import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Quantos alunos tem a turma? ");
            int quantidadeAlunos = scanner.nextInt();
            scanner.nextLine();

            if (quantidadeAlunos < 1) {
                throw new IllegalArgumentException("A turma deve ter pelo menos 1 aluno.");
            }

            Aluno[] alunos = new Aluno[quantidadeAlunos];

            for (int i = 0; i < quantidadeAlunos; i++) {
                System.out.println("\nAluno " + (i + 1));

                System.out.print("Digite a matrícula: ");
                int matricula = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();

                System.out.print("Quantas notas (1 a 4)? ");
                int qtdNotas = scanner.nextInt();
                scanner.nextLine();

                if (qtdNotas < 1 || qtdNotas > 4) {
                    throw new IllegalArgumentException("O número de notas deve ser entre 1 e 4.");
                }

                float[] notas = new float[qtdNotas];
                for (int j = 0; j < qtdNotas; j++) {
                    System.out.print("Digite a nota " + (j + 1) + ": ");
                    notas[j] = scanner.nextFloat();
                }
                scanner.nextLine();

                alunos[i] = new Aluno(matricula, nome, notas);
            }

            Turma turma = new Turma(alunos);

            // Listar aprovados
            List<Aluno> aprovados = turma.listarAprovados();
            System.out.println("\nAlunos Aprovados:");
            for (Aluno a : aprovados) {
                System.out.printf("%s - Média: %.2f\n", a.getNome(), a.calcularMedia());
            }

            // Listar reprovados
            List<Aluno> reprovados = turma.listarReprovados();
            System.out.println("\nAlunos Reprovados:");
            for (Aluno a : reprovados) {
                System.out.printf("%s - Média: %.2f\n", a.getNome(), a.calcularMedia());
            }

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}



