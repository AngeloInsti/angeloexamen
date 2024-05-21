package com.example.angeloexamen.angeloautor;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface AngeloAutorRepository extends CrudRepository<AngeloAutor, Long> {

    List<AngeloAutor> findAll();
    @Transactional
    void deleteByNombre(String nombre);
    
}