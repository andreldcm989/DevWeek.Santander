package com.devweek.santander.banklineapi.controllers;

import java.util.List;

import com.devweek.santander.banklineapi.dto.NovoCorrentista;
import com.devweek.santander.banklineapi.model.Correntista;
import com.devweek.santander.banklineapi.repositories.CorrentistaRepository;
import com.devweek.santander.banklineapi.services.CorrentistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
    
    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista){
        service.save(correntista);
    }
}
