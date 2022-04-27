package com.example.bd_trab.service;

import java.util.NoSuchElementException;

import com.example.bd_trab.dto.MarcasDTO;
import com.example.bd_trab.entity.Marcas;
import com.example.bd_trab.repository.MarcasRepository;
import com.example.bd_trab.vo.MarcasQueryVO;
import com.example.bd_trab.vo.MarcasUpdateVO;
import com.example.bd_trab.vo.MarcasVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class MarcasService {

    @Autowired
    private MarcasRepository marcasRepository;

    public Integer save(MarcasVO vO) {
        Marcas bean = new Marcas();
        BeanUtils.copyProperties(vO, bean);
        bean = marcasRepository.save(bean);
        return bean.getId();
    }

    public void delete(Integer id) {
        marcasRepository.deleteById(id);
    }

    public void update(Integer id, MarcasUpdateVO vO) {
        Marcas bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        marcasRepository.save(bean);
    }

    public MarcasDTO getById(Integer id) {
        Marcas original = requireOne(id);
        return toDTO(original);
    }

    public Page<MarcasDTO> query(MarcasQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private MarcasDTO toDTO(Marcas original) {
        MarcasDTO bean = new MarcasDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Marcas requireOne(Integer id) {
        return marcasRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
