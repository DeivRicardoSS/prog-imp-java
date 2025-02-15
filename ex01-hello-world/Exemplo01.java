import java.util.Scanner;

public class Exemplo01 {
    public static void Print(String texto) {
        System.out.println(texto);
    }

    public static Scanner scan = new Scanner(System.in);

    public static String Input(String texto) {
        System.out.print(texto);
        return scan.nextLine();
    }

    public static void main(String[] args) {
        String num = Input("Digite um Número: ");
        Print("O dobro de " + num + " é " + dobro(Double.parseDouble(num)));
    }

    public static double dobro(double x) {
        return 2 * x;
    }
}