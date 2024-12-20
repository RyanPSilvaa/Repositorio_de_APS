package gerenciador.universidade_gerenciador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
    if (descricao != null && !descricao.trim().isEmpty()) {
        this.descricao = descricao;
    } else {
        throw new IllegalArgumentException("Descrição não pode ser vazia.");
    }
}
    public void setNomeArquivo(String originalFilename) {
        throw new UnsupportedOperationException("Unimplemented method 'setNomeArquivo'");
    }
    public void setTipoArquivo(String contentType) {
        throw new UnsupportedOperationException("Unimplemented method 'setTipoArquivo'");
    }
    public void setDados(byte[] bytes) {
        throw new UnsupportedOperationException("Unimplemented method 'setDados'");
    }
    public void setLegenda(String legenda) {
        throw new UnsupportedOperationException("Unimplemented method 'setLegenda'");
    }
    public void setAtividade(Atividade atividade) {
        throw new UnsupportedOperationException("Unimplemented method 'setAtividade'");
    }

}