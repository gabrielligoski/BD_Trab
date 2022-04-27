package com.example.bd_trab.dto;

import java.io.Serializable;
import java.sql.Blob;

import lombok.Data;

@Data
public class ProdutoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;

    private String nome;

    private String descricao;

    private String categoria;

    private Float preco;

    private Integer quantidadeEstoque;

    private byte[] imagem;
}
