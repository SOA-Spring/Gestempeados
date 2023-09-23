package com.discord.empleados.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {
    @RequestMapping(value = "proyectos")
    public String prueba() {
        return "prueba proyecto";

    }
}
