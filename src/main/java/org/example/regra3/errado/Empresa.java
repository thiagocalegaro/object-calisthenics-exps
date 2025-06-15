package org.example.regra3.errado;

public class Empresa {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // lógica para validar o email
    public boolean isValido() {
        return email != null && email.contains("@") && email.contains(".");
    }
}
