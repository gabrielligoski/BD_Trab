package com.example.bd_trab.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClienteDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cpf;

    private String nome;

    private String telefone;

    private String email;
}
