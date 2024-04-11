package Exercicio2;
// Adicionando libs para utilizar lista no Java
import java.util.List;
import java.util.ArrayList;

public class Venda {
    // Declarando a lista
    private List<Produto> listaProdutosVendidos;

    public Venda() {
        listaProdutosVendidos = new ArrayList<>();
    }

    public void adicionarProdutoVenda(Produto produto) {
        listaProdutosVendidos.add(produto);
    }

    public void listarProdutosVendidos() {
        // percorendo a lista de obj
        for (Produto produto : listaProdutosVendidos) {
            System.out.println(
                "Nome: " + produto.getNome() + 
                " -- Preço: " + produto.getPreco() +
                " -- Total:  " + produto.getPreco() * produto.getQuantidadeEstoque()
            );
        }
    }

    public double valorTotalVendas() {
        double somaVendas = 0;
        for (Produto produto : listaProdutosVendidos) {
            somaVendas += produto.getPreco() * produto.getQuantidadeEstoque();
        }
        return somaVendas;
    }
}
