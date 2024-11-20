package com.universidade.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidade.api.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {}