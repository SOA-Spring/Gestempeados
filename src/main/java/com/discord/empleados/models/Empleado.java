package com.discord.empleados.models;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Nempleado")
    private long Nempleado;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellidos")
    private String apellidos;

    @Column(name="dni")
    private String dni;

    @Column(name="domicilio")
    private String domicilio;

    @Column(name="telefono")
    private String telefono;

    @Column(name="email")
    private String email;

    @Column(name="salario")
    private double salario;

    @Column(name="Cproyecto")
    private long Cproyecto;

    @Column(name="Cdepartamento")
    private long Cdepartamento;

    @Column(name="fingreso")
    private String fingreso;

    public long getNempleado() {
        return this.Nempleado;
    }

    public void setNempleado(long nempleado) {
        this.Nempleado = nempleado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long getCproyecto() {
        return this.Cproyecto;
    }

    public void setCproyecto(long cproyecto) {
        this.Cproyecto = cproyecto;
    }

    public long getCdepartamento() {
        return this.Cdepartamento;
    }

    public void setCdepartamento(long cdepartamento) {
        this.Cdepartamento = cdepartamento;
    }

    public String getFingreso() {
        return this.fingreso;
    }

    public void setFingreso(String fingreso) {
        this.fingreso = fingreso;
    }
}
