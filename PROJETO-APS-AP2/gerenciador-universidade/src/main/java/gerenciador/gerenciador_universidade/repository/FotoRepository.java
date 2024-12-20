package gerenciador.gerenciador_universidade.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import gerenciador.gerenciador_universidade.model.Atividade;
import gerenciador.gerenciador_universidade.model.Foto;

public interface FotoRepository extends JpaRepository<Foto, Long> {

    List<Foto> findByAtividade(Atividade atividade);
}