package com.example.bd_trab.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EnderecoQueryVO implements Serializable {


    private Integer id;

    private String cep;

    private String numero;

    private String infoAdicional;
}
