package gerenciador.universidade_gerenciador.service;


import org.springframework.stereotype.Service;

import gerenciador.universidade_gerenciador.dto.AtividadeDTO;
import gerenciador.universidade_gerenciador.model.Atividade;
import gerenciador.universidade_gerenciador.model.Curso;
import gerenciador.universidade_gerenciador.repository.AtividadeRepository;
import gerenciador.universidade_gerenciador.repository.CursoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AtividadeService {
    private final AtividadeRepository atividadeRepository;
    private final CursoRepository cursoRepository;

    public AtividadeService(AtividadeRepository atividadeRepository, CursoRepository cursoRepository) {
        this.atividadeRepository = atividadeRepository;
        this.cursoRepository = cursoRepository;
    }

    // Criar nova atividade
    public Atividade criarAtividade(AtividadeDTO atividadeDTO) {
        Curso curso = cursoRepository.findById(atividadeDTO.getCursoId())
                .orElseThrow(() -> new IllegalArgumentException("Curso não encontrado"));

        Atividade atividade = new Atividade();
        atividade.setNome(atividadeDTO.getNome());
        atividade.setCategoriaPrincipal(atividadeDTO.getCategoriaPrincipal());
        atividade.setObjetivo(atividadeDTO.getObjetivo());
        atividade.setPublicoAlvo(atividadeDTO.getPublicoAlvo());
        atividade.setStatusPublicacao(atividadeDTO.getStatusPublicacao());
        atividade.setDataCriacao(atividadeDTO.getDataCriacao());
        atividade.setCurso(curso);

        return atividadeRepository.save(atividade);
    }

    // Listar todas as atividades
    public List<AtividadeDTO> listarAtividades() {
        return atividadeRepository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    // Obter atividade por ID
    public AtividadeDTO obterAtividadePorId(Long id) {
        Atividade atividade = atividadeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Atividade não encontrada"));
        return toDTO(atividade);
    }

    // Atualizar atividade existente
    public Atividade atualizarAtividade(Long id, AtividadeDTO atividadeDTO) {
        Atividade atividade = atividadeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Atividade não encontrada"));

        atividade.setNome(atividadeDTO.getNome());
        atividade.setCategoriaPrincipal(atividadeDTO.getCategoriaPrincipal());
        atividade.setObjetivo(atividadeDTO.getObjetivo());
        atividade.setPublicoAlvo(atividadeDTO.getPublicoAlvo());
        atividade.setStatusPublicacao(atividadeDTO.getStatusPublicacao());

        return atividadeRepository.save(atividade);
    }

    // Excluir atividade
    public void excluirAtividade(Long id) {
        if (!atividadeRepository.existsById(id)) {
            throw new IllegalArgumentException("Atividade não encontrada");
        }
        atividadeRepository.deleteById(id);
    }

    // Converter para DTO
    private AtividadeDTO toDTO(Atividade atividade) {
        AtividadeDTO dto = new AtividadeDTO();
        dto.setNome(atividade.getNome());
        dto.setCategoriaPrincipal(atividade.getCategoriaPrincipal());
        dto.setObjetivo(atividade.getObjetivo());
        dto.setPublicoAlvo(atividade.getPublicoAlvo());
        dto.setStatusPublicacao(atividade.getStatusPublicacao());
        dto.setDataCriacao(atividade.getDataCriacao());
        dto.setCursoId(atividade.getCurso().getId());
        return dto;
    }
}

