package com.example.angeloexamen.angeloautor;

import java.sql.Date;

import com.example.angeloexamen.angelolibro.AngeloLibro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class AngeloAutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombre;
    private Date fecha_nacimiento;
    private Integer edad;
    private Boolean estado;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    @ManyToOne
    private AngeloLibro angeloLibro;


    public AngeloLibro getAngeloLibro() {
        return angeloLibro;
    }
    public void setAngeloLibro(AngeloLibro angeloLibro) {
        this.angeloLibro = angeloLibro;
    }

    
    
}
