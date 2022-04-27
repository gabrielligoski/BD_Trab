package com.example.bd_trab.repository;

import com.example.bd_trab.entity.Promocoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PromocoesRepository extends JpaRepository<Promocoes, String>, JpaSpecificationExecutor<Promocoes> {

}