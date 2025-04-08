package exerciciosVetores;

import java.util.Scanner;

/* 
    Faça um programa que receba do usuario um vetor com 10 posições. Em seguida deverá ser impresso o maior e o menor elemento do vetor.
*/
public class Ex4 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[10];
        povoar(vetor);
        maiorEmenor(vetor);

    }

    public static void povoar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Ditige o " + (i+1) + "º número: ");
            v[i] = input.nextInt();
        }
    }

    public static void maiorEmenor(int[] v) {
        int maior = v[0];
        int menor = v[9];
        for (int i = 0; i < (v.length - 1); i++) {
            if(v[i+1] > maior) {
                maior = v[i+1];
            }
        }

        for (int i = v.length; i > 1; i--) {
            if(v[i-1] < menor) {
                menor = v[i-1];
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }

}
