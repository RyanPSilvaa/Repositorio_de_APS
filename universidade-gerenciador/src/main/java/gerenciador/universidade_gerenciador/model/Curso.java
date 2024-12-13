package gerenciador.universidade_gerenciador.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos") // Opcional: Define o nome da tabela no banco de dados
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // Opcional: Define validações no banco
    private String nome;

    // Construtor padrão (necessário para JPA)
    public Curso() {
    }

    // Construtor parametrizado (opcional)
    public Curso(String nome) {
        this.nome = nome;
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
}
