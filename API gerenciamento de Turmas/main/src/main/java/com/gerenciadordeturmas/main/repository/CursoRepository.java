package com.gerenciadordeturmas.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeturmas.main.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
