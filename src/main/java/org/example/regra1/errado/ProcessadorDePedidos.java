package org.example.regra1.errado;

import org.example.regra1.Cliente;
import org.example.regra1.Estoque;
import org.example.regra1.Item;
import org.example.regra1.Pedido;

import java.util.List;

public class ProcessadorDePedidos {

    public double finalizarCompra(Pedido pedido) {
        double precoTotal = 0.0;
        Cliente cliente = pedido.getCliente();
        List<Item> itens = pedido.getItens();

        System.out.println("Processando pedido da forma ERRADA...");

        //nível 1 de indentação
        for (Item item : itens) {

            //nível 2 de] indentação
            if (Estoque.verificarEstoque(item)) {
                double precoItem = item.getPreco();

                //nível 3 de indentação
                if (cliente.temCupomEspecial()) {
                    //aplica desconto
                    precoItem *= 0.90;
                    System.out.println("Cupom de 10% aplicado no item: " + item.getNome());
                }

                precoTotal += precoItem;
            } else {
                System.out.println("Item " + item.getNome() + " fora de estoque!");
            }
        }

        return precoTotal;
    }
}