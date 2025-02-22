import java.util.Scanner;

public class Percentual {
    public static Scanner inpt = new Scanner(System.in);
    public static void main(String[] args) {
        double preco1 = inputD("Digite o preço antigo: ");
        double preco2 = inputD("Digite o preço novo: ");

        double diferenca = preco2 - preco1;

        double percentual = (diferenca * 100)/preco1;

        if(diferenca > 0) {
            System.out.println("O produto aumentou " + diferenca + " reais!");
            System.out.println("Houve um aumento de " + percentual + "%");
        } else if(diferenca < 0) {
            System.out.println("O produto reduziu " + (diferenca * -1) + " reais!");
            System.out.println("Houve uma redução de " + (percentual * -1) + "%");
        } else {
            System.out.println("Não houve alteração de texto");
        }

    }

    public static Double inputD(String texto) {
        System.out.print(texto);
        return inpt.nextDouble();
    }
}