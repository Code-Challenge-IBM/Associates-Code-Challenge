package com.ibm.associatescodechallenge.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Classe de integracao com a tabela tpedido
 */
public class Pedido  {

    private Long id;
    private Date date;

    private Cliente cliente;

    /**
     * lista de pedidos para cada cliente
     */
    private List<ItemPedido> itensPedido;


    //falta criar enum de status

    public Pedido(){

    }

    public Pedido(Long id, Date date) {
        this.id = id;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return id.equals(pedido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
    public void AdicionarProduto (ItemPedido itemPedido) {
        itensPedido.add(itemPedido);
    }
    public void RemoverProduto (ItemPedido itemPedido) {
        itensPedido.remove(itemPedido);
    }
}
