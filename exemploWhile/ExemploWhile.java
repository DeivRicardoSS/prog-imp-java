import java.util.Scanner;

public class ExemploWhile {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Laços=de=repetições=======================================");
        num1 = inputI("Digite um número inteiro: ");
        num2 = inputI("Digite o segundo número inteiro maior que " + num1 + ": ");

        while (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro!");
            num2 = inputI("Digite o segundo número novamente: ");
        }
        clear();
        System.out.println("Laços=de=repetições=======================================");
        System.out.println("Existem " + (num2 - num1) + " números no intervalo de " + num1 + " e " + num2);

        System.out.print("Os números são: { ");
        for(int i = num1; i < num2; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(num2 + " }");
    }

    public static int inputI(String texto) {
        System.out.print(texto);
        return scn.nextInt();
    }

    public static void clear() {
        for(int i = 0; i < 100; i++) {
            System.out.println(" ");
        }
    }
}