package org.example.regra1;

// Cliente.java
public class Cliente {
    private String nome;
    private boolean temCupomEspecial;

    public Cliente(String nome, boolean temCupomEspecial) {
        this.nome = nome;
        this.temCupomEspecial = temCupomEspecial;
    }

    public boolean temCupomEspecial() {
        return temCupomEspecial;
    }
}
