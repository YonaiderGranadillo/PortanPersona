package com.portal.PortanPersona.controllers;

import com.portal.PortanPersona.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setName("andres");
        usuario.setEmail("jeff@colsubsidio.com");
        usuario.setPhones("320151");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario>usuarios=new ArrayList<>();
        Usuario usuario=new Usuario();
        usuario.setId(12l);
        usuario.setName("andres");
        usuario.setEmail("jeff@colsubsidio.com");
        usuario.setPhones("320151");

        Usuario usuario2=new Usuario();
        usuario2.setId(22l);
        usuario2.setName("flor");
        usuario2.setEmail("jefjkmjf@colsubsidio.com");
        usuario2.setPhones("32015dfg1");

        Usuario usuario3=new Usuario();
        usuario3.setId(32l);
        usuario3.setName("maria");
        usuario3.setEmail("jefhgf@colsubsidio.com");
        usuario3.setPhones("320dfgdg151");

        Usuario usuario4=new Usuario();
        usuario4.setId(42l);
        usuario4.setName("estebas");
        usuario4.setEmail("jesdfff@colsubsidio.com");
        usuario4.setPhones("32sdf0151");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);

        return usuarios;
    }

    @RequestMapping(value = "usuario2")
    public Usuario editar(){
        Usuario usuario=new Usuario();
        usuario.setName("andres");
        usuario.setEmail("jeff@colsubsidio.com");
        usuario.setPhones("320151");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario eliminar(){
        Usuario usuario=new Usuario();
        usuario.setName("andres");
        usuario.setEmail("jeff@colsubsidio.com");
        usuario.setPhones("320151");
        return usuario;
    }
    @RequestMapping(value = "usuario4")
    public Usuario buscar(){
        Usuario usuario=new Usuario();
        usuario.setName("andres");
        usuario.setEmail("jeff@colsubsidio.com");
        usuario.setPhones("320151");
        return usuario;
    }
}
