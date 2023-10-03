package com.discord.empleados.controllers;

import com.discord.empleados.dao.empleadoDao;
import com.discord.empleados.dao.empleadoDaoImp;
import com.discord.empleados.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpleadoController {
    @Autowired
    private empleadoDao emplDao;

    @RequestMapping(value = "indice", method = RequestMethod.GET)
    public List<Empleado> getListEmpleadoIndex() {
        return emplDao.getListEmpleadoIndex();
    }

    @RequestMapping(value = "empleados", method = RequestMethod.GET)
    public List<Empleado> getListEmpleado() {
        return emplDao.getListEmpleado();
    }

    @RequestMapping(value = "eliminar/{nempleado}", method = RequestMethod.DELETE)
    public void eliminarEmpleado(@PathVariable long nempleado) {
        emplDao.eliminarEmpleado(nempleado);
    }
}
