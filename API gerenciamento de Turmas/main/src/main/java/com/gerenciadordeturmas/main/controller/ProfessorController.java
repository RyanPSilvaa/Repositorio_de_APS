package com.gerenciadordeturmas.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciadordeturmas.main.model.Professor;
import com.gerenciadordeturmas.main.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> listarTodos() {
        return professorService.listarTodos();
    }

    @PostMapping
    public Professor salvar(@RequestBody Professor professor) {
        return professorService.salvar(professor);
    }

    @PutMapping("/{id}")
    public Professor atualizar(@PathVariable Long id, @RequestBody Professor professor) {
        return (Professor) professorService.atualizar(id, professor);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        professorService.excluir(id);
    }
}
