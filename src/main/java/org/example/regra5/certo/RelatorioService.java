package org.example.regra5.certo;

import org.example.regra5.Departamento;

public class RelatorioService {
    public void imprimirCidadeDoGerente(Departamento departamento) {
        System.out.println("Buscando cidade do gerente");

        //apenas um ponto na mesma linha, baixo acoplamento
        //pedimos a informação diretamente ao objeto com o qual interagimos
        String nomeCidade = departamento.obterNomeDaCidadeDoGerente();

        System.out.println("O gerente do departamento mora em: " + nomeCidade);
    }
}
