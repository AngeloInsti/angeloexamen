package com.example.angeloexamen.angelolibro;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface AngeloLibroRepository extends CrudRepository<AngeloLibro, Long> {

    List<AngeloLibro> findAll();
    @Transactional
    void deleteBytitulo(String titulo);
    
}