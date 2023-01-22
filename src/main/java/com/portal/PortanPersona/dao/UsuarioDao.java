package com.portal.PortanPersona.dao;

import com.portal.PortanPersona.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean verificardatos(Usuario usuario);
}
