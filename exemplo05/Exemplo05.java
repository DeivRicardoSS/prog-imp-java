import java.util.Random;

public class Exemplo05 {
    public static Random gerador = new Random();
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            //int num = (int) Math.floor(Math.random() * 6) + 1;
            System.out.println(gerador.nextInt(6) + 1);
        }
    }
}