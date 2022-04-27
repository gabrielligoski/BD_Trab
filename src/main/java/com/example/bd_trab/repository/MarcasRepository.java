package com.example.bd_trab.repository;

import com.example.bd_trab.entity.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MarcasRepository extends JpaRepository<Marcas, Integer>, JpaSpecificationExecutor<Marcas> {

}