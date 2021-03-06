package com.devweek.santander.banklineapi.controllers;

import java.util.List;

import com.devweek.santander.banklineapi.dto.NovaMovimentacao;
import com.devweek.santander.banklineapi.model.Movimentacao;
import com.devweek.santander.banklineapi.repositories.MovimentacaoRepository;
import com.devweek.santander.banklineapi.services.MovimentacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
    
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao){
        service.save(movimentacao);
    }
}
