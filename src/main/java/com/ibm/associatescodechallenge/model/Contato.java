package com.ibm.associatescodechallenge.model;

import javax.persistence.*;

/**
 * Classe de integracao com a tabela tcontato
 */
@Entity
//@Table
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeComprador;
    private String email;
    private String telefone;
    private Integer DDI;
    private Integer DDD;

   // @ManyToOne
    //public Cliente cliente;

    public Contato() {}
    public Contato(Long id, String nomeComprador, String email, String telefone, Integer DDI, Integer DDD) {
        this.id = id;
        this.nomeComprador = nomeComprador;
        this.email = email;
        this.telefone = telefone;
        this.DDI = DDI;
        this.DDD = DDD;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getDDI() {
        return DDI;
    }

    public void setDDI(Integer DDI) {
        this.DDI = DDI;
    }

    public Integer getDDD() {
        return DDD;
    }

    public void setDDD(Integer DDD) {
        this.DDD = DDD;
    }

}
