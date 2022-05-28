package com.example.proyectoventas.userdetails;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class Usuario implements UserDetails {
    //Objeto que contiene la información del usuario que ingresa por login
    private User user;
    //Nombre de la persona que ingresa por login
    private String nombre;
    //Apellido de la persona que ingresa por login
    private String apellido;

    public Usuario(User user, String nombre, String apellido) {
        this.user = user;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    /*
    Métodos sobrescritos de la interfaz UserDetails.
    NOTA: la información necesaria para los return de cada método
    están en el objeto de tipo User.
     */

    //Devuelve los permisos asignados al usuario
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getAuthorities();
    }

    //Devuelve la contraseña del usuario
    @Override
    public String getPassword() {
        return user.getPassword();
    }

    //Devuelve el nombre de usuario
    @Override
    public String getUsername() {
        return user.getUsername();
    }

    //Indica si la cuenta del usuario expiró
    @Override
    public boolean isAccountNonExpired() {
        return user.isAccountNonExpired();
    }

    //Indica si la cuenta del usuario está bloqueada
    @Override
    public boolean isAccountNonLocked() {
        return user.isAccountNonLocked();
    }

    //Indica si la contraseña del usuario expiró
    @Override
    public boolean isCredentialsNonExpired() {
        return user.isCredentialsNonExpired();
    }

    //Indica si el usuario está inhabilitado o no (bloqueado)
    @Override
    public boolean isEnabled() {
        return user.isEnabled();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
