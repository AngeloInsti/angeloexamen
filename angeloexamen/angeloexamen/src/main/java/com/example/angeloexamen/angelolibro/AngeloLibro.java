package com.example.angeloexamen.angelolibro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AngeloLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String titulo;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String gettitulo() {
        return titulo;
    }
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
}
