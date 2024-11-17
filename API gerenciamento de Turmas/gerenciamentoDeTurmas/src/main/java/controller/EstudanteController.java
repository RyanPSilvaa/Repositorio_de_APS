package controller;

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

import model.Estudante;
import service.EstudanteService;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    @Autowired
    private EstudanteService service;

    @GetMapping
    public List<Estudante> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Estudante buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Estudante salvar(@RequestBody Estudante estudante) {
        return service.salvar(estudante);
    }

    @PutMapping("/{id}")
    public Estudante atualizar(@PathVariable Long id, @RequestBody Estudante estudanteAtualizado) {
        return service.atualizar(id, estudanteAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
