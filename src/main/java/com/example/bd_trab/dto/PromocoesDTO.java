package com.example.bd_trab.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class PromocoesDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idProduto;

    private Integer desconto;

    private Integer parcelamento;

    private String codigoPromocional;

    private Date vencimento;
}
