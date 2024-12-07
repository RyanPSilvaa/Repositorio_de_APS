package com.universidade.gerenciador.universidade.gerenciador.repository;


import com.universidade.gerenciador.universidade.gerenciador.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CursoRepository extends JpaRepository<Curso, Long> {
}
