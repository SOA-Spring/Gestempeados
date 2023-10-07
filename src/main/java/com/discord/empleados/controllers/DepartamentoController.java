package com.discord.empleados.controllers;

import com.discord.empleados.dao.departamentoDao;
import com.discord.empleados.models.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartamentoController {
    @Autowired
    private departamentoDao departDao;

    @RequestMapping(value = "departamentos", method = RequestMethod.GET)
    public List<Departamento> getListDepartamento() {
        return departDao.getListDepartamento();
    }

    @RequestMapping(value = "eliminardepart/{cdepartamento}", method = RequestMethod.DELETE)
    public void eliminarDepartamento(@PathVariable long cdepartamento) {
        departDao.eliminarDepartamento(cdepartamento);
    }
}
