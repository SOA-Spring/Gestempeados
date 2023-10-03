package com.discord.empleados.dao;

import com.discord.empleados.models.Departamento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class departamentoDaoimp implements departamentoDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Departamento> getListDepartamento() {
        String query = "FROM Departamento";
        return entityManager.createQuery(query).getResultList();
    }
}
