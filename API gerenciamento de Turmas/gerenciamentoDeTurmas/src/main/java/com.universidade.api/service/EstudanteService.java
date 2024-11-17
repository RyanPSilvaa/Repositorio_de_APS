package service;

import repository.EstudanteRepository;
import model.Estudante;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository repository;

    public List<Estudante> listarTodos() {
        return repository.findAll();
    }

    public Estudante buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Estudante não encontrado!"));
    }

    public Estudante salvar(Estudante estudante) {
        return repository.save(estudante);
    }

    public Estudante atualizar(Long id, Estudante estudanteAtualizado) {
        Estudante estudante = buscarPorId(id);
        estudante.setNome(estudanteAtualizado.getNome());
        estudante.setEmail(estudanteAtualizado.getEmail());
        return repository.save(estudante);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
