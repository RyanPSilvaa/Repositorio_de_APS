package gerenciador.universidade_gerenciador.dto;

import java.util.Date;

public class AtividadeDTO {
    private Long id;
    private String nome;
    private String categoria;
    private String objetivo;
    private boolean publicacao;
    private String publico;
    private Date data;
    private Long cursoId;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public boolean isPublicacao() {
        return publicacao;
    }

    public void setPublicacao(boolean publicacao) {
        this.publicacao = publicacao;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public Object getCategoriaPrincipal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCategoriaPrincipal'");
    }

    public Object getPublicoAlvo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPublicoAlvo'");
    }

    public Object getStatusPublicacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStatusPublicacao'");
    }

    public void setCategoriaPrincipal(Object categoriaPrincipal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCategoriaPrincipal'");
    }

    public void setPublicoAlvo(Object publicoAlvo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPublicoAlvo'");
    }

    public void setStatusPublicacao(Object statusPublicacao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStatusPublicacao'");
    }

    public void setDataCriacao(Object dataCriacao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataCriacao'");
    }

    public Object getDataCriacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataCriacao'");
    }
}
