package Q1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Turma {

    private Aluno[] alunos;

    public Turma(Aluno[] alunos) {
        if (!turmaValida(alunos)) {
            throw new IllegalArgumentException("A turma não pode ser vazia.");
        }
        if (!matriculasUnicas(alunos)) {
            throw new IllegalArgumentException("Existem alunos com matrícula repetida.");
        }
        this.alunos = alunos;
    }


    public List<Aluno> listarAprovados() {
        List<Aluno> aprovados = new ArrayList<>();
        for (Aluno a : alunos) {
            if (a.calcularMedia() >= 7) {
                aprovados.add(a);
            }
        }
        return aprovados;
    }

    public List<Aluno> listarReprovados() {
        List<Aluno> reprovados = new ArrayList<>();
        for (Aluno a : alunos) {
            if (a.calcularMedia() < 7) {
                reprovados.add(a);
            }
        }
        return reprovados;
    }


    private boolean turmaValida(Aluno[] alunos) {
        return alunos != null && alunos.length > 0;
    }

    private boolean matriculasUnicas(Aluno[] alunos) {
        Set<Integer> matriculas = new HashSet<>();
        for (Aluno a : alunos) {
            if (!matriculas.add(a.getMatricula())) {
                return false;
            }
        }
        return true;
    }

}

