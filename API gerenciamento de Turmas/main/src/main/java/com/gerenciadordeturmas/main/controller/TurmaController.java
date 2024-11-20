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

import com.gerenciadordeturmas.main.model.Turma;
import com.gerenciadordeturmas.main.service.TurmaService;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<Turma> listarTodas() {
        return turmaService.listarTodas();
    }

    @PostMapping
    public Turma salvar(@RequestBody Turma turma) {
        return turmaService.salvar(turma);
    }

    @PutMapping("/{id}")
    public Turma atualizar(@PathVariable Long id, @RequestBody Turma turma) {
        return turmaService.atualizar(id, turma);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        turmaService.excluir(id);
    }
}
