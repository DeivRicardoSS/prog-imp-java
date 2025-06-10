import java.util.Scanner;

public class ControleDeEstoque {
    public static final int TAM = 100;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Produto[] produtos = new Produto[TAM];
        int qtdProdutos = 0;
        int controle;

        do {
            System.out.println("===============");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Imprimir Produtos");
            System.out.println("3 - Filtrar produtos por categoria");
            System.out.println("4 - Ordenar");
            System.out.println("5 - Remover Produto");
            System.out.println("6 - Atualizar Preço");
            System.out.println("7 - Listagem com subtotal do valor em estoque por categoria");
            System.out.println("0 - Sair");
            System.out.println("===============");

            controle = input.nextInt();
            input.nextLine();

            switch (controle) {
                case 1:
                    qtdProdutos = cadastrarProduto(produtos, qtdProdutos);
                    break;
                case 2:
                    listarProdutos(produtos, qtdProdutos);
                    break;
                case 3:
                    System.out.println("Pesquisar Categoria: ");
                    filtrarProdutoPorCategoria(produtos, qtdProdutos, input.nextLine(), false);
                    break;
                case 4:
                    ordenar(produtos, qtdProdutos);
                    break;
                case 5:
                    qtdProdutos = removerProduto(produtos, qtdProdutos);
                    break;
                case 6:
                    atualizarPreco(produtos, qtdProdutos);
                    break;
                case 7:
                    listarComSubtotalDoValorEmEstoque(produtos, qtdProdutos);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Tem algo errado ae");
                    break;
            }
        } while (controle != 0);
    }

    public static int cadastrarProduto(Produto[] v, int qtd) {
        if (qtd >= TAM) {
            System.out.println("Erro: vetor cheio.");
            return qtd;
        }

        v[qtd] = new Produto();
        System.out.print("Digite o nome do produto: ");
        v[qtd].nome = input.nextLine();
        System.out.print("Digite a categoria do produto: ");
        v[qtd].categoria = input.nextLine();
        System.out.print("Digite o preço do produto: ");
        v[qtd].preco = input.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        v[qtd].qtdEstoque = input.nextInt();
        System.out.print("Digite a quantidade mínima: ");
        v[qtd].qtdMinima = input.nextInt();
        input.nextLine(); // limpa buffer

        return qtd + 1;
    }

    public static void listarProdutos(Produto[] v, int qtd) {
        System.out.println("Produtos:======================");
        for (int i = 0; i < qtd; i++) {
            System.out.println("Nome: " + v[i].nome);
            System.out.println("Categoria: " + v[i].categoria);
            System.out.println("Preço: " + v[i].preco);
            System.out.println("Quantidade em Estoque: " + v[i].qtdEstoque);
            System.out.println("Quantidade mínima: " + v[i].qtdMinima);
            System.out.println();
        }
    }

    public static void filtrarProdutoPorCategoria(Produto[] v, int qtd, String cat, boolean subtotal) {
        double total = 0;
        boolean encontrado = false;

        for (int i = 0; i < qtd; i++) {
            if (v[i].categoria.equalsIgnoreCase(cat)) {
                encontrado = true;
                System.out.println("Nome: " + v[i].nome);
                System.out.println("Categoria: " + v[i].categoria);
                System.out.println("Preço: " + v[i].preco);
                System.out.println("Quantidade em Estoque: " + v[i].qtdEstoque);
                System.out.println("Quantidade mínima: " + v[i].qtdMinima);
                System.out.println();

                if (subtotal) {
                    total += v[i].preco * v[i].qtdEstoque;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum produto encontrado na categoria: " + cat);
        } else if (subtotal) {
            System.out.printf("Subtotal da categoria \"%s\": R$ %.2f\n", cat, total);
        }
    }

    public static void ordenar(Produto[] v, int qtd) {
        for (int i = 0; i < qtd - 1; i++) {
            for (int j = 0; j < qtd - i - 1; j++) {
                if (v[j].nome.compareToIgnoreCase(v[j + 1].nome) > 0) {
                    Produto aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
        System.out.println("Produtos ordenados por nome.");
    }

    public static int removerProduto(Produto[] v, int qtd) {
        System.out.println("Digite o nome do produto que deseja remover: ");
        String nome = input.nextLine();

        for (int i = 0; i < qtd; i++) {
            if (v[i].nome.equalsIgnoreCase(nome)) {
                for (int j = i; j < qtd - 1; j++) {
                    v[j] = v[j + 1];
                }
                v[qtd - 1] = null;
                System.out.println("Produto removido.");
                return qtd - 1;
            }
        }

        System.out.println("Produto não encontrado.");
        return qtd;
    }

    public static void atualizarPreco(Produto[] v, int qtd) {
        System.out.println("Digite o nome do produto que deseja atualizar: ");
        String nome = input.nextLine();

        for (int i = 0; i < qtd; i++) {
            if (v[i].nome.equalsIgnoreCase(nome)) {
                System.out.print("Digite o novo preço: ");
                v[i].preco = input.nextDouble();
                input.nextLine(); // limpa buffer
                System.out.println("Preço atualizado.");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    public static void listarComSubtotalDoValorEmEstoque(Produto[] v, int qtd) {
        String[] categorias = new String[qtd];
        int numCategorias = 0;

        for (int i = 0; i < qtd; i++) {
            boolean existe = false;
            for (int j = 0; j < numCategorias; j++) {
                if (categorias[j].equalsIgnoreCase(v[i].categoria)) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                categorias[numCategorias++] = v[i].categoria;
            }
        }

        for (int i = 0; i < numCategorias; i++) {
            System.out.println("Categoria: " + categorias[i]);
            filtrarProdutoPorCategoria(v, qtd, categorias[i], true);
        }
    }
}