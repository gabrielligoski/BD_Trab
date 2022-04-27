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
@Table(name = "promocoes")
public class Promocoes implements Serializable {


    @Column(name = "id_produto", nullable = false)
    private Integer idProduto;

    @Column(name = "desconto")
    private Integer desconto;

    @Column(name = "parcelamento")
    private Integer parcelamento;

    @Id
    @Column(name = "codigo_promocional", nullable = false)
    private String codigoPromocional;

    @Column(name = "vencimento")
    private Date vencimento;
}
