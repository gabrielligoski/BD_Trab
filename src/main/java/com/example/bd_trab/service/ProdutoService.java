package com.example.bd_trab.service;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.bd_trab.dto.ProdutoDTO;
import com.example.bd_trab.entity.Produto;
import com.example.bd_trab.repository.ProdutoRepository;
import com.example.bd_trab.vo.ProdutoQueryVO;
import com.example.bd_trab.vo.ProdutoUpdateVO;
import com.example.bd_trab.vo.ProdutoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Integer save(ProdutoVO vO) {
        Produto bean = new Produto();
        BeanUtils.copyProperties(vO, bean);
        bean = produtoRepository.save(bean);
        return bean.getId();
    }

    public void delete(Integer id) {
        produtoRepository.deleteById(id);
    }

    public void update(Integer id, ProdutoUpdateVO vO) {
        Produto bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        produtoRepository.save(bean);
    }

    public ProdutoDTO getById(Integer id) {
        Produto original = requireOne(id);
        return toDTO(original);
    }

    public List<Produto> query(ProdutoQueryVO vO) {
        return produtoRepository.findAll();
    }

    private ProdutoDTO toDTO(Produto original) {
        ProdutoDTO bean = new ProdutoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Produto requireOne(Integer id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
