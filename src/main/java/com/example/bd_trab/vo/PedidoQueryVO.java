package com.example.bd_trab.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class PedidoQueryVO implements Serializable {


    private Integer id;

    private Integer idProduto;

    private String cpfCliente;

    private String status;

    private String codigoRastreio;
}
