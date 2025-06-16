package org.example.regra1.certo;

import org.example.regra1.Cliente;
import org.example.regra1.Item;
import org.example.regra1.Pedido;

public class ProcessadorDePedidos {

    private double precoTotal;

    public double finalizarCompra(Pedido pedido) {
        this.precoTotal = 0.0;
        System.out.println("\nProcessando pedido da forma CORRETA (Refatorada)...");

        // Nível 1 de indentação
        for (Item item : pedido.getItens()) {
            processarItem(item, pedido.getCliente());
        }

        return this.precoTotal;
    }

    private void processarItem(Item item, Cliente cliente) {
        // Nível 1 de indentação
        if (!EstoqueService.temEstoque(item)) {
            System.out.println("Item " + item.getNome() + " fora de estoque!");
            return; // Usando Guard Clause para evitar o 'else'
        }

        double precoDoItem = calcularPrecoFinalItem(item, cliente);
        this.precoTotal += precoDoItem;
    }

    private double calcularPrecoFinalItem(Item item, Cliente cliente) {
        double precoItem = item.getPreco();

        // Nível 1 de indentação
        if (cliente.temCupomEspecial()) {
            System.out.println("Cupom de 10% aplicado no item: " + item.getNome());
            return precoItem * 0.90; // Retorna o valor com desconto
        }

        return precoItem; // Retorna o valor original
    }
}