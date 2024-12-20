package gerenciador.universidade_gerenciador.controller;

import gerenciador.universidade_gerenciador.model.Foto;
import gerenciador.universidade_gerenciador.repository.FotoRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fotos")
public class FotoController {

    private final FotoRepository fotoRepository;

    public FotoController(FotoRepository fotoRepository) {
        this.fotoRepository = fotoRepository;
    }

    @GetMapping
    public List<Foto> getFotos() {
        return fotoRepository.findAll();
    }

    @PostMapping
    public Foto createFoto(@RequestBody Foto foto) {
        return fotoRepository.save(foto);
    }

    @GetMapping("/{id}")
    public Foto getFotoById(@PathVariable Long id) {
        return fotoRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Foto updateFoto(@PathVariable Long id, @RequestBody Foto foto) {
        foto.setId(id);
        return fotoRepository.save(foto);
    }

    @DeleteMapping("/{id}")
    public void deleteFoto(@PathVariable Long id) {
        fotoRepository.deleteById(id);
    }
}
