package com.discord.empleados.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {
    @RequestMapping(value = "empleados")
    public String prueba() {
        return "prueba";
    }

}
