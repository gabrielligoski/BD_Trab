package com.example.bd_trab.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class DestaquesDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer idProduto;

    private Date fimDestaque;
}
