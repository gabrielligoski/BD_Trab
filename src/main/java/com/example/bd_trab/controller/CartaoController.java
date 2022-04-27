package com.example.bd_trab.controller;

import com.example.bd_trab.dto.CartaoDTO;
import com.example.bd_trab.service.CartaoService;
import com.example.bd_trab.vo.CartaoQueryVO;
import com.example.bd_trab.vo.CartaoUpdateVO;
import com.example.bd_trab.vo.CartaoVO;
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
@RequestMapping("/cartao")
@CrossOrigin
public class CartaoController {

    @Autowired
    private CartaoService cartaoService;

    @PostMapping
    public String save( @RequestBody CartaoVO vO) {
        return cartaoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(  @PathVariable("id") Integer id) {
        cartaoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(  @PathVariable("id") Integer id,
             @RequestBody CartaoUpdateVO vO) {
        cartaoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public CartaoDTO getById(  @PathVariable("id") Integer id) {
        return cartaoService.getById(id);
    }

    @GetMapping
    public Page<CartaoDTO> query( CartaoQueryVO vO) {
        return cartaoService.query(vO);
    }
}
