package com.discord.empleados.dao;

import com.discord.empleados.models.Proyecto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class proyectoDaoimp implements proyectoDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Proyecto> getListProyecto() {
        String query = "FROM Proyecto";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminarProyecto(long cproyecto) {
        Proyecto proyecto = entityManager.find(Proyecto.class, cproyecto);
        entityManager.remove(proyecto);
    }
}
