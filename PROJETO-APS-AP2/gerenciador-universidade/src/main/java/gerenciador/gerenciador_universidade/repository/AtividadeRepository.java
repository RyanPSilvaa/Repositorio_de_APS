package gerenciador.gerenciador_universidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gerenciador.gerenciador_universidade.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
}
