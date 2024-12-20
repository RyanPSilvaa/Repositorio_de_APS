package gerenciador.gerenciador_universidade.service;

import org.springframework.stereotype.Service;

import gerenciador.gerenciador_universidade.model.Curso;
import gerenciador.gerenciador_universidade.repository.CursoRepository;

import java.util.List;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    // Criar novo curso
    public Curso criarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    // Listar todos os cursos
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    // Obter curso por ID
    public Curso obterCursoPorId(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Curso não encontrado"));
    }

    // Atualizar curso existente
    public Curso atualizarCurso(Long id, Curso cursoAtualizado) {
        Curso curso = cursoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Curso não encontrado"));

        curso.setNome(cursoAtualizado.getNome());
        return cursoRepository.save(curso);
    }

    // Excluir curso
    public void excluirCurso(Long id) {
        if (!cursoRepository.existsById(id)) {
            throw new IllegalArgumentException("Curso não encontrado");
        }
        cursoRepository.deleteById(id);
    }
}

