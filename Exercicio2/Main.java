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

        //venda.listarProdutosVendidos();

        Eletronico eletronico1 = new Eletronico();

        eletronico1.setNome("Notebook");

        eletronico1.setPreco(4000.99);

        eletronico1.setQuantidadeEstoque(2);

        eletronico1.setMarca("Dell");

        venda.adicionarProdutoVenda(eletronico1);

        venda.listarProdutosVendidos();

        System.out.println("Total das Vendas: " + venda.valorTotalVendas());
    }
}
