package com.example.bd_trab.controller;

import java.util.List;

import com.example.bd_trab.dto.PromocoesDTO;
import com.example.bd_trab.entity.Promocoes;
import com.example.bd_trab.service.PromocoesService;
import com.example.bd_trab.vo.PromocoesQueryVO;
import com.example.bd_trab.vo.PromocoesUpdateVO;
import com.example.bd_trab.vo.PromocoesVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocoes")
@CrossOrigin
public class PromocoesController {

    @Autowired
    private PromocoesService promocoesService;

    @PostMapping
    public String save(@RequestBody PromocoesVO vO) {
        return promocoesService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete( @PathVariable("id") String id) {
        promocoesService.delete(id);
    }

    @PutMapping("/{id}")
    public void update( @PathVariable("id") String id,
            @RequestBody PromocoesUpdateVO vO) {
        promocoesService.update(id, vO);
    }

    @GetMapping("/{id}")
    public PromocoesDTO getById( @PathVariable("id") String id) {
        return promocoesService.getById(id);
    }

    @GetMapping
    public List<Promocoes> query(PromocoesQueryVO vO) {
        return promocoesService.query(vO);
    }
}
