package com.example.bd_trab.service;

import java.util.NoSuchElementException;

import com.example.bd_trab.dto.CartaoDTO;
import com.example.bd_trab.entity.Cartao;
import com.example.bd_trab.repository.CartaoRepository;
import com.example.bd_trab.vo.CartaoQueryVO;
import com.example.bd_trab.vo.CartaoUpdateVO;
import com.example.bd_trab.vo.CartaoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    public Integer save(CartaoVO vO) {
        Cartao bean = new Cartao();
        BeanUtils.copyProperties(vO, bean);
        bean = cartaoRepository.save(bean);
        return bean.getId();
    }

    public void delete(Integer id) {
        cartaoRepository.deleteById(id);
    }

    public void update(Integer id, CartaoUpdateVO vO) {
        Cartao bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        cartaoRepository.save(bean);
    }

    public CartaoDTO getById(Integer id) {
        Cartao original = requireOne(id);
        return toDTO(original);
    }

    public Page<CartaoDTO> query(CartaoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private CartaoDTO toDTO(Cartao original) {
        CartaoDTO bean = new CartaoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Cartao requireOne(Integer id) {
        return cartaoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
