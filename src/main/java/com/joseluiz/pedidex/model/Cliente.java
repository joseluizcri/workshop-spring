package com.joseluiz.pedidex.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
@EqualsAndHashCode
public class Cliente implements Serializable {

    @Id
    @Column(name = "I_CLIENTES")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String documento;
    private String nome;
    private String telefone;
    private String email;
}
