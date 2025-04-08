import java.util.Random;

public class Vetor200{
    public static final int QUANT = 200;
    public static Random rand = new Random();
    public static void main(String[] args) {
        int[] vetor = new int[QUANT];
        preencher(vetor);
    }

    public static void preencher(int[] v) {
        int[] freq = new int[20];
        for (int i = 0; i < v.length; i++) {
            v[i] = rand.nextInt(20) + 1;
            freq[v[i] - 1] += 1;
        }
        System.out.println("Num \t Freq");
        for (int i = 0; i < freq.length; i++) {
            System.out.printf("%2d \t %2d \n", (i+1), freq[i]);
        }
    }
}