package com.example.angeloexamen.angeloautor;

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
@RequestMapping("/angeloautor")
public class AngeloAutorController {

    @Autowired
    private AngeloAutorService angeloAutorService;

    //create
    @PostMapping("/")
    public AngeloAutor save(@RequestBody AngeloAutor entity)
    {
        return angeloAutorService.save(entity);
    }

    //select by id
    @GetMapping("/{id}")
    public AngeloAutor findById(@PathVariable Long id)
    {
        return angeloAutorService.findById(id);
    }

    //update
    @PutMapping("/")
    public AngeloAutor Update(@RequestBody AngeloAutor entity)
    {
        return angeloAutorService.save(entity);
    }
    

    //Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        angeloAutorService.deleteById(id);
    }

    //Delete
    @DeleteMapping("/nombre/{nombre}")
    public void deleteByNombre(@PathVariable String nombre)
    {
        angeloAutorService.deleteByNombre(nombre);
    }

    //select all
    @GetMapping("/")
    public List<AngeloAutor> findAll()
    {
        return angeloAutorService.findAll();
    }
    
}
