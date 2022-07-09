package com.random0perator.odontologo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaDeAlta;
    @OneToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;
    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
    private Set<Turno> turnos = new java.util.LinkedHashSet<>();




    public Paciente() {
    }

    public Paciente(Integer id, String nombre, String apellido, String email, Domicilio domicilio, String fechaDeAlta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.domicilio = domicilio;
        this.fechaDeAlta = LocalDate.parse(fechaDeAlta,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public Paciente(String nombre, String apellido, String email, Domicilio domicilio, String fechaDeAlta) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.domicilio = domicilio;
        this.fechaDeAlta = LocalDate.parse(fechaDeAlta,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    public Paciente(String nombre, String apellido, String email, String fechaDeAlta) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaDeAlta = LocalDate.parse(fechaDeAlta,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Set<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(Set<Turno> turnos) {
        this.turnos = turnos;
    }

}
