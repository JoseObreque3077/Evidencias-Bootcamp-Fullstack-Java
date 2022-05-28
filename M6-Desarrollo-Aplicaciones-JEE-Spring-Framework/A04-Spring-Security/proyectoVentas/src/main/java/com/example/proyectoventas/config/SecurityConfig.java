package com.example.proyectoventas.config;

import com.example.proyectoventas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //Se traen los métodos de UsuarioService
    @Autowired
    private UsuarioService usuarioService;

    //Se trae el encriptador de contraseñas
    @Autowired
    private BCryptPasswordEncoder bCPE;

    //Se define el Bean del encriptador de contraseña
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCPE = new BCryptPasswordEncoder();
        return bCPE;
    }

    //Se configura la seguridad HTTP
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/**").permitAll() //Se da acceso a la carpeta css
                .antMatchers("/js/**").permitAll() //Se da acceso a la carpeta js
                .antMatchers("/").hasAnyAuthority("ADMIN", "CUSTOMER") //Se le permite el acceso al index solo a usuarios con permiso ADMIN
                .anyRequest().authenticated() //Admite requests, que antes deben pasar si o si por el login
                .and()
                .formLogin().loginPage("/login").permitAll() //Configura la ruta del login y permite que siempre pueda ser accesible
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) //Se configura el logout (cerrar sesión)
                .logoutSuccessUrl("/login"); //Al cerrar sesión, se redirige a la ventana de login
    }

    //Se configura el manejo de contraseñas encriptadas
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioService).passwordEncoder(bCPE);
    }
}
