package com.example.bd_trab.service;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.bd_trab.dto.PromocoesDTO;
import com.example.bd_trab.entity.Promocoes;
import com.example.bd_trab.repository.PromocoesRepository;
import com.example.bd_trab.vo.PromocoesQueryVO;
import com.example.bd_trab.vo.PromocoesUpdateVO;
import com.example.bd_trab.vo.PromocoesVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromocoesService {

    @Autowired
    private PromocoesRepository promocoesRepository;

    public String save(PromocoesVO vO) {
        Promocoes bean = new Promocoes();
        BeanUtils.copyProperties(vO, bean);
        bean = promocoesRepository.save(bean);
        return bean.getCodigoPromocional();
    }

    public void delete(String id) {
        promocoesRepository.deleteById(id);
    }

    public void update(String id, PromocoesUpdateVO vO) {
        Promocoes bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        promocoesRepository.save(bean);
    }

    public PromocoesDTO getById(String id) {
        Promocoes original = requireOne(id);
        return toDTO(original);
    }

    public List<Promocoes> query(PromocoesQueryVO vO) {
        return promocoesRepository.findAll();
    }

    private PromocoesDTO toDTO(Promocoes original) {
        PromocoesDTO bean = new PromocoesDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Promocoes requireOne(String id) {
        return promocoesRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
