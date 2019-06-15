package com.joseluiz.pedidex.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="PRODUTOS")
@Getter
@Setter
@EqualsAndHashCode
public class Produto implements Serializable {

    @Id
    @Column(name = "I_PRODUTOS")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String descricao;
    private BigDecimal preco;
    private BigDecimal estoque;
}
