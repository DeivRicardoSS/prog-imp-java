package alunos;
import java.util.Scanner;

public class Aluno {
    public static Scanner input = new Scanner(System.in);
    String nome, matricula;
    double mediaFinal;

    public Aluno() {
        System.out.print("Nome:\t");
        this.nome = input.nextLine();
        System.out.print("Matrícula:\t");
        this.matricula = input.nextLine();
        System.out.print("Media Final:\t");
        this.mediaFinal = input.nextDouble();
        input.nextLine();
    }

    public void print(int n) {
        System.out.println("Aluno " + n + " ===================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Média: " + this.mediaFinal);
    }

    public boolean aprovado() {
        if (mediaFinal >= 5) {
            return true;
        } else {
            return false;
        }
    }
}