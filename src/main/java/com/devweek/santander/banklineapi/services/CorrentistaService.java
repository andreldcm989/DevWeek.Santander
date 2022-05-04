package com.devweek.santander.banklineapi.services;

import java.util.Date;

import com.devweek.santander.banklineapi.dto.NovoCorrentista;
import com.devweek.santander.banklineapi.model.Conta;
import com.devweek.santander.banklineapi.model.Correntista;
import com.devweek.santander.banklineapi.repositories.CorrentistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrentistaService {
    
    @Autowired
    private CorrentistaRepository repository;

    public void save(NovoCorrentista novoCorrentista){
        Correntista correntista = new Correntista();
        correntista.setNome(novoCorrentista.getNome());
        correntista.setCpf(novoCorrentista.getCpf());
        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());
        correntista.setConta(conta);
        repository.save(correntista);
    }
}
