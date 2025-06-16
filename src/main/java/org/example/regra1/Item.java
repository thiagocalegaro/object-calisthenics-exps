package org.example.regra1;

public class Item {
    private String nome;
    private double preco;
    private Estoque estoque;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
    public Estoque getEstoque() {
        return estoque;
    }

}
