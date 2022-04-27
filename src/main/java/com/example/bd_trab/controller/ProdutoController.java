package com.example.bd_trab.controller;

import java.util.List;

import com.example.bd_trab.dto.ProdutoDTO;
import com.example.bd_trab.entity.Produto;
import com.example.bd_trab.service.ProdutoService;
import com.example.bd_trab.vo.ProdutoQueryVO;
import com.example.bd_trab.vo.ProdutoUpdateVO;
import com.example.bd_trab.vo.ProdutoVO;
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
@RequestMapping("/produto")
@CrossOrigin
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public String save( @RequestBody ProdutoVO vO) {
        return produtoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete( @PathVariable("id") Integer id) {
        produtoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update( @PathVariable("id") Integer id,
             @RequestBody ProdutoUpdateVO vO) {
        produtoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public ProdutoDTO getById( @PathVariable("id") Integer id) {
        return produtoService.getById(id);
    }

    @GetMapping
    public List<Produto> query( ProdutoQueryVO vO) {
        return produtoService.query(vO);
    }
}
