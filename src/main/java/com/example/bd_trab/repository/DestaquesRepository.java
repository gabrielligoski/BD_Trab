package com.example.bd_trab.repository;

import com.example.bd_trab.entity.Destaques;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DestaquesRepository extends JpaRepository<Destaques, Integer>, JpaSpecificationExecutor<Destaques> {

}