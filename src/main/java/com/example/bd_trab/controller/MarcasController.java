package com.example.bd_trab.controller;

import com.example.bd_trab.dto.MarcasDTO;
import com.example.bd_trab.service.MarcasService;
import com.example.bd_trab.vo.MarcasQueryVO;
import com.example.bd_trab.vo.MarcasUpdateVO;
import com.example.bd_trab.vo.MarcasVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
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
@RequestMapping("/marcas")
@CrossOrigin
public class MarcasController {

    @Autowired
    private MarcasService marcasService;

    @PostMapping
    public String save( @RequestBody MarcasVO vO) {
        return marcasService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        marcasService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id,
             @RequestBody MarcasUpdateVO vO) {
        marcasService.update(id, vO);
    }

    @GetMapping("/{id}")
    public MarcasDTO getById(@PathVariable("id") Integer id) {
        return marcasService.getById(id);
    }

    @GetMapping
    public Page<MarcasDTO> query( MarcasQueryVO vO) {
        return marcasService.query(vO);
    }
}
