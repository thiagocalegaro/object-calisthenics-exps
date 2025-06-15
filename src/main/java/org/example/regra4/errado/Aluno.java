package org.example.regra4.errado;

import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    List<String> notas;

    //add nota
    public void addNota(String nota) {
        this.notas.add(nota);
    }
    //calcular média
    public double calcularMedia() {
        double soma = 0;
        for (String nota : notas) {
            soma += Double.parseDouble(nota);
        }
        return soma / notas.size();
    }

}
