package com.example.bd_trab.controller;

import java.util.List;

import com.example.bd_trab.dto.DestaquesDTO;
import com.example.bd_trab.entity.Destaques;
import com.example.bd_trab.service.DestaquesService;
import com.example.bd_trab.vo.DestaquesQueryVO;
import com.example.bd_trab.vo.DestaquesUpdateVO;
import com.example.bd_trab.vo.DestaquesVO;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/destaques")
@CrossOrigin
public class DestaquesController {

    @Autowired
    private DestaquesService destaquesService;

    @PostMapping
    public String save( @RequestBody DestaquesVO vO) {
        return destaquesService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete( @PathVariable("id") Integer id) {
        destaquesService.delete(id);
    }

    @PutMapping("/{id}")
    public void update( @PathVariable("id") Integer id,
             @RequestBody DestaquesUpdateVO vO) {
        destaquesService.update(id, vO);
    }

    @GetMapping("/{id}")
    public DestaquesDTO getById( @PathVariable("id") Integer id) {
        return destaquesService.getById(id);
    }

    @GetMapping
    public List<Destaques> query( DestaquesQueryVO vO) {
        return destaquesService.query(vO);
    }
}
