import java.util.Random;

public class Tarefa {
    public static Random rand = new Random();
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        povoar(vetor);
    }

    public static void povoar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int num;
            do {
                num = rand.nextInt(1000) + 1;
                v[i] = num;
            } while (estaRepetido(v, num, i));
            
            System.out.print(v[i] + " ");
        }
    }

    public static boolean estaRepetido(int[] v, int n, int index){
        boolean result = false;
        for(int i = 0; i < index; i++) {
            if (v[i] == n) {
                result = true;
                break;
            }
        }
        return result;
    }

}