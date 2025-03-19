import java.util.Scanner;

public class Progressao {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        int n1 = input.nextInt();
        System.out.print("Digite um número: ");
        int n2 = input.nextInt();
        System.out.print("Digite um número: ");
        int n3 = input.nextInt();

        for(int i = 1; i <= n3; i++) {
            System.out.print(n1 + " ");
            n1 += n2;
        }
    }
}
