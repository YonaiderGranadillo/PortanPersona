package com.portal.PortanPersona.dao;

import com.portal.PortanPersona.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoimp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Usuario> getUsuarios() {
        String query="FROM Usuario ";
       return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario= entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);

    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public boolean verificardatos(Usuario usuario){
        String query ="FROM Usuario WHERE email=:email AND password=:password";
       List<Usuario> lista= entityManager.createQuery(query)
                .setParameter("email",usuario.getEmail())
                .setParameter("password",usuario.getPassword())
        .getResultList();

       return !lista.isEmpty();


    }

}
