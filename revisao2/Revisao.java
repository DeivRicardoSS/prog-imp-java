import java.util.Scanner;

public class Revisao {
    public static Scanner input = new Scanner(System.in);
    public static final int TAM = 100;

    public static void main(String[] args) {
        int controle = 0;
        Categoria[] categorias = new Categoria[TAM];
        int qtdCategorias = 0;
        Produto[] produtos = new Produto[TAM];
        int qtdProdutos = 0;

        do {
            System.out.println("===============");
            System.out.println("1 - Cadastrar Categoria");
            System.out.println("2 - Imprimir Categorias");
            System.out.println("3 - Cadastrar Produto");
            System.out.println("4 - Imprimir Produtos");
            System.out.println("5 - Ordenar Produtos por Descrição");
            System.out.println("6 - Pesquisar produto");
            System.out.println("===============");

            controle = input.nextInt();
            input.nextLine();

            switch (controle) {
                case 1:
                    qtdCategorias = cadastrarCategoria(categorias, qtdCategorias);
                    break;
                case 2:
                    imprimirCategorias(categorias, qtdCategorias);
                    break;
                case 3:
                    qtdProdutos = cadastrarProduto(produtos, qtdProdutos);
                    break;
                case 4:
                    imprimirProdutos(produtos, qtdProdutos, categorias);
                    break;
                case 5:
                    selectionSortPorDescricao(produtos, qtdProdutos);
                    imprimirProdutos(produtos, qtdProdutos, categorias);
                    break;
                case 6:
                    System.out.print("Digite a descrição do produto: ");
                    buscaBinariPorDescricao(produtos, qtdProdutos, input.nextLine());
                    break;
                default:
                    System.out.println("Tem algo errado ae");
                    break;
            }
        } while (controle != 0);
    }

    public static int cadastrarCategoria(Categoria[] v, int qtd) {
        if (qtd >= TAM) {
            System.out.println("Erro: Não foi possível cadastrar uma nova categoria. Vetor cheio.");
            return qtd;
        }

        System.out.print("Digite o nome da categoria: ");
        v[qtd] = new Categoria();
        v[qtd].codigo = qtd + 1;
        v[qtd].nome = input.nextLine();

        return qtd + 1;
    }

    public static void imprimirCategorias(Categoria[] v, int qtd) {
        System.out.println("Categorias:======================");
        for (int i = 0; i < qtd; i++) {
            System.out.println("Código: " + v[i].codigo);
            System.out.println("Nome: " + v[i].nome + "\n");
        }
    }

    public static int cadastrarProduto(Produto[] v, int qtd) {
        if (qtd >= TAM) {
            System.out.println("Erro: Não foi possível cadastrar uma nova categoria. Vetor cheio.");
            return qtd;
        }

        v[qtd] = new Produto();
        v[qtd].codigo = qtd + 1;
        System.out.print("Digite o nome da produto: ");
        v[qtd].titulo = input.nextLine();
        System.out.print("Digite o código da categoria do produto: ");
        v[qtd].categoria = input.nextInt();
        input.nextLine();
        System.out.print("Digite a descrição do produto: ");
        v[qtd].descricao = input.nextLine();
        System.out.print("Digite o preço do produto: ");
        v[qtd].preco = input.nextInt();

        return qtd + 1;
    }

    public static void imprimirProdutos(Produto[] v, int qtd, Categoria[] cat) {
        System.out.println("Categorias:======================");
        for (int i = 0; i < qtd; i++) {
            System.out.println("Código: " + v[i].codigo);
            System.out.println("Nome: " + v[i].titulo);
            System.out.println("Categoria: " + cat[v[i].categoria - 1].nome);
            double preco = v[i].preco / 100.0;
            System.out.println("Preço: " + preco);
            System.out.println("Descrição: " + v[i].descricao + "\n");
        }
    }

    public static void selectionSortPorDescricao(Produto[] v, int qtd) {
        int fim = qtd - 1;

        while (fim > 0) {
            int palavraDepois = 0;
            for (int i = 0; i < fim; i++) {
                if (v[i + 1].descricao.compareTo(v[palavraDepois].descricao) > 0) {
                    palavraDepois = i + 1;
                }
            }
            Produto aux = v[fim];
            v[fim] = v[palavraDepois];
            v[palavraDepois] = aux;

            fim -= 1;
        }
    }

    public static void buscaBinariPorDescricao(Produto[] v, int qtd, String x) {
        int comeco = 0;
        int meio = qtd / 2;
        int fim = qtd;

        while (comeco <= fim) {
            meio = (comeco + fim) / 2;

            if (v[meio].descricao.equals(x)) {
                System.out.println("Código: " + v[meio].codigo);
                System.out.println("Nome: " + v[meio].titulo);
                System.out.println("Categoria: " + v[meio].categoria);
                double preco = v[meio].preco / 100.0;
                System.out.println("Preço: " + preco);
                System.out.println("Descrição: " + v[meio].descricao + "\n");
                return;
            } else if (v[meio].descricao.compareTo(x) < 0) {
                comeco = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Erro: Produto não encontrado");

    }
}
