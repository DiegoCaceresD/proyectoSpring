package com.proyecto.spring.proyectospring.modelo;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "nombre", nullable = false)
    private String nombre;
    @Column (name = "apellido", nullable = false)
    private String apellido;
    @Column (name = "email", nullable = false, unique = true)
    private String email;
    @Column (name = "usuario", nullable = false, unique = true)
    private String usuario;
    @Column (name = "contraseña", nullable = false)
    private String contraseña;

    public usuario(){

    }

    public usuario(Long id, String nombre, String apellido, String email, String usuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
