package com.example.bd_trab.vo;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class DestaquesVO implements Serializable {


    private Integer id;

    private Integer idProduto;

    private Date fimDestaque;
}
