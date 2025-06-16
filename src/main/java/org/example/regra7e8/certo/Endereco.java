package org.example.regra7e8.certo;

import org.example.regra7e8.Bairro;
import org.example.regra7e8.Cidade;
import org.example.regra7e8.NumeroDaResidencia;
import org.example.regra7e8.Rua;

public class Endereco {
    private Cidade cidade;
    private Bairro bairro;
    private Rua rua;
    private NumeroDaResidencia numeroDaResidencia;

    public Endereco(Cidade cidade, Bairro bairro, Rua rua, NumeroDaResidencia numeroDaResidencia) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroDaResidencia = numeroDaResidencia;
    }
    public Cidade getCidade() {
        return cidade;
    }

    //jeito correto regra 5
    public String obterNomeDaCidade() {
        return this.cidade.getNome();
    }
}
