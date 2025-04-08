package exerciciosVetores;

/*  
Faça um programa que possua um vetor denominado A que armazene 6 numeros inteiros. O programa deve executar os seguintes passos:

(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.

(b) Armazene em uma variavel inteira (simples) a soma entre os valores das posiçõesA[0], A[1] e A[5] do vetor e mostre na tela esta soma.

(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.

(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

public class Ex1 {

    public static void main(String[] args) {
        int[] a = new int[6];

        povoar(a);
        System.out.println("Valores antes da mudança: ");
        print(a);

        int soma = a[0] + a[1] + a[5];

        System.out.println("Soma de a[0] + a[1] + a[5]: " + soma);

        a[4] = 100;

        System.out.println("Valores depois da mudança: ");
        print(a);
    }

    public static void povoar(int[] v) {
        v[0] = 1;
        v[1] = 0;
        v[2] = 5;
        v[3] = -2;
        v[4] = -5;
        v[5] = 7;
    }

    public static void print(int[] v) {
        for (int i : v) {
            System.out.println(i);
        }
    }


}