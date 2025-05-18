package Q1;

public class Aluno {

    private int matricula;
    private String nome;
    private float[] nota;

    public Aluno(int matricula, String nome, float[] nota) {
        this.matricula = matricula;
        this.nome = nome;
        if (!notaValida(nota)) {
            throw new IllegalArgumentException("O array de notas deve conter de 1 a 4 elementos.");
        }
        this.nota = nota.clone();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float[] getNota() {
        return nota.clone();
    }

    public boolean cadastrarNota(float[] nota) {
        if (!notaValida(nota)) {
            return false;
        }
        this.nota = nota.clone();
        return true;
    }

    public float calcularMedia() {
        if (!notaValida(this.nota)) {
            throw new IllegalStateException("Verifique se há notas registradas e/ou há de 1 à 4 notas [1,4]");
        }
        float soma = 0;
        for (float n : this.nota) {
            soma += n;
        }
        return soma / this.nota.length;
    }

    private boolean notaValida(float[] nota) {
        return nota != null && nota.length >= 1 && nota.length <= 4;
    }
}

