//conta, multa, juros mensal, dias de atraso
//multa é fixo
//juros é um percentual equivalente a um mês (30 dias)
//só realizar a conta se estiver com menos de 45 dias de atraso

import java.util.Scanner;

public class ContaAtrasada {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double conta, multa, juros;
        int dias;

        System.out.print("Digite o valor da Conta: ");
        conta = input.nextDouble();
        System.out.print("Digite o valor da multa: ");
        multa = input.nextDouble();
        System.out.print("Digite o valor dos juros Ex.:20 : ");
        juros = input.nextDouble() / 100;
        System.out.print("Digite a quantidade de dias: ");
        dias = input.nextInt();

        if(dias < 45) {
            double total = conta + multa + (conta * juros);

            System.out.println(total);
        } else {
            System.err.println("Já passaram " + dias + " dias de atraso. Não é possível pagar essa conta!");
        }
        
    }
}