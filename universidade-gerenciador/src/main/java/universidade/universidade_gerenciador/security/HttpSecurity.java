package universidade.universidade_gerenciador.security;

public interface HttpSecurity {

    Object csrf();

    SecurityFilterChain build();

}
