package exerciciosVetores;

import java.util.Scanner;

/* 
    Leia um vetor com 20 numeros inteiros. Escreva os elementos do vetor eliminando ele- ´
mentos repetidos.

*/
public class Ex10 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para a posição " + i + ": ");
            vetor[i] = input.nextInt();
        }
        System.out.println("Valores duplicados encontrados:");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i]);
                }
            }
        }
    }

}