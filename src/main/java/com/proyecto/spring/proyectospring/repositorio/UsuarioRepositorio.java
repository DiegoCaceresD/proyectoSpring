package com.proyecto.spring.proyectospring.repositorio;

import com.proyecto.spring.proyectospring.modelo.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UsuarioRepositorio extends JpaRepository<usuario, Long> {
}
