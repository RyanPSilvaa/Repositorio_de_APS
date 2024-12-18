package gerenciador.universidade_gerenciador.repository;

import gerenciador.universidade_gerenciador.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
