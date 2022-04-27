package com.example.bd_trab.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClienteVO implements Serializable {


    private String cpf;

    private String nome;

    private String telefone;

    private String email;
}
