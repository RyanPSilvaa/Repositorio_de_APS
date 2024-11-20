package com.gerenciadordeturmas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordeturmas.model.Curso;
import com.gerenciadordeturmas.repository.CursoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    public Optional<Curso> buscarPorId(Long id) {
        return cursoRepository.findById(id);
    }

    public Optional<Curso> atualizar(Long id, Curso curso) {
        return cursoRepository.findById(id).map(existingCurso -> {
            existingCurso.setNome(curso.getNome());
            existingCurso.setDescricao(curso.getDescricao());
            return cursoRepository.save(existingCurso);
        });
    }

    public Curso salvar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }
}
