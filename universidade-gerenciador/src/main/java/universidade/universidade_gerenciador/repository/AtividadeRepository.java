package universidade.universidade_gerenciador.repository;

import java.util.ArrayList;
import java.util.List;

import universidade.universidade_gerenciador.model.Atividade;

public class AtividadeRepository {

    // Lista em memória para armazenar as atividades
    private static final List<Atividade> atividades = new ArrayList<>();

    // Retorna todas as atividades
    public static List<Atividade> findAll() {
        return new ArrayList<>(atividades); // Retorna uma cópia para evitar modificações diretas
    }

    // Salva uma nova atividade no repositório
    public static Atividade save(Atividade atividade) {
        if (atividade == null) {
            throw new IllegalArgumentException("Atividade não pode ser nula");
        }
        atividades.add(atividade);
        return atividade;
    }
}
