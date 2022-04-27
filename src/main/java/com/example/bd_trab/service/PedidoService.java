package com.example.bd_trab.service;

import java.util.NoSuchElementException;

import com.example.bd_trab.dto.PedidoDTO;
import com.example.bd_trab.entity.Pedido;
import com.example.bd_trab.repository.PedidoRepository;
import com.example.bd_trab.vo.PedidoQueryVO;
import com.example.bd_trab.vo.PedidoUpdateVO;
import com.example.bd_trab.vo.PedidoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Integer save(PedidoVO vO) {
        Pedido bean = new Pedido();
        BeanUtils.copyProperties(vO, bean);
        bean = pedidoRepository.save(bean);
        return bean.getId();
    }

    public void delete(Integer id) {
        pedidoRepository.deleteById(id);
    }

    public void update(Integer id, PedidoUpdateVO vO) {
        Pedido bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        pedidoRepository.save(bean);
    }

    public PedidoDTO getById(Integer id) {
        Pedido original = requireOne(id);
        return toDTO(original);
    }

    public Page<PedidoDTO> query(PedidoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private PedidoDTO toDTO(Pedido original) {
        PedidoDTO bean = new PedidoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Pedido requireOne(Integer id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
