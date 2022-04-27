package com.example.bd_trab.repository;

import com.example.bd_trab.entity.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer>, JpaSpecificationExecutor<Avaliacao> {

}