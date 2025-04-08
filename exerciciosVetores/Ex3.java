package exerciciosVetores;
import java.util.Scanner;

//Leia um vetor de 10 posic¸oes. Contar e escrever quantos valores pares ele possui.
public class Ex3 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[10];
        povoar(vetor);
        System.out.println("O vetor possui " + quantPar(vetor) + " números pares.");
    }

    public static void povoar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Ditige o " + (i+1) + "º número: ");
            v[i] = input.nextInt();
        }
    }

    public static int quantPar(int[] v) {
        int output = 0;
        for (int i : v) {
            if(i % 2 == 0) {
                output += 1;
            }
        }

        return output;
    }


}
