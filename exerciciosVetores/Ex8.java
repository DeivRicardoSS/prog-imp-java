package exerciciosVetores;

import java.util.Scanner;

/* 
    Fac¸a um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule
e imprima a media geral. 
*/
public class Ex8 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vetor = new int[15];
        int media = 0;
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite a sua media : ");
            vetor[i] = input.nextInt();
            soma += vetor[i];

        }
        media = soma / vetor.length;
        System.out.println("a meida da turma é : " + media);

    }
}