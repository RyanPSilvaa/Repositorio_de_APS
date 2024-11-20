package com.gerenciadordeturmas.main.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordeturmas.main.model.Curso;
import com.gerenciadordeturmas.main.repository.CursoRepository;

@Service
public class CursoService {
    @Autowired
    private CursoRepository repository;

    public List<Curso> findAll() {
        return repository.findAll();
    }

    public Optional<Curso> findById(Long id) {
        return repository.findById(id);
    }

    public Curso save(Curso curso) {
        return repository.save(curso);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Curso> listarTodos() {

        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    public Object buscarPorId(Long id) {

        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    public Object atualizar(Long id, Curso curso) {

        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
}
