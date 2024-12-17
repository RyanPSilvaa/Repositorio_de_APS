package universidade.universidade_gerenciador.service;

import org.springframework.stereotype.Service;

import universidade.universidade_gerenciador.dto.AtividadeDTO;
import universidade.universidade_gerenciador.model.Atividade;
import universidade.universidade_gerenciador.repository.AtividadeRepository;

import java.util.List;

@Service
public class AtividadeService {
    public AtividadeService(AtividadeRepository atividadeRepository) {
    }

    public Atividade salvarAtividade(AtividadeDTO atividadeDTO) {
        // Implementar lógica de conversão e persistência
        Atividade atividade = new Atividade();
        atividade.setNome(atividadeDTO.getNome());
        atividade.setCategoriaPrincipal(atividadeDTO.getCategoriaPrincipal());
        atividade.setObjetivo(atividadeDTO.getObjetivo());
        atividade.setPublicoAlvo(atividadeDTO.getPublicoAlvo());
        atividade.setStatusPublicacao(atividadeDTO.getStatusPublicacao());
        atividade.setDataCriacao(atividadeDTO.getDataCriacao());
        return AtividadeRepository.save(atividade);
    }

    public List<Atividade> listarAtividades() {
        return AtividadeRepository.findAll();
    }
}
