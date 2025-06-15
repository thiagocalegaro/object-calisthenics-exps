package org.example.regra4.certo;

public class Aluno {
    private String nome;
    private int matricula;
    private DiarioDeNotas diarioDeNotas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.diarioDeNotas = new DiarioDeNotas();
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void addNota(double nota) {
        diarioDeNotas.addNota(nota);
    }

    public double calcularMedia() {
        return diarioDeNotas.calcularMedia();
    }
}
