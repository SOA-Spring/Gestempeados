package com.discord.empleados.dao;

import com.discord.empleados.models.Empleado;

import java.util.List;

public interface empleadoDao {
    List<Empleado> getListEmpleadoIndex();
    List<Empleado> getListEmpleado();
    void eliminarEmpleado(long nempleado);
}
