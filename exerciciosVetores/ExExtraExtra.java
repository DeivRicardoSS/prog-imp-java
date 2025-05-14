import java.util.Random;

public class ExExtraExtra {
    public static Random rand = new Random();
    public static final int TAM = 10;
    public static void main(String[] args) {
        int[] vetor = new int[TAM];
        preencherVetor(vetor, TAM);
        imprimirVetor(vetor, TAM);
        

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

    public static void preencherVetor(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            v[i] = rand.nextInt(10) + 1;
        }
    }

    public static void reverterVetor(int[] v, int n) {
        int fim = n;
        int meio = (n/2)
        for (int i = 0; i < meio; i++) {
            
        }
    }

    public static void verificarSeqFib(int[] v, int n) {

    }
}