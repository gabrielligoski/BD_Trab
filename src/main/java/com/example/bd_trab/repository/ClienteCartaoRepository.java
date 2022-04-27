package com.example.bd_trab.repository;

import com.example.bd_trab.entity.ClienteCartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClienteCartaoRepository extends JpaRepository<ClienteCartao, Void>, JpaSpecificationExecutor<ClienteCartao> {

}