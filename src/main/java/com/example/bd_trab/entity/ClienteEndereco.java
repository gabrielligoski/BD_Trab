package com.example.bd_trab.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cliente_endereco")
public class ClienteEndereco implements Serializable {


    @Id
    @Column(name = "cpf_cliente")
    private String cpfCliente;

    @Column(name = "id_endereco", nullable = false)
    private Integer idEndereco;
}
