package com.random0perator.odontologo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "odontologo")
public class Odontologo {
    @Id
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer matricula;



    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getMatricula() {
        return matricula;
    }
}

