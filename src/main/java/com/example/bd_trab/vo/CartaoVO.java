package com.example.bd_trab.vo;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class CartaoVO implements Serializable {


    private Integer id;

    private String nome;

    private String numero;

    private Date data;

    private Integer securityCode;
}
