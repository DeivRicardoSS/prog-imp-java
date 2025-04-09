package exerciciosVetores;

import java.util.Scanner;

/* 
    Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos ˆ
na ordem inversa
*/
public class Ex6 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[6];
        povoar(vetor);
        printInvert(vetor);
    }
    public static void povoar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Ditige o " + (i+1) + "º número: ");
            v[i] = input.nextInt();
        }
    }
    public static void printInvert(int[] v) {
        for (int i = (v.length - 1); i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
    }
}