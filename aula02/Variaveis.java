import java.util.Scanner;

public class Variaveis {
    public static Scanner inpt = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = inputI("Digite um número inteiro: "); 
        int num2 = inputI("Digite um número inteiro: ");
        double num3 = inputD("Digite um número real: ");

        print("Número 1: " + num1);
        print("Número 2: " + num2);
        print("Número 3: " + num3);
    }

    public static void print(String texto) {
        System.out.println(texto);
    }

    public static int inputI(String texto) {
        System.out.print(texto);
        return inpt.nextInt();
    }

    public static Double inputD(String texto) {
        System.out.print(texto);
        return inpt.nextDouble();
    }
}
