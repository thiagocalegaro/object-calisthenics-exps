package org.example.regra2;

public class Usuario {
    private String username;
    private String senha;

    public Usuario(String username, String senha) {
        this.username = username;

    }
    public String getNome() {
        return username;
    }
    public String getSenha() {
        return senha;
    }
    public void loginErrado(String username, String senha) {
        if (this.username.equals(username) && this.senha.equals(senha)) {
            System.out.println("Login bem-sucedido para o usuário: " + username);
        } else {
            System.out.println("Falha no login. Verifique suas credenciais.");
        }
    }
    public void LoginCerto(String username, String senha) {
        //não usar else
        if (!this.username.equals(username) || !this.senha.equals(senha)) {
            throw new IllegalArgumentException("Falha no login. Verifique suas credenciais.");
        }
        //redirecionar para a página de boas-vindas
        System.out.println("Login bem-sucedido para o usuário: " + username);
    }



}
