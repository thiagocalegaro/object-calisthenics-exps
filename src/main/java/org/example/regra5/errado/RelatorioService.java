package org.example.regra5.errado;

import org.example.regra5.Departamento;

public class RelatorioService {

    public void imprimirCidadeDoGerente(Departamento departamento) {

        System.out.println("Buscando cidade do gerente da:");
        //muitos pontos na mesma linha, alto acoplamento.
        String nomeCidade = departamento.getGerente().getEndereco().getCidade().getNome();
        System.out.println("O gerente do departamento mora em: " + nomeCidade);
    }
}
