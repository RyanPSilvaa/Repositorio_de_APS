package gerenciador.universidade_gerenciador.controller;

import gerenciador.universidade_gerenciador.dto.CursoDTO;
import gerenciador.universidade_gerenciador.model.Curso;
import gerenciador.universidade_gerenciador.repository.CursoRepository;
import org.springframework.web.bind.annotation.*;

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
