package com.gerenciadordeturmas.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordeturmas.main.model.Turma;
import com.gerenciadordeturmas.main.repository.TurmaRepository;

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
        throw new UnsupportedOperationException("Unimplemented method 'listarTodas'");
    }

    public Optional<Turma> buscarPorId(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    public Turma atualizar(Long id, Turma turma) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    public Turma salvar(Turma turma) {
        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }

    public void excluir(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }
}

