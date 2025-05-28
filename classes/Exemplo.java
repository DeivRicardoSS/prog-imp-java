public class Exemplo {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
        }
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].print();
        }
        System.out.println("Média de idade: " + mediaIdade(pessoas));
    }

    public static double mediaIdade(Pessoa[] v) {
        double soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma = v[i].idade + soma;
        }
        return soma / v.length;
    }
}