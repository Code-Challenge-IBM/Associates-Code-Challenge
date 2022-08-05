package com.ibm.associatescodechallenge.model;

import com.ibm.associatescodechallenge.enums.ItemStatus;

import javax.persistence.*;
import java.util.*;

/**
 * Classe de integracao com a tabela tpedido
 */
@Entity
//@Table
public class Pedido  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;

    private Cliente cliente;

    /**
     * lista de pedidos para cada cliente
     */
    //@OneToMany(mappedBy = "ItemPedido")
    private List<ItemPedido> itensPedido = new ArrayList<>();

    private ItemStatus itemStatus;

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

    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
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
    public void adicionarProduto (ItemPedido itemPedido) {
        itensPedido.add(itemPedido);
    }
    public void removerProduto (ItemPedido itemPedido) {
        itensPedido.remove(itemPedido);
    }

    public Double total(){
        double total = 0.0;
        for (ItemPedido item : itensPedido){
            total += item.getPreco();
        }
        return total;
    }

}
