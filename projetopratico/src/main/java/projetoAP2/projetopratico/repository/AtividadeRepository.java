package projetoAP2.projetopratico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projetoAP2.projetopratico.model.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {

    //busca atividades
    List<Atividade> findByCategoria(String categoria);

     // Exemplo usando uma query personalizada
    @Query("SELECT a FROM Atividade a WHERE a.nome LIKE %:nome%")
    List<Atividade> findByNomeContaining(String nome);
  
}
