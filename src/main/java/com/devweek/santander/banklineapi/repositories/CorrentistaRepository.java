package com.devweek.santander.banklineapi.repositories;

import com.devweek.santander.banklineapi.model.Correntista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
    
}
