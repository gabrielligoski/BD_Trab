package com.example.bd_trab.repository;

import com.example.bd_trab.entity.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CartaoRepository extends JpaRepository<Cartao, Integer>, JpaSpecificationExecutor<Cartao> {

}