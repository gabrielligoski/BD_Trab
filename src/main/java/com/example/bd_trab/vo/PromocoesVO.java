package com.example.bd_trab.vo;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class PromocoesVO implements Serializable {


    private Integer idProduto;

    private Integer desconto;

    private Integer parcelamento;

    private String codigoPromocional;

    private Date vencimento;
}
