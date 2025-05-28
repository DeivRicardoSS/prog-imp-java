package alunos;

public class ExercicioVetor {
    public static final int TAM = 10;
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[TAM];
        Aluno[] aprovados = new Aluno[TAM];
        Aluno[] reprovados = new Aluno[TAM];
        preencherVetor(alunos, TAM);
        separarAlunos(alunos, aprovados, reprovados, TAM);
    }

    public static void preencherVetor(Aluno[] v, int n) {
        for (int i = 0; i < n; i++) {
            v[i] = new Aluno();
        }
    }

    public static void separarAlunos(Aluno[] v, Aluno[] a, Aluno[] r, int n) {
        int posAprov = 0, posReprov = 0;
        for (int i = 0; i < n; i++) {
            if(v[i].aprovado()){
                a[posAprov] = v[i];
                posAprov += 1;
            } else {
                r[posReprov] = v[i];
                posReprov += 1;
            }
        }
        System.out.println("\nAlunos aprovados:\n");
        imprimirAlunos(a, posAprov);
        System.out.println("\nAlunos reprovados:\n");
        imprimirAlunos(r, posReprov);
    }

    public static void imprimirAlunos(Aluno[] a, int n) {
        for (int i = 0; i < n; i++) {
            a[i].print(i+1);
        }
    }
}
