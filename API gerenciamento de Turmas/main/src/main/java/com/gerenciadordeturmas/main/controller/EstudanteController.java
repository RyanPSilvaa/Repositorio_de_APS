package com.gerenciadordeturmas.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciadordeturmas.main.model.Estudante;
import com.gerenciadordeturmas.main.service.EstudanteService;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    @Autowired
    private EstudanteService service;

    @GetMapping
    public List<Estudante> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudante> getById(@PathVariable Long id) {
        return service.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estudante create(@RequestBody Estudante estudante) {
        return service.save(estudante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudante> update(@PathVariable Long id, @RequestBody Estudante estudante) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        estudante.setId(id);
        return ResponseEntity.ok(service.save(estudante));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

// Controladores similares para Turma, Professor e Curso.