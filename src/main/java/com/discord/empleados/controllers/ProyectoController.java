package com.discord.empleados.controllers;


import com.discord.empleados.dao.proyectoDao;
import com.discord.empleados.models.Proyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProyectoController {
    @Autowired
    private proyectoDao proyDao;

    @RequestMapping(value = "proyectos")
    public List<Proyecto> getListProyecto() {
        return proyDao.getListProyecto();
    }
}
