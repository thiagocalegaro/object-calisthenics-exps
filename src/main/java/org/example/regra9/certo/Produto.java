package org.example.regra9.certo;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidadeEstoque;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        if (preco == null || preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser nulo ou negativo");
        }
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void darBaixaEstoque(int quantidadeDeVenda) {
        if (quantidadeDeVenda < 0) {
            throw new IllegalArgumentException("Quantidade a ser baixada não pode ser negativa");
        }
        if (quantidadeDeVenda > quantidadeEstoque) {
            throw new IllegalArgumentException("Quantidade a ser baixada é maior que o estoque disponível");
        }
        this.quantidadeEstoque -= quantidadeDeVenda;
    }

    public void adicionarEstoque(int quantidade) {

        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade a ser adicionada não pode ser negativa");
        }
        quantidadeEstoque += quantidade;
    }
}
