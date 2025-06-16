package org.example.regra7e8.certo;

import org.example.regra7e8.Cpf;

public class Gerente {
    private String nome;
    private Cpf cpf;
    private Endereco endereco;
    //getters and setters
    public Gerente(String nome, Cpf cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    //jeito correto regra 5
    public String obterNomeDaCidade() {
        return this.endereco.obterNomeDaCidade();
    }
}
