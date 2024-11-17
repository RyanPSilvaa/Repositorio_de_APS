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

import model.Curso;
import model.Estudante;
import service.EstudanteService;

@RestController
@RequestMapping("/estudantes")
public class CursoController {
    @Autowired
    private CursoService service;

    @GetMapping
    public List<Curso> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Curso buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Curso salvar(@RequestBody Curso estudante) {
        return service.salvar(estudante);
    }

    @PutMapping("/{id}")
    public Curso atualizar(@PathVariable Long id, @RequestBody Curso cursoAtualizado) {
        return service.atualizar(id, cursoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

