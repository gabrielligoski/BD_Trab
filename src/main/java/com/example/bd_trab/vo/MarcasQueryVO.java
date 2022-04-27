package com.example.bd_trab.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class MarcasQueryVO implements Serializable {

    private Integer id;

    private String nome;

    private String contato;

    private String cnpj;
}
