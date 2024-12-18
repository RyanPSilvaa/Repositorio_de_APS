package gerenciador.universidade_gerenciador.repository;

import gerenciador.universidade_gerenciador.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
}
