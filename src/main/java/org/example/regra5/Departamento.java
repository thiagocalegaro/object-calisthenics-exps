package org.example.regra5;

import org.example.regra7e8.certo.Gerente;

public class Departamento {
    private String nome;
    private Gerente gerente;

    public Departamento(String nome, Gerente gerente) {
        this.nome = nome;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gerente getGerente() {
        return gerente;
    }

    //jeito errado regra 5
    public String obterNomeDaCidadeDoGerente() {
        return this.gerente.obterNomeDaCidade();
    }
}
