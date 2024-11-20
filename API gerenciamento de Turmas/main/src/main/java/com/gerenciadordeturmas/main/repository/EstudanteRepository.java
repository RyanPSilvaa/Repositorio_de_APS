package com.gerenciadordeturmas.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeturmas.main.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
    
}