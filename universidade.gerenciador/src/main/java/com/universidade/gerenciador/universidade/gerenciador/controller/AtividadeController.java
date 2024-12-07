package com.universidade.gerenciador.universidade.gerenciador.controller;



import org.springframework.beans.factory.annotation.Autowired;

//importação de todos os serviços springframework
import org.springframework.web.bind.annotation.*;

import com.universidade.gerenciador.universidade.gerenciador.model.Atividade;
import com.universidade.gerenciador.universidade.gerenciador.service.AtividadeService;

import java.util.List;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;
    

    @PostMapping
    public Atividade criarAtividade(@RequestBody Atividade atividade) {
        return atividadeService.criarAtividade(atividade);
    }

    @GetMapping("/publicadas")
    public List<Atividade> listarPublicadas() {
        return atividadeService.listarAtividadesPorPublicacao(true);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Atividade> listarPorCategoria(@PathVariable String categoria) {
        return atividadeService.listarPorCategoria(categoria);  
    }

    @GetMapping("/data")
        public List<Atividade> listarPorPeriodo(
        @RequestParam("inicio") String inicio,
        @RequestParam("fim") String fim) {
    return atividadeService.listarPorPeriodo(inicio, fim);
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
