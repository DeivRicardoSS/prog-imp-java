package exerciciosVetores;

import java.util.Scanner;

public class ExExtra {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int[] pares = new int[5];
        int[] impares = new int[5];

        System.out.println("Preenchendo Vetor");
        preencherVetor(vetor, vetor.length);
        System.out.println("Imprimindo Vetor");
        imprimirVetor(vetor, vetor.length);
        System.out.println("Ordenando Vetor");
        ordenar(vetor, vetor.length);
        System.out.println("Imprimindo Vetor");
        imprimirVetor(vetor, vetor.length);
        
        imprimirMaiorImpar(vetor, vetor.length);
        System.out.println("Separando pares dos impares");
        criarParesImpares(vetor, vetor.length, pares, impares);

    }

    public static void preencherVetor(int[] v, int n){
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            v[i] = input.nextInt();
        }
    }

    public static void imprimirVetor(int[] v, int n){
        System.out.print("{");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + v[i]);
            if(i == (n-1)) {
                System.out.println(" }");
            } else {
                System.out.print(",");
            }
        }
    }

    public static void ordenar(int[] v, int n) {
        int fim = (n-1);
        while (fim > 0) {
            for (int i = 0; i < fim; i++) {
                if(v[i] > v[i+1]){
                    int aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
                }
            }

            fim -= 1;
        }
        
    }

    public static void imprimirMaiorImpar(int[] v, int n){
        for (int i = (n-1); i >= 0; i--) {
            if(v[i] % 2 != 0) {
                System.out.println("Maior número ímpar: " + v[i]);
                return;
            }
        }

        System.out.println("Não existem números ímpares neste vetor");
    }

    public static void criarParesImpares(int[] v, int n, int[] pares, int[] impares){
        int parI = 0;
        int imparI = 0;

        for (int i = 0; i < n; i++) {
            impares[i] = -1;
            pares[i] = -1;
            if(v[i] % 2 == 0) {
                pares[parI] = v[i];
                parI += 1;
                
            }else {
                impares[imparI] = v[i];
                imparI += 1;
                
            }
        }
        
        System.out.println("Vetores Pares");
        imprimirVetor(pares, pares.length);
        System.out.println("Vetores Impares");
        imprimirVetor(impares, impares.length);
    }
}
