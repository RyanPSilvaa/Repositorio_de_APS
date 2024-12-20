package gerenciador.gerenciador_universidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gerenciador.gerenciador_universidade.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}