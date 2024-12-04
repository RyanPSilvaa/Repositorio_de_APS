package projetoAP2.projetopratico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import projetoAP2.projetopratico.model.Atividade;
import projetoAP2.projetopratico.service.AtividadeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @PostMapping
    public Atividade criarAtividade(@RequestBody Atividade atividade) {
        return atividadeService.criarAtividade(atividade);
    }

    @GetMapping
    public List<Atividade> listarAtividades() {
        return atividadeService.listarAtividades();
    }

    @PutMapping("/{id}")
    public Atividade editarAtividade(@PathVariable Long id, @RequestBody Atividade atividade) {
        return atividadeService.editarAtividade(id, atividade);
    }

    @DeleteMapping("/{id}")
    public void deletarAtividade(@PathVariable Long id) {
        atividadeService.deletarAtividade(id);
    }
}
