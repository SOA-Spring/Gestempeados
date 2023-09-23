package com.discord.empleados.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartamentoController {
    @RequestMapping(value = "departamentos")
    public String prueba() {
        return "prueba departamento";
    }
}
