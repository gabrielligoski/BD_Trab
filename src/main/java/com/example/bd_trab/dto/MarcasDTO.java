package com.example.bd_trab.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MarcasDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;

    private String nome;

    private String contato;

    private String cnpj;
}
