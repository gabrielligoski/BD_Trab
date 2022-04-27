package com.example.bd_trab.dto;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class CartaoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;

    private String nome;

    private String numero;

    private Date data;

    private Integer securityCode;
}
