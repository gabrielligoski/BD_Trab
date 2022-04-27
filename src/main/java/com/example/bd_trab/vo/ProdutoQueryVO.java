package com.example.bd_trab.vo;

import java.io.Serializable;
import java.sql.Blob;

import lombok.Data;

@Data
public class ProdutoQueryVO implements Serializable {


    private Integer id;

    private String nome;

    private String descricao;

    private String categoria;

    private Float preco;

    private Integer quantidadeEstoque;

    private byte[] imagem;
}
