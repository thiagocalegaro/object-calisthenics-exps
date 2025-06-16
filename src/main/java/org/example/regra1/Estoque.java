package org.example.regra1;

public class Estoque {

    private int quantidade;



    public Estoque(int quantidade) {
        this.quantidade = quantidade;
    }

    public static boolean verificarEstoque(Item item) {
        if (item.getEstoque().getQuantidade() > 0) {
            System.out.println("Item inválido!");
            return false;
        }
        System.out.println("Verificando estoque para: " + item.getNome());
        return true;
    }
    public int getQuantidade() {
        return quantidade;
    }
}