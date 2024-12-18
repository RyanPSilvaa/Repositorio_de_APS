package gerenciador.universidade_gerenciador.controller;

import gerenciador.universidade_gerenciador.model.Atividade;
import gerenciador.universidade_gerenciador.repository.AtividadeRepository;
import org.springframework.web.bind.annotation.*;

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
