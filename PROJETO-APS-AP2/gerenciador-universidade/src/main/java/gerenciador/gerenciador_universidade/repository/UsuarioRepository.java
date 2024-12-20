package gerenciador.gerenciador_universidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gerenciador.gerenciador_universidade.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}