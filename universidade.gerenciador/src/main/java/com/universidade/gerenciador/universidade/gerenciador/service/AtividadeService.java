package com.universidade.gerenciador.universidade.gerenciador.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universidade.gerenciador.universidade.gerenciador.model.Atividade;
import com.universidade.gerenciador.universidade.gerenciador.repository.AtividadeRepository;

import java.util.List;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;

    public Atividade criarAtividade(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    public List<Atividade> listarAtividades() {
        return atividadeRepository.findAll();
    }

    public Atividade editarAtividade(Long id, Atividade atividadeAtualizada) {
        Atividade atividade = atividadeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Atividade não encontrada"));
        atividade.setNome(atividadeAtualizada.getNome());
        atividade.setCategoria(atividadeAtualizada.getCategoria());
        atividade.setPublicada(atividadeAtualizada.isPublicada());
        atividade.setData(atividadeAtualizada.getData());
        atividade.setCurso(atividadeAtualizada.getCurso());
        return atividadeRepository.save(atividade);
    }

    public void deletarAtividade(Long id) {
        atividadeRepository.deleteById(id);
    }

    public List<Atividade> listarAtividadesPorPublicacao(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarAtividadesPorPublicacao'");
    }

    public List<Atividade> listarPorPeriodo(String inicio, String fim) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarPorPeriodo'");
    }

    public List<Atividade> listarPorCategoria(String categoria) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarPorCategoria'");
    }
}
