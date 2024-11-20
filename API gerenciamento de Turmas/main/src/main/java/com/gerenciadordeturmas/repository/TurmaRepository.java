package com.gerenciadordeturmas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeturmas.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {}