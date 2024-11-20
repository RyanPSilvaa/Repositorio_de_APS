package com.universidade.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidade.api.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
