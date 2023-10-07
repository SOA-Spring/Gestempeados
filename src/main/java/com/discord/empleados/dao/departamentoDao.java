package com.discord.empleados.dao;

import com.discord.empleados.models.Departamento;

import java.util.List;

public interface departamentoDao {
    List<Departamento> getListDepartamento();
    void eliminarDepartamento(long cdepartamento);
}
