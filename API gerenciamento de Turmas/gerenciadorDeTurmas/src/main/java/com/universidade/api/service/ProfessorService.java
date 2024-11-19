package com.universidade.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universidade.api.model.Professor;
import com.universidade.api.repository.ProfessorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository repository;

    public List<Professor> findAll() {
        return repository.findAll();
    }

    public Optional<Professor> findById(Long id) {
        return repository.findById(id);
    }

    public Professor save(Professor professor) {
        return repository.save(professor);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Professor> listarTodos() {
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    public Object buscarPorId(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    public Object atualizar(Long id, Professor professor) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    public Professor salvar(Professor professor) {
        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }

    public void excluir(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }
}