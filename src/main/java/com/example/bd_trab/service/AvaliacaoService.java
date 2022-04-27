package com.example.bd_trab.service;

import java.util.NoSuchElementException;

import com.example.bd_trab.dto.AvaliacaoDTO;
import com.example.bd_trab.entity.Avaliacao;
import com.example.bd_trab.repository.AvaliacaoRepository;
import com.example.bd_trab.vo.AvaliacaoQueryVO;
import com.example.bd_trab.vo.AvaliacaoUpdateVO;
import com.example.bd_trab.vo.AvaliacaoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public Integer save(AvaliacaoVO vO) {
        Avaliacao bean = new Avaliacao();
        BeanUtils.copyProperties(vO, bean);
        bean = avaliacaoRepository.save(bean);
        return bean.getIdProduto();
    }

    public void delete(Integer id) {
        avaliacaoRepository.deleteById(id);
    }

    public void update(Integer id, AvaliacaoUpdateVO vO) {
        Avaliacao bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        avaliacaoRepository.save(bean);
    }

    public AvaliacaoDTO getById(Integer id) {
        Avaliacao original = requireOne(id);
        return toDTO(original);
    }

    public Page<AvaliacaoDTO> query(AvaliacaoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private AvaliacaoDTO toDTO(Avaliacao original) {
        AvaliacaoDTO bean = new AvaliacaoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Avaliacao requireOne(Integer id) {
        return avaliacaoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
