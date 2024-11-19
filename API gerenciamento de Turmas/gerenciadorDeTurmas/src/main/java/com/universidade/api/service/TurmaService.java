package com.universidade.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universidade.api.model.Turma;
import com.universidade.api.repository.TurmaRepository;

@Service
public class TurmaService {
    @Autowired
    private TurmaRepository repository;

    public List<Turma> findAll() {
        return repository.findAll();
    }

    public Optional<Turma> findById(Long id) {
        return repository.findById(id);
    }

    public Turma save(Turma turma) {
        return repository.save(turma);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Turma> listarTodas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodas'");
    }

    public Object buscarPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    public Object atualizar(Long id, Turma turma) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
}

