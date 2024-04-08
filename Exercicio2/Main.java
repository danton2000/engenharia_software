package Exercicio2;

public class Main {
    public static void main(String[] args) {

        Venda venda = new Venda();

        Livro livro1 = new Livro();

        livro1.setNome("Diarío de um Banana");

        livro1.setPreco(18.00);

        livro1.setQuantidadeEstoque(5);

        livro1.setAutor("Desconhecido");

        venda.adicionarProdutoVenda(livro1);

        venda.listarProdutosVendidos();


    }
}
