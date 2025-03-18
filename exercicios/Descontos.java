//categoria, preço, quantidade
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Descontos {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        double preco;
        int quantidade, categoria;
        
        System.out.print("Categoria do Produto: ");
        categoria = input.nextInt();
        System.out.print("Preço do Produto: ");
        preco = input.nextDouble();
        System.out.print("Quantidade: ");
        quantidade = input.nextInt();

        double total = preco * quantidade;

        System.out.println("Subtotal: " + total);
        

        if(categoria == 1) {
            System.out.println("- 10% (" + arredondar(total * 0.1) + "): " + arredondar(total - total * 0.1));
            total = total - total * 0.1;

        } else if(categoria == 2) {
            System.out.println("- 15% (" + arredondar(total * 0.15) + "): " + arredondar(total - total * 0.15));
            total = total - total * 0.15;
        } else if(categoria == 3) {
            System.out.println("- 15% (" + arredondar(total * 0.15) + "): " + arredondar(total - total * 0.15));
            total = total - total * 0.15;
        }

        if(quantidade <= 2){
            System.out.println("- 2% (" + arredondar(total * 0.02) + "): " + arredondar(total - total * 0.02));
            total = total - total * 0.02;
        } else if(quantidade <= 10) {
            System.out.println("- 5% (" + arredondar(total * 0.05) + "): " + arredondar(total - total * 0.05));
            total = total - total * 0.05;
        } else {
            System.out.println("- 10% (" + arredondar(total * 0.1) + "): " + arredondar(total - total * 0.1));
            total = total - total * 0.1;
        }

        System.out.println("Total: " + arredondar(total));
        
    }

    public static BigDecimal arredondar(double num) {
        BigDecimal bd = new BigDecimal(num);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd;
    }

}
