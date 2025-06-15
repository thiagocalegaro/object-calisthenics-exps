package org.example.regra8;

public class Cpf {
    private String numero;

    public Cpf(String numero) {
        if (!isValid(numero)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.numero = numero;
    }

    private boolean isValid(String cpf) {
        // Implementar a lógica de validação do CPF
        return cpf != null && cpf.matches("\\d{11}");
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
