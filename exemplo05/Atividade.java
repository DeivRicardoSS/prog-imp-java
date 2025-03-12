public class Atividade {

    public static void main(String[] args) {
        int pessoa1 = 0;
        int pessoa2 = 0;

        for(int i = 1; i <= 10; i++) {
            int num1 = (int) Math.floor(Math.random() * 6) + 1;
            System.out.print("Jogador 1: " + num1 + " - ");

            int num2 = (int) Math.floor(Math.random() * 6) + 1;
            System.out.print("Jogador 2: " + num2 + " - ");

            if(num1 > num2) {
                pessoa1++;
                System.out.println("Jogador 1 Ganhou!");
            } else if(num1 < num2) {
                pessoa2++;
                System.out.println("Jogador 2 Ganhou!");
            }else {
                System.out.println("Empate!");
            }

            
        }

        if(pessoa1 > pessoa2) {
            System.out.println("Jogador 1 Ganhou por " + pessoa1 + " x " + pessoa2);
        } else if (pessoa1 < pessoa2) {
            System.out.println("Jogador 2 Ganhou por " + pessoa2 + " x " + pessoa1);
        }
        
    }
}
