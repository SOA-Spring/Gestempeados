package com.discord.empleados.models;

import jakarta.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Cdepartamento")
    private long Cdepartamento;

    @Column(name="departamento")
    private String departamento;

    public long getCdepartamento() {
        return this.Cdepartamento;
    }

    public void setCdepartamento(long cdepartamento) {
        this.Cdepartamento = cdepartamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
