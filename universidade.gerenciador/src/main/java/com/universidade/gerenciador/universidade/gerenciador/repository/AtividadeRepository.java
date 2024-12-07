package com.universidade.gerenciador.universidade.gerenciador.repository;


import com.universidade.gerenciador.universidade.gerenciador.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Date;
import java.util.List;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    List<Atividade> findByPublicada(boolean publicada);
    List<Atividade> findByCategoria(String categoria);
    List<Atividade> findByDataBetween(Date inicio, Date fim);
}