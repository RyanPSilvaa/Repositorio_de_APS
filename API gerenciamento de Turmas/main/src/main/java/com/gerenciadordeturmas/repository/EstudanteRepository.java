package com.universidade.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidade.api.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
    
}