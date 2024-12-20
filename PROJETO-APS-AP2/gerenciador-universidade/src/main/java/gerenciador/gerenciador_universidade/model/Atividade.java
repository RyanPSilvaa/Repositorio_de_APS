package gerenciador.gerenciador_universidade.model;

import java.time.LocalDate;

import gerenciador.gerenciador_universidade.dto.AtividadeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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
        throw new UnsupportedOperationException("Unimplemented method 'setCategoriaPrincipal'");
    }

    public void setPublicoAlvo(Object publicoAlvo) {
        throw new UnsupportedOperationException("Unimplemented method 'setPublicoAlvo'");
    }

    public void setStatusPublicacao(Object statusPublicacao) {
        throw new UnsupportedOperationException("Unimplemented method 'setStatusPublicacao'");
    }

    public Object getCategoriaPrincipal() {
        throw new UnsupportedOperationException("Unimplemented method 'getCategoriaPrincipal'");
    }

    public Object getPublicoAlvo() {
        throw new UnsupportedOperationException("Unimplemented method 'getPublicoAlvo'");
    }

    public Object getStatusPublicacao() {
        throw new UnsupportedOperationException("Unimplemented method 'getStatusPublicacao'");
    }

    public Object getDataCriacao() {
        throw new UnsupportedOperationException("Unimplemented method 'getDataCriacao'");
    }

    public AtividadeDTO getCurso() {
        throw new UnsupportedOperationException("Unimplemented method 'getCurso'");
    }

    public void setDataCriacao(Object dataCriacao) {
        throw new UnsupportedOperationException("Unimplemented method 'setDataCriacao'");
    }

    public void setCurso(Curso curso) {
        throw new UnsupportedOperationException("Unimplemented method 'setCurso'");
    }
}
