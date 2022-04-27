package com.example.bd_trab.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "avaliacao")
public class Avaliacao implements Serializable {


    @Id
    @Column(name = "id_produto", nullable = false)
    private Integer idProduto;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "opniao_geral")
    private String opniaoGeral;

    @Column(name = "pros")
    private String pros;

    @Column(name = "contras")
    private String contras;

    @Column(name = "estrelas", nullable = false)
    private Integer estrelas;

    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "id_cliente", nullable = false)
    private String idCliente;
}
