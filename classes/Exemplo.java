import java.util.Scanner;

public class Exemplo {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
        }
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].print();
        }
    }
}