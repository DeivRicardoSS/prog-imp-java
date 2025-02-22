import java.util.Scanner;

public class Imc {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        double peso = inputD("Peso: ");
        double altura = inputD("Altura: ");
        double imc = peso/(altura * altura);

        if(imc < 16) {
            System.out.println("IMC: " + imc + " | Magreza Grave");
        } else if(imc < 17) {
            System.out.println("IMC: " + imc + " | Magreza Moderada");
        } else if(imc < 18.5) {
            System.out.println("IMC: " + imc + " | Magreza Leve");
        } else if(imc < 25) {
            System.out.println("IMC: " + imc + " | Saudável");
        } else if(imc < 30) {
            System.out.println("IMC: " + imc + " | Sobrepeso");
        } else if(imc < 35) {
            System.out.println("IMC: " + imc + " | Obesidade Grau I");
        } else if(imc < 40) {
            System.out.println("IMC: " + imc + " | Obesidade Grau II");
        } else if(imc >= 40) {
            System.out.println("IMC: " + imc + " | Obesidade Grau III");
        }
    }

    public static double inputD(String texto) {
        System.out.print(texto);
        return scn.nextDouble();
    }
}

