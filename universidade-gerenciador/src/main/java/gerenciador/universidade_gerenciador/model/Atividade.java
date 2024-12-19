package gerenciador.universidade_gerenciador.model;

import jakarta.persistence.*;
import java.time.LocalDate;

import gerenciador.universidade_gerenciador.dto.AtividadeDTO;

@Entity
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String categoria;

    private String objetivo;

    private Boolean publicacao;

    private String publico;

    private LocalDate data;

    // Construtor padrão (necessário para JPA)
    public Atividade() {
    }

    // Construtor parametrizado (opcional)
    public Atividade(String nome, String categoria, String objetivo, Boolean publicacao, String publico, LocalDate data) {
        this.nome = nome;
        this.categoria = categoria;
        this.objetivo = objetivo;
        this.publicacao = publicacao;
        this.publico = publico;
        this.data = data;
    }

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

    public Boolean getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Boolean publicacao) {
        this.publicacao = publicacao;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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

    public Object getDataCriacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataCriacao'");
    }

    public AtividadeDTO getCurso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurso'");
    }

    public void setDataCriacao(Object dataCriacao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataCriacao'");
    }

    public void setCurso(Curso curso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCurso'");
    }
}

