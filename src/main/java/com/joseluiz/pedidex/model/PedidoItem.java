package com.joseluiz.pedidex.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Entity
@Table(name = "PEDIDOS_ITENS")
@Getter
@Setter
@EqualsAndHashCode
public class PedidoItem {

    @Id
    @Column(name = "ID_PEDIDO_ITEM")
    @GeneratedValue(generator = "PEDIDOS_ITENS_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO")
    private Produto produto;

    @NotNull
    @Digits(integer = 10, fraction = 5)
    @Column(name = "VL_UNITARIO", precision = 15, scale = 5)
    private BigDecimal valorUnitario;

    @NotNull
    @Digits(integer = 10, fraction = 5)
    @Column(name = "QUANTIDADE", precision = 15, scale = 5)
    private BigDecimal quantidade;

    @NotNull
    @Digits(integer = 10, fraction = 5)
    @Column(name = "VL_TOTAL", precision = 15, scale = 5)
    private BigDecimal valorTotal;
}
