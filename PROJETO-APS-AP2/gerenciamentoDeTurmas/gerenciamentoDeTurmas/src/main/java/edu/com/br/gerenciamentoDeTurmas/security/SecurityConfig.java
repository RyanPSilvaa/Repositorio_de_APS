package edu.com.br.gerenciamentoDeTurmas.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @SuppressWarnings("unused")
private final UserDetailsService userDetailsService;
    private final AuthenticationSuccessHandler customAuthenticationSuccessHandler;

    public SecurityConfig(UserDetailsService userDetailsService, AuthenticationSuccessHandler customAuthenticationSuccessHandler) {
        this.userDetailsService = userDetailsService;
        this.customAuthenticationSuccessHandler = customAuthenticationSuccessHandler;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @SuppressWarnings("removal")
@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/public/**", "/login", "/error").permitAll()
                        .requestMatchers("/h2-console/**").authenticated()
                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").authenticated()
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/gerente/**").hasRole("GERENTE")
                        .requestMatchers("/secretario/**").hasRole("SECRETARIO")
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .successHandler(customAuthenticationSuccessHandler)
                        .failureUrl("/login?error=true")
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/login?logout=true")
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .permitAll()
                )
                .headers(headers -> headers.frameOptions().sameOrigin());

        return http.build();
    }
}
