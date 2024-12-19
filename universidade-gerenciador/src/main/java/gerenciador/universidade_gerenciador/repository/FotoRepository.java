package gerenciador.universidade_gerenciador.repository;

import gerenciador.universidade_gerenciador.model.Atividade;
import gerenciador.universidade_gerenciador.model.Foto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepository extends JpaRepository<Foto, Long> {

    List<Foto> findByAtividade(Atividade atividade);
}
