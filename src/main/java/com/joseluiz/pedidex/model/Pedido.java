package com.joseluiz.pedidex.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PEDIDOS")
@Getter
@Setter
@EqualsAndHashCode
public class Pedido implements Serializable {

    @Id
    @Column(name = "ID_PEDIDO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PEDIDOS_SEQ")
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;

    @NotNull
    @Column(name = "DT_EMISSAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date emissao;

    @Column(name = "DT_APROVACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aprovacao;

    @JoinColumn(name = "ID_PEDIDO")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PedidoItem> itens;

    @NotNull
    @Digits(integer = 10, fraction = 5)
    @Column(name = "VL_TOTAL", precision = 15, scale = 5)
    private BigDecimal valorTotal;

}
