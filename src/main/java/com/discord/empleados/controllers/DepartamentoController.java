package com.discord.empleados.controllers;

import com.discord.empleados.dao.departamentoDao;
import com.discord.empleados.models.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartamentoController {
    @Autowired
    private departamentoDao departDao;

    @RequestMapping(value = "departamentos")
    public List<Departamento> getListDepartamento() {
        return departDao.getListDepartamento();
    }
}
