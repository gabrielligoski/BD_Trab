package com.example.bd_trab.controller;

import com.example.bd_trab.dto.EnderecoDTO;
import com.example.bd_trab.service.EnderecoService;
import com.example.bd_trab.vo.EnderecoQueryVO;
import com.example.bd_trab.vo.EnderecoUpdateVO;
import com.example.bd_trab.vo.EnderecoVO;
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
@RequestMapping("/endereco")
@CrossOrigin
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public String save( @RequestBody EnderecoVO vO) {
        return enderecoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(  @PathVariable("id") Integer id) {
        enderecoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(  @PathVariable("id") Integer id,
             @RequestBody EnderecoUpdateVO vO) {
        enderecoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public EnderecoDTO getById(  @PathVariable("id") Integer id) {
        return enderecoService.getById(id);
    }

    @GetMapping
    public Page<EnderecoDTO> query( EnderecoQueryVO vO) {
        return enderecoService.query(vO);
    }
}
