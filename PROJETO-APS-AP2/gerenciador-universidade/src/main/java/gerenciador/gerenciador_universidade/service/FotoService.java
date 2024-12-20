package gerenciador.gerenciador_universidade.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import gerenciador.gerenciador_universidade.model.Atividade;
import gerenciador.gerenciador_universidade.model.Foto;
import gerenciador.gerenciador_universidade.repository.AtividadeRepository;
import gerenciador.gerenciador_universidade.repository.FotoRepository;

import java.io.IOException;
import java.util.List;

@Service
public class FotoService {
    private final FotoRepository fotoRepository;
    private final AtividadeRepository atividadeRepository;

    public FotoService(FotoRepository fotoRepository, AtividadeRepository atividadeRepository) {
        this.fotoRepository = fotoRepository;
        this.atividadeRepository = atividadeRepository;
    }

    // Adicionar uma foto a uma atividade
    public Foto adicionarFoto(Long atividadeId, MultipartFile arquivo, String legenda) {
        Atividade atividade = atividadeRepository.findById(atividadeId)
                .orElseThrow(() -> new IllegalArgumentException("Atividade não encontrada"));

        try {
            Foto foto = new Foto();
            foto.setNomeArquivo(arquivo.getOriginalFilename());
            foto.setTipoArquivo(arquivo.getContentType());
            foto.setDados(arquivo.getBytes());
            foto.setLegenda(legenda);
            foto.setAtividade(atividade);

            return fotoRepository.save(foto);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar foto: " + e.getMessage());
        }
    }

    // Obter todas as fotos de uma atividade
    public List<Foto> listarFotosPorAtividade(Long atividadeId) {
        Atividade atividade = atividadeRepository.findById(atividadeId)
                .orElseThrow(() -> new IllegalArgumentException("Atividade não encontrada"));

        return fotoRepository.findByAtividade(atividade);
    }

    // Obter foto por ID
    public Foto obterFotoPorId(Long id) {
        return fotoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Foto não encontrada"));
    }

    // Atualizar legenda de uma foto
    public Foto atualizarLegenda(Long id, String novaLegenda) {
        Foto foto = fotoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Foto não encontrada"));

        foto.setLegenda(novaLegenda);
        return fotoRepository.save(foto);
    }

    // Excluir foto
    public void excluirFoto(Long id) {
        if (!fotoRepository.existsById(id)) {
            throw new IllegalArgumentException("Foto não encontrada");
        }
        fotoRepository.deleteById(id);
    }
}

