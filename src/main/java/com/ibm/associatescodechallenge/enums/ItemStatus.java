package com.ibm.associatescodechallenge.enums;

/*
 * Lista de status de pedido
*/

public enum ItemStatus {
    PAGAMENTO_PENDENTE (0),
    PROCESSANDO (1),
    APROVADO ( 2),
    ENVIADO (3),
    ENTREGUE (4),
    REJEITADO (5)
    ;

    private final int valor;

    ItemStatus(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
