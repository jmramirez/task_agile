package com.taskagile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

  private static final String[] PUBLIC = new String[]{
    "/error","/login", "/logout", "/register", "/api/registrations"
  };

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
      .authorizeHttpRequests()
      .requestMatchers(PUBLIC).permitAll()
      .anyRequest().authenticated()
      .and()
      .logout()
      .logoutUrl("/logout")
      .logoutSuccessUrl("/logout?logged-out")
      .and()
      .csrf().disable();
    return http.build();
  }

  @Bean
  public WebSecurityCustomizer webSecurityCustomizer() {
    return (web) -> web.ignoring().requestMatchers("/static/*/**","/assets/**" ,"/js/**", "/css/**", "/images/**", "/favicon.ico");
  }
}
