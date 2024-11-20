package com.gerenciadordeturmas.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeturmas.main.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {}