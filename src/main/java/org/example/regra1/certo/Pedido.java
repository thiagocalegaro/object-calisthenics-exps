package org.example.regra1.certo;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Item> itens;

    public Pedido(Cliente cliente, List<Item> itens) {
        this.cliente = cliente;
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }
}