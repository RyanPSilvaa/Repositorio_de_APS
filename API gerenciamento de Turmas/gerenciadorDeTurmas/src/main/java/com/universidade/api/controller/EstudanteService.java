package com.universidade.api.controller;

import com.universidade.api.model.Estudante;
import com.universidade.api.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository repository;

    public Estudante salvar(Estudante estudante) {
        return repository.save(estudante);
    }

    public List<Estudante> listarTodos() {
        return repository.findAll();
    }

    public Optional<Estudante> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Optional<Estudante> atualizar(Long id, Estudante estudante) {
        return repository.findById(id).map(existing -> {
            existing.setNome(estudante.getNome());
            existing.setEmail(estudante.getEmail());
            return repository.save(existing);
        });
    }

    public boolean deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
