import java.util.Scanner;

public class Revisao {
    public static final int TAM = 100;
    public static Scanner input = new Scanner(System.in);
    public static void  main(String[] args) {
        int[] vetor = new int[TAM];
        int qtdVetor1 = 0, opcao;
        do {
            System.out.println("Menu");
            System.out.println("1 - Inserir Valor");
            System.out.println("2 - Imprimir Vetor");
            System.out.println("0  -  Sair");
            opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    qtdVetor1 = inserirVetor(vetor, qtdVetor1);
                    break;
                case 2:
                    imprimirVetor(vetor, qtdVetor1);
                    break;
                default:
                    if(opcao != 0){
                        System.out.println("opção inválida");
                    }
                    break;
                

            }
        } while(opcao != 0);
    }

    public static int inserirVetor(int[] v, int n){
        if (v.length > n) {
            v[n] = input.nextInt();
            n += 1;
        } else {
            System.out.println("Vetor cheio");
        }
        return n;
    }

    public static void imprimirVetor(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
    }

    
}