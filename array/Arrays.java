import java.util.Scanner;

public class Arrays {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double[] notas = new double[10];

        for(int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scan.nextDouble();
        }

        double soma = 0;

        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Média: " + (soma / notas.length));

        System.out.println("Notas acima da média: ");

        for(int i = 0; i < notas.length; i++) {
            if(notas[i] > media) {
                System.out.println((i + 1) + "ª nota: " + notas[i]);
            }
        }
    }

}