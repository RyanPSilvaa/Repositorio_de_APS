package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

}
