package com.portal.PortanPersona.controllers;

import com.portal.PortanPersona.dao.UsuarioDao;
import com.portal.PortanPersona.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}",method = RequestMethod.GET)
    public Usuario getUsuarios(@PathVariable Long id) {
        Usuario usuario =new Usuario();
        usuario.setId(id);
        usuario.setNombre("andres");
        usuario.setApellido("pinto");
        usuario.setEmail("ae@jgjg.com");
        usuario.setTelefono("625894");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios",method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
       return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios",method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario) {


        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "usuarios45")
    public Usuario editar(){
        Usuario usuario =new Usuario();
        usuario.setNombre("rest");
        usuario.setApellido("pintofg");
        usuario.setEmail("ae@jgjg.com");
        usuario.setTelefono("694104");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}",method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);

    }

}