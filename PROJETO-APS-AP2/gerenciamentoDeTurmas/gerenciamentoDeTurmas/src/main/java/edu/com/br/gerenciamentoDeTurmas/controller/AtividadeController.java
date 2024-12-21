package edu.com.br.gerenciamentoDeTurmas.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.com.br.gerenciamentoDeTurmas.model.Atividade;
import edu.com.br.gerenciamentoDeTurmas.service.AtividadeService;

import java.util.List;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {
    private final AtividadeService atividadeService;

    public AtividadeController(AtividadeService atividadeService) {
        this.atividadeService = atividadeService;
    }

    @GetMapping
    public List<Atividade> listarAtividades(@RequestParam(required = false) Boolean publicada) {
        if (publicada != null) {
            return atividadeService.filtrarPorPublicacao(publicada);
        }
        return atividadeService.listarTodas();
    }

    @PostMapping
    public ResponseEntity<Atividade> adicionarAtividade(@RequestBody Atividade atividade) {
        Atividade novaAtividade = atividadeService.adicionarAtividade(atividade);
        return ResponseEntity.status(201).body(novaAtividade);
    }

    @PutMapping("/{id}/publicar")
    @PreAuthorize("hasAnyRole('ADMIN', 'GERENTE')")
    public ResponseEntity<Atividade> publicarAtividade(@PathVariable Long id) {
        Atividade atividade = atividadeService.publicarAtividade(id);
        return ResponseEntity.ok(atividade);
    }

    @PutMapping("/{id}/despublicar")
    @PreAuthorize("hasAnyRole('ADMIN', 'GERENTE')")
    public ResponseEntity<Atividade> despublicarAtividade(@PathVariable Long id) {
        Atividade atividade = atividadeService.despublicarAtividade(id);
        return ResponseEntity.ok(atividade);
    }
}
