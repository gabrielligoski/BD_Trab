package com.example.bd_trab.repository;

import com.example.bd_trab.entity.ClienteEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClienteEnderecoRepository extends JpaRepository<ClienteEndereco, Void>, JpaSpecificationExecutor<ClienteEndereco> {

}