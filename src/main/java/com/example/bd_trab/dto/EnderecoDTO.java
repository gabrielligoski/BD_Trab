package com.example.bd_trab.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EnderecoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;

    private String cep;

    private String numero;

    private String infoAdicional;
}
