package org.example.regra4.certo;

import java.util.List;

public class DiarioDeNotas {
    private double[] notas;
    private int quantidadeNotas;
    private static final int MAX_NOTAS = 10;

    public DiarioDeNotas() {
        this.notas = new double[MAX_NOTAS];
        this.quantidadeNotas = 0;
    }
    public void addNota(double nota) {
        if (quantidadeNotas < MAX_NOTAS) {
            notas[quantidadeNotas] = nota;
            quantidadeNotas++;
        } else {
            System.out.println("Limite de notas atingido.");
        }
    }
    public double calcularMedia() {
        if (quantidadeNotas == 0) {
            return 0.0;
        }
        double soma = 0.0;
        for (int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }
        return soma / quantidadeNotas;
    }
}
