package com.example.bd_trab.service;

import java.util.NoSuchElementException;

import com.example.bd_trab.dto.ClienteDTO;
import com.example.bd_trab.entity.Cliente;
import com.example.bd_trab.repository.ClienteRepository;
import com.example.bd_trab.vo.ClienteQueryVO;
import com.example.bd_trab.vo.ClienteUpdateVO;
import com.example.bd_trab.vo.ClienteVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public String save(ClienteVO vO) {
        Cliente bean = new Cliente();
        BeanUtils.copyProperties(vO, bean);
        bean = clienteRepository.save(bean);
        return bean.getCpf();
    }

    public void delete(String id) {
        clienteRepository.deleteById(id);
    }

    public void update(String id, ClienteUpdateVO vO) {
        Cliente bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        clienteRepository.save(bean);
    }

    public ClienteDTO getById(String id) {
        Cliente original = requireOne(id);
        return toDTO(original);
    }

    public Page<ClienteDTO> query(ClienteQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private ClienteDTO toDTO(Cliente original) {
        ClienteDTO bean = new ClienteDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Cliente requireOne(String id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
