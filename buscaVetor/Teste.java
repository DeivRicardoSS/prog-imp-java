import java.util.Random;

public class Teste {
    public static Random gerador = new Random();
    public static void main(String[] args) {
        int[] vetor = new int[16];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 2;
        vetor[3] = 7;
        vetor[4] = 12;
        vetor[5] = 23;
        vetor[6] = 24;
        vetor[7] = 26;
        vetor[8] = 37;
        vetor[9] = 38;
        vetor[10] = 42;
        vetor[11] = 43;
        vetor[12] = 45;
        vetor[13] = 48;
        vetor[14] = 56;
        vetor[15] = 78;

        if(estaOrdenado(vetor)) {
            System.out.println("Está ordenado");
        } else {
            System.out.println("Está desordenado");
        }
        
    }

    public static int pesquisaBinaria(int[] v, int x) {
        int inicio = 0, fim = v.length -1, meio;
        while(inicio <= fim) {
            meio = (inicio + fim) / 2;
            if(x == v[meio]) {
                return v[meio];
            } else if (x < v[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static boolean estaOrdenado(int[] v) {
        for ( int i = 0; i < v.length; i ++ ) {
            if (i > 0 && i < v.length - 1) {
                if(v[i] > v[i+1] || v[i] < v[i-1]){
                    break;
                }
            }
        }

        for ( int i = 0; i < v.length; i ++ ) {
            if (i > 0 && i < v.length - 1) {
                if(v[i] < v[i+1] || v[i] > v[i-1]){
                    return false;
                }
            }
        }
        return true;
    }
}