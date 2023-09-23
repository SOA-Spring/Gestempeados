package com.discord.empleados.models;

public class Proyecto {
    private long Cproyecto;
    private String nombre;
    private String descripcion;

    public long getCproyecto() {
        return Cproyecto;
    }

    public void setCproyecto(long cproyecto) {
        Cproyecto = cproyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
