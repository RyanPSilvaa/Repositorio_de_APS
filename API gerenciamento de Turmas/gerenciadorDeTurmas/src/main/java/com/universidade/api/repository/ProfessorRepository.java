package com.universidade.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidade.api.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    
}
