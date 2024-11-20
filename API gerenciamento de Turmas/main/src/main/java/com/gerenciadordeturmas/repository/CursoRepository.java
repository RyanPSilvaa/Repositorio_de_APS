package com.gerenciadordeturmas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeturmas.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
