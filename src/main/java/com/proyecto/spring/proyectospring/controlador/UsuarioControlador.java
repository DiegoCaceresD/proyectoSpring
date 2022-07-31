package com.proyecto.spring.proyectospring.controlador;

import com.proyecto.spring.proyectospring.modelo.usuario;
import com.proyecto.spring.proyectospring.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins ="http://localhost:4200/")

@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")


public class UsuarioControlador {
        @Autowired
    private UsuarioRepositorio repositorio;
        @GetMapping("/usuarios")
        public List<usuario> listarTodosLosUsuarios(){
            return repositorio.findAll();
        }

        // este metodo sirve para guardar el usuario
        @PostMapping("/usuarios")
    public usuario guardarUsuario(@RequestBody usuario  Usuario){
            return repositorio.save(Usuario);
        }
}
