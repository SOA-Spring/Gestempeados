package com.discord.empleados.models;

public class Empleado {
    private long Nempleado;
    private String nombre;
    private String apelidos;
    private String dni;
    private String domicilio;
    private String telefono;
    private String email;
    private float salario;
    private long Cproyecto;
    private long Cdepartamento;

    public long getNempleado() {
        return Nempleado;
    }

    public void setNempleado(long nempleado) {
        Nempleado = nempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public long getCproyecto() {
        return Cproyecto;
    }

    public void setCproyecto(long cproyecto) {
        Cproyecto = cproyecto;
    }

    public long getCdepartamento() {
        return Cdepartamento;
    }

    public void setCdepartamento(long cdepartamento) {
        Cdepartamento = cdepartamento;
    }
}
