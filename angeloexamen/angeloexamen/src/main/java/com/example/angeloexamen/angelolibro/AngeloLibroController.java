package com.example.angeloexamen.angelolibro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/angelolibro")
public class AngeloLibroController {
    @Autowired
    private AngeloLibroService angeloLibroService;

    //create
    @PostMapping("/")
    public AngeloLibro save(@RequestBody AngeloLibro entity)
    {
        return angeloLibroService.save(entity);
    }

    //select by id
    @GetMapping("/{id}")
    public AngeloLibro findById(@PathVariable Long id)
    {
        return angeloLibroService.findById(id);
    }

    //update
    @PutMapping("/")
    public AngeloLibro Update(@RequestBody AngeloLibro entity)
    {
        return angeloLibroService.save(entity);
    }
    

    //Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        angeloLibroService.deleteById(id);
    }

    @DeleteMapping("/titulo/{titulo}")
    public void deleteBytitulo(@PathVariable String titulo)
    {
        angeloLibroService.deleteBytitulo(titulo);
    }

    //select all
    @GetMapping("/")
    public List<AngeloLibro> findAll()
    {
        return angeloLibroService.findAll();
    }
}
