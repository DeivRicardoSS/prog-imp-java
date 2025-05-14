import java.util.Scanner;

public class Pessoa {
    public static Scanner input = new Scanner(System.in);
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa() {

        input.nextLine();
        System.out.print("Nome: ");
        String n = input.nextLine();
        System.out.print("Idade: ");
        int i = input.nextInt();
        System.out.print("Peso: ");
        double p = input.nextDouble();
        System.out.print("Altura: ");
        double a = input.nextDouble();

        this.nome = n;
        this.idade = i;
        this.peso = p;
        this.altura = a;
    }

    public void print(){
        System.out.println("Impressão====================");
        System.out.printf("(%s, %d anos, %f kg, %f m)\n",
        this.nome, this.idade, this.peso, this.altura);
    }
}
