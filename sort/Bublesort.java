import java.util.Random;

public class Bublesort {
    public static Random rand = new Random();
    public static void main (String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(10) + 1;
        }

        imprimirVetor(vetor, vetor.length);
        inserctionSort(vetor);
        imprimirVetor(vetor, vetor.length);
    }

    public static void bubleSort(int[] v) {
        int fim = v.length - 1;
        boolean trocou = false;
        do {
            for (int i = 0; i < fim - 1; i++) {
                if(v[i] > v[i + 1]){
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    trocou = true;
                }
            }
    
            fim -= 1;
        } while (fim > 0 && trocou == true);
    }

    public static void selectionSort(int[] v) {
        int fim = v.length;
        
        do {
            int maior = 0;
            for (int i = 1; i < fim; i++) {
                if(v[maior] < v[i]) {
                    maior = i;
                }
                if(i == fim - 1) {
                    int aux = v[maior];
                    v[maior] = v[i];
                    v[i] = aux;
                }
            }
            fim -= 1;
        } while (fim > 0);
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

    public static void inserctionSort(int[] v) {
        
        for (int i = 1; i < v.length; i++) {
            for (int j = i; j > 0; j--) {
                if(v[j] < v[j-1]){
                    int aux = v[j];
                    v[j] = v[j-1];
                    v[j-1] = aux;
                }
            }
        }
    }


}