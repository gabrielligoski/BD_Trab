package com.example.bd_trab.controller;

import com.example.bd_trab.dto.AvaliacaoDTO;
import com.example.bd_trab.service.AvaliacaoService;
import com.example.bd_trab.vo.AvaliacaoQueryVO;
import com.example.bd_trab.vo.AvaliacaoUpdateVO;
import com.example.bd_trab.vo.AvaliacaoVO;
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
@RequestMapping("/avaliacao")
@CrossOrigin
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @PostMapping
    public String save( @RequestBody AvaliacaoVO vO) {
        return avaliacaoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(  @PathVariable("id") Integer id) {
        avaliacaoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(  @PathVariable("id") Integer id,
             @RequestBody AvaliacaoUpdateVO vO) {
        avaliacaoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public AvaliacaoDTO getById(  @PathVariable("id") Integer id) {
        return avaliacaoService.getById(id);
    }

    @GetMapping
    public Page<AvaliacaoDTO> query( AvaliacaoQueryVO vO) {
        return avaliacaoService.query(vO);
    }
}
