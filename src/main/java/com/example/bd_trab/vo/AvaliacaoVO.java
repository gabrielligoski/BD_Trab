package com.example.bd_trab.vo;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class AvaliacaoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idProduto;

    private String titulo;

    private String opniaoGeral;

    private String pros;

    private String contras;

    private Integer estrelas;

    private Date data;

    private String idCliente;
}
