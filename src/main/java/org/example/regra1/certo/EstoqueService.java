package org.example.regra1.certo;

import org.example.regra1.Item;

public class EstoqueService {
    public static boolean temEstoque(Item item) {
        // Simula uma verificação de estoque.
        // Para este exemplo, vamos dizer que sempre temos estoque.
        System.out.println("Verificando estoque para: " + item.getNome());
        return true;
    }
}