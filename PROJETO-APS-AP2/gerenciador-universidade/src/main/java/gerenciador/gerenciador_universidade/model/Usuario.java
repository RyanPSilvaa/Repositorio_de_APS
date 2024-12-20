package gerenciador.gerenciador_universidade.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios") // Nome da tabela (opcional, pode ser omitido


public class Usuario {
    
    public enum NivelAcesso {
        ADMINISTRADOR,
        GERENTE,
        SECRETARIO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String email;

    @Enumerated(EnumType.STRING) // Define que será armazenado como texto no banco
    private NivelAcesso acesso;

    // Construtor padrão (necessário para JPA)
    public Usuario() {
    }

    // Construtor parametrizado (opcional)
    public Usuario(String login, String email, NivelAcesso acesso) {
        this.login = login;
        this.email = email;
        this.acesso = acesso;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NivelAcesso getAcesso() {
        return acesso;
    }

    public void setAcesso(NivelAcesso acesso) {
        this.acesso = acesso;
    }

    public String getSenha() {
        throw new UnsupportedOperationException("Unimplemented method 'getSenha'");
    }

    public Object getNome() {
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    public void setSenha(String encode) {
        throw new UnsupportedOperationException("Unimplemented method 'setSenha'");
    }

    public void setNome(Object nome) {
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }
}

