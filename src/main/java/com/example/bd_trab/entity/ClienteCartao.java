package com.example.bd_trab.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cliente_cartao")
public class ClienteCartao implements Serializable {


    @Id
    @Column(name = "cpf_cliente")
    private String cpfCliente;

    @Column(name = "id_cartao")
    private Integer idCartao;
}
