package com.devweek.santander.banklineapi.repositories;

import com.devweek.santander.banklineapi.model.Movimentacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
    
}
