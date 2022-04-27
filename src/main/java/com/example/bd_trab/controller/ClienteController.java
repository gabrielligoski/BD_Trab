package com.example.bd_trab.controller;

import com.example.bd_trab.dto.ClienteDTO;
import com.example.bd_trab.service.ClienteService;
import com.example.bd_trab.vo.ClienteQueryVO;
import com.example.bd_trab.vo.ClienteUpdateVO;
import com.example.bd_trab.vo.ClienteVO;
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
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public String save( @RequestBody ClienteVO vO) {
        return clienteService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(  @PathVariable("id") String id) {
        clienteService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(  @PathVariable("id") String id,
             @RequestBody ClienteUpdateVO vO) {
        clienteService.update(id, vO);
    }

    @GetMapping("/{id}")
    public ClienteDTO getById(  @PathVariable("id") String id) {
        return clienteService.getById(id);
    }

    @GetMapping
    public Page<ClienteDTO> query( ClienteQueryVO vO) {
        return clienteService.query(vO);
    }
}
