package com.example.bd_trab.entity;

import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(schema = "ecommerce", name = "produto")
public class Produto implements Serializable {


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @Column(name = "preco")
    private Float preco;

    @Column(name = "quantidade_estoque")
    private Integer quantidadeEstoque;

    @Column(name = "imagem")
    private byte[] imagem;
}
