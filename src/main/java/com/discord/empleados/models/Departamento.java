package com.discord.empleados.models;

public class Departamento {
    private long Cdepartamento;
    private String departamento;

    public long getCdepartamento() {
        return Cdepartamento;
    }

    public void setCdepartamento(long cdepartamento) {
        Cdepartamento = cdepartamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
