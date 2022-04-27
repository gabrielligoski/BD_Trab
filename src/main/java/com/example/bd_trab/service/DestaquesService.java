package com.example.bd_trab.service;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.bd_trab.dto.DestaquesDTO;
import com.example.bd_trab.entity.Destaques;
import com.example.bd_trab.repository.DestaquesRepository;
import com.example.bd_trab.vo.DestaquesQueryVO;
import com.example.bd_trab.vo.DestaquesUpdateVO;
import com.example.bd_trab.vo.DestaquesVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestaquesService {

    @Autowired
    private DestaquesRepository destaquesRepository;

    public Integer save(DestaquesVO vO) {
        Destaques bean = new Destaques();
        BeanUtils.copyProperties(vO, bean);
        bean = destaquesRepository.save(bean);
        return bean.getId();
    }

    public void delete(Integer id) {
        destaquesRepository.deleteById(id);
    }

    public void update(Integer id, DestaquesUpdateVO vO) {
        Destaques bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        destaquesRepository.save(bean);
    }

    public DestaquesDTO getById(Integer id) {
        Destaques original = requireOne(id);
        return toDTO(original);
    }

    public List<Destaques> query(DestaquesQueryVO vO) {
        return destaquesRepository.findAll();
    }

    private DestaquesDTO toDTO(Destaques original) {
        DestaquesDTO bean = new DestaquesDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Destaques requireOne(Integer id) {
        return destaquesRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
