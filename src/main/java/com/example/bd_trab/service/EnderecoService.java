package com.example.bd_trab.service;

import java.util.NoSuchElementException;

import com.example.bd_trab.dto.EnderecoDTO;
import com.example.bd_trab.entity.Endereco;
import com.example.bd_trab.repository.EnderecoRepository;
import com.example.bd_trab.vo.EnderecoQueryVO;
import com.example.bd_trab.vo.EnderecoUpdateVO;
import com.example.bd_trab.vo.EnderecoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Integer save(EnderecoVO vO) {
        Endereco bean = new Endereco();
        BeanUtils.copyProperties(vO, bean);
        bean = enderecoRepository.save(bean);
        return bean.getId();
    }

    public void delete(Integer id) {
        enderecoRepository.deleteById(id);
    }

    public void update(Integer id, EnderecoUpdateVO vO) {
        Endereco bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        enderecoRepository.save(bean);
    }

    public EnderecoDTO getById(Integer id) {
        Endereco original = requireOne(id);
        return toDTO(original);
    }

    public Page<EnderecoDTO> query(EnderecoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private EnderecoDTO toDTO(Endereco original) {
        EnderecoDTO bean = new EnderecoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Endereco requireOne(Integer id) {
        return enderecoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
