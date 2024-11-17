package service;

import repository.CursoRepository;
import model.Curso;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CursoService {
    @Autowired
    private CursoRepository repository;

    public List<Curso> listarTodos() {
        return repository.findAll();
    }

    public Curso buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Estucurso não encontrado!"));
    }

    public Curso salvar(Curso curso) {
        return repository.save(curso);
    }

    public Curso atualizar(Long id, Curso cursoAtualizado) {
        Curso estudante = buscarPorId(id);
        estudante.setNome(cursoAtualizado.getNome());
        estudante.setEmail(cursoAtualizado.getEmail());
        return repository.save(curso);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

