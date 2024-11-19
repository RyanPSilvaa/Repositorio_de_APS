package com.universidade.api.controller;

import java.util.List;
import com.universidade.api.model.Estudante;
import com.universidade.api.service.EstudanteService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    
    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public ResponseEntity<Estudante> criarEstudante(@RequestBody Estudante estudante) {
        return ResponseEntity.status(HttpStatus.CREATED).body(estudanteService.salvar(estudante));
    }

    @GetMapping
    public List<Estudante> listarTodos() {
        return estudanteService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudante> buscarPorId(@PathVariable Long id) {
        return estudanteService.buscarPorId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudante> atualizar(@PathVariable Long id, @RequestBody Estudante estudante) {
        return estudanteService.atualizar(id, estudante)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        estudanteService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}