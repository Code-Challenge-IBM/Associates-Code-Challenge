package com.ibm.associatescodechallenge.model;

import java.util.List;
import java.util.Objects;

public class Cliente {
    private Long id;
    private String cnpj;
    private String razaoSocial;
    private List<Endereco> enderecos;
    private List<Contato> contatos;

    public Cliente() {
    }

    public Cliente(Long id, String cnpj, String razaoSocial, List<Endereco> enderecos, List<Contato> contatos) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.enderecos = enderecos;
        this.contatos = contatos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                '}';
    }

}
