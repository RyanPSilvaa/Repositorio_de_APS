package universidade.universidade_gerenciador.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class SecurityConfig {
    @Bean
    void securityFilterChain(HttpSecurity http) throws Exception {
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return (PasswordEncoder) new BCryptPasswordEncoder();
    }
}
