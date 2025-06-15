package org.example.regra3.certo;

public class Email {
    private String endereco;

    public Email(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //lógica para validar o email
    public boolean isValido() {
        return endereco != null && endereco.contains("@") && endereco.contains(".");
    }
}
