package projetoAP2.projetopratico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoAP2.projetopratico.model.Atividade;
import projetoAP2.projetopratico.repository.AtividadeRepository;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;

    public Atividade salvar(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    public List<Atividade> listar() {
        return atividadeRepository.findAll();
    }

    public void deletar(Long id) {
        if (atividadeRepository.existsById(id)) {
            atividadeRepository.deleteById(id);
        }
    }

    public Atividade criarAtividade(Atividade atividade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarAtividade'");
    }

    public List<Atividade> listarAtividades() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarAtividades'");
    }

    public Atividade editarAtividade(Long id, Atividade atividade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editarAtividade'");
    }

    public void deletarAtividade(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarAtividade'");
    }
}
