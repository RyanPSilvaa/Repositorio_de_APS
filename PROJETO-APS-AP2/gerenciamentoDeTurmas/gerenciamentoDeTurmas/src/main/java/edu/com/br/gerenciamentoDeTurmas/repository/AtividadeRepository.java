package edu.com.br.gerenciamentoDeTurmas.repository;

import edu.com.br.gerenciamentoDeTurmas.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    List<Atividade> findByCategoria(String categoria);
    List<Atividade> findByDataBetween(Date startDate, Date endDate);
    List<Atividade> findByCursoId(Long cursoId);
    List<Atividade> findByPublicada(boolean publicada);
}
