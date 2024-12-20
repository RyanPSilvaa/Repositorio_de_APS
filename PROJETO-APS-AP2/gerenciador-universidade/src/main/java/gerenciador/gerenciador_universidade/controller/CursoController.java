package gerenciador.gerenciador_universidade.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gerenciador.gerenciador_universidade.dto.CursoDTO;
import gerenciador.gerenciador_universidade.model.Curso;
import gerenciador.gerenciador_universidade.repository.CursoRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoRepository cursoRepository;

    public CursoController(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @GetMapping
    public List<CursoDTO> getCursos() {
        return cursoRepository.findAll().stream()
            .map(curso -> {
                CursoDTO dto = new CursoDTO();
                dto.setId(curso.getId());
                dto.setNome(curso.getNome());
                return dto;
            })
            .collect(Collectors.toList());
    }

    @PostMapping
    public CursoDTO createCurso(@RequestBody CursoDTO cursoDTO) {
        Curso curso = new Curso();
        curso.setNome(cursoDTO.getNome());
        curso = cursoRepository.save(curso);
        cursoDTO.setId(curso.getId());
        return cursoDTO;
    }

    @GetMapping("/{id}")
    public CursoDTO getCursoById(@PathVariable Long id) {
        Curso curso = cursoRepository.findById(id).orElse(null);
        if (curso != null) {
            CursoDTO dto = new CursoDTO();
            dto.setId(curso.getId());
            dto.setNome(curso.getNome());
            return dto;
        }
        return null;
    }

    @PutMapping("/{id}")
    public CursoDTO updateCurso(@PathVariable Long id, @RequestBody CursoDTO cursoDTO) {
        Curso curso = cursoRepository.findById(id).orElseThrow();
        curso.setNome(cursoDTO.getNome());
        curso = cursoRepository.save(curso);
        cursoDTO.setId(curso.getId());
        return cursoDTO;
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable Long id) {
        cursoRepository.deleteById(id);
    }
}