package com.gerenciadordeturmas.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeturmas.main.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    
}
