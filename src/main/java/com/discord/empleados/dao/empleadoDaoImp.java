package com.discord.empleados.dao;

import com.discord.empleados.models.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class empleadoDaoImp implements empleadoDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Empleado> getListEmpleadoIndex() {
        String query = "FROM Empleado";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Empleado> getListEmpleado() {
        String query = "FROM Empleado";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminarEmpleado(long nempleado) {
        Empleado empleado = entityManager.find(Empleado.class, nempleado);
        entityManager.remove(empleado);
    }
}
