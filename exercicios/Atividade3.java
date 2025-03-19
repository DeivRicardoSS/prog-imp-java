import java.util.Scanner;

public class Atividade3 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Quantas pessoas da lista: ");
        int quantidade = input.nextInt();
        

        Pessoa[] lista = new Pessoa[quantidade];

        for(int i = 0; i < lista.length; i++) {
            input.nextLine();
            System.out.print("Digite o nome da " + (i+1) + "ª pessoa: ");
            String nome = input.nextLine();

            System.out.print("Digite o sexo da " + (i+1) + "ª pessoa (M ou F): ");
            String sexo = input.nextLine();

            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            int idade = input.nextInt();

            System.out.print("Digite o peso da " + (i+1) + "ª pessoa: ");
            double peso = input.nextDouble();

            lista[i] = new Pessoa(nome, sexo, idade, peso);
        }

        int hm30 = 0;
        Pessoa maisPesada = new Pessoa("nada", "A", 0, 0.0);
        int mulheresMenos50 = 0;
        int totalMulheres = 0;

        for(int i = 0; i < lista.length; i++) {
            if(lista[i].idade < 30 && lista[i].sexo == "M"){
                hm30++;
            }

            if(lista[i].peso >= maisPesada.peso){
                maisPesada = lista[i];
            }

            if(lista[i].sexo.equals("F")) {
                totalMulheres += 1;
                if(lista[i].peso < 50) {
                    mulheresMenos50 += 1;
                }
            }

        }

        Pessoa[] homensMenos30 = new Pessoa[hm30];

        int j = 0;
        for(int i = 0; i < lista.length; i++) {
            if(lista[i].idade < 30 && lista[i].sexo == "M"){
                homensMenos30[j] = lista[i];
                j += 1;
            }
        }

        int percentual = (mulheresMenos50 / totalMulheres) * 100;


        double somapeso = 0;

        for(int i = 0; i < homensMenos30.length; i++) {
            somapeso += homensMenos30[i].peso;
        }

        double media = somapeso / homensMenos30.length;

        System.out.println("Média do peso dos homens com menos de 30 anos: " + media);

        System.out.println("Pessoa mais pesada: " + maisPesada.nome + " | " + maisPesada.peso);
    
        System.out.println("Percentual de mulheres com menos de 50kg em relação ao total de mulheres: " + percentual);
    }
}
