package exerciciosVetores;
import java.util.Scanner;
/*

Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos.

*/

public class Ex2 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[6];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("Valores Lidos: ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
