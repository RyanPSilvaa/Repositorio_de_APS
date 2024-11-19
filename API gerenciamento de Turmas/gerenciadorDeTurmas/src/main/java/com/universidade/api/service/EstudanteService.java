package com.universidade.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universidade.api.model.Estudante;
import com.universidade.api.repository.EstudanteRepository;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    public Object buscarPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    public Object atualizar(Long id, Estudante estudante) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
}