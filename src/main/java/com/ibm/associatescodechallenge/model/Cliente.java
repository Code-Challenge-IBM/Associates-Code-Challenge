package com.ibm.associatescodechallenge.model;

import java.util.List;
import java.util.Objects;

public class Cliente {
    private Long id;
    private String cnpj;
    private String razaoSocial;
    private List<Endereco> enderecos;
    private List<Contato> contatos;

    public Cliente(Long id, String cnpj) {
        this.id = id;
        this.cnpj = cnpj;
    }

    public Cliente(Long id, String cnpj, String razaoSocial, List<Endereco> enderecos, List<Contato> contatos) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.enderecos = enderecos;
        this.contatos = contatos;
    }
}
