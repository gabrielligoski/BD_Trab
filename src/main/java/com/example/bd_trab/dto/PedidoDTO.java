package com.example.bd_trab.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PedidoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer idProduto;

    private String cpfCliente;

    private String status;

    private String codigoRastreio;
}
