package com.gerenciadordeturmas.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordeturmas.main.model.Estudante;
import com.gerenciadordeturmas.main.repository.EstudanteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository repository;

    public List<Estudante> findAll() {
        return repository.findAll();
    }

    public Optional<Estudante> findById(Long id) {
        return repository.findById(id);
    }

    public Estudante save(Estudante estudante) {
        return repository.save(estudante);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Estudante> listarTodos() {
        
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    public Object buscarPorId(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    public Object atualizar(Long id, Estudante estudante) {
        
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
}