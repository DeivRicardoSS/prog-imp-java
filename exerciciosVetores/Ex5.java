package exerciciosVetores;

import java.util.Scanner;

/* 
    Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima o vetor, o maior elemento e a posição que ele se encontra
*/
public class Ex5 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[10];
        povoar(vetor);
        print(vetor);
        maiorNumero(vetor);

    }

    public static void povoar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Ditige o " + (i+1) + "º número: ");
            v[i] = input.nextInt();
        }
    }

    public static void maiorNumero(int[] v) {
        int maior = 0;
        for (int i = 0; i < (v.length - 1); i++) {
            if(v[i+1] > v[maior]) {
                maior = i+1;
            }
        }

        System.out.println("Maior número: v[" + maior + "] = " + v[maior]);
    }

    public static void print(int[] v) {
        for (int i : v) {
            System.out.print(i + " ");
        }
    }

}
