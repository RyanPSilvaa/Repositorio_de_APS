package com.gerenciadordeturmas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeturmas.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
    
}