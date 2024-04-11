package Exercicio2;

abstract class Produto {
    
    private String nome;

    private Double preco;

    private Integer quantidade_estoque;

    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public Double getPreco() {

        return this.preco;
    }

    public void setPreco(Double preco) {

        this.preco = preco;

    }

    public Integer getQuantidadeEstoque() {

        return this.quantidade_estoque;
    }

    public void setQuantidadeEstoque(Integer quantidade_estoque) {

        this.quantidade_estoque = quantidade_estoque;

    }

}
