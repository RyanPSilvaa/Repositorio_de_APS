package com.gerenciadordeturmas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeturmas.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    
}
