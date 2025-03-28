import java.util.Scanner;

public class Ordenar {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++ ) {
            printVetor(vetor);
            System.out.println("\nDigite um número: ");
            adNum(vetor, input.nextInt());
        }

    }

    public static void printVetor(int[] vetor) {
        System.out.println("Vetor Atual: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void adNum(int[] vetor, int num) {
        for (int i = 0; i < vetor.length; i++) {
            if (num < vetor[i] && num > vetor[i - 1] || vetor[i] == 0) {
                for (int j = (vetor.length - 1); i >= 0; i-- ) {
                    if(j != i) {
                        vetor[j] = vetor[j - 1];
                    } else {
                        vetor[i] = num;
                        return;
                    }
                }
            }
        }
    }
}
