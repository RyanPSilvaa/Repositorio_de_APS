package gerenciador.universidade_gerenciador.repository;

import gerenciador.universidade_gerenciador.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}