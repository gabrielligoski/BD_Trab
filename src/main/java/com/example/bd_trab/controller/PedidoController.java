package com.example.bd_trab.controller;

import com.example.bd_trab.dto.PedidoDTO;
import com.example.bd_trab.service.PedidoService;
import com.example.bd_trab.vo.PedidoQueryVO;
import com.example.bd_trab.vo.PedidoUpdateVO;
import com.example.bd_trab.vo.PedidoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
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
@RequestMapping("/pedido")
@CrossOrigin
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public String save( @RequestBody PedidoVO vO) {
        return pedidoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pedidoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id,
             @RequestBody PedidoUpdateVO vO) {
        pedidoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public PedidoDTO getById(@PathVariable("id") Integer id) {
        return pedidoService.getById(id);
    }

    @GetMapping
    public Page<PedidoDTO> query( PedidoQueryVO vO) {
        return pedidoService.query(vO);
    }
}
