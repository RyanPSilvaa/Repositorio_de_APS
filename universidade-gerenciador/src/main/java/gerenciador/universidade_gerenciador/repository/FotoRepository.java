package gerenciador.universidade_gerenciador.repository;

import gerenciador.universidade_gerenciador.model.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepository extends JpaRepository<Foto, Long> {
}
