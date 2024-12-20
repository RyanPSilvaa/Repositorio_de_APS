package gerenciador.gerenciador_universidade.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gerenciador.gerenciador_universidade.model.Atividade;
import gerenciador.gerenciador_universidade.repository.AtividadeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/atividades")
public class AtividadeController {

    private final AtividadeRepository atividadeRepository;

    public AtividadeController(AtividadeRepository atividadeRepository) {
        this.atividadeRepository = atividadeRepository;
    }

    @GetMapping
    public List<Atividade> getAtividades() {
        return atividadeRepository.findAll();
    }

    @PostMapping
    public Atividade createAtividade(@RequestBody Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    @GetMapping("/{id}")
    public Atividade getAtividadeById(@PathVariable Long id) {
        return atividadeRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Atividade updateAtividade(@PathVariable Long id, @RequestBody Atividade atividade) {
        atividade.setId(id);
        return atividadeRepository.save(atividade);
    }

    @DeleteMapping("/{id}")
    public void deleteAtividade(@PathVariable Long id) {
        atividadeRepository.deleteById(id);
    }
}

