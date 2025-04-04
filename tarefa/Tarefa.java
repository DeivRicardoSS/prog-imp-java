import java.util.Random;

public class Tarefa {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        System.out.println("Questão 1====================");
        povoar1(vetor);
        System.out.println("\n\n\nQuestão 2====================");
        povoar2(vetor);
    }

    public static void povoar1(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int num;
            do {
                num = rand.nextInt(1000) + 1;
                v[i] = num;
            } while (estaRepetido(v, num, i));

            System.out.print(v[i] + " ");
        }
    }

    public static boolean estaRepetido(int[] v, int n, int index) {
        boolean result = false;
        for (int i = 0; i < index; i++) {
            if (v[i] == n) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void povoar2(int[] v) {
        for (int i = 0; i < v.length; i++) {
            
            v[i] = i + 1;

            System.out.print(v[i] + " ");
        }

        System.out.println("\n \n");

        for (int i = 0; i < v.length; i++) {
            
            int num;
            do {
                num = rand.nextInt(1000);
                v[i] = num;
            } while (estaRepetido(v, num, i));

            System.out.print(v[i] + " ");
        }

    }

    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

}