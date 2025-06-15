package org.example.regra6;

import org.example.regra3.certo.Email;

public class Usuario {

    //abreviando, difícil de entender
    private String n;
    private String s;

    public void lgn(String n, String s) {
        if (!this.n.equals(n) || !this.s.equals(s)) {
            throw new IllegalArgumentException("Falha no login. Verifique suas credenciais.");
        }
        System.out.println("Login bem-sucedido para o usuário: " + n);
    }

    //sem abreviar, fácil de entender
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void login(String nome, String senha) {
        if (!this.nome.equals(nome) || !this.senha.equals(senha)) {
            throw new IllegalArgumentException("Falha no login. Verifique suas credenciais.");
        }
        System.out.println("Login bem-sucedido para o usuário: " + nome);
    }


}
